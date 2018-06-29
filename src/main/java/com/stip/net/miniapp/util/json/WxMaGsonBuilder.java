package com.stip.net.miniapp.util.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.stip.net.miniapp.bean.WxMaKefuMessage;
import com.stip.net.miniapp.bean.WxMaTemplateMessage;

/**
 * @author cja
 */
public class WxMaGsonBuilder {
  private static final GsonBuilder INSTANCE = new GsonBuilder();

  static {
    INSTANCE.disableHtmlEscaping();
    INSTANCE.registerTypeAdapter(WxMaKefuMessage.class, new WxMaKefuMessageGsonAdapter());
    INSTANCE.registerTypeAdapter(WxMaTemplateMessage.class, new WxMaTemplateMessageGsonAdapter());
  }

  public static Gson create() {
    return INSTANCE.create();
  }

}
