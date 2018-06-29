package com.stip.net.miniapp.builder;

import com.stip.net.miniapp.bean.WxMaKefuMessage;
import com.stip.net.miniapp.constant.WxMaConstants;

/**
 * @author cja
 */
public final class ImageBuilder extends BaseBuilder<ImageBuilder> {
  private String mediaId;

  public ImageBuilder() {
    this.msgType = WxMaConstants.KefuMsgType.IMAGE;
  }

  public ImageBuilder mediaId(String media_id) {
    this.mediaId = media_id;
    return this;
  }

  @Override
  public WxMaKefuMessage build() {
    WxMaKefuMessage m = super.build();
    m.setMediaId(this.mediaId);
    return m;
  }
}
