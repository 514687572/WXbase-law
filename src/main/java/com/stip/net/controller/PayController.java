package com.stip.net.controller;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.stip.net.entity.AlipayRecords;
import com.stip.net.entity.CashBalanceRecords;
import com.stip.net.entity.GiftList;
import com.stip.net.entity.RefundRecords;
import com.stip.net.miniapp.config.WxPayConfig;
import com.stip.net.service.AlipayService;
import com.stip.net.service.GiftService;
import com.stip.net.service.WalletService;
import com.stip.net.utils.Base64Utils;
import com.stip.net.utils.Constantutils;
import com.stip.net.utils.GrnerateUUID;
import com.stip.net.utils.PayUtil;
import com.stip.net.utils.TimeUtils;

/**
 *微信支付
 * @author cja
 */
@RestController
@RequestMapping("/pay")
public class PayController {
	@Autowired
    private GiftService giftService;
	@Autowired
	private AlipayService alipayService;
	@Autowired
	private WalletService walletService;
	
	/**
	 * @Description: 发起微信支付
	 * @param request
	 */
	@RequestMapping("/createOrder")
	public Map<String, Object> wxPay(HttpServletRequest request){
		Map<String, Object> response = new HashMap<String, Object>();//返回给小程序端需要的参数
		String sessionKey=request.getParameter("sessionKey");
		String openid=sessionKey.substring(27, 55);
		String giftId=request.getParameter("giftId");
		String dateId=request.getParameter("dateId");
		GiftList gift=null;
		
		if(!StringUtils.isBlank(giftId)) {
			gift=giftService.getGiftById(Integer.parseInt(giftId));
		}
		
		if(gift==null) {
			response.put("success", Boolean.FALSE);
			return response;
		}
		
		try{
			//生成的随机字符串
			String nonce_str = alipayService.getRandomStringByLength(32);
			//商品名称
			String body = gift.getGiftName();
			//获取客户端的ip地址
			String spbill_create_ip = getIpAddr(request);
			
			//组装参数，用户生成统一下单接口的签名
			Map<String, String> packageParams = new HashMap<String, String>();
			String out_trade_no=GrnerateUUID.getUUID();
			packageParams.put("appid", WxPayConfig.appid);
			packageParams.put("mch_id", WxPayConfig.mch_id);
			packageParams.put("nonce_str", nonce_str);
			packageParams.put("body", body);
			packageParams.put("out_trade_no", out_trade_no);//商户订单号
			packageParams.put("total_fee",gift.getGiftPrice()+"");//支付金额，这边需要转成字符串类型，否则后面的签名会失败
			packageParams.put("spbill_create_ip",WxPayConfig.server_ip);
			packageParams.put("notify_url", WxPayConfig.notify_url);//支付成功后的回调地址
			packageParams.put("trade_type", WxPayConfig.TRADETYPE);//支付方式
			packageParams.put("openid", openid);
			   
        	String prestr = PayUtil.createLinkString(packageParams); // 把数组所有元素，按照“参数=参数值”的模式用“&”字符拼接成字符串 
        
        	//MD5运算生成签名，这里是第一次签名，用于调用统一下单接口
        	String mysign = PayUtil.sign(prestr, WxPayConfig.key, "utf-8").toUpperCase();
	        
	        //拼接统一下单接口使用的xml数据，要将上一步生成的签名一起拼接进去
	        String xml = "<xml>" + "<appid>" + WxPayConfig.appid + "</appid>" 
                    + "<body><![CDATA[" + body + "]]></body>" 
                    + "<mch_id>" + WxPayConfig.mch_id + "</mch_id>" 
                    + "<nonce_str>" + nonce_str + "</nonce_str>" 
                    + "<notify_url>" + WxPayConfig.notify_url + "</notify_url>" 
                    + "<openid>" + openid + "</openid>" 
                    + "<out_trade_no>" + out_trade_no + "</out_trade_no>" 
                    + "<spbill_create_ip>" + WxPayConfig.server_ip + "</spbill_create_ip>" 
                    + "<total_fee>" + gift.getGiftPrice() + "</total_fee>"
                    + "<trade_type>" + WxPayConfig.TRADETYPE + "</trade_type>" 
                    + "<sign>" + mysign + "</sign>"
                    + "</xml>";
	        
	        //调用统一下单接口，并接受返回的结果
	        String result = PayUtil.httpRequest(WxPayConfig.pay_url, "POST", xml);
	        
	        // 将解析结果存储在HashMap中   
	        Map map = PayUtil.doXMLParse(result);
	        String return_code = (String) map.get("return_code");//返回状态码
	        
	        if(return_code=="SUCCESS"||return_code.equals(return_code)){   
	            String prepay_id = (String) map.get("prepay_id");//返回的预付单信息   
	            response.put("nonceStr", nonce_str);
	            response.put("package", "prepay_id=" + prepay_id);
	            Long timeStamp = System.currentTimeMillis() / 1000;   
	            response.put("timeStamp", timeStamp + "");//这边要将返回的时间戳转化成字符串，不然小程序端调用wx.requestPayment方法会报签名错误
	            //拼接签名需要的参数
	            String stringSignTemp = "appId=" + WxPayConfig.appid + "&nonceStr=" + nonce_str + "&package=prepay_id=" + prepay_id+ "&signType=MD5&timeStamp=" + timeStamp;   
	            //再次签名，这个签名用于小程序端调用wx.requesetPayment方法
	            String paySign = PayUtil.sign(stringSignTemp, WxPayConfig.key, "utf-8").toUpperCase();
	            
	            response.put("paySign", paySign);
	            response.put("outTradeNo", out_trade_no);
	            
	            AlipayRecords record=new AlipayRecords();
	            record.setAmount(Integer.parseInt(gift.getGiftPrice()));
	            record.setCreatedAt(new Date());
	            record.setGiftId(Integer.parseInt(giftId));
	            record.setOpenId(openid);
	            record.setOutTradeNo(out_trade_no);
	            record.setStatus("CREATE_SUCCESS");
	            record.setUpdatedAt(new Date());
	            record.setPrepayId(prepay_id);
	            record.setDateId(dateId);
	            
	            alipayService.insert(record);
	        }
			
	        response.put("appid", WxPayConfig.appid);
			
	        return response;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * IpUtils工具类方法 获取真实的ip地址
	 * 
	 * @param request
	 * @return
	 */
	public static String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("X-Forwarded-For");
		if (StringUtils.isNotEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)) {
			// 多次反向代理后会有多个ip值，第一个ip才是真实ip
			int index = ip.indexOf(",");
			if (index != -1) {
				return ip.substring(0, index);
			} else {
				return ip;
			}
		}
		ip = request.getHeader("X-Real-IP");
		if (StringUtils.isNotEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)) {
			return ip;
		}
		return request.getRemoteAddr();
	}
	
	/**
	 * @Description:微信支付	
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value="/wxNotify")
	public void wxNotify(HttpServletRequest request,HttpServletResponse response) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader((ServletInputStream)request.getInputStream()));
        String line = null;
        StringBuilder sb = new StringBuilder();
        while((line = br.readLine()) != null){
            sb.append(line);
        }
        //sb为微信返回的xml
		String notityXml = sb.toString();
		String resXml = "";
	
		Map map = PayUtil.doXMLParse(notityXml);
	    
		String returnCode = (String) map.get("return_code");
		if("SUCCESS".equals(returnCode)){
			//验证签名是否正确
			if(StringUtils.isNoneBlank(map.get("sign").toString())){
				/**此处添加自己的业务逻辑代码start**/
				String out_trade_no = (String) map.get("out_trade_no");
				AlipayRecords records=alipayService.getRecordsByOrderId(out_trade_no);
				int total_fee = Integer.parseInt(map.get("total_fee")+"");
				
				if(total_fee==Integer.parseInt(records.getAmount()+"")) {
					records.setStatus(map.get("result_code")+"");
					Date now=new Date();
					records.setUpdatedAt(now);
					alipayService.updateByPrimaryKey(records);
					
					walletService.addWalletHistory(records.getOpenId(), "-"+records.getAmount(), "送出礼物");
					
					Timer timer = new Timer();
					TimerTask task = new TimerTask() {
			            @Override
			            public void run() {
			            	try {
								refund(records.getOutTradeNo());
								timer.cancel();
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			            }
			        };

			        timer.schedule(task, TimeUtils.setDateHour(now, 24));
				}else {
					records.setStatus("illegal");
					records.setUpdatedAt(new Date());
					alipayService.updateByPrimaryKey(records);
				}
				
				/**此处添加自己的业务逻辑代码end**/
				//通知微信服务器已经支付成功
				resXml = "<xml>" + "<return_code><![CDATA[SUCCESS]]></return_code>"
				+ "<return_msg><![CDATA[OK]]></return_msg>" + "</xml> ";
			}
		}else{
			resXml = "<xml>" + "<return_code><![CDATA[FAIL]]></return_code>"
			+ "<return_msg><![CDATA[报文为空]]></return_msg>" + "</xml> ";
		}

		BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
		out.write(resXml.getBytes());
		out.flush();
		out.close();
	}
	
	/**
	 * 用户提现
	 * @param request
	 * @param userid
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/transfers")
	public synchronized @ResponseBody Map<String,Object> transfers(HttpServletRequest request) throws Exception {
		Map<String,Object> result=new HashMap<String,Object>();
		String sessionKey=request.getParameter("sessionKey");
		String openid=sessionKey.substring(27, 55);
		String amount=request.getParameter("amount");
		
		synchronized(this) {
			String balance=walletService.getWalletBalance(openid);
			int intBalance=Integer.parseInt(balance);
			Number intAmount=Math.floor(Double.parseDouble(new String(Base64Utils.decode(amount),"utf-8")));
			
			if(intBalance<intAmount.intValue()) {
				result.put("success", Boolean.FALSE);
				result.put("error_code","余额不足");
				
				return result;
			}
			
			int newAmount=intAmount.intValue()*98;
			amount=(newAmount/100)+"";
			
			Map<String, String> packageParams = new HashMap<String, String>();
			String nonce_str = alipayService.getRandomStringByLength(32);
			String out_trade_no=GrnerateUUID.getUUID();
			packageParams.put("mch_appid", WxPayConfig.appid);
			packageParams.put("mchid", WxPayConfig.mch_id);
			packageParams.put("nonce_str", nonce_str);
			packageParams.put("partner_trade_no", out_trade_no);
			packageParams.put("openid", openid);//商户订单号
			packageParams.put("check_name","NO_CHECK");
			packageParams.put("amount",amount);
			packageParams.put("desc","用户提现");//支付成功后的回调地址
			packageParams.put("spbill_create_ip", WxPayConfig.server_ip);//支付方式
			
			String prestr = PayUtil.createLinkString(packageParams); // 把数组所有元素，按照“参数=参数值”的模式用“&”字符拼接成字符串 
			
			//MD5运算生成签名，这里是第一次签名，用于调用统一下单接口
			String mysign = PayUtil.sign(prestr, WxPayConfig.key, "utf-8").toUpperCase();
			
			//拼接统一下单接口使用的xml数据，要将上一步生成的签名一起拼接进去
			String xml = "<xml>" + "<mch_appid>" + WxPayConfig.appid + "</mch_appid>" 
					+ "<mchid>" + WxPayConfig.mch_id + "</mchid>" 
					+ "<nonce_str>" + nonce_str + "</nonce_str>" 
					+ "<partner_trade_no>" + out_trade_no + "</partner_trade_no>" 
					+ "<openid>" + openid + "</openid>" 
					+ "<check_name>" + "NO_CHECK" + "</check_name>" 
					+ "<amount>" + amount + "</amount>" 
					+ "<desc>" + "用户提现" + "</desc>"
					+ "<spbill_create_ip>" + WxPayConfig.server_ip + "</spbill_create_ip>" 
					+ "<sign><![CDATA[" + mysign + "]]></sign>"
					+ "</xml>";
			
			//调用统一下单接口，并接受返回的结果
			String path = this.getClass().getClassLoader().getResource("").getPath();
			CloseableHttpClient httpclient = alipayService.ssl(path);
			HttpPost httpPost = new HttpPost(Constantutils.UNIFIED_FEEDBACK_URL);
			httpPost.setEntity(new StringEntity(xml, "utf-8"));
			CloseableHttpResponse response = httpclient.execute(httpPost);
			HttpEntity entity = response.getEntity();
			InputStreamReader reader = new InputStreamReader(entity.getContent(), "UTF-8");
			
			char[] buff = new char[1024];
			int length = 0;
			StringBuffer strxml = new StringBuffer();
			while ((length = reader.read(buff)) != -1) {
				strxml.append(new String(buff, 0, length));
				System.out.println(new String(buff, 0, length));
			}
			// httpclient.close();
			httpclient.getConnectionManager().shutdown();
			
			// 将解析结果存储在HashMap中   
			Map map = PayUtil.doXMLParse(strxml.toString());
			String return_code = (String) map.get("return_code");//返回状态码
			String result_code = (String) map.get("result_code");//返回状态码
			String err_code = (String) map.get("err_code");//错误返回状态码
			
			if(return_code=="SUCCESS"||return_code.equals("SUCCESS")) {
				if(result_code=="SUCCESS"||result_code.equals("SUCCESS")){ 
					CashBalanceRecords records=new CashBalanceRecords();
					records.setAmount(amount);
					records.setCbrDesc("用户提现");
					records.setCbrId(GrnerateUUID.getUUID());
					records.setCbrStatus("SUCCESS");
					records.setCreateTime(new Date());
					records.setOpenid(openid);
					records.setOutTradeNo(out_trade_no);
					
					alipayService.insertCashBalanceRecords(records);
					walletService.updateWalletByOpenid(openid, intAmount.intValue()*-1);
					result.put("success", Boolean.TRUE);
				}else if(err_code=="SYSTEMERROR"||err_code.equals("SYSTEMERROR")){;   
					result.put("success", Boolean.FALSE);
				}
			}else {
				result.put("success", Boolean.FALSE);
			}
		}
		
		return result;
	}
	
	/**
	 * 申请退款
	 * @return
	 * @throws Exception 
	 */
	@Transactional
	public Map<String, Object> refund(String outTradeNo) throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		Map<String, String> packageParams = new HashMap<String, String>();
		String nonceStr = alipayService.getRandomStringByLength(32);
		String outRefundNo = GrnerateUUID.getUUID();
		
		AlipayRecords record=alipayService.getRecordsByOrderId(outTradeNo);
		
		if(!"SUCCESS".equals(record.getStatus())) {
			result.put("success", Boolean.FALSE);
			return result;
		}

		packageParams.put("appid", WxPayConfig.appid);
		packageParams.put("mch_id", WxPayConfig.mch_id);// 微信支付分配的商户号
		packageParams.put("nonce_str", nonceStr);// 随机字符串，不长于32位
		packageParams.put("out_refund_no", outRefundNo);// 商户系统内部的退款单号，商户系统内部唯一，同一退款单号多次请求只退一笔
		packageParams.put("out_trade_no", outTradeNo);// 商户侧传给微信的订单号32位
		packageParams.put("refund_fee", record.getAmount()+"");
		packageParams.put("total_fee", record.getAmount()+"");
		packageParams.put("refund_desc", "礼物未被领取退款");
		String prestr = PayUtil.createLinkString(packageParams);
		String sign = PayUtil.sign(prestr, WxPayConfig.key, "utf-8").toUpperCase();

		String refundUrl = "https://api.mch.weixin.qq.com/secapi/pay/refund";
		String xmlParam = "<xml>" + 
		"<appid>" + WxPayConfig.appid + "</appid>" +
				"<mch_id>" + WxPayConfig.mch_id+ "</mch_id>"
		+ "<nonce_str>" + nonceStr + "</nonce_str>" 
				+ "<out_refund_no>" + outRefundNo+ "</out_refund_no>"
		+ "<out_trade_no>" + outTradeNo + "</out_trade_no>" 
				+ "<refund_fee>" + record.getAmount()+"" + "</refund_fee>" 
		+ "<total_fee>" + record.getAmount()+"" + "</total_fee>" 
				+ "<refund_desc>" + "礼物未被领取退款"+ "</refund_desc>" 
		+ "<sign>" + sign + "</sign>" 
				+ "</xml>";

		// 调用统一下单接口，并接受返回的结果
		String path = this.getClass().getClassLoader().getResource("").getPath();
		CloseableHttpClient httpclient = alipayService.ssl(path);
		HttpPost httpPost = new HttpPost(refundUrl);
		httpPost.setEntity(new StringEntity(xmlParam, "utf-8"));
		
		CloseableHttpResponse response = httpclient.execute(httpPost);
		HttpEntity entity = response.getEntity();
		InputStreamReader reader = new InputStreamReader(entity.getContent(), "UTF-8");
		char[] buff = new char[1024];
		int length = 0;
		StringBuffer strxml = new StringBuffer();
		while ((length = reader.read(buff)) != -1) {
			strxml.append(new String(buff, 0, length));
			System.out.println(new String(buff, 0, length));
		}
		// httpclient.close();
		httpclient.getConnectionManager().shutdown();

		// 解析结果
		try {
			Map map = PayUtil.doXMLParse(strxml.toString());
			String returnCode = map.get("return_code").toString();
			if (returnCode.equals("SUCCESS")) {
				String resultCode = map.get("result_code").toString();
				if (resultCode.equals("SUCCESS")) {
					RefundRecords refundRecords=new RefundRecords();
					
					refundRecords.setNonceStr(nonceStr);
					refundRecords.setOpenid(record.getOpenId());
					refundRecords.setOutRefundNo(outRefundNo);
					refundRecords.setOutTradeNo(outTradeNo);
					refundRecords.setRefundDesc("礼物未被领取退款");
					refundRecords.setRefundFee(record.getAmount()+"");
					refundRecords.setRefundId(GrnerateUUID.getUUID());
					refundRecords.setRefundStatus(resultCode);
					refundRecords.setWxRefundId(map.get("refund_id").toString());
					
					alipayService.insertRefundRecords(refundRecords);
					
					record.setStatus("TIME_OUT");
					alipayService.updateByPrimaryKey(record);

					result.put("success", Boolean.TRUE);
				} else {
					result.put("success", Boolean.FALSE);
				}
			} else {
				result.put("success", Boolean.FALSE);
			}
		} catch (Exception e) {
			e.printStackTrace();
			result.put("success", Boolean.FALSE);
		}
		return result;
	}
	
}
