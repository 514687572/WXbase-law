package com.stip.net.miniapp.message;

import com.stip.net.miniapp.api.WxMaService;
import com.stip.net.miniapp.bean.WxMaMessage;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.common.session.WxSessionManager;

import java.util.Map;

/**
 * 处理小程序推送消息的处理器接口
 *
 * @author cja
 */
public interface WxMaMessageHandler {

  void handle(WxMaMessage message, Map<String, Object> context,
              WxMaService service, WxSessionManager sessionManager) throws WxErrorException;

}
