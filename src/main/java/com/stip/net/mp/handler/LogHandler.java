package com.stip.net.mp.handler;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.stip.net.entity.Muser;
import com.stip.net.mp.service.WeixinService;
import com.stip.net.service.HelperService;
import com.stip.net.utils.GrnerateUUID;

import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import me.chanjar.weixin.mp.bean.result.WxMpUser;

/**
 * 
 * @author cja
 *
 */
@Component
public class LogHandler extends AbstractHandler {
	@Autowired
	private HelperService helperService;
	
  private static final ObjectMapper JSON = new ObjectMapper();
  static {
    JSON.setSerializationInclusion(Include.NON_NULL);
    JSON.configure(SerializationFeature.INDENT_OUTPUT, Boolean.TRUE);
  }

	@Override
	public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage, Map<String, Object> context, WxMpService wxMpService, WxSessionManager sessionManager) {
		try {
			WeixinService weixinService = (WeixinService) wxMpService;
			WxMpUser userWxInfo;
			try {
				userWxInfo = weixinService.getUserService().userInfo(wxMessage.getFromUser(), null);
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
					}else if(userWxInfo.getNickname()!=null||userWxInfo.getHeadImgUrl()!=null) {
						boolean isSame=false;
						if(userWxInfo.getNickname()!=null&&!userWxInfo.getNickname().equals(muser.getNickname())) {
							muser.setNickname(userWxInfo.getNickname());
							isSame=true;
						}
						if(userWxInfo.getHeadImgUrl()!=null&&!userWxInfo.getHeadImgUrl().equals(muser.getHeadimgurl())) {
							muser.setHeadimgurl(userWxInfo.getHeadImgUrl());
							isSame=true;
						}
						
						if(isSame) {
							helperService.updateByPrimaryKey(muser);
						}
					}
				}
			} catch (WxErrorException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//this.logger.info("\nLogHandler接收到请求消息，内容：{}", JSON.writeValueAsString(wxMessage));
		} catch (Exception e) {
			e.printStackTrace();
		}

    return null;
  }

}
