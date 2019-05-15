package com.stip.net.service;

import com.alibaba.fastjson.JSONObject;
import com.stip.net.utils.Constantutils;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Service
public class AccessTokenService {
	private static String ACCESS_TOKEN;
	private static long ACCESS_TOKEN_TIME = 0;
	
    private static AccessTokenService accessTokenService;
    /**
     * 私有构造函数
     */
    private AccessTokenService(){
    	getAccesstoken();
    }
    /**
     * 获取SingleAccessToken对象
     * @return
     */
    public static AccessTokenService getInstance(){
        if(accessTokenService==null){
        	accessTokenService=new AccessTokenService();
        }
        return accessTokenService;
    }
    
	/**
	 * 
	 * @Description: 获取access_token并解析
	 * @param return
	 *            返回access_token值
	 * @throws @author
	 *             lvguangming
	 * @date 2017-3-29
	 */
	public static String getAccesstoken() {
		if (ACCESS_TOKEN_TIME != 0) { // 判断上次获取的ACCESS_TOKEN时间是否超过6000秒，若未超过直接使用上次获取的参数
			if (System.currentTimeMillis() < ACCESS_TOKEN_TIME) {
				return ACCESS_TOKEN;
			}else {
				ACCESS_TOKEN_TIME=0;
			}
		}
		String openjosn = getOpenJosn(Constantutils.GETURL);
		JSONObject jsonObject;
		String accessToken = "";
		try {
			jsonObject = JSONObject.parseObject(openjosn);
			Map result = new HashMap();
			Iterator iterator = jsonObject.keySet().iterator();
			String key = null;
			String value = null;
			while (iterator.hasNext()) {
				key = (String) iterator.next();
				value = jsonObject.getString(key);
				result.put(key, value);
			}

			if (null != result.get("access_token")) {
				accessToken = result.get("access_token").toString();
				int expiresIn = Integer.parseInt(result.get("expires_in").toString());
				ACCESS_TOKEN_TIME = System.currentTimeMillis() + (expiresIn - 200) * 1000L;
				ACCESS_TOKEN = accessToken;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return accessToken;
	}
	
	/**
	 * 
	 * @Description: 获取access_token并解析
	 * @param return
	 *            返回access_token值
	 * @throws @author
	 *             lvguangming
	 * @date 2017-3-29
	 */
	public static String getNewAccesstoken() {
		String openjosn = getOpenJosn(Constantutils.GETURL);
		JSONObject jsonObject;
		String accessToken = "";
		try {
			jsonObject = JSONObject.parseObject(openjosn);
			Map result = new HashMap();
			Iterator iterator = jsonObject.keySet().iterator();
			String key = null;
			String value = null;
			while (iterator.hasNext()) {
				key = (String) iterator.next();
				value = jsonObject.getString(key);
				result.put(key, value);
			}
			
			if (null != result.get("access_token")) {
				accessToken = result.get("access_token").toString();
				int expiresIn = Integer.parseInt(result.get("expires_in").toString());
				ACCESS_TOKEN_TIME = System.currentTimeMillis() + (expiresIn - 200) * 1000L;
				ACCESS_TOKEN = accessToken;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return accessToken;
	}
	
	/**
	 * 
	 * @Description: 获取access_token
	 * @param @param args
	 * @throws @author chen
	 * @date 2017-3-29
	 */
	private static String getOpenJosn(String url) {
		String result = "";
		PrintWriter out = null;
		BufferedReader in = null;
		try {
			URL realUrl = new URL(url);
			// 打开和URL之间的连接
			URLConnection conn = realUrl.openConnection();
			// 设置通用的请求属性
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// 发送POST请求必须设置如下两行
			conn.setDoOutput(true);
			conn.setDoInput(true);
			// 获取URLConnection对象对应的输出流
			out = new PrintWriter(conn.getOutputStream());
			// 发送请求参数
			// flush输出流的缓冲
			out.flush();
			// 定义BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
    
	public static String getACCESS_TOKEN() {
		return ACCESS_TOKEN;
	}
	public static void setACCESS_TOKEN(String aCCESS_TOKEN) {
		ACCESS_TOKEN = aCCESS_TOKEN;
	}
	public static long getACCESS_TOKEN_TIME() {
		return ACCESS_TOKEN_TIME;
	}
	public static void setACCESS_TOKEN_TIME(long aCCESS_TOKEN_TIME) {
		ACCESS_TOKEN_TIME = aCCESS_TOKEN_TIME;
	}
	public static AccessTokenService getAccessTokenService() {
		return accessTokenService;
	}
	public static void setAccessTokenService(AccessTokenService accessTokenService) {
		AccessTokenService.accessTokenService = accessTokenService;
	}

}
