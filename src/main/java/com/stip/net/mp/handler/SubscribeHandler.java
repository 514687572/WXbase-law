package com.stip.net.mp.handler;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stip.net.mp.builder.TextBuilder;
import com.stip.net.mp.service.WeixinService;
import com.stip.net.service.HelperService;

import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;

/**
 * 
 * @author cja
 *
 */
@Component
public class SubscribeHandler extends AbstractHandler {
	@Autowired
	private HelperService helperService;

  @Override
  public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage, Map<String, Object> context, WxMpService wxMpService,WxSessionManager sessionManager) throws WxErrorException {

    this.logger.info("新关注用户 ");

    WeixinService weixinService = (WeixinService) wxMpService;

    // 获取微信用户基本信息
    /*WxMpUser userWxInfo = weixinService.getUserService().userInfo(wxMessage.getFromUser(), null);

		if (userWxInfo != null) {
			Muser muser = helperService.findUserByUnionId(userWxInfo.getUnionId());
			if (muser==null) {
				Muser user = new Muser();
				user.setCity(userWxInfo.getCity());
				user.setCountry(userWxInfo.getCountry());
				user.setHeadimgurl(userWxInfo.getHeadImgUrl());
				user.setId(GrnerateUUID.getUUID());
				user.setNickname(userWxInfo.getNickname());
				user.setOpenid(userWxInfo.getOpenId());
				user.setProvince(userWxInfo.getProvince());
				user.setCreateTime(new Date());
				user.setUnionid(userWxInfo.getUnionId());
				user.setAppOpenid("1");
				
	    		try {
					helperService.insertUser(user);
				} catch (Exception e) {
					user.setNickname("Normal");
					helperService.insertUser(user);
				}
			}else if(muser.getOpenid() == null || "1".equals(muser.getOpenid())) {
				muser.setOpenid(userWxInfo.getOpenId());
				helperService.updateByPrimaryKey(muser);
			}
		}
*/
    WxMpXmlOutMessage responseResult = null;
    try {
      responseResult = handleSpecial(wxMessage);
    } catch (Exception e) {
      this.logger.error(e.getMessage(), e);
    }

    if (responseResult != null) {
      return responseResult;
    }

    try {
      return new TextBuilder().build("我可以记录生日、纪念日、倒数日并及时发消息提醒你"+"\r"+"意见反馈请直接发消息勾搭^_^"+"\r"+"[提醒服务已开启]"+"\r", wxMessage, weixinService);
    } catch (Exception e) {
      this.logger.error(e.getMessage(), e);
    }
    return null;
  }

  /**
   * 处理特殊请求，比如如果是扫码进来的，可以做相应处理
   */
  protected WxMpXmlOutMessage handleSpecial(WxMpXmlMessage wxMessage) throws Exception {
    //TODO
    return null;
  }

}
