package com.stip.net.service;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.stip.net.entity.DateList;
import com.stip.net.entity.Dictionary;
import com.stip.net.utils.Constantutils;
import com.stip.net.utils.TimeUtils;

@Service
public class PushService {
	@Resource
	public SysService sysService;
	
	private String materialId;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * 
	 * @Description: 模版信息
	 * @param @param toUser
	 * @param @return
	 * @throws @author chen
	 * @date 2017-4-12
	 */
	public void setSendTemplate(DateList dateList) throws Exception {
		String accessToken = AccessTokenService.getAccesstoken();
		String postURL = Constantutils.sendUrl + "?access_token=" + accessToken;
		String result=sendTemplate(dateList,postURL);
		
		JsonObject jsonObject = null;
		Gson token_gson = new Gson();
		jsonObject = token_gson.fromJson(result, JsonObject.class);
		String errcode = jsonObject.get("errcode").toString().replaceAll("\"", "");
		
		if("40001".equals(errcode)) {
			accessToken = AccessTokenService.getNewAccesstoken();
			String newUrl = Constantutils.sendUrl + "?access_token=" + accessToken;
			sendTemplate(dateList,newUrl);
		}
		
	}
	
	/**
	 * 
	 * @Description: 模版信息
	 * @param @param toUser
	 * @param @return
	 * @throws @author chen
	 * @date 2017-4-12
	 */
	public String sendTemplate(DateList dateList,String url) throws Exception {
		Map<String, Object> sendMap = new HashMap<String, Object>();
		Map<String, Object> dateMap = new HashMap<String, Object>(); // 模版
		Map<String, Object> firstMap = new HashMap<String, Object>();
		Map<String, Object> timeMap = new HashMap<String, Object>();
		Map<String, Object> nowMap = new HashMap<String, Object>();
		Map<String, Object> remarkMap = new HashMap<String, Object>();
		Map<String, Object> keyMap = new HashMap<String, Object>();
		Map<String, Object> miniMap = new HashMap<String, Object>();
		
		firstMap.put("value", "纪念日助手提醒你");
		firstMap.put("color", "#173177");
		dateMap.put("first", firstMap);
		dateMap.put("Topic", firstMap);
		
		nowMap.put("value", TimeUtils.dateToString(new Date(), "yyyy-MM-dd hh:mm:ss"));
		nowMap.put("color", "#173177");
		dateMap.put("Time", nowMap);
		
		timeMap.put("value", TimeUtils.dateToString(dateList.getDateTime(), "yyyy-MM-dd"));
		timeMap.put("color", "#173177");
		dateMap.put("keyword2", timeMap);
		
		if (Constantutils.BIRTHDAY.equals(dateList.getDateType())) {
			keyMap.put("value", dateList.getDateTitle() + "生日");
		} else {
			keyMap.put("value", dateList.getDateTitle());
		}
		
		keyMap.put("color", "#173177");
		dateMap.put("keyword1", keyMap);
		
		int dates = 0;
		if (dateList.getNextRemindTime() != null && !"".equals(dateList.getNextRemindTime())) {
			dates = TimeUtils.nDaysBetweenTwoDate(new Date(), dateList.getNextRemindTime());
		} else {
			dates = TimeUtils.nDaysBetweenTwoDate(new Date(), dateList.getDateTime());
		}
		
		String tempStr = "";
		
		if (dates < 0) {
			dates = (dates * -1)+1;
			tempStr = "第" + dates + "天";
		} else if (dates == 0) {
			tempStr = "就是今天";
		} else {
			if (dates <= 2) {
				tempStr = "只有" + dates + "天";
			} else {
				tempStr = "还有" + dates + "天";
			}
		}
		
		remarkMap.put("value", tempStr);
		remarkMap.put("color", "#173177");
		dateMap.put("remark", remarkMap);
		
		sendMap.put("touser", dateList.getOpenId());
		sendMap.put("template_id", Constantutils.temp_id);
		miniMap.put("appid", Constantutils.wxapp_appid);
		miniMap.put("pagepath", "pages/detail/detail?dateId=" + dateList.getDateId());
		// sendMap.put("url", "http://weixinmap.com/getDetailByDateId?dateId=" +
		// dateList.getDateId() + "&openId="+ dateList.getOpenId());
		sendMap.put("miniprogram", miniMap);
		sendMap.put("data", dateMap);
		
		JSON json = (JSON) JSONObject.toJSON(sendMap);
		String h = json.toString();
		String ret = sendPost(url, h);
		
		return ret;
	}

