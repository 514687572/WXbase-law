package com.stip.net.controller;

import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.stip.net.entity.DateList;
import com.stip.net.entity.Message;
import com.stip.net.entity.Muser;
import com.stip.net.mp.service.WeixinService;
import com.stip.net.service.HelperService;
import com.stip.net.utils.Constantutils;
import com.stip.net.utils.GrnerateUUID;

import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;

/**
 * @author cja
 */
@RestController
@RequestMapping("/wechat/portal")
public class WxMpPortalController {
  @Autowired
  private WeixinService wxService;
  @Autowired
  private HelperService helperService;
  
  public static  String industry_id1="1";  //行业id  
  public static  String industry_id2="2";//行业id
  
  private final Logger logger = LoggerFactory.getLogger(this.getClass());
  
  private String TOKEN = "d3r34rt45t54AA";
  public static final String setURL="https://api.weixin.qq.com/cgi-bin/template/api_set_industry";
  
/*  @ResponseBody
  @GetMapping(produces = "text/plain;charset=utf-8")
  public void authGet(@RequestParam(name = "signature", required = false) String signature,
      @RequestParam(name = "timestamp", required = false) String timestamp,
      @RequestParam(name = "nonce", required = false) String nonce,
      @RequestParam(name = "echostr", required = false) String echostr,HttpServletResponse response) throws Exception {
    this.logger.info("\n接收到来自微信服务器的认证消息：[{}, {}, {}, {}]", signature, timestamp, nonce, echostr);

    if (StringUtils.isAnyBlank(signature, timestamp, nonce, echostr)) {
      throw new IllegalArgumentException("请求参数非法，请核实!");
    }
    
    String[] str = { TOKEN, timestamp, nonce };
    Arrays.sort(str); // 字典序排序
    String bigStr = str[0] + str[1] + str[2];
    // SHA1加密
    SHA1 sha1= new SHA1();
    String digest =sha1.gen(str);

    // 确认请求来至微信
    if (digest.equals(signature)) {
        response.getWriter().print(echostr);
    }
   }*/

  @ResponseBody
  @GetMapping(produces = "text/plain;charset=utf-8")
  public String authGet(@RequestParam(name = "signature", required = false) String signature,
      @RequestParam(name = "timestamp", required = false) String timestamp,
      @RequestParam(name = "nonce", required = false) String nonce,
      @RequestParam(name = "echostr", required = false) String echostr) {
    //this.logger.info("\n接收到来自微信服务器的认证消息：[{}, {}, {}, {}]", signature, timestamp, nonce, echostr);

    if (StringUtils.isAnyBlank(signature, timestamp, nonce, echostr)) {
      throw new IllegalArgumentException("请求参数非法，请核实!");
    }

    if (this.getWxService().checkSignature(timestamp, nonce, signature)) {
      return echostr;
    }

    return "非法请求";
  }

  @ResponseBody
  @PostMapping(produces = "application/xml; charset=UTF-8")
  public String post(@RequestBody String requestBody, @RequestParam("signature") String signature,
      @RequestParam(name = "encrypt_type", required = false) String encType,
      @RequestParam(name = "msg_signature", required = false) String msgSignature,
      @RequestParam("timestamp") String timestamp, @RequestParam("nonce") String nonce) {
    //this.logger.info("\n接收微信请求：[signature=[{}], encType=[{}], msgSignature=[{}],"+ " timestamp=[{}], nonce=[{}], requestBody=[\n{}\n] ",signature, encType, msgSignature, timestamp, nonce, requestBody);

    if (!this.wxService.checkSignature(timestamp, nonce, signature)) {
      throw new IllegalArgumentException("非法请求，可能属于伪造的请求！");
    }

    String out = null;
    if (encType == null) {
      // 明文传输的消息
      WxMpXmlMessage inMessage = WxMpXmlMessage.fromXml(requestBody);
      WxMpXmlOutMessage outMessage = this.getWxService().route(inMessage);
      if (outMessage == null) {
        return "";
      }

      out = outMessage.toXml();
    } else if ("aes".equals(encType)) {
      // aes加密的消息
      WxMpXmlMessage inMessage = WxMpXmlMessage.fromEncryptedXml(requestBody,
          this.getWxService().getWxMpConfigStorage(), timestamp, nonce, msgSignature);
      //this.logger.debug("\n消息解密后内容为：\n{} ", inMessage.toString());
      WxMpXmlOutMessage outMessage = this.getWxService().route(inMessage);
      if (outMessage == null) {
        return "";
      }

      out = outMessage.toEncryptedXml(this.getWxService().getWxMpConfigStorage());
    }

    //this.logger.debug("\n组装回复信息：{}", out);

    return out;
  }

  
  /**
   * 生成用于获取access_token的Code的Url
   *
   * @param redirectUrl
   * @return
 * @throws Exception 
   */
  @RequestMapping("/getAuth")
  public void getRequestCodeUrl(HttpServletResponse response) throws Exception {
      String url= String.format("https://open.weixin.qq.com/connect/oauth2/authorize?appid=%s&redirect_uri=%s&response_type=code&scope=snsapi_userinfo&state=message#wechat_redirect",
    		  Constantutils.wx_appid,URLEncoder.encode("http://weixinmap.com/wechat/portal/auth"));
      System.out.println(url);
  }
  
