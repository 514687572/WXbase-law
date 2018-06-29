package com.stip.net.miniapp.util.crypt;

import java.nio.charset.StandardCharsets;
import java.security.AlgorithmParameters;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

import com.stip.net.miniapp.config.WxMaConfig;

import me.chanjar.weixin.common.util.crypto.PKCS7Encoder;

/**
 * @author cja
 */
public class WxMaCryptUtils extends me.chanjar.weixin.common.util.crypto.WxCryptUtil {
  public WxMaCryptUtils(WxMaConfig config) {
    this.appidOrCorpid = config.getAppid();
    this.token = config.getToken();
    this.aesKey = Base64.decodeBase64(config.getAesKey() + "=");
  }

  /**
   * AES解密
   *
   * @param encryptedData 消息密文
   * @param ivStr         iv字符串
   */
  public static String decrypt(String sessionKey, String encryptedData, String ivStr) {
    try {
      AlgorithmParameters params = AlgorithmParameters.getInstance("AES");
      params.init(new IvParameterSpec(Base64.decodeBase64(ivStr)));

      Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
      cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(Base64.decodeBase64(sessionKey), "AES"), params);

      return new String(PKCS7Encoder.decode(cipher.doFinal(Base64.decodeBase64(encryptedData))), StandardCharsets.UTF_8);
    } catch (Exception e) {
    	System.out.println(e);
      throw new RuntimeException("AES解密失败", e);
    }
  }

}