	/**
	 * 
	 * @Description: 周年模版信息
	 * @param @param
	 *            toUser
	 * @param @return
	 * @throws @author
	 *             chen
	 * @date 2017-4-12
	 */
	public String setAnniversary(DateList dateList) {
		String accessToken = AccessTokenService.getAccesstoken();
		String postURL = Constantutils.sendUrl + "?access_token=" + accessToken;
		Map<String, Object> sendMap = new HashMap<String, Object>();
		Map<String, Object> dateMap = new HashMap<String, Object>(); // 模版
		Map<String, Object> firstMap = new HashMap<String, Object>();
		Map<String, Object> timeMap = new HashMap<String, Object>();
		Map<String, Object> nowMap = new HashMap<String, Object>();
		Map<String, Object> remarkMap = new HashMap<String, Object>();
		Map<String, Object> keyMap = new HashMap<String, Object>();
		Map<String, Object> miniMap = new HashMap<String, Object>();
		Date now = new Date();

		firstMap.put("value", "纪念日助手提醒你");
		firstMap.put("color", "#173177");
		dateMap.put("first", firstMap);
		dateMap.put("Topic", firstMap);

		nowMap.put("value", TimeUtils.dateToString(now, "yyyy-MM-dd hh:mm:ss"));
		nowMap.put("color", "#173177");
		dateMap.put("Time", nowMap);

		timeMap.put("value", TimeUtils.dateToString(dateList.getDateTime(), "yyyy-MM-dd"));
		timeMap.put("color", "#173177");
		dateMap.put("keyword2", timeMap);

		keyMap.put("value", dateList.getDateTitle());
		keyMap.put("color", "#173177");
		dateMap.put("keyword1", keyMap);

		int dates = now.getYear() - dateList.getDateTime().getYear();
		String tempStr = "";

		tempStr = "第" + dates + "周年";

		remarkMap.put("value", tempStr);
		remarkMap.put("color", "#173177");
		dateMap.put("remark", remarkMap);

		sendMap.put("touser", dateList.getOpenId());
		sendMap.put("template_id", Constantutils.temp_id);
		miniMap.put("appid", Constantutils.wxapp_appid);
		miniMap.put("pagepath", "pages/detail/detail?dateId=" + dateList.getDateId());
		// sendMap.put("url", "http://weixinmap.com/getDetailByDateId?dateId=" +
		// dateList.getDateId() + "&openId="+ dateList.getOpenId());
		sendMap.put("miniprogram", miniMap);
		sendMap.put("data", dateMap);

		JSON json = (JSON) JSONObject.toJSON(sendMap);
		String h = json.toString();
		String ret = sendPost(postURL, h);
		
		return ret;
	}
	