  /**
   * 获取请求用户信息的access_token
   *
   * @param code
 * @return 
   * @return
   */
  @RequestMapping("/auth")
  public ModelAndView getUserInfoAccessToken(HttpServletRequest request) {
	  ModelAndView mav=null;
	  String code=request.getParameter("code");
	  String state=request.getParameter("state");
      JsonObject object = null;
      Map<String, Object> data = new HashMap<String, Object>();
      if(request.getSession().getAttribute("unionid")!=null) {
    	  String unionid=request.getSession().getAttribute("unionid").toString();
    	  Muser muser1=helperService.findUserByUnionId(unionid);
    	  if(null!=muser1) {
    		  if(Constantutils.ADD_DATE.equals(state)) {
    			  mav=new ModelAndView("addDate");
    			  return mav;
    		  }else if(Constantutils.STATE.equals(state)) {
    			  List<DateList> dateList=helperService.getDateListByUnionId(unionid);
    	          request.getSession().setAttribute("dateList",dateList);
    	          data.put("dateList", dateList);
    	          mav=new ModelAndView("dateList",data);
    	          return mav;
    		  }else if(Constantutils.message.equals(state)) {
				List<Message> messageList = helperService.getMessageList(1, 4);
				request.getSession().setAttribute("messageList", messageList);

				data.put("messageList", messageList);
				data.put("success", Boolean.TRUE);
				mav = new ModelAndView("message", data);

				return mav;
    		  }
    	  }
      }
      try {
          String url = String.format("https://api.weixin.qq.com/sns/oauth2/access_token?appid=%s&secret=%s&code=%s&grant_type=authorization_code",Constantutils.wx_appid, Constantutils.wx_appsecret, code);
          logger.info("request accessToken from url: {}", url);
          DefaultHttpClient httpClient = new DefaultHttpClient();
          HttpGet httpGet = new HttpGet(url);
          HttpResponse httpResponse = httpClient.execute(httpGet);
          HttpEntity httpEntity = httpResponse.getEntity();
          String tokens = EntityUtils.toString(httpEntity, "utf-8");
          Gson token_gson = new Gson();
          object = token_gson.fromJson(tokens, JsonObject.class);
          //logger.info("request accessToken success. [result={}]", object);
          if(object.get("access_token")==null)
        	  return new ModelAndView("index");
          data.put("unionid", object.get("unionid").toString().replaceAll("\"", ""));
          data.put("access_token", object.get("access_token").toString().replaceAll("\"", ""));
      } catch (Exception ex) {
          logger.error("fail to request wechat access token. [error={}]", ex);
      }
      
      Muser muser=helperService.findUserByUnionId(data.get("unionid").toString());
      request.getSession().setAttribute("unionid", data.get("unionid"));
      request.getSession().setAttribute("user",muser);
      if(muser!=null) {
    	  if(muser.getOpenid()==null||"1".equals(muser.getOpenid())) {
    		  this.getUserInfo(data,request,"");
    	  }
    	  data.put("user", muser);
      }else {
    	  data= this.getUserInfo(data,request);
      }
      
	  if(Constantutils.ADD_DATE.equals(state)) {
		  mav=new ModelAndView("addDate");
	  }else if(Constantutils.STATE.equals(state)) {
          List<DateList> dateList=helperService.getDateListByUnionId(request.getSession().getAttribute("unionid")+"");
          request.getSession().setAttribute("dateList",dateList);
          data.put("dateList", dateList);
          mav=new ModelAndView("dateList",data);
	  }else if(Constantutils.message.equals(state)) {
			List<Message> messageList = helperService.getMessageList(1, 4);
			request.getSession().setAttribute("messageList", messageList);

			data.put("messageList", messageList);
			data.put("success", Boolean.TRUE);
			mav = new ModelAndView("message", data);

			return mav;
	  }
      
      return mav;
  }
  
