package com.stip.net.miniapp.builder;

import com.stip.net.miniapp.bean.WxMaKefuMessage;
import com.stip.net.miniapp.constant.WxMaConstants;

/**
 * @author cja
 */
public final class TextBuilder extends BaseBuilder<TextBuilder> {
  private String content;

  public TextBuilder() {
    this.msgType = WxMaConstants.KefuMsgType.TEXT;
  }

  public TextBuilder content(String content) {
    this.content = content;
    return this;
  }

  @Override
  public WxMaKefuMessage build() {
    WxMaKefuMessage m = super.build();
    m.setContent(this.content);
    return m;
  }
}