	/**
	 * 
	 * @Description: 默认模版信息
	 * @param @param toUser
	 * @param @return
	 * @throws @author chen
	 * @date 2017-4-12
	 */
	public String sendDefaultRemind(DateList dateList) {
		String accessToken = AccessTokenService.getAccesstoken();
		String postURL = Constantutils.sendUrl + "?access_token=" + accessToken;
		Map<String, Object> sendMap = new HashMap<String, Object>();
		Map<String, Object> dateMap = new HashMap<String, Object>(); // 模版
		Map<String, Object> firstMap = new HashMap<String, Object>();
		Map<String, Object> timeMap = new HashMap<String, Object>();
		Map<String, Object> nowMap = new HashMap<String, Object>();
		Map<String, Object> remarkMap = new HashMap<String, Object>();
		Map<String, Object> keyMap = new HashMap<String, Object>();
		Map<String, Object> miniMap = new HashMap<String, Object>();
		Date now = new Date();
		
		firstMap.put("value", "纪念日助手提醒你");
		firstMap.put("color", "#173177");
		dateMap.put("first", firstMap);
		dateMap.put("Topic", firstMap);
		
		nowMap.put("value", TimeUtils.dateToString(now, "yyyy-MM-dd hh:mm:ss"));
		nowMap.put("color", "#173177");
		dateMap.put("Time", nowMap);
		
		int dates=TimeUtils.nDaysBetweenTwoDate(dateList.getDateTime(),now)+1;
		int temp=0;
		
		if(dates==520||dates==519||dates==513) {
			temp=520;
		}else if(dates==100||dates==99||dates==93) {
			temp=100;
		}else if(dates==1000||dates==999||dates==993) {
			temp=1000;
		}else if(dates==1314||dates==1313||dates==1307) {
			temp=1314;
		}
		
		int midDay=temp-dates;
		
		timeMap.put("value", TimeUtils.dateToString(TimeUtils.setDateDay(new Date(),midDay), "yyyy-MM-dd"));
		timeMap.put("color", "#173177");
		dateMap.put("keyword2", timeMap);
		
		
		keyMap.put("value", dateList.getDateTitle() +" 第"+temp+"天");
		keyMap.put("color", "#173177");
		dateMap.put("keyword1", keyMap);
		
		String tempStr = "";
		
		if((temp-dates)==0){
			tempStr = "就是今天";
		}else {
			tempStr = "还有"+(temp-dates)+"天";
		}
		
		remarkMap.put("value", tempStr);
		remarkMap.put("color", "#173177");
		dateMap.put("remark", remarkMap);
		
		sendMap.put("touser", dateList.getOpenId());
		sendMap.put("template_id", Constantutils.temp_id);
		miniMap.put("appid", Constantutils.wxapp_appid);
		miniMap.put("pagepath", "pages/detail/detail?dateId=" + dateList.getDateId());
		sendMap.put("miniprogram", miniMap);
		sendMap.put("data", dateMap);
		
		JSON json = (JSON) JSONObject.toJSON(sendMap);
		String h = json.toString();
		String ret = sendPost(postURL, h);
		
		return ret;
	}

	/**
	 * 
	 * @Description: 模版信息
	 * @param @param toUser
	 * @param @return
	 * @throws Exception 
	 * @throws IOException 
	 * @throws @author chen
	 * @date 2017-4-12
	 */
	public void setSendCustomerMsg(String openId,HttpServletRequest request) throws IOException, Exception {
		int ise=isMaterial();
		
		String accessToken = MaAccessTokenService.getAppAccesstoken();
		String result="";
		if(ise==1) {
			result=sendMsg(accessToken,openId);
		}else {
			String p = "https://api.weixin.qq.com/cgi-bin/media/upload?access_token=" + accessToken + "&type=image";
			materialId = PushService.update(request.getRealPath("/images") + "/"+"A000001.png", p);
			
			Dictionary dic=sysService.getDicByKey("material_id");
			if(null!=dic) {
				dic.setDicValue(materialId);
				sysService.updateByPrimaryKey(dic);
			}

			result=sendMsg(accessToken,openId);
		}
		
		JsonObject jsonObject = null;
		Gson token_gson = new Gson();
		
		jsonObject = token_gson.fromJson(result, JsonObject.class);

		String errcode = jsonObject.get("errcode").toString().replaceAll("\"", "");
		
		if("40001".equals(errcode)) {
			logger.error("----------------------------强制刷新小程序TOKEN");
			accessToken = MaAccessTokenService.getNewAppAccesstoken();
			sendMsg(accessToken,openId);
		}
	}
	
	/**
	 * 发送客户模板消息
	 * @param accessToken
	 * @param openId
	 * @return
	 */
	public String sendMsg(String accessToken,String openId) {
		String postURL = Constantutils.custom_sendUrl + "?access_token=" + accessToken;
		Map<String, Object> sendMap = new HashMap<String, Object>();
		Map<String, Object> dateMap = new HashMap<String, Object>();

		dateMap.put("media_id",materialId);
		sendMap.put("touser", openId);
		sendMap.put("msgtype", "image");
		sendMap.put("image", dateMap);

		JSON json = (JSON) JSONObject.toJSON(sendMap);
		String h = json.toString();
		String ret = sendPost(postURL, h);
		
		return ret;
	}
	