  /**
   * 获取用户信息
   *
   * @param accessToken
   * @param openId
   * @return
   */
  public Map<String, Object> getUserInfo(Map<String, Object> fromData,HttpServletRequest request) {
	  String accessToken=fromData.get("access_token")+"";
	  String openId=fromData.get("openid")+"";
      Map<String, Object> data = new HashMap();
      String url = "https://api.weixin.qq.com/sns/userinfo?access_token=" + accessToken + "&openid=" + openId + "&lang=zh_CN";
      //logger.info("request user info from url: {}", url);
      JsonObject userInfo = null;
      try {
          DefaultHttpClient httpClient = new DefaultHttpClient();
          HttpGet httpGet = new HttpGet(url);
          HttpResponse httpResponse = httpClient.execute(httpGet);
          HttpEntity httpEntity = httpResponse.getEntity();
          String response = EntityUtils.toString(httpEntity, "utf-8");
          Gson token_gson = new Gson();
          userInfo = token_gson.fromJson(response, JsonObject.class);
          //logger.info("get userinfo success. [result={}]", userInfo);
          
          Muser user=new Muser();
          user.setCity(userInfo.get("city").toString().replaceAll("\"", ""));
          user.setCountry(userInfo.get("country").toString().replaceAll("\"", ""));
          user.setHeadimgurl(userInfo.get("headimgurl").toString().replaceAll("\"", ""));
          user.setId(GrnerateUUID.getUUID());
          user.setNickname(userInfo.get("nickname").toString().replaceAll("\"", ""));
          user.setOpenid(userInfo.get("openid").toString().replaceAll("\"", ""));
          user.setProvince(userInfo.get("province").toString().replaceAll("\"", ""));
          user.setCreateTime(new Date());
          user.setUnionid(userInfo.get("unionid").toString().replaceAll("\"", ""));
          user.setAppOpenid("1");
          
          data.put("user", user);
          request.getSession().setAttribute("unionid", user.getUnionid());
          request.getSession().setAttribute("user",user);
		  try {
			  helperService.insertUser(user);
		  } catch (Exception e) {
			  user.setNickname("Normal");
			  helperService.insertUser(user);
		  }
          request.setAttribute("userId", user.getId());
      } catch (Exception ex) {
          logger.error("fail to request wechat user info. [error={}]", ex);
      }
      
      return data;
  }
  /**
   * 获取用户信息
   *
   * @param accessToken
   * @param openId
   * @return
   */
  public Map<String, Object> getUserInfo(Map<String, Object> fromData,HttpServletRequest request,String var) {
	  String accessToken=fromData.get("access_token")+"";
	  String openId=fromData.get("openid")+"";
	  Map<String, Object> data = new HashMap();
	  String url = "https://api.weixin.qq.com/sns/userinfo?access_token=" + accessToken + "&openid=" + openId + "&lang=zh_CN";
	  //logger.info("request user info from url: {}", url);
	  JsonObject userInfo = null;
	  try {
		  DefaultHttpClient httpClient = new DefaultHttpClient();
		  HttpGet httpGet = new HttpGet(url);
		  HttpResponse httpResponse = httpClient.execute(httpGet);
		  HttpEntity httpEntity = httpResponse.getEntity();
		  String response = EntityUtils.toString(httpEntity, "utf-8");
		  Gson token_gson = new Gson();
		  userInfo = token_gson.fromJson(response, JsonObject.class);
		  //logger.info("get userinfo success. [result={}]", userInfo);
		  
		  Muser muser=helperService.findUserByUnionId(userInfo.get("unionid").toString().replaceAll("\"", ""));
		  muser.setOpenid(userInfo.get("openid").toString().replaceAll("\"", ""));
		  
		  request.getSession().setAttribute("unionid", userInfo.get("unionid").toString().replaceAll("\"", ""));
		  request.getSession().setAttribute("user",muser);
		  helperService.updateByPrimaryKey(muser);
		  request.setAttribute("userId", muser.getId());
	  } catch (Exception ex) {
		  logger.error("fail to request wechat user info. [error={}]", ex);
	  }
	  
	  return data;
  }
  
  protected WeixinService getWxService() {
	  return this.wxService;
  }
}
