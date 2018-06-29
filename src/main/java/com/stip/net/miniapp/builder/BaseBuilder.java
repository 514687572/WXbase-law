package com.stip.net.miniapp.builder;

import com.stip.net.miniapp.bean.WxMaKefuMessage;

/**
 * @author cja
 */
public class BaseBuilder<T> {
  protected String msgType;
  protected String toUser;

  @SuppressWarnings("unchecked")
  public T toUser(String toUser) {
    this.toUser = toUser;
    return (T) this;
  }

  public WxMaKefuMessage build() {
    WxMaKefuMessage m = new WxMaKefuMessage();
    m.setMsgType(this.msgType);
    m.setToUser(this.toUser);
    return m;
  }
}