	/**
	 * 
	 * @Description: 模版信息
	 * @param @param toUser
	 * @param @return
	 * @throws Exception 
	 * @throws IOException 
	 * @throws @author chen
	 * @date 2017-4-12
	 */
	public void setSendCustomerMsgLink(String openId) throws IOException, Exception {
		String accessToken = MaAccessTokenService.getAppAccesstoken();
		String result="";
		result=setSendCustomerLink(accessToken,openId);
		
		JsonObject jsonObject = null;
		Gson token_gson = new Gson();
		
		jsonObject = token_gson.fromJson(result, JsonObject.class);

		String errcode = jsonObject.get("errcode").toString().replaceAll("\"", "");
		
		if("40001".equals(errcode)) {
			logger.error("----------------------------强制刷新小程序TOKEN");
			accessToken = MaAccessTokenService.getNewAppAccesstoken();
			setSendCustomerLink(accessToken,openId);
		}
	}

	/**
	 * 
	 * @Description: 发送图文链接
	 * @param @param toUser
	 * @param @return
	 * @throws @author chen
	 * @date 2017-4-12
	 */
	public String setSendCustomerLink(String accessToken,String openId) {
		String postURL = Constantutils.custom_sendUrl + "?access_token=" + accessToken;
		Map<String, Object> sendMap = new HashMap<String, Object>();
		Map<String, Object> dateMap = new HashMap<String, Object>();

		dateMap.put("title", "关注公众号接收提醒消息");
		dateMap.put("description", "点击");
		dateMap.put("url", Constantutils.weixin_Url_other);
		dateMap.put("thumb_url", Constantutils.pic_weixin_Url);

		sendMap.put("touser", openId);
		sendMap.put("msgtype", "link");
		sendMap.put("link", dateMap);

		JSON json = (JSON) JSONObject.toJSON(sendMap);
		String h = json.toString();
		String res = sendPost(postURL, h);
		
		return res;
	}

	/**
	 * 
	 * @Description: 文字
	 * @param @param toUser
	 * @param @return
	 * @throws @author chen
	 * @date 2017-4-12
	 */
	public String setSendCustomerWorld(String openId) {
		String accessToken = MaAccessTokenService.getAppAccesstoken();
		String postURL = Constantutils.custom_sendUrl + "?access_token=" + accessToken;
		Map<String, Object> sendMap = new HashMap<String, Object>();
		Map<String, Object> dateMap = new HashMap<String, Object>();

		dateMap.put("content", "请点击链接关注公众号获得提醒服务" + Constantutils.weixin_Url + "(小程序自身无法提醒)");

		sendMap.put("touser", openId);
		sendMap.put("msgtype", "text");
		sendMap.put("text", dateMap);

		JSON json = (JSON) JSONObject.toJSON(sendMap);
		String h = json.toString();
		String ret = sendPost(postURL, h);
		
		return ret;
	}
	
	/**
	 * 
	 * @Description: 文字
	 * @param @param toUser
	 * @param @return
	 * @throws @author chen
	 * @date 2017-4-12
	 */
	public static String getKeFuAccount() {
		String accessToken = MaAccessTokenService.getAppAccesstoken();
		String postURL = Constantutils.kefuurl + "?access_token=" + accessToken;
		String h = "";
		String ret = sendPost(postURL, h);
		
		return ret;
	}
	
	/**
	 * 
	 * @Description:设置行业信息
	 * @param @param
	 *            url
	 * @param @param
	 *            industry
	 * @param @return
	 * @throws @author
	 *             lvguangming
	 * @date 2017-3-29
	 */
	public String setIndustry() {
		String accessToken = AccessTokenService.getAccesstoken();
		String postURL = Constantutils.setURL + "?access_token=" + accessToken;
		Map<String, Object> sendMap = new HashMap<String, Object>();
		sendMap.put("industry_id1", Constantutils.industry_id1);
		sendMap.put("industry_id2", Constantutils.industry_id2);
		JSON json = (JSON) JSONObject.toJSON(sendMap);
		String h = json.toString();
		String ret = sendPost(postURL, h);
		
		return ret;
	}

