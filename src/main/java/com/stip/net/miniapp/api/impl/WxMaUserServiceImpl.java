package com.stip.net.miniapp.api.impl;

import com.google.common.base.Joiner;
import com.stip.net.miniapp.api.WxMaService;
import com.stip.net.miniapp.api.WxMaUserService;
import com.stip.net.miniapp.bean.WxMaJscode2SessionResult;
import com.stip.net.miniapp.bean.WxMaUserInfo;
import com.stip.net.miniapp.config.WxMaConfig;
import com.stip.net.miniapp.util.crypt.WxMaCryptUtils;
import me.chanjar.weixin.common.exception.WxErrorException;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cja
 */
@Service("userService")
public class WxMaUserServiceImpl implements WxMaUserService {
  @Autowired
  private WxMaService wxMaService;

  @Override
  public WxMaJscode2SessionResult getSessionInfo(String jsCode) throws WxErrorException {
    final WxMaConfig config = wxMaService.getWxMaConfig();
    Map<String, String> params = new HashMap<>();
    params.put("appid", config.getAppid());
    params.put("secret", config.getSecret());
    params.put("js_code", jsCode);
    params.put("grant_type", "authorization_code");

    String result = this.wxMaService.get(JSCODE_TO_SESSION_URL, Joiner.on("&").withKeyValueSeparator("=").join(params));
    return WxMaJscode2SessionResult.fromJson(result);
  }

  @Override
  public WxMaUserInfo getUserInfo(String sessionKey, String encryptedData, String ivStr) {
    return WxMaUserInfo.fromJson(WxMaCryptUtils.decrypt(sessionKey, encryptedData, ivStr));
  }

  @Override
  public boolean checkUserInfo(String sessionKey, String rawData, String signature) {
    final String generatedSignature = DigestUtils.sha1Hex(rawData + sessionKey);
    
    return generatedSignature.equals(signature);
  }

}
