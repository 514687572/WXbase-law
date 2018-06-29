package com.stip.net.miniapp.api.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.stip.net.miniapp.api.WxMaMsgService;
import com.stip.net.miniapp.api.WxMaService;
import com.stip.net.miniapp.bean.WxMaKefuMessage;
import com.stip.net.miniapp.bean.WxMaTemplateMessage;

import me.chanjar.weixin.common.bean.result.WxError;
import me.chanjar.weixin.common.exception.WxErrorException;

/**
 * @author cja
 */
@Service("kefuService")
public class WxMaMsgServiceImpl implements WxMaMsgService {
  private static final JsonParser JSON_PARSER = new JsonParser();
  @Autowired
  private WxMaService wxMaService;

  @Override
  public boolean sendKefuMsg(WxMaKefuMessage message) throws WxErrorException {
    String responseContent = this.wxMaService.post(KEFU_MESSAGE_SEND_URL, message.toJson());
    return responseContent != null;
  }

  @Override
  public void sendTemplateMsg(WxMaTemplateMessage templateMessage) throws WxErrorException {
    String responseContent = this.wxMaService.post(TEMPLATE_MSG_SEND_URL, templateMessage.toJson());
    JsonObject jsonObject = JSON_PARSER.parse(responseContent).getAsJsonObject();
    if (jsonObject.get("errcode").getAsInt() != 0) {
      throw new WxErrorException(WxError.fromJson(responseContent));
    }
  }

}