	/**
	 * 更新临时素材
	 * @param fileUrl
	 * @param url
	 * @return
	 * @throws IOException
	 */
	public static String update(String fileUrl, String url) throws IOException {
		// 创建一个文件file
		File file = new File(fileUrl);
		// 判断file文件是否为空
		if (file == null)
			throw new IOException("文件不存在");
		URL urlobj = new URL(url);
		urlobj.openStream();
		// httpURLConnection实例的作用是用来做一个请求但潜在网络连接到HTTP服务器
		HttpURLConnection urlconnection = (HttpURLConnection) urlobj.openConnection();
		// 进行urconnection对象设置
		urlconnection.setRequestMethod("POST");
		urlconnection.setDoInput(true);
		urlconnection.setDoOutput(true);
		urlconnection.setUseCaches(false);
		// 设置请求头信息
		urlconnection.setRequestProperty("Connection", "Keep-Alive");
		urlconnection.setRequestProperty("Charset", "UTF-8");
		// 设置边界
		// currentTimeMillis方法获取当前时间信息
		String BOUNDARY = "-----------" + System.currentTimeMillis();
		// Content-Type，内容类型一般是指网页中存在的Content-Type，用于定义网络文件的类型和网页的编码
		// multipart/from-data请求文件上传类型
		urlconnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + BOUNDARY);
		StringBuilder sb = new StringBuilder();
		sb.append("--");
		sb.append(BOUNDARY);
		sb.append("\r\n");
		// Content-Disposition就是当用户请求所得内容存为一个文件的提供一个默认的文件名
		sb.append("Content-Disposition:form-data;name=\"media\";filename=\"" + file.getName() + "\"\r\n");
		// application.octet-stream 只能提交二进制，而且提交一个二进制，如果提交文件的话，只能提交一个文件
		// 后台接收参数只能有一个，而且还只能是流或者是字节码
		sb.append("Content-Type:application/octet-stream\r\n\r\n");
		// 创建一个byte数组
		// sb对象数据转换成字节码
		byte[] head = sb.toString().getBytes("utf-8");
		// 获取输出流 getoutputStream作用就是返回使用此连接的流
		// OutputStream 该抽象类是所有类的字节输出流的父类
		// DataOutputStream 创建一个新的数据输出流，以便将数据写入指定的基础输出流,返回为零
		OutputStream output = new DataOutputStream(urlconnection.getOutputStream());
		// 在将字节码数据转入到流对象中
		output.write(head);
		// 文件正文部分
		// 把文件一流文件的方式 推入url中
		// DateinputStream的作用就是file目录的文件以流的方式输入进来
		DataInputStream in = new DataInputStream(new FileInputStream(file));
		int bytes = 0;
		byte[] b = new byte[1024];
		while ((bytes = in.read(b)) != -1) {
			output.write(b, 0, bytes);
		}
		// 关闭输入流
		in.close();
		// 结尾部分
		byte[] foot = ("\r\n--" + BOUNDARY + "--\r\n").getBytes("utf-8"); // 定义最后数据分割线
		// 把定义最后的数据分割线字节码数据转入流对象中
		output.write(foot);
		// 刷新
		output.flush();
		// 关闭
		output.close();
		StringBuffer buffer = new StringBuffer();
		BufferedReader reader = null;
		String result = null;
		try {
			// 定义一个BufferRader输入流来读取url的响应
			reader = new BufferedReader(new InputStreamReader(urlconnection.getInputStream()));
			String line = null;
			// while循环读取文字
			while ((line = reader.readLine()) != null) {
				buffer.append(line);
			}
			if (result == null) {
				result = buffer.toString();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 关闭流
			if (reader != null) {
				reader.close();
			}
		}
		JSONObject jsonobject = JSON.parseObject(result.toString());
		String mediaid = jsonobject.getString("media_id");
		
		return mediaid;
	}

