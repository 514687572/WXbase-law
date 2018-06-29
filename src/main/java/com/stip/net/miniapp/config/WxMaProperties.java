package com.stip.net.miniapp.config;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WxMaProperties {
    /**
     * 设置微信小程序的appid
     */
	@Value("#{wxProperties.wxapp_token}")
    private String appid;

    /**
     * 设置微信小程序的Secret
     */
	@Value("#{wxProperties.wxapp_appsecret}")
    private String secret;

    /**
     * 设置微信小程序的token
     */
	@Value("#{wxProperties.wxapp_token}")
    private String token;

    /**
     * 设置微信小程序的EncodingAESKey
     */
	@Value("#{wxProperties.wxapp_aeskey}")
    private String aesKey;

    /**
     * 消息格式，XML或者JSON
     */
	@Value("#{wxProperties.wxapp_msgDataFormat}")
    private String msgDataFormat;

    public String getAppid() {
        return this.appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getSecret() {
        return this.secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAesKey() {
        return this.aesKey;
    }

    public void setAesKey(String aesKey) {
        this.aesKey = aesKey;
    }

    public String getMsgDataFormat() {
        return msgDataFormat;
    }

    public void setMsgDataFormat(String msgDataFormat) {
        this.msgDataFormat = msgDataFormat;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
