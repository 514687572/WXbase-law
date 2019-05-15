package com.stip.net.controller;

import com.stip.net.entity.SysUser;
import com.stip.net.miniapp.api.WxMaService;
import com.stip.net.miniapp.api.impl.WxMaQrcodeServiceImpl;
import com.stip.net.miniapp.bean.WxMaJscode2SessionResult;
import com.stip.net.miniapp.bean.WxMaUserInfo;
import com.stip.net.service.SysUserService;
import com.stip.net.utils.GrnerateUUID;
import com.stip.net.utils.JsonUtils;
import me.chanjar.weixin.common.exception.WxErrorException;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 微信小程序用户接口
 *
 * @author cja
 */
@RestController
@RequestMapping("/wechat/user")
public class WxMaUserController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private WxMaService wxMaService;
    @Autowired
    private WxMaQrcodeServiceImpl qrCodeService;
    @Autowired
    private SysUserService sysUserService;

    /**
     * 登陆接口
     * @throws Exception 
     */
    @GetMapping("login")
    public String login(HttpServletRequest request) throws Exception {
    	String code=request.getParameter("code");
    	String signature=request.getParameter("signature");
    	String rawData=request.getParameter("rawData");
    	String encryptedData=request.getParameter("encryptedData");
    	String iv=request.getParameter("iv");
    	
        if (StringUtils.isBlank(code)) {
            return "empty jscode";
        }

        try {
        	Map<String,Object> result=new HashMap<String,Object>();
            WxMaJscode2SessionResult session = this.wxMaService.getUserService().getSessionInfo(code);
            String openid=session.getOpenid();
            String sessionKey=session.getSessionKey();
            String key=sessionKey+"&$&"+openid;
            String id=GrnerateUUID.getUUID();
            result.put("sessionKey", key);
            request.getSession().setAttribute("sessinoKey", sessionKey);
            request.getSession().setAttribute("openId", openid);
            request.getSession().setAttribute(id, key);

			SysUser muser=getInfo(sessionKey,signature,rawData,encryptedData,iv);
	        
	        request.getSession().setAttribute("user", muser);
	        
            //TODO 可以增加自己的逻辑，关联业务相关数据
            return JsonUtils.toJson(result);
        } catch (WxErrorException e) {
            this.logger.error(e.getMessage(), e);
            return e.toString();
        }
    }

    /**
     * <pre>
     * 获取用户信息接口
     * </pre>
     */
    @GetMapping("info")
    public String info(String sessionKey, String signature, String rawData, String encryptedData, String iv) {
        // 用户信息校验
        if (!this.wxMaService.getUserService().checkUserInfo(sessionKey, rawData, signature)) {
            return "user check failed";
        }

        // 解密用户信息
        WxMaUserInfo userInfo = this.wxMaService.getUserService().getUserInfo(sessionKey, encryptedData, iv);

        return JsonUtils.toJson(userInfo);
    }
    
    public SysUser getInfo(String sessionKey, String signature, String rawData, String encryptedData, String iv) throws Exception {
    	// 用户信息校验
    	if (!this.wxMaService.getUserService().checkUserInfo(sessionKey, rawData, signature)) {
    		System.out.println("user check failed");
    	}
    	
    	// 解密用户信息
    	WxMaUserInfo userInfo = this.wxMaService.getUserService().getUserInfo(sessionKey, encryptedData, iv);

		SysUser muser=sysUserService.findUserByUnionId(userInfo.getUnionId());
		SysUser user =new SysUser();
    	if(muser==null) {
    		user.setId(GrnerateUUID.getUUID());
    		user.setCreateTime(new Date());
    		user.setAppOpenid(userInfo.getOpenId());
    		user.setAvatarurl(userInfo.getAvatarUrl());
    		user.setCity(userInfo.getCity());
    		user.setCountry(userInfo.getCountry());
    		user.setGender(userInfo.getGender());
    		user.setHeadimgurl(userInfo.getAvatarUrl());
    		user.setNickname(userInfo.getNickName());
    		user.setProvince(userInfo.getProvince());
    		user.setUnionid(userInfo.getUnionId());
    		user.setWatermark(JsonUtils.toJson(userInfo.getWatermark()));
    		user.setOpenid("1");
    		
    		try {
				sysUserService.insert(user);
			} catch (Exception e) {
				user.setNickname("Normal");
				sysUserService.insert(user);
			}
    	}else if(muser.getAppOpenid()==null||"1".equals(muser.getAppOpenid())) {
			muser.setAppOpenid(userInfo.getOpenId());
			muser.setWatermark(JsonUtils.toJson(userInfo.getWatermark()));
			user=muser;
			sysUserService.updateByPrimaryKey(muser);
    	}else if(muser.getNickname().equals(userInfo.getNickName()) || !userInfo.getAvatarUrl().equals(muser.getHeadimgurl())) {
			muser.setHeadimgurl(userInfo.getAvatarUrl());
			muser.setNickname(userInfo.getNickName());
			sysUserService.updateByPrimaryKey(muser);
		}
    	
    	return user;
    }

}
