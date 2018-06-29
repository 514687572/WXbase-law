package com.stip.net.mp.handler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.stip.net.mp.builder.TextBuilder;
import com.stip.net.mp.dto.Message;
import com.stip.net.mp.service.WeixinService;
import com.stip.net.utils.Constantutils;

import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;

/**
 * 
 * @author cja
 *
 */
@Component
public class MsgHandler extends AbstractHandler {

    @Override
    public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage,Map<String, Object> context, WxMpService wxMpService,WxSessionManager sessionManager)    {
        WeixinService weixinService = (WeixinService) wxMpService;

        if (!wxMessage.getMsgType().equals(WxConsts.XML_MSG_EVENT)) {
            //TODO 可以选择将消息保存到本地
        }

        String content = "";
        
        if (StringUtils.contains(wxMessage.getContent(), "提醒")) {
        	content = "已开启提醒，我会记住你添加的记录，并在准确的时间提醒你";
        	
        	return new TextBuilder().build(content, wxMessage, weixinService);
        }else {
        	return null;
        }

    }
    
    public static String getMessage(String inMessage) throws Exception, IOException {
         String INFO = URLEncoder.encode(inMessage, "utf-8"); 
         String getURL = "http://www.tuling123.com/openapi/api?key=" + Constantutils.APIKEY + "&info=" + INFO; 
         URL getUrl = new URL(getURL); 
         HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection(); 
         connection.connect(); 

         // 取得输入流，并使用Reader读取 
         BufferedReader reader = new BufferedReader(new InputStreamReader( connection.getInputStream(), "utf-8")); 
         StringBuffer sb = new StringBuffer(); 
         String line = ""; 
         while ((line = reader.readLine()) != null) { 
             sb.append(line); 
         } 
         reader.close(); 
         // 断开连接 
         connection.disconnect(); 
         
         Message message=JSON.parseObject(sb.toString(), Message.class);
         
         return message.text;
    }
    
    public static void main(String[] args) throws Exception, Exception {
    	System.out.println(MsgHandler.getMessage("今天星期几"));
	}

}
