package com.stip.net.miniapp.config;

import com.google.common.collect.Lists;
import com.stip.net.miniapp.api.WxMaService;
import com.stip.net.miniapp.bean.WxMaKefuMessage;
import com.stip.net.miniapp.bean.WxMaTemplateMessage;
import com.stip.net.miniapp.message.WxMaMessageHandler;
import com.stip.net.miniapp.message.WxMaMessageRouter;
import me.chanjar.weixin.common.bean.result.WxMediaUploadResult;
import me.chanjar.weixin.common.exception.WxErrorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

@Configuration
public class WxMaConfiguration {
	@Autowired
	private WxMaProperties properties;
	@Autowired
	private WxMaService wxMaService;
	
    private static final WxMaMessageHandler templateMsgHandler = (wxMessage, context, wxMaService, sessionManager) ->
    wxMaService.getMsgService().sendTemplateMsg(WxMaTemplateMessage.newBuilder()
                    .templateId("此处更换为自己的模板id")
                    .formId("自己替换可用的formid")
                    .data(Lists.newArrayList(
                            new WxMaTemplateMessage.Data("keyword1", "339208499", "#173177")))
                    .toUser(wxMessage.getFromUser())
                    .build());

    private final WxMaMessageHandler logHandler = (wxMessage, context, wxMaService, sessionManager) -> {
        System.out.println("收到消息：" + wxMessage.toString());
        wxMaService.getMsgService().sendKefuMsg(WxMaKefuMessage.TEXT().content("收到信息为：" + wxMessage.toJson())
                .toUser(wxMessage.getFromUser()).build());
    };

    private final WxMaMessageHandler textHandler = (wxMessage, context, wxMaService, sessionManager) ->
    wxMaService.getMsgService().sendKefuMsg(WxMaKefuMessage.TEXT().content("回复文本消息")
                    .toUser(wxMessage.getFromUser()).build());

    private final WxMaMessageHandler picHandler = (wxMessage, context, wxMaService, sessionManager) -> {
        try {
            WxMediaUploadResult uploadResult = wxMaService.getMediaService().uploadMedia("image", "png",ClassLoader.getSystemResourceAsStream("tmp.png"));
            wxMaService.getMsgService().sendKefuMsg(
                    WxMaKefuMessage.IMAGE()
                            .mediaId(uploadResult.getMediaId())
                            .toUser(wxMessage.getFromUser())
                            .build());
        } catch (WxErrorException e) {
            e.printStackTrace();
        }
    };

    private final WxMaMessageHandler qrcodeHandler = (wxMessage, context, service, sessionManager) -> {
        try {
            final File file = service.getQrcodeService().createQrcode("123", 430);
            WxMediaUploadResult uploadResult = service.getMediaService().uploadMedia("image", file);
            service.getMsgService().sendKefuMsg(
                    WxMaKefuMessage.IMAGE()
                            .mediaId(uploadResult.getMediaId())
                            .toUser(wxMessage.getFromUser())
                            .build());
        } catch (WxErrorException e) {
            e.printStackTrace();
        }
    };

    @Bean
    public WxMaMessageRouter router(WxMaService service) {
        final WxMaMessageRouter router = new WxMaMessageRouter(service);
        router.rule().handler(logHandler).next()
                .rule().async(false).content("模板").handler(templateMsgHandler).end()
                .rule().async(false).content("文本").handler(textHandler).end()
                .rule().async(false).content("图片").handler(picHandler).end()
                .rule().async(false).content("二维码").handler(qrcodeHandler).end();
        
        return router;
    }

}
