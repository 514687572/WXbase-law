package com.stip.net.miniapp.api.impl;

import com.stip.net.miniapp.api.WxMaMediaService;
import com.stip.net.miniapp.api.WxMaService;
import me.chanjar.weixin.common.bean.result.WxError;
import me.chanjar.weixin.common.bean.result.WxMediaUploadResult;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.common.util.fs.FileUtils;
import me.chanjar.weixin.common.util.http.MediaDownloadRequestExecutor;
import me.chanjar.weixin.common.util.http.MediaUploadRequestExecutor;
import me.chanjar.weixin.common.util.http.RequestExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.UUID;

/**
 * @author cja
 */
@Service("materialService")
public class WxMaMediaServiceImpl implements WxMaMediaService {
  private final Logger log = LoggerFactory.getLogger(this.getClass());
  @Autowired
  private WxMaService wxMaService;

  @Override
  public WxMediaUploadResult uploadMedia(String mediaType, String fileType, InputStream inputStream) throws WxErrorException {
    try {
      return this.uploadMedia(mediaType, FileUtils.createTmpFile(inputStream, UUID.randomUUID().toString(), fileType));
    } catch (IOException e) {
      e.printStackTrace();
      throw new WxErrorException(WxError.newBuilder().setErrorMsg(e.getMessage()).build());
    }
  }

  @Override
  public WxMediaUploadResult uploadMedia(String mediaType, File file) throws WxErrorException {
    String url = String.format(MEDIA_UPLOAD_URL, mediaType);
    return this.wxMaService.execute(MediaUploadRequestExecutor.create(this.wxMaService.getRequestHttp()), url, file);
  }

  @Override
  public File getMedia(String mediaId) throws WxErrorException {
    try {
      RequestExecutor<File, String> executor = MediaDownloadRequestExecutor
        .create(this.wxMaService.getRequestHttp(), Files.createTempDirectory("wxma").toFile());
      return this.wxMaService.execute(executor, MEDIA_GET_URL, "media_id=" + mediaId);
    } catch (IOException e) {
      this.log.error(e.getMessage(), e);
      throw new WxErrorException(WxError.newBuilder().setErrorMsg(e.getMessage()).build());
    }
  }

}
