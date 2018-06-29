package com.stip.net.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.security.KeyStore;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.Resource;
import javax.net.ssl.SSLContext;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;
import org.springframework.stereotype.Service;

import com.stip.net.dao.AlipayRecordsDao;
import com.stip.net.dao.CashBalanceRecordsDao;
import com.stip.net.dao.RefundRecordsDao;
import com.stip.net.entity.AlipayRecords;
import com.stip.net.entity.CashBalanceRecords;
import com.stip.net.entity.RefundRecords;
import com.stip.net.example.AlipayRecordsExample;
import com.stip.net.miniapp.config.WxPayConfig;
import com.stip.net.mp.dto.AliGiftInfo;
import com.stip.net.utils.Constantutils;
import com.stip.net.utils.GrnerateUUID;
import com.stip.net.utils.PayUtil;
import com.stip.net.utils.TimeUtils;

@Service
public class AlipayService{
	@Resource
	public AlipayRecordsDao alipayRecordsDao;
	@Resource
	public CashBalanceRecordsDao cashBalanceRecordsDao;
	@Resource
	public RefundRecordsDao refundRecordsDao;

	/**
	 * 新增支付建单记录
	 */
	public void insert(AlipayRecords record) {
		alipayRecordsDao.insert(record);
	}
	
	/**
	 * 新增支付建单记录
	 */
	public void updateByPrimaryKey(AlipayRecords record) {
		alipayRecordsDao.updateByPrimaryKey(record);
	}
	
	/**
	 * 删除支付记录
	 */
	public void deleteRecord(AlipayRecords record) {
		alipayRecordsDao.deleteByPrimaryKey(record.getId());
	}
	
	/**
	 * 根据交易订单号查询交易记录
	 * @return
	 */
	public AlipayRecords getRecordsByOrderId(String id) {
		AlipayRecordsExample example = new AlipayRecordsExample();
		example.createCriteria().andOutTradeNoEqualTo(id);
		List<AlipayRecords> giftList = alipayRecordsDao.selectByExample(example);
		
		if (giftList != null && giftList.size() > 0) {
			return giftList.get(0);
		} else {
			return null;
		}
	}
	
	/**
	 * 根据用户openid
	 * 查询送礼物记录
	 * @return
	 */
	public List<AliGiftInfo> getRecordsByOpenId(String openId) {
		List<AliGiftInfo> giftList = alipayRecordsDao.selectOutGiftListWithUser(openId);
		
		if (giftList != null && giftList.size() > 0) {
			return giftList;
		} else {
			return null;
		}
	}
	
	/**
	 * 新增提现记录
	 */
	public void insertCashBalanceRecords(CashBalanceRecords record) {
		cashBalanceRecordsDao.insert(record);
	}
	
	/**
	 * 新增提现记录
	 */
	public void insertRefundRecords(RefundRecords record) {
		refundRecordsDao.insert(record);
	}
	
	/**
	 * 查询出支付成功后24小时未退款的记录
	 * @return
	 */
	public List<AlipayRecords> getRecordsUnRefund() {
		AlipayRecordsExample example = new AlipayRecordsExample();
		Date now=new Date();
		Date newDate=TimeUtils.setDateHour(now, -24);
		example.createCriteria().andStatusEqualTo("SUCCESS").andUpdatedAtLessThan(newDate);
		List<AlipayRecords> records = alipayRecordsDao.selectByExample(example);
		
		if (records != null && records.size() > 0) {
			return records;
		} else {
			return null;
		}
	}
	
	/**
	 * 查询出3小时未支付记录
	 * @return
	 */
	public List<AlipayRecords> getNotSuccessRecords() {
		AlipayRecordsExample example = new AlipayRecordsExample();
		Date now=new Date();
		Date newDate=TimeUtils.setDateHour(now, -3);
		example.createCriteria().andStatusEqualTo("CREATE_SUCCESS").andUpdatedAtLessThan(newDate);
		List<AlipayRecords> records = alipayRecordsDao.selectByExample(example);
		
		if (records != null && records.size() > 0) {
			return records;
		} else {
			return null;
		}
	}
	
	/**
	 * 申请退款
	 * @return
	 * @throws Exception 
	 */
	public Map<String, Object> doRefund(String outTradeNo) throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		Map<String, String> packageParams = new HashMap<String, String>();
		String nonceStr = getRandomStringByLength(32);
		String outRefundNo = GrnerateUUID.getUUID();
		
		AlipayRecords record=getRecordsByOrderId(outTradeNo);
		
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
		CloseableHttpClient httpclient = ssl(path);
		HttpPost httpPost = new HttpPost(refundUrl);
		httpPost.setEntity(new StringEntity(xmlParam, "utf-8"));
		System.out.println("executing request" + httpPost.getRequestLine());
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
					
					insertRefundRecords(refundRecords);
					
					record.setStatus("TIME_OUT");
					updateByPrimaryKey(record);

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

	/**
	 * 验证证书公共方法
	 * 
	 * @description
	 * @param certPath 证书的路径
	 * @param mchid 商户id
	 * @return
	 * @throws Exception
	 * @author Jobs
	 */
	public CloseableHttpClient ssl(String path) throws Exception {
		KeyStore keyStore = KeyStore.getInstance("PKCS12");
		FileInputStream instream = new FileInputStream(new File(path+Constantutils.CERTIFICATE_PATH));
		
		try {
			keyStore.load(instream, WxPayConfig.mch_id.toCharArray());
		} finally {
			instream.close();
		}

		// 相信自己的CA和所有自签名的证书
		SSLContext sslcontext = SSLContexts.custom().loadKeyMaterial(keyStore, WxPayConfig.mch_id.toCharArray()).build();
		// 只允许使用TLSv1协议
		SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslcontext, new String[] { "TLSv1" }, null,SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
		CloseableHttpClient httpclient = HttpClients.custom().setSSLSocketFactory(sslsf).build();
		
		return httpclient;
	}
	
	/**
	 * StringUtils工具类方法 获取一定长度的随机字符串，范围0-9，a-z
	 * 
	 * @param length：指定字符串长度
	 * @return 一定长度的随机字符串
	 */
	public static String getRandomStringByLength(int length) {
		String base = "abcdefghijklmnopqrstuvwxyz0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(base.length());
			sb.append(base.charAt(number));
		}
		return sb.toString();
	}
	
}