	/**
	 * @Description: 发送信息
	 * @param @param args
	 * @throws @author chen
	 * @date 2017-3-29
	 */
	public static String sendPost(String url, String param) {
		PrintWriter out = null;
		BufferedReader in = null;
		String result = "";
		try {
			URL realUrl = new URL(url);
			// 打开和URL之间的连接
			URLConnection conn = realUrl.openConnection();
			// 设置通用的请求属性
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("Accept-Charset", "UTF-8");
			conn.setRequestProperty("contentType", "UTF-8");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// 发送POST请求必须设置如下两行
			conn.setDoOutput(true);
			conn.setDoInput(true);
			OutputStream outputStream = conn.getOutputStream();
			// 注意编码格式，防止中文乱码
			outputStream.write(param.getBytes("UTF-8"));
			outputStream.close();
			// 定义BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 使用finally块来关闭输出流、输入流
		finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}
	
	/**
	 * 判断素材是否过期
	 * @return
	 * @throws Exception
	 * @throws IOException
	 */
	public int isMaterial() throws Exception, IOException {
		Dictionary dic=sysService.getDicByKey("material_id");
		if(null==dic) {
			return 0;
		}else {
			if(null==dic.getDicValue()||dic.getDicValue().toString().length()<10) {
				return 2;
			}
		}
		String url = Constantutils.getmaUrl + MaAccessTokenService.getAppAccesstoken() + "&media_id="+dic.getDicValue();
		JsonObject jsonObject = null;
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet(url);
		HttpResponse httpResponse = httpClient.execute(httpGet);
		org.apache.http.HttpEntity httpEntity = httpResponse.getEntity();
		String response = EntityUtils.toString(httpEntity, "utf-8");
		Gson token_gson = new Gson();
		if(response.length()>10000) {
			materialId=dic.getDicValue();
			return 1;
		}
		jsonObject = token_gson.fromJson(response, JsonObject.class);

		String errcode;
		try {
			errcode = jsonObject.get("errcode").toString().replaceAll("\"", "");
		} catch (Exception e) {
			materialId=dic.getDicValue();
			return 1;
		}
		
		if("40007".equals(errcode)) {
			return 0;
		}
		
		return 0;
	}

	public String getMaterialId() {
		return materialId;
	}

	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}
	
	
	/**
	 * 
	 * @Description: 小程序礼物领取通知
	 * @param @param toUser
	 * @param @return
	 * @throws @author chen
	 * @date 2018-3-23
	 */
	public static String sendGetGoods(String giftName,String geter,String outOpenId,String token,String formId,String outTradeNo) {
		String postURL = Constantutils.app_sendUrl + "?access_token=" + token;
		Map<String, Object> sendMap = new HashMap<String, Object>();
		Map<String, Object> dateMap = new HashMap<String, Object>(); // 模版
		Map<String, Object> keyoMap = new HashMap<String, Object>();
		Map<String, Object> keytMap = new HashMap<String, Object>();
		Map<String, Object> keytrMap = new HashMap<String, Object>();
		Date now = new Date();

		keyoMap.put("value", giftName);
		keyoMap.put("color", "#173177");
		dateMap.put("keyword1", keyoMap);
		
		keytMap.put("value", TimeUtils.dateToString(now, "yyyy-MM-dd hh:mm:ss"));
		keytMap.put("color", "#173177");
		dateMap.put("keyword2", keytMap);
		
		keytrMap.put("value", geter);
		keytrMap.put("color", "#173177");
		dateMap.put("keyword3", keytrMap);

		sendMap.put("touser", outOpenId);
		sendMap.put("template_id", Constantutils.app_temp_id);
		sendMap.put("page", "pages/giftdetail/giftdetail?action=out&orderid="+outTradeNo);
		sendMap.put("form_id",formId);
		sendMap.put("data", dateMap);

		JSON json = (JSON) JSONObject.toJSON(sendMap);
		String h = json.toString();
		String ret = sendPost(postURL, h);
		
		return ret;
	}
	
	/**
	 * 发送领取领悟通知
	 * @param openId
	 * @throws IOException
	 * @throws Exception
	 */
	public static void sendGetGiftMsg(String giftName,String geter,String outOpenId,String formId,String outTradeNo) throws IOException, Exception {
		String accessToken = MaAccessTokenService.getAppAccesstoken();
		String result="";
		result=sendGetGoods(giftName,geter,outOpenId,accessToken,formId,outTradeNo);
		
		JsonObject jsonObject = null;
		Gson token_gson = new Gson();
		
		jsonObject = token_gson.fromJson(result, JsonObject.class);

		String errcode = jsonObject.get("errcode").toString().replaceAll("\"", "");
		
		if("40001".equals(errcode)) {
			//logger.error("----------------------------领取通知强制刷新小程序TOKEN");
			accessToken = MaAccessTokenService.getNewAppAccesstoken();
			sendGetGoods(giftName,geter,outOpenId,accessToken,formId,outTradeNo);
		}
	}
	
}
