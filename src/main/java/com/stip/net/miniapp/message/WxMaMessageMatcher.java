package com.stip.net.miniapp.message;

import com.stip.net.miniapp.bean.WxMaMessage;

/**
 * 消息匹配器，用在消息路由的时候
 *
 * @author cja
 */
public interface WxMaMessageMatcher {

  /**
   * 消息是否匹配某种模式
   */
  boolean match(WxMaMessage message);

}
