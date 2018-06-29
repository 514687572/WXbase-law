package com.stip.net.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.aliyun.oss.OSSClient;
import com.google.common.collect.Maps;
import com.stip.net.entity.DateList;
import com.stip.net.entity.Message;
import com.stip.net.entity.Muser;
import com.stip.net.entity.PraiseRecords;
import com.stip.net.service.AliyunOSSService;
import com.stip.net.service.DateService;
import com.stip.net.service.HelperService;
import com.stip.net.service.PushService;
import com.stip.net.service.SysService;
import com.stip.net.utils.Constantutils;
import com.stip.net.utils.GrnerateUUID;
import com.stip.net.utils.Lunars;
import com.stip.net.utils.SensitiveWord;
import com.stip.net.utils.TimeUtils;
import com.stip.net.utils.Yearww;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import me.chanjar.weixin.common.util.crypto.SHA1;

/**
 * 微信小程序用户接口
 *
 * @author cja
 */
@Api(value = "纪念日增删改查")
@RestController
@RequestMapping("/")
public class IndexController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private String TOKEN = "d3r34rt45t54AA";
    @Autowired
    private HelperService helperService;
    @Autowired
    private DateService dateService;
    @Resource
	public PushService pushService;
    @Resource
    public SysService sysService;

    /**
     * <pre>
     * 查询用户是否关注公众号
     * </pre>
     * @throws Exception 
     * @throws IOException 
     */
    @ApiOperation(value = "查询用户是否关注服务号true关注否者未关注", httpMethod = "GET", response = Map.class, notes = "查询用户是否关注服务号")
    @ApiImplicitParams({@ApiImplicitParam(name = "sessionKey",value = "sessionKey",dataType = "String",paramType = "path",required=true)})
    @RequestMapping("/getUserStatus")
    public Map<String,Object> getUserStatus(HttpServletRequest request,HttpServletResponse response) throws IOException, Exception {
    	Map<String,Object> result=new HashMap<String,Object>();
    	boolean follow =false;
    	
    	String sessionKey=request.getParameter("sessionKey");
		String openid=sessionKey.substring(27, 55);
    	if(!"".equals(openid)) {
    		Muser user=helperService.findUserByAppOpenId(openid);
    		if(user.getOpenid().length()>5) {
    			follow=helperService.getUserStatus(user.getOpenid());
    		}else {
    			follow=false;
    		}
    	}
    	
    	result.put("follow", follow);
    	
		return result;
    }
    
    /**
     * <pre>
     * 获取用户信息接口
     * </pre>
     * @throws IOException 
     */
    @RequestMapping("/check")
    public void check( HttpServletRequest request,HttpServletResponse response) throws IOException {
    	 String signature = request.getParameter("signature");
         // 随机字符串
         String echostr = request.getParameter("echostr");
         // 时间戳
         String timestamp = request.getParameter("timestamp");
         // 随机数
         String nonce = request.getParameter("nonce");

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
     * <pre>
     * 保存用户纪念日
     * </pre>
     * @throws IOException 
     */
    @RequestMapping("/saveDate")
    public Map<String,Object> saveDate(HttpServletRequest request,HttpServletResponse response) throws IOException {
    	Map<String,Object> result=new HashMap<String,Object>();
    	
    	if(null!=request.getSession().getAttribute("unionid")) {
    		String openid = request.getSession().getAttribute("unionid").toString();
    		String typerepeat = request.getParameter("typerepeat").toString();
    		String typeremind = request.getParameter("typeremind").toString();
    		String isGC = request.getParameter("isGC").toString();
    		String isAttention = request.getParameter("isAttention").toString();
    		String thingname = request.getParameter("thingname").toString();
    		String datetime = request.getParameter("datetime").toString();
    		Muser user=(Muser) request.getSession().getAttribute("user");
    		
    		DateList dateList=new DateList();
    		
    		dateList.setRepetRemind(typeremind);
    		dateList.setDateTitle(thingname);
    		dateList.setAttentionDate(isAttention);
    		dateList.setCreateTime(new Date());
    		if(isGC.equals("0")) {
    			dateList.setDateTime(TimeUtils.stringToDate(request.getParameter("solarDate").toString(), "yyyy-MM-dd"));
    			dateList.setLunarCh(datetime);
    			dateList.setLunarDate(TimeUtils.stringToDate(request.getParameter("lunarDate").toString(), "yyyy-MM-dd"));
    		}else {
    			dateList.setDateTime(TimeUtils.stringToDate(datetime, "yyyy-MM-dd"));
    		}
    		dateList.setGc(isGC.equals("1"));
    		dateList.setRemindType(typerepeat);
    		dateList.setOpenId(user.getOpenid());
    		dateList.setUserId(user.getId());
    		dateList.setDateId(GrnerateUUID.getUUID());
    		
    		helperService.insertDate(dateList);
    		result.put("success", Boolean.TRUE);
    	}else {
    		result.put("success", Boolean.FALSE);
    	}
    	 
		return result;
    }
    
    /**
     * <pre>
     * 保存用户纪念日
     * 小程序
     * </pre>
     * @throws IOException 
     */
    @RequestMapping("/saveMaDate")
    @ApiOperation(value = "新增纪念日", httpMethod = "GET", response = Map.class, notes = "新增纪念日")
    @ApiImplicitParams({@ApiImplicitParam(name = "thingname",value = "事件名称",dataType = "String",paramType = "path",required=true),
    	@ApiImplicitParam(name = "typeremind",value = "提醒类型",dataType = "String",paramType = "path",required=true),
    	@ApiImplicitParam(name = "typerepeat",value = "重复类型",dataType = "String",paramType = "path",required=true),
    	@ApiImplicitParam(name = "dateTime",value = "事件时间(农历时格式是1990(庚午)-一月-初一，公历格式2017-06-06)",dataType = "String",paramType = "path",required=true),
    	@ApiImplicitParam(name = "lunarDate",value = "农历时间(当是农历是必填)格式2017-06-06",dataType = "String",paramType = "path",required=false),
    	@ApiImplicitParam(name = "isAttention",value = "是否特别关注1特别关注0未关注",dataType = "String",paramType = "path",required=true),
    	@ApiImplicitParam(name = "solarDate",value = "农历对应的阳历时间(当是农历是必填)格式2017-06-06",dataType = "String",paramType = "path",required=false),
    	@ApiImplicitParam(name = "isGC",value = "是否阳历1阳历0阴历",dataType = "String",paramType = "path",required=true)})
    public Map<String,Object> saveMaDate(HttpServletRequest request,HttpServletResponse response) throws IOException {
    	Map<String,Object> result=new HashMap<String,Object>();
    	
    	if(null!=request.getParameter("sessionKey")){
    		String sessionKey=request.getParameter("sessionKey");
    		String openid=sessionKey.substring(27, 55);
    		
    		String typerepeat = request.getParameter("typerepeat").toString();
    		String typeremind = request.getParameter("typeremind").toString();
    		String isGC = request.getParameter("isGC").toString();
    		String isAttention = request.getParameter("isAttention").toString();
    		String thingname = request.getParameter("thingname").toString();
    		String datetime = request.getParameter("dateTime").toString();
    		String dateType = request.getParameter("dateType").toString();
    		Muser user=helperService.findUserByAppOpenId(openid);
    		
    		typerepeat=new String(typerepeat.getBytes("ISO-8859-1"),"utf-8");
    		typeremind=new String(typeremind.getBytes("ISO-8859-1"),"utf-8");
    		thingname=new String(thingname.getBytes("ISO-8859-1"),"utf-8");
    		
    		DateList dateList=new DateList();
    		
    		dateList.setDateType(dateType);
    		dateList.setRepetRemind(typeremind);
    		dateList.setDateTitle(thingname);
    		dateList.setAttentionDate(isAttention);
    		dateList.setCreateTime(new Date());
    		if(isGC.equals("0")) {
    			String lunarDate=request.getParameter("lunarDate").toString();
    			datetime=new String(datetime.getBytes("ISO-8859-1"),"utf-8");
    			if(datetime.contains("闰")) {
    				String ymd[]=lunarDate.split("-");
    				int m=Integer.parseInt(ymd[1])-13;
    				lunarDate=ymd[0]+"-"+m+"-"+ymd[2];
    				dateList.setLunarDate(TimeUtils.stringToDate(lunarDate, "yyyy-MM-dd"));
    			}else {
    				dateList.setLunarDate(TimeUtils.stringToDate(lunarDate, "yyyy-MM-dd"));
    			}
    			if(!"每年".equals(typerepeat)) {
    				Date newSolar=helperService.lunarToSolar(dateList.getLunarDate().getYear()+1900,dateList.getLunarDate().getMonth()+1,dateList.getLunarDate().getDate());
    				
    				dateList.setDateTime(newSolar);
    			}else {
    				dateList.setDateTime(TimeUtils.stringToDate(request.getParameter("solarDate").toString(), "yyyy-MM-dd"));
    			}
    			dateList.setLunarCh(datetime);
    		}else {
    			dateList.setDateTime(TimeUtils.stringToDate(datetime, "yyyy-MM-dd"));
    		}
    		String dateId=GrnerateUUID.getUUID();
    		dateList.setGc(isGC.equals("1"));
    		dateList.setRemindType(typerepeat);
    		dateList.setOpenId(openid);
    		dateList.setUserId(user.getId());
    		dateList.setDateId(dateId);
    		
    		helperService.insertDate(dateList);
    		result.put("success", Boolean.TRUE);
    		result.put("dateId",dateId);
    		logger.info("执行添加纪念日操作！");
    	}else {
    		result.put("success", Boolean.FALSE);
    	}
    	
    	return result;
    }
    
    /**
     * <pre>
     * 保存用户纪念日
     * 小程序
     * </pre>
     * @throws IOException 
     */
    @RequestMapping("/saveSecretDate")
    @ApiOperation(value = "新增纪念日", httpMethod = "GET", response = Map.class, notes = "新增纪念日")
    @ApiImplicitParams({@ApiImplicitParam(name = "thingname",value = "事件名称",dataType = "String",paramType = "path",required=true),
    	@ApiImplicitParam(name = "typeremind",value = "提醒类型",dataType = "String",paramType = "path",required=true),
    	@ApiImplicitParam(name = "typerepeat",value = "重复类型",dataType = "String",paramType = "path",required=true),
    	@ApiImplicitParam(name = "dateTime",value = "事件时间(农历时格式是1990(庚午)-一月-初一，公历格式2017-06-06)",dataType = "String",paramType = "path",required=true),
    	@ApiImplicitParam(name = "lunarDate",value = "农历时间(当是农历是必填)格式2017-06-06",dataType = "String",paramType = "path",required=false),
    	@ApiImplicitParam(name = "isAttention",value = "是否特别关注1特别关注0未关注",dataType = "String",paramType = "path",required=true),
    	@ApiImplicitParam(name = "solarDate",value = "农历对应的阳历时间(当是农历是必填)格式2017-06-06",dataType = "String",paramType = "path",required=false),
    	@ApiImplicitParam(name = "isGC",value = "是否阳历1阳历0阴历",dataType = "String",paramType = "path",required=true)})
    public Map<String,Object> saveSecretDate(HttpServletRequest request,HttpServletResponse response) throws IOException {
    	Map<String,Object> result=new HashMap<String,Object>();
    	
    	if(null!=request.getParameter("sessionKey")){
    		String sessionKey=request.getParameter("sessionKey");
    		String openid=sessionKey.substring(27, 55);
    		
    		String typerepeat = request.getParameter("typerepeat").toString();
    		String typeremind = request.getParameter("typeremind").toString();
    		String isGC = request.getParameter("isGC").toString();
    		String isAttention = request.getParameter("isAttention").toString();
    		String thingname = request.getParameter("thingname").toString();
    		String datetime = request.getParameter("dateTime").toString();
    		String dateType = request.getParameter("dateType").toString();
    		String secret = request.getParameter("secret").toString();
    		Muser user=helperService.findUserByAppOpenId(openid);
    		
    		typerepeat=new String(typerepeat.getBytes("ISO-8859-1"),"utf-8");
    		typeremind=new String(typeremind.getBytes("ISO-8859-1"),"utf-8");
    		thingname=new String(thingname.getBytes("ISO-8859-1"),"utf-8");
    		
    		DateList dateList=new DateList();
    		
    		dateList.setDateType(dateType);
    		dateList.setRepetRemind(typeremind);
    		dateList.setDateTitle(thingname);
    		dateList.setAttentionDate(isAttention);
    		dateList.setCreateTime(new Date());
    		if(isGC.equals("0")) {
    			String lunarDate=request.getParameter("lunarDate").toString();
    			datetime=new String(datetime.getBytes("ISO-8859-1"),"utf-8");
    			if(datetime.contains("闰")) {
    				String ymd[]=lunarDate.split("-");
    				int m=Integer.parseInt(ymd[1])-13;
    				lunarDate=ymd[0]+"-"+m+"-"+ymd[2];
    				dateList.setLunarDate(TimeUtils.stringToDate(lunarDate, "yyyy-MM-dd"));
    			}else {
    				dateList.setLunarDate(TimeUtils.stringToDate(lunarDate, "yyyy-MM-dd"));
    			}
    			if(!"每年".equals(typerepeat)) {
    				Date newSolar=helperService.lunarToSolar(dateList.getLunarDate().getYear()+1900,dateList.getLunarDate().getMonth()+1,dateList.getLunarDate().getDate());
    				
    				dateList.setDateTime(newSolar);
    			}else {
    				dateList.setDateTime(TimeUtils.stringToDate(request.getParameter("solarDate").toString(), "yyyy-MM-dd"));
    			}
    			dateList.setLunarCh(datetime);
    		}else {
    			dateList.setDateTime(TimeUtils.stringToDate(datetime, "yyyy-MM-dd"));
    		}
    		String dateId=GrnerateUUID.getUUID();
    		dateList.setGc(isGC.equals("1"));
    		dateList.setRemindType(typerepeat);
    		dateList.setOpenId(openid);
    		dateList.setUserId(user.getId());
    		dateList.setDateId(dateId);
    		dateList.setAttentionDate("secret");
    		
    		helperService.insertDate(dateList);
    		result.put("success", Boolean.TRUE);
    		result.put("dateId",dateId);
    		logger.info("执行添加纪念日操作！");
    	}else {
    		result.put("success", Boolean.FALSE);
    	}
    	
    	return result;
    }
    
    /**
     * <pre>
     * 保存用户留言
     * </pre>
     * @throws IOException 
     */
    @RequestMapping("/saveMessage")
    public Map<String,Object> saveMessage( HttpServletRequest request,HttpServletResponse response) throws IOException {
    	Map<String,Object> result=new HashMap<String,Object>();
    	String message = request.getParameter("message").toString();
    	if (SensitiveWord.searchBanWords(message, this.getClass().getClassLoader().getResource("").getPath()).size() > 0) {
    		result.put("success", "badWords");
    		return result;
    	}
    	if(null!=request.getSession().getAttribute("unionid")) {
    		Muser user=(Muser) request.getSession().getAttribute("user");
    		
    		Message msg=new Message();
    		msg.setMsgContent(message);
    		msg.setMsgId(GrnerateUUID.getUUID());
    		msg.setMsgSender(user.getOpenid());
    		msg.setSendTime(new Date());
    		
    		helperService.insertMsg(msg);
    		result.put("success", Boolean.TRUE);
    	}else {
    		result.put("success", Boolean.FALSE);
    	}
    	 
		return result;
    }
    
    /**
     * <pre>
     * 获取最新留言信息
     * </pre>
     * @throws IOException 
     */
    @RequestMapping("/getMessageList")
    public Map<String,Object> getMessageList( HttpServletRequest request,HttpServletResponse response) throws IOException {
    	Map<String,Object> result=new HashMap<String,Object>();
    	
    	List<Message> messageList=helperService.getMessageList(1, 4);
    	
    	if(null!=messageList) {
    		result.put("messageList", messageList);
    		result.put("success", Boolean.TRUE);
    		request.getSession().setAttribute("messageList", messageList);
    	}else {
    		result.put("success", Boolean.FALSE);
    	}
		return result;
    }
    
    /**
     * <pre>
     * 获取最新留言信息
     * </pre>
     * @throws IOException 
     */
    @RequestMapping("/messageList")
    public ModelAndView messageList( HttpServletRequest request,HttpServletResponse response) throws IOException {
    	Map<String,Object> result=new HashMap<String,Object>();
    	List<Message> messageList=helperService.getMessageList(1, 4);
    	ModelAndView mav=null;
    	
    	if(null!=messageList) {
    		result.put("messageList", messageList);
    		result.put("success", Boolean.TRUE);
    		mav=new ModelAndView("message",result);
    	}else {
    		result.put("success", Boolean.FALSE);
    		mav=new ModelAndView("message",result);
    	}
    	return mav;
    }
    
    /**
     * <pre>
     * 编辑用户纪念日
     * </pre>
     * @throws IOException 
     */
    @RequestMapping("/saveDateDetils")
    public Map<String,Object> saveDateDetils( HttpServletRequest request,HttpServletResponse response) throws IOException {
    	Map<String,Object> result=new HashMap<String,Object>();
    	String dateId = request.getParameter("dateId").toString();
    	String openId = request.getParameter("openId").toString();
    	String typerepeat = request.getParameter("typerepeat").toString();
    	String typeremind = request.getParameter("typeremind").toString();
    	String isGC = request.getParameter("isGC").toString();
    	String isAttention = request.getParameter("isAttention").toString();
    	String thingname = request.getParameter("thingname").toString();
    	String datetime = request.getParameter("datetime").toString();
    	
    	if(!"".equals(openId)) {
    		List<DateList> dateList = helperService.getDateListByDateId(dateId);
    		DateList date=dateList.get(0);
    		
    		date.setRepetRemind(typeremind);
    		date.setDateTitle(thingname);
    		date.setAttentionDate(isAttention);
    		date.setRemindType(typerepeat);
    		if(isGC.equals("0")) {
    			date.setDateTime(TimeUtils.stringToDate(request.getParameter("solarDate").toString(), "yyyy-MM-dd"));
    			date.setLunarCh(datetime);
    			date.setLunarDate(TimeUtils.stringToDate(request.getParameter("lunarDate").toString(), "yyyy-MM-dd"));
    			if("每年".equals(date.getRemindType())||"每周".equals(date.getRemindType())||"每月".equals(date.getRemindType())) {
    				date.setNextRemindTime(null);
    			}
    		}else {
    			date.setDateTime(TimeUtils.stringToDate(datetime, "yyyy-MM-dd"));
    			date.setLunarCh(null);
    			date.setLunarDate(null);
    			if("每年".equals(date.getRemindType())||"每周".equals(date.getRemindType())||"每月".equals(date.getRemindType())) {
    				date.setNextRemindTime(null);
    			}
    		}
    		date.setGc(isGC.equals("1"));
    		
    		helperService.updateByPrimaryKey(date);
    		result.put("success", Boolean.TRUE);
    	}else {
    		result.put("success", Boolean.FALSE);
    	}
    	 
		return result;
    }
    
    /**
     * <pre>
     * 编辑用户纪念日
     * </pre>
     * 小程序
     * @throws IOException 
     */
    @ApiOperation(value = "编辑保存纪念日", httpMethod = "GET", response = Map.class, notes = "编辑保存纪念日")
    @ApiImplicitParams({@ApiImplicitParam(name = "thingname",value = "事件名称",dataType = "String",paramType = "path",required=true),
    	@ApiImplicitParam(name = "typeremind",value = "提醒类型",dataType = "String",paramType = "path",required=true),
    	@ApiImplicitParam(name = "typerepeat",value = "重复类型",dataType = "String",paramType = "path",required=true),
    	@ApiImplicitParam(name = "dateTime",value = "事件时间(农历时格式是1990(庚午)-一月-初一，公历格式2017-06-06)",dataType = "String",paramType = "path",required=true),
    	@ApiImplicitParam(name = "lunarDate",value = "农历时间(当是农历是必填)格式2017-06-06",dataType = "String",paramType = "path",required=false),
    	@ApiImplicitParam(name = "isAttention",value = "是否特别关注1特别关注0未关注",dataType = "String",paramType = "path",required=true),
    	@ApiImplicitParam(name = "dateId",value = "纪念日ID",dataType = "String",paramType = "path",required=true),
    	@ApiImplicitParam(name = "solarDate",value = "农历对应的阳历时间(当是农历是必填)格式2017-06-06",dataType = "String",paramType = "path",required=false),
    	@ApiImplicitParam(name = "isGC",value = "是否阳历1阳历0阴历",dataType = "String",paramType = "path",required=true)})
    @RequestMapping("/saveMaDateDetils")
    public Map<String,Object> saveMaDateDetils( HttpServletRequest request,HttpServletResponse response) throws IOException {
    	Map<String,Object> result=new HashMap<String,Object>();
    	String dateId = request.getParameter("dateId").toString();
    	String typerepeat = request.getParameter("typerepeat").toString();
    	String typeremind = request.getParameter("typeremind").toString();
    	String isGC = request.getParameter("isGC").toString();
    	String isAttention = request.getParameter("isAttention").toString();
    	String thingname = request.getParameter("thingname").toString();
    	String datetime = request.getParameter("dateTime").toString();
    	String dateType = request.getParameter("dateType").toString();
    	
    	if(!"".equals(dateId)) {
    		List<DateList> dateList = helperService.getDateListByDateId(dateId);
    		DateList date=dateList.get(0);
    		
    		typerepeat=new String(typerepeat.getBytes("ISO-8859-1"),"utf-8");
    		typeremind=new String(typeremind.getBytes("ISO-8859-1"),"utf-8");
    		thingname=new String(thingname.getBytes("ISO-8859-1"),"utf-8");
    		
    		date.setDateType(dateType);
    		date.setRepetRemind(typeremind);
    		date.setDateTitle(thingname);
    		date.setAttentionDate(isAttention);
    		if(isGC.equals("0")) {
    			String str[]= request.getParameter("lunarDate").toString().split("-");
    			String newStr=str[0]+"-"+(Integer.parseInt(str[1])%13)+"-"+str[2];
    			date.setLunarDate(TimeUtils.stringToDate(newStr, "yyyy-MM-dd"));
    			Date newSolar=helperService.lunarToSolar(date.getLunarDate().getYear()+1900,date.getLunarDate().getMonth()+1,date.getLunarDate().getDate());
				
    			date.setDateTime(newSolar);
    			datetime=new String(datetime.getBytes("ISO-8859-1"),"utf-8");
    			date.setLunarCh(datetime);
    			date.setNextRemindTime(null);
    		}else {
    			date.setDateTime(TimeUtils.stringToDate(datetime, "yyyy-MM-dd"));
    			date.setLunarCh(null);
    			date.setLunarDate(null);
    			date.setNextRemindTime(null);
    		}
    		date.setGc(isGC.equals("1"));
    		date.setRemindType(typerepeat);
    		
    		helperService.updateByPrimaryKey(date);
    		result.put("success", Boolean.TRUE);
    		logger.info("执行编辑纪念日操作！");
    	}else {
    		result.put("success", Boolean.FALSE);
    	}
    	
    	return result;
    }
    
    /**
     * <pre>
     * 查询指定ID纪念日
     * </pre>
     * @throws IOException 
     */
    @RequestMapping("/getDateList")
    public Map<String,Object> getDateList( HttpServletRequest request,HttpServletResponse response) throws IOException {
    	Map<String,Object> result=new HashMap<String,Object>();
    	if(null!=request.getSession().getAttribute("unionid")) {
    		String unionid = request.getSession().getAttribute("unionid").toString();
    		
    		List<DateList> dateList=helperService.getDateListByUnionId(unionid);
    		result.put("dateList", dateList);
    		result.put("success", Boolean.TRUE);
    		request.getSession().setAttribute("dateList", dateList);
    	}else {
    		result.put("success", Boolean.FALSE);
    	}
		return result;
    }
    
    /**
     * <pre>
     * 查询指定用户指定纪念日
     * </pre>
     * @throws IOException 
     */
    @RequestMapping("/selectDateList")
    public ModelAndView selectDateList( HttpServletRequest request,HttpServletResponse response) throws IOException {
    	Map<String,Object> result=new HashMap<String,Object>();
    	ModelAndView mav=null;
    	if(null!=request.getSession().getAttribute("unionid")) {
    		String unionid = request.getSession().getAttribute("unionid").toString();
    		
    		List<DateList> dateList=helperService.getDateListByUnionId(unionid);
    		result.put("dateList", dateList);
    		result.put("success", Boolean.TRUE);
    		mav=new ModelAndView("dateList",result);
    	}else {
    		result.put("success", Boolean.FALSE);
    		mav=new ModelAndView("dateList",result);
    	}
		return mav;
    }
    
    /**
     * <pre>
     * 查询指定用户指定纪念日
     * 小程序
     * </pre>
     * @throws IOException 
     */
    @ApiOperation(value = "得到指定用户所有纪念日", httpMethod = "GET", response = Map.class, notes = "得到指定用户所有纪念日")
    @ApiImplicitParams({@ApiImplicitParam(name = "sessionKey",value = "sessionKey",dataType = "String",paramType = "path",required=true)})
    @RequestMapping("/getMaDateList")
    public Map<String, Object> getMaDateList( HttpServletRequest request,HttpServletResponse response) throws IOException {
    	Map<String,Object> result=new HashMap<String,Object>();
    	boolean follow =false;
    	String sessionKey=request.getParameter("sessionKey");
    	String openid=sessionKey.substring(27, 55);
    	String page=request.getParameter("page");
    	String record=request.getParameter("record");
    	
    	if(!"".equals(openid)) {
    		Muser user=helperService.findUserByAppOpenId(openid);
    		if(user.getOpenid().length()>5) {
    			follow=true;
    		}else {
    			follow=false;
    		}
    		
    		List<DateList> dateList=null;
    		if(StringUtils.isNoneBlank(page)&&StringUtils.isNoneBlank(record)) {
    			dateList=helperService.getDateListAndAttentionByMaOpenId(openid,user,Integer.parseInt(page),Integer.parseInt(record));
    		}else {
    			dateList=helperService.getDateListAndAttentionByMaOpenId(openid,user);
    		}
    		result.put("dateList", dateList);
    		result.put("success", Boolean.TRUE);
    		result.put("follow",follow);
    		logger.info("执行查看纪念日列表操作！");
    	}else {
    		result.put("success", Boolean.FALSE);
    	}
    	return result;
    }
    
    /**
     * <pre>
     * 跳转至详情页
     * </pre>
     * @throws IOException 
     */
    @RequestMapping("/getDetail")
    public Map<String, Object> getDetail( HttpServletRequest request,HttpServletResponse response) throws IOException {
    	Map<String,Object> result=new HashMap<String,Object>();
    	if(null!=request.getSession().getAttribute("unionid")) {
    		String unionid = request.getSession().getAttribute("unionid").toString();
    		String dateId=request.getParameter("dateId");
    		
    		List<DateList> dateList=helperService.getDateListByOpenId(unionid,dateId);
    		DateList date=dateList.get(0);
    		result.put("date", date);
    		request.getSession().setAttribute("date", date);
    		result.put("success", Boolean.TRUE);
    	}else if(null!=request.getParameter("unionid")){
    		String unionid = request.getParameter("unionid");
    		request.getSession().setAttribute("unionid", request.getParameter("unionid"));
    		String dateId=request.getParameter("dateId");
    		
    		List<DateList> dateList=helperService.getDateListByOpenId(unionid,dateId);
    		DateList date=dateList.get(0);
    		result.put("date", date);
    		request.getSession().setAttribute("date", date);
    		result.put("success", Boolean.TRUE);
    	}
    	
		return result;
    }
    
	/**
	 * <pre>
	 * 跳转至详情页getDetailByDateId
	 * </pre>
	 * 
	 * @throws IOException
	 */
	@RequestMapping("/getDetailByDateId")
	public ModelAndView getDetailByDateId(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Map<String, Object> result = new HashMap<String, Object>();
		ModelAndView mav=null;
		String dateId = request.getParameter("dateId");

		List<DateList> dateList = helperService.getDateListByDateId(dateId);
		if(dateList!=null) {
			DateList date = dateList.get(0);
			result.put("date", date);
			request.getSession().setAttribute("date", date);
			result.put("success", Boolean.TRUE);
			logger.info("执行查看纪念日操作！");
		}
		
		mav=new ModelAndView("card",result);

		return mav;
	}
	
	/**
	 * <pre>
	 * 跳转至详情页getDetailByDateId
	 * </pre>
	 * 小程序
	 * @throws IOException
	 */
	@ApiOperation(value = "根据纪念日ID得到指定纪念日详情", httpMethod = "GET", response = Map.class, notes = "根据纪念日ID得到指定纪念日详情")
    @ApiImplicitParams({@ApiImplicitParam(name = "纪念日ID",value = "dateId",dataType = "String",paramType = "path",required=true)})
	@RequestMapping("/getMaDetailByDateId")
	public Map<String, Object> getMaDetailByDateId(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Map<String, Object> result = new HashMap<String, Object>();
		String dateId = request.getParameter("dateId");
		
		if(!"".equals(dateId)&&null!=dateId&&dateId.length()>5) {
			List<DateList> dateList = helperService.getDateListByDateId(dateId);
			if(dateList!=null) {
				DateList date = dateList.get(0);
				
				result.put("date", date);
				result.put("success", Boolean.TRUE);
			}else {
				result.put("status", "404");
				result.put("success", Boolean.FALSE);
			}
			
			logger.info("执行编辑纪念日操作！");
		}else {
			result.put("success", Boolean.FALSE);
		}
		
		return result;
	}
	
    /**
     * <pre>
     * 删除用户纪念日
     * </pre>
     * 小程序和公众账号公用方法
     * @throws IOException 
     */
	@ApiOperation(value = "根据纪念日ID删除纪念日", httpMethod = "GET", response = Map.class, notes = "根据纪念日ID删除纪念日")
    @ApiImplicitParams({@ApiImplicitParam(name = "纪念日ID",value = "dateId",dataType = "String",paramType = "path",required=true)})
    @RequestMapping("/deleteDate")
    public Map<String,Object> deleteDate( HttpServletRequest request,HttpServletResponse response) throws IOException {
    	Map<String,Object> result=new HashMap<String,Object>();
    	String dateId = request.getParameter("dateId").toString();
    	
    	if(!"".equals(dateId)) {
    		helperService.deleteByPrimaryKey(dateId);
    		result.put("success", Boolean.TRUE);
    		logger.info("执行删除纪念日操作！");
    	}else {
    		result.put("success", Boolean.FALSE);
    	}
    	 
		return result;
    }
    
    
    @RequestMapping("/getData")
    public Map<String,Object> getData( HttpServletRequest request,HttpServletResponse response) throws IOException {
    	Map<String,Object> result = Maps.newLinkedHashMap(); 
    	Yearww yw=null;
    	List<Yearww> list =new ArrayList<Yearww>();
    	for(int i=1900;i<=2100;i++) {
    		yw=new Yearww();
    		yw.setKey(i+"");
    		yw.setValue(i+"("+Lunars.lunarYearToGanZhi(i)+")");
    		list.add(yw);
		}
    	result.put("years",list);
    	logger.info("执行日志打印测试操作！");
    	return result;
    }
    
    /**
     * <pre>
     * 判断用户是否关注某个纪念日根据dateId
     * </pre>
     * 判断用户是否关注某个纪念日根据dateId
     * @throws IOException 
     */
	@ApiOperation(value = "判断用户是否关注某个纪念日根据dateId", httpMethod = "GET", response = Map.class, notes = "判断用户是否关注某个纪念日")
    @ApiImplicitParams({@ApiImplicitParam(name = "纪念日ID",value = "dateId",dataType = "String",paramType = "path",required=true)
    ,@ApiImplicitParam(name = "sessionKey",value = "sessionKey",dataType = "String",paramType = "path",required=true)})
    @RequestMapping("/isAttentionDate")
    public Map<String,Object> isAttentionDate( HttpServletRequest request,HttpServletResponse response) throws IOException {
    	Map<String,Object> result=new HashMap<String,Object>();
    	String dateId = request.getParameter("dateId").toString();
    	String sessionKey=request.getParameter("sessionKey");
		String openid=sessionKey.substring(27, 55);
    	if(!"".equals(openid)) {
    		Muser user=helperService.findUserByAppOpenId(openid);
    		
    		if(user!=null&&!"".equals(dateId)) {
    			boolean has=helperService.getDateListByUnionIdAndDateId(user.getUnionid(),dateId);

    			if(!has) {
    				has=helperService.getDateListByUnionIdAndRemark(user.getUnionid(),dateId);
    			}
    			result.put("has",has);
    			result.put("success", Boolean.TRUE);
    		}else {
    			result.put("has",Boolean.FALSE);
    			result.put("success", Boolean.FALSE);
    		}
    	}
    	
		return result;
    }
	
	/**
	 * <pre>
	 * 关注某个纪念日根据dateId
	 * </pre>
	 * 关注某个纪念日根据dateId
	 * @throws IOException 
	 */
	@ApiOperation(value = "关注某个纪念日根据dateId", httpMethod = "GET", response = Map.class, notes = "关注某个纪念日")
	@ApiImplicitParams({@ApiImplicitParam(name = "纪念日ID",value = "dateId",dataType = "String",paramType = "path",required=true),
		@ApiImplicitParam(name = "sessionKey",value = "sessionKey",dataType = "String",paramType = "path",required=true)})
	@RequestMapping("/attentionDate")
	public Map<String,Object> attentionDate( HttpServletRequest request,HttpServletResponse response) throws IOException {
		Map<String,Object> result=new HashMap<String,Object>();
		String dateId = request.getParameter("dateId").toString();
		String sessionKey=request.getParameter("sessionKey");
		String openid=sessionKey.substring(27, 55);
		if(!"".equals(openid)) {
			Muser user=helperService.findUserByAppOpenId(openid);
			
			if(user!=null&&!"".equals(dateId)) {
				boolean has=helperService.getDateListByUnionIdAndDateId(user.getUnionid(),dateId);
				if(!has) {
					List<DateList> dateList=helperService.getDateListByDateId(dateId);
					if(dateList!=null&&dateList.size()>0) {
						DateList date=dateList.get(0);
						
						if(date.getOpenId().equals(user.getOpenid())||date.getOpenId().equals(user.getAppOpenid())) {
							result.put("success", Boolean.FALSE);
						}else {
							String newDateId=GrnerateUUID.getUUID();
							date.setDateId(newDateId);
							date.setOpenId(openid);
							date.setUserId(user.getId());
							if(date.getRemarkt()!=null&&!"".equals(date.getRemarkt())) {
								date.setRemarkt(date.getRemarkt());
							}else {
								date.setRemarkt(dateId);
							}
							date.setCreateTime(new Date());
							
							helperService.insertDate(date);
							result.put("success", Boolean.TRUE);
							
							List<PraiseRecords> recordsList=dateService.getDatePraiseRecordsList(dateId);
							if(recordsList!=null&&recordsList.size()>0) {
								for(PraiseRecords record:recordsList) {
									dateService.addPraiseForServer(newDateId, record.getUserId(), record.getPraiseCount());
								}
							}
						}
					}else {
						result.put("success", Boolean.FALSE);
					}
				}else {
					result.put("success", Boolean.FALSE);
				}
			}else {
				result.put("success", Boolean.FALSE);
			}
		}
		
		return result;
	}
	
	/**
	 * 发送公众号二维码给小程序用户
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception 
	 */
    @RequestMapping("/sendQR")
    public Map<String,Object> sendQR( HttpServletRequest request,HttpServletResponse response) throws Exception {
    	Map<String,Object> result = Maps.newLinkedHashMap(); 
    	String sessionKey=request.getParameter("sessionKey");
		String openid=sessionKey.substring(27, 55);
		
		pushService.setSendCustomerMsgLink(openid);
		result.put("success", Boolean.TRUE);
		logger.info("执行发送二维码操作！");
		
    	return result;
    }
    
    /**
     * 更新纪念日背景图片
     * @param request
     * @param response
     * @return
     * @throws Exception 
     */
    @RequestMapping("/updateDateBg")
    public Map<String,Object> updateDateBg( HttpServletRequest request,HttpServletResponse response) throws Exception {
    	Map<String,Object> result=new HashMap<String,Object>();
		// 获取文件需要上传到的路径
		String path = request.getRealPath("/upload") + "/";
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdir();
		}

		request.setCharacterEncoding("utf-8"); // 设置编码
		// 获得磁盘文件条目工厂
		DiskFileItemFactory factory = new DiskFileItemFactory();
		/**
		 * 原理: 它是先存到暂时存储室，然后再真正写到对应目录的硬盘上， 按理来说当上传一个文件时，其实是上传了两份，第一个是以 .tem 格式的
		 * 然后再将其真正写到对应目录的硬盘上
		 */
		factory.setRepository(dir);
		// 设置缓存的大小，当上传文件的容量超过该缓存时，直接放到暂时存储室
		factory.setSizeThreshold(1024 * 1024);
		ServletFileUpload upload = new ServletFileUpload(factory);
		List<FileItem> list = upload.parseRequest(request);
		
		for (FileItem item : list) {
			if (item.isFormField()) {
				// 获取表单的属性名字
				String name = item.getFieldName();
				// 如果获取的表单信息是普通的 文本 信息
				if (item.isFormField()) {
					// 获取用户具体输入的字符串
					String value = item.getString();
					request.setAttribute(name, value);
				}
			}
		}
		
		String dateId=request.getAttribute("dateId").toString();
    	
    	if(!"".equals(dateId)) {
    		DateList date=helperService.selectByPrimaryKey(dateId);
    		
    		if(null!=date) {
    			String filePath=this.uploadPictures(list,true);
    			if(filePath.length()>8) {
    				date.setDateBg(filePath);
    				result.put("imageUrl",filePath);
    			}else {
    				date.setDateBg("");
    				result.put("imageUrl","");
    			}
    			
    			helperService.updateByPrimaryKey(date);
    			result.put("success", Boolean.TRUE);
    		}else {
    			result.put("success", Boolean.FALSE);
    		}
    	}else {
    		result.put("success", Boolean.FALSE);
    	}
    	 
    	logger.info("执行上传背景操作！");
    	
		return result;
    }
    
    /**
     * 图片上传公共方法
     * @param request
     * @param response
     * @return 
     * @throws Exception
     */
	public String uploadPictures(List<FileItem> list,boolean single) throws Exception {
		// 高水平的API文件上传处理
		try {
			if(list!=null&&list.size()<0) {
				return "";
			}
			
			String images="";
			for (FileItem item : list) {
				if (item.isFormField()) {
					continue;
				}
				
				String fileType=".png";
				InputStream in = item.getInputStream();
				if("image/jpeg".equals(item.getContentType())) {
					fileType=".png";
				}else if("image/gif".equals(item.getContentType())) {
					fileType=".gif";
				}else if("image/bmp".equals(item.getContentType())) {
					fileType=".bmp";
				}
				
				Random ran = new Random();
				String fileName=System.currentTimeMillis()+"";
				for(int i = 0;i < 3;i++){
					fileName += ran.nextInt(9);
				}
				
	    		OSSClient ossClient=AliyunOSSService.getOSSClient();
	    		AliyunOSSService.uploadObject2OSS(ossClient, in, Constantutils.BACKET_NAME,Constantutils.BG_FOLDER, fileName+fileType, item.getSize());
	    		if(single) {
	    			images=(images==null?"":images)+"/"+Constantutils.BG_FOLDER+fileName+fileType;
	    		}else {
	    			images=(images==null?"":images)+"/"+Constantutils.BG_FOLDER+fileName+fileType+";";
	    		}
				in.close();
			}
			
			return images;
		} catch (Exception e) {
			logger.error("", e);
		}
		
		return "";
	}
	
	/**
	 * 根据用户信息查询最后一条生日密码
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/getLastSecret")
	public Map<String, Object> getLastSecret(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Map<String, Object> result = new HashMap<String, Object>();
		String sessionKey=request.getParameter("sessionKey");
		String openid=sessionKey.substring(27, 55);
		
		DateList date = helperService.getLastSecretByMaOpenId(openid);
		if(date!=null) {
			String key="";
			if(date.getGc()) {
				key=(date.getDateTime().getMonth()+1)+"-"+date.getDateTime().getDate();
			}else {
				if(date.getLunarCh().contains("闰")) {
					key=helperService.lunarToSolar(date.getLunarDate().getYear()+1900,date.getLunarDate().getMonth()+1,date.getLunarDate().getDate(),true);
				}else {
					key=helperService.lunarToSolar(date.getLunarDate().getYear()+1900,date.getLunarDate().getMonth()+1,date.getLunarDate().getDate(),false);
				}
			}
			result.put("key", key);
			result.put("userId", date.getUserId());
			result.put("success", Boolean.TRUE);
		}else {
			result.put("status", "empty");
			result.put("success", Boolean.FALSE);
		}
		
		return result;
	}
	
	/**
	 * 根据sessionkey查询用户信息
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/getUserInfoBySessionKey")
	public Map<String, Object> getUserInfoBySessionKey(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Map<String, Object> result = new HashMap<String, Object>();
		String sessionKey=request.getParameter("sessionKey");
		String openid=sessionKey.substring(27, 55);
		
		Muser muser = helperService.getUserByTOpenId(openid);
		if(muser!=null) {
			result.put("url", muser.getHeadimgurl());
			result.put("name", muser.getNickname());
			result.put("id", muser.getId());
			result.put("success", Boolean.TRUE);
		}else {
			result.put("success", Boolean.FALSE);
		}
		
		return result;
	}
	
	/**
	 * 根据sessionkey查询用户信息
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/getUserInfoById")
	public Map<String, Object> getUserInfoById(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Map<String, Object> result = new HashMap<String, Object>();
		String userId=request.getParameter("userId");
		
		Muser muser = helperService.findUserByUserId(userId);
		if(muser!=null) {
			result.put("url", muser.getHeadimgurl());
			result.put("name", muser.getNickname());
			result.put("id", muser.getId());
			result.put("success", Boolean.TRUE);
		}else {
			result.put("success", Boolean.FALSE);
		}
		
		return result;
	}
	
}
