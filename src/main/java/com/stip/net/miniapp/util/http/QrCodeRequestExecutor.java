package com.stip.net.miniapp.util.http;

import com.stip.net.miniapp.bean.WxMaQrcodeWrapper;
import me.chanjar.weixin.common.bean.result.WxError;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.common.util.fs.FileUtils;
import me.chanjar.weixin.common.util.http.RequestExecutor;
import me.chanjar.weixin.common.util.http.RequestHttp;
import me.chanjar.weixin.common.util.http.apache.InputStreamResponseHandler;
import me.chanjar.weixin.common.util.http.apache.Utf8ResponseHandler;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/**
 * @author cja
 */
public class QrCodeRequestExecutor implements RequestExecutor<File, WxMaQrcodeWrapper> {
  protected RequestHttp<CloseableHttpClient, HttpHost> requestHttp;

  public QrCodeRequestExecutor(RequestHttp requestHttp) {
    this.requestHttp = requestHttp;
  }

  @Override
  public File execute(String uri, WxMaQrcodeWrapper ticket) throws WxErrorException, IOException {
    HttpPost httpPost = new HttpPost(uri);
    if (requestHttp.getRequestHttpProxy() != null) {
      httpPost
        .setConfig(RequestConfig.custom()
          .setProxy(requestHttp.getRequestHttpProxy())
          .build()
        );
    }
    httpPost.setEntity(new StringEntity(ticket.toString()));

    try (CloseableHttpResponse response = requestHttp.getRequestHttpClient().execute(httpPost);
         InputStream inputStream = InputStreamResponseHandler.INSTANCE.handleResponse(response);) {
      Header[] contentTypeHeader = response.getHeaders("Content-Type");
      if (contentTypeHeader != null && contentTypeHeader.length > 0
        && ContentType.APPLICATION_JSON.getMimeType().equals(contentTypeHeader[0].getValue())) {
        String responseContent = Utf8ResponseHandler.INSTANCE.handleResponse(response);
        throw new WxErrorException(WxError.fromJson(responseContent));
      }

      return FileUtils.createTmpFile(inputStream, UUID.randomUUID().toString(), "jpg");
    } finally {
      httpPost.releaseConnection();
    }
  }
}
