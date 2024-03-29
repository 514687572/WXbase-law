package com.stip.net.miniapp.bean;

import com.google.gson.annotations.SerializedName;
import com.stip.net.miniapp.util.json.WxMaGsonBuilder;

/**
 * {"session_key":"nzoqhc3OnwHzeTxJs+inbQ==","expires_in":2592000,"openid":"oVBkZ0aYgDMDIywRdgPW8-joxXc4"}
 *
 * @author cja
 */
public class WxMaJscode2SessionResult {
  @SerializedName("session_key")
  private String sessionKey;

  @SerializedName("expires_in")
  private Integer expiresin;

  @SerializedName("openid")
  private String openid;

  @SerializedName("unionid")
  private String unionid;

  public static WxMaJscode2SessionResult fromJson(String json) {
    return WxMaGsonBuilder.create().fromJson(json, WxMaJscode2SessionResult.class);
  }

  public String getSessionKey() {
    return sessionKey;
  }

  public void setSessionKey(String sessionKey) {
    this.sessionKey = sessionKey;
  }

  public Integer getExpiresin() {
    return expiresin;
  }

  public void setExpiresin(Integer expiresin) {
    this.expiresin = expiresin;
  }

  public String getOpenid() {
    return openid;
  }

  public void setOpenid(String openid) {
    this.openid = openid;
  }

  public String getUnionid() {
    return unionid;
  }

  public void setUnionid(String unionid) {
    this.unionid = unionid;
  }

}
