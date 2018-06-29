package com.stip.net.miniapp.message;

import java.util.Map;

import com.stip.net.miniapp.api.WxMaService;
import com.stip.net.miniapp.bean.WxMaMessage;

import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.common.session.WxSessionManager;

/**
 * 微信消息拦截器，可以用来做验证
 *
 * @author cja
 */
public interface WxMaMessageInterceptor {

  /**
   * 拦截微信消息
   *
   * @param context 上下文，如果handler或interceptor之间有信息要传递，可以用这个
   * @return true代表OK，false代表不OK
   */
  boolean intercept(WxMaMessage wxMessage,
                    Map<String, Object> context,
                    WxMaService wxMaService,
                    WxSessionManager sessionManager) throws WxErrorException;

}
