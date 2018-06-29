package com.stip.net.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.stip.net.entity.Muser;
import com.stip.net.service.HelperService;
import com.stip.net.service.PushService;
import com.stip.net.utils.PayUtil;

import me.chanjar.weixin.common.util.crypto.SHA1;

/**
 * @author cja
 */
@RestController
@RequestMapping("/miniapp")
public class WxMaPortalController {
  private final Logger logger = LoggerFactory.getLogger(this.getClass());
  private String TOKEN = "d3r34rt45t54AApp";
  @Resource
  public PushService pushService;
  @Autowired
  private HelperService helperService;
  
  @ResponseBody
  @RequestMapping(method=RequestMethod.GET,produces= "text/plain;charset=utf-8")
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
   }
  
  /**
   * POST请求：
   * 接收客服消息； 
   * 此处的value值也就是往微信公众平台要配置的请求的地址
   */
  @ResponseBody
  @RequestMapping(method=RequestMethod.POST)
  public String doMessagePost(HttpServletRequest request,HttpServletResponse response) {
	  String msg="";
      try {
          ServletInputStream stream = request.getInputStream();
           BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
           StringBuffer buffer = new StringBuffer();
           String line = new String("");  
           while((line = reader.readLine()) != null){
               buffer.append(line);
           }
			Map map=PayUtil.doXMLParse(buffer.toString());
			
			String from=(String) map.get("ToUserName");
			String to=(String) map.get("FromUserName");
			Integer time=Integer.parseInt(map.get("CreateTime").toString());
			String sessionFrom= (String) map.get("SessionFrom");
			String msgType=(String) map.get("MsgType");
			
			PrintWriter out=response.getWriter(); 
			
			msg="<xml>" + 
					"<ToUserName><![CDATA["+to+"]]></ToUserName>" + 
					"<FromUserName><![CDATA["+from+"]]></FromUserName>" + 
					"<CreateTime>"+time+"</CreateTime>" + 
					"<MsgType><![CDATA[transfer_customer_service]]></MsgType>" + 
					"</xml>";

			out.print(msg);
			
			if("follow".equals(sessionFrom)) {
				pushService.setSendCustomerMsgLink(to);
			}else if(null!=map.get("Content")) {
				if(((String) map.get("Content")).contains("提醒")) {
					Muser user=helperService.findUserByAppOpenId(to);
					if(user.getOpenid().length()<5) {
						pushService.setSendCustomerMsgLink(to);
					}else {
						boolean follow=helperService.getUserStatus(user.getOpenid());
						if(!follow) {
							pushService.setSendCustomerMsgLink(to);
						}
					}
				}
			}
      } catch (Exception e) {
          e.printStackTrace();
      }
      return msg;
  }
  
}
