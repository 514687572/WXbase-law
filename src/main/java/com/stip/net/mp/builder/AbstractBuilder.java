package com.stip.net.mp.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.stip.net.mp.service.WeixinService;

import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;

/**
 * 
 * @author cja
 *
 */
public abstract class AbstractBuilder {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  public abstract WxMpXmlOutMessage build(String content,
      WxMpXmlMessage wxMessage, WeixinService service) ;
}
