package com.stip.net.mp.handler;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.stip.net.mp.builder.AbstractBuilder;
import com.stip.net.mp.builder.ImageBuilder;
import com.stip.net.mp.builder.TextBuilder;
import com.stip.net.mp.dto.WxMenuKey;
import com.stip.net.mp.service.WeixinService;

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
public class MenuHandler extends AbstractHandler {

  @Override
  public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage,
      Map<String, Object> context, WxMpService wxMpService,
      WxSessionManager sessionManager) {
    WeixinService weixinService = (WeixinService) wxMpService;

    String key = wxMessage.getEventKey();
    WxMenuKey menuKey = null;
    try {
    	
      menuKey = JSON.parseObject(key, WxMenuKey.class);
    } catch (Exception e) {
      if("addDate".equals(key)) {
    	  return WxMpXmlOutMessage.TEXT().content("功能开发中")
    	          .fromUser(wxMessage.getToUser())
    	          .toUser(wxMessage.getFromUser()).build();
      }else if("myDate".equals(key)) {
    	  return WxMpXmlOutMessage.TEXT().content("功能开发中")
    	          .fromUser(wxMessage.getToUser())
    	          .toUser(wxMessage.getFromUser()).build();
      }else if("timeDate".equals(key)) {
    	  return WxMpXmlOutMessage.TEXT().content("功能开发中")
    	          .fromUser(wxMessage.getToUser())
    	          .toUser(wxMessage.getFromUser()).build();
      }
    }

    AbstractBuilder builder = null;
    switch (menuKey.getType()) {
    case WxConsts.XML_MSG_TEXT:
      builder = new TextBuilder();
      break;
    case WxConsts.XML_MSG_IMAGE:
      builder = new ImageBuilder();
      break;
    case WxConsts.XML_MSG_VOICE:
      break;
    case WxConsts.XML_MSG_VIDEO:
      break;
    case WxConsts.XML_MSG_NEWS:
      break;
    default:
      break;
    }

    if (builder != null) {
      try {
        return builder.build(menuKey.getContent(), wxMessage, weixinService);
      } catch (Exception e) {
        this.logger.error(e.getMessage(), e);
      }
    }

    return null;

  }

}
