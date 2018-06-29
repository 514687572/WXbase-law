package com.stip.net.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.aliyun.oss.OSSClient;
import com.stip.net.entity.BirthdaySecret;
import com.stip.net.entity.DateHistory;
import com.stip.net.entity.DateList;
import com.stip.net.entity.Muser;
import com.stip.net.mp.dto.DateHistoryVo;
import com.stip.net.service.AliyunOSSService;
import com.stip.net.service.DateService;
import com.stip.net.service.HelperService;
import com.stip.net.service.SysService;
import com.stip.net.utils.Constantutils;
import com.stip.net.utils.GrnerateUUID;
import com.stip.net.utils.TimeUtils;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * 微信小程序用户接口
 *
 * @author cja
 */
@Api(value = "纪念日送祝福送礼物")
@RestController
@RequestMapping("/date")
public class DateController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private HelperService helperService;
    @Autowired
    private DateService dateService;
    @Resource
    public SysService sysService;

    /**
     * <pre>
     * 对于某个指定纪念日送祝福
     * </pre>
     * @throws Exception 
     * @throws IOException 
     */
    @ApiOperation(value = "对指定纪念日送祝福", httpMethod = "GET", response = Map.class, notes = "送祝福")
    @ApiImplicitParams({@ApiImplicitParam(name = "sessionKey",value = "sessionKey",dataType = "String",paramType = "path",required=true),
    		@ApiImplicitParam(name = "dateId",value = "dateId",dataType = "String",paramType = "path",required=true),
    		@ApiImplicitParam(name = "addCount",value = "addCount",dataType = "String",paramType = "path",required=true)})
    @RequestMapping("/addPraise")
    public Map<String,Object> addPraise(HttpServletRequest request,HttpServletResponse response) throws IOException, Exception {
    	Map<String,Object> result=null;
    	String dateId = request.getParameter("dateId").toString();
    	
    	String sessionKey=request.getParameter("sessionKey");
		String openid=sessionKey.substring(27, 55);
    	if(!"".equals(openid)) {
    		Muser user=helperService.findUserByAppOpenId(openid);
    		if(user!=null) {
    			String addCount=request.getParameter("addCount");
    			result=dateService.addPraise(dateId, user.getId(),addCount);
    			result.put("success", Boolean.TRUE);
    		}else {
    			result=new HashMap<String,Object>(); 
    			result.put("success", Boolean.FALSE);
    		}
    	}
    	
		return result;
    }
    
    /**
     * <pre>
     *查询指定纪念日点赞次数和当前用户点赞次数
     * </pre>
     * @throws Exception 
     * @throws IOException 
     */
    @ApiOperation(value = "查询指定纪念日点赞次数和当前用户点赞次数", httpMethod = "GET", response = Map.class, notes = "查询指定纪念日点赞次数和当前用户点赞次数")
    @ApiImplicitParams({@ApiImplicitParam(name = "sessionKey",value = "sessionKey",dataType = "String",paramType = "path",required=true),
    	@ApiImplicitParam(name = "dateId",value = "dateId",dataType = "String",paramType = "path",required=true)})
    @RequestMapping("/getPraiseInfo")
    public Map<String,Object> getPraiseInfo(HttpServletRequest request,HttpServletResponse response) throws IOException, Exception {
    	Map<String,Object> result=null;
    	String dateId = request.getParameter("dateId").toString();
    	
    	String sessionKey=request.getParameter("sessionKey");
    	String openid=sessionKey.substring(27, 55);
    	if(!"".equals(openid)) {
    		Muser user=helperService.findUserByAppOpenId(openid);
    		if(user!=null) {
    			result=dateService.getDatePraise(dateId, user.getId());
    			result.put("success", Boolean.TRUE);
    		}else {
    			result=new HashMap<String,Object>(); 
    			result.put("success", Boolean.FALSE);
    		}
    	}
    	
    	return result;
    }
    
    /**
     * <pre>
     *查询指定纪念日点赞记录排行数
     * </pre>
     * @throws Exception 
     * @throws IOException 
     */
    @ApiOperation(value = "查询指定纪念日点赞记录排行数", httpMethod = "GET", response = Map.class, notes = "查询指定纪念日点赞记录排行数")
    @ApiImplicitParams({@ApiImplicitParam(name = "dateId",value = "dateId",dataType = "String",paramType = "path",required=true)})
    @RequestMapping("/getPraiserecords")
    public Map<String,Object> getPraiserecords(HttpServletRequest request,HttpServletResponse response) throws IOException, Exception {
    	Map<String,Object> result=null;
    	String dateId = request.getParameter("dateId").toString();
    	
    	if(!"".equals(dateId)) {
    		result=dateService.getDatePraiseRecords(dateId);
			result.put("success", Boolean.TRUE);
    	}else {
    		result.put("success", Boolean.FALSE);
    	}
    	
    	return result;
    }
    
    /**
     * 纪念日历史节点图片上传
     * @param request
     * @param response
     * @throws Exception
     */
	@RequestMapping("/uploadPicture")
	public void uploadPicture(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Map<Object,Object> result=new HashMap<Object,Object>();
		PrintWriter printWriter = response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        
		boolean isExists=true;
		// 获取文件需要上传到的路径
		String path = request.getRealPath("/upload") + "/";
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdir();
		}

		request.setCharacterEncoding("utf-8"); // 设置编码
		// 获得磁盘文件条目工厂
		DiskFileItemFactory factory = new DiskFileItemFactory();

		// 如果没以下两行设置的话,上传大的文件会占用很多内存，
		// 设置暂时存放的存储室,这个存储室可以和最终存储文件的目录不同
		/**
		 * 原理: 它是先存到暂时存储室，然后再真正写到对应目录的硬盘上， 按理来说当上传一个文件时，其实是上传了两份，第一个是以 .tem 格式的
		 * 然后再将其真正写到对应目录的硬盘上
		 */
		factory.setRepository(dir);
		// 设置缓存的大小，当上传文件的容量超过该缓存时，直接放到暂时存储室
		factory.setSizeThreshold(1024 * 1024);
		// 高水平的API文件上传处理
		ServletFileUpload upload = new ServletFileUpload(factory);
		try {
			List<FileItem> list = upload.parseRequest(request);
			DateHistory dateHistory=null;
			result.put("success", Boolean.FALSE);
			if(list!=null&&list.size()<0) {
				printWriter.write(JSON.toJSONString(result));
		        printWriter.flush();
		        
				return;
			}
			
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
				String hisId=request.getAttribute("hisId").toString();
				
				dateHistory=dateService.selectByPrimaryKey(hisId);
	    		if(null==dateHistory) {
	    			dateHistory=new DateHistory();
	    			dateHistory.setHisId(hisId);
	    			isExists=false;
	    		}
				
	    		OSSClient ossClient=AliyunOSSService.getOSSClient();
	    		AliyunOSSService.uploadObject2OSS(ossClient, in, Constantutils.BACKET_NAME,Constantutils.FOLDER, fileName+fileType, item.getSize());
	    		String images=dateHistory.getHisImages();
	    		dateHistory.setHisImages((images==null?"":images)+"/"+Constantutils.FOLDER+fileName+fileType+";");
				in.close();
			}
			
			dateHistory.setUpdateTime(new Date());
			if(isExists) {
				dateService.updateByPrimaryKey(dateHistory);
			}else {
				dateService.insertDateHistory(dateHistory);
			}
			result.put("success", Boolean.TRUE);
		} catch (FileUploadException e1) {
			logger.error("", e1);
		} catch (Exception e) {
			logger.error("", e);
		}
		
        printWriter.write(JSON.toJSONString(result));
        printWriter.flush();
	}
	
	/**
	 * 获取纪念日历史节点ID
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 * @throws Exception
	 */
    @RequestMapping("/getHistoryId")
    public Map<String,Object> getHistoryId(HttpServletRequest request,HttpServletResponse response) throws IOException, Exception {
    	Map<String,Object> result=new HashMap<String,Object>();
    	
    	result.put("hisId",GrnerateUUID.getUUID());
    	result.put("success", Boolean.TRUE);
    	
    	return result;
    }
    
    /**
     * 根据纪念日节点ID删除对应节点
     * @param request
     * @param response
     * @return
     * @throws IOException
     * @throws Exception
     */
    @RequestMapping("/deleteHis")
    public Map<String,Object> deleteHis(HttpServletRequest request,HttpServletResponse response) throws IOException, Exception {
    	Map<String,Object> result=new HashMap<String,Object>();
    	String hisId = request.getParameter("hisId").toString();
    	
    	int rec=dateService.deleteByPrimaryKey(hisId);
    	
    	if(rec>0) {
    		result.put("success", Boolean.TRUE);
    	}else {
    		result.put("success", Boolean.FALSE);
    	}
    	
    	return result;
    }
    
    /**
     * 保存纪念日历史节点
     * @param request
     * @param response
     * @return
     * @throws IOException
     * @throws Exception
     */
    @PostMapping("/saveHistoryNode")
    public Map<String,Object> saveHistoryNode(HttpServletRequest request,HttpServletResponse response) throws IOException, Exception {
    	Map<String,Object> result=new HashMap<String,Object>();
    	String hisId = request.getParameter("hisId").toString();
    	String dateId = request.getParameter("dateId").toString();
    	String hisDateTime = request.getParameter("hisDateTime").toString();
    	String hisTitle = request.getParameter("hisTitle").toString();
    	
    	result.put("success", Boolean.FALSE);
    	if(null!=dateId){
    		DateHistory history=dateService.selectByPrimaryKey(hisId);
    		if(null!=history) {
    			history.setHisDateTime(TimeUtils.stringToDate(hisDateTime, "yyyy-MM-dd"));
    			history.setHisTitle(hisTitle);
    			history.setCreateTime(new Date());
    			history.setDateId(dateId);
    			
    			dateService.updateByPrimaryKey(history);
    			
    			result.put("success", Boolean.TRUE);
    			logger.info("执行添加节点操作！");
    		}
    	}
    	
    	return result;
    }
    
    public static void main(String[] args) throws Exception {
    	String hisTitle="?????";
    	hisTitle=new String(hisTitle.getBytes("utf-8"),"ISO-8859-1");
    	
    	System.out.println(hisTitle);
	}
    
    /**
     * 得到纪念日历史节点
     * @param request
     * @param response
     * @return
     * @throws IOException
     * @throws Exception
     */
	@RequestMapping("/getDateHistoryInfo")
	public Map<String, Object> getDateHistoryInfo(HttpServletRequest request, HttpServletResponse response) throws IOException, Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		String page = request.getParameter("page").toString();
		String record = request.getParameter("record").toString();
		String dateId = request.getParameter("dateId").toString();

		result.put("success", Boolean.FALSE);
		if (null != dateId) {
			List<DateHistory> historyList = dateService.selectByExampleByPage(dateId, Integer.parseInt(page),Integer.parseInt(record));
			List<DateHistoryVo> voList =new ArrayList<DateHistoryVo>();
			
			if(historyList!=null&&historyList.size()>0) {
				for(DateHistory history:historyList) {
					if (null != history) {
						DateHistoryVo hisVo=new DateHistoryVo();
						List<String> imagesList =new ArrayList<String>();
						String[] ima=history.getHisImages().split(";");
						
						for(String s:ima) {
							if(StringUtils.isNotBlank(s)&&s.length()>5) {
								imagesList.add(s);
							}
						}
						
						hisVo.setImages(imagesList);
						hisVo.setHisId(history.getHisId());
						hisVo.setTitle(history.getHisTitle());
						String date=TimeUtils.dateToString(history.getHisDateTime(), "yyyy-MM-dd");
						hisVo.setHisDate(date);
						String[] dates=date.split("-");
						hisVo.setYear(dates[0]);
						hisVo.setMonth(dates[1]);
						hisVo.setDay(dates[2]);
						
						voList.add(hisVo);
					}
				}
				
			}
			
			result.put("success", Boolean.TRUE);
			result.put("list", voList);
		}

		return result;
	}
	
	/**
	 * 获取小程序背景图片
	 * 
	 * @param request
	 * @param resp
	 * @throws Exception
	 */
	@GetMapping("/getDateImage")
	public void getappCode(HttpServletRequest request, HttpServletResponse resp) throws Exception {
		String dateId = request.getParameter("dateId");
		List<DateList> dateList=helperService.getDateListByDateId(dateId);
		
		if(dateList!=null&&dateList.size()>0) {
			DateList date=dateList.get(0);
			if(date.getDateBg().length()>5) {
				URL url = new URL(Constantutils.imagesUrlHeader+date.getDateBg()+"?x-oss-process=image/resize,m_fill,h_770,w_700");  
		        //打开链接  
		        HttpURLConnection conn = (HttpURLConnection)url.openConnection();  
		        //设置请求方式为"GET"  
		        conn.setRequestMethod("GET");  
		        //超时响应时间为5秒  
		        conn.setConnectTimeout(5 * 1000);  
		        //通过输入流获取图片数据  
		        InputStream inStream = conn.getInputStream();  

				
				if (inStream.available()>0) {
					BufferedImage bi = ImageIO.read(inStream);
					
					resp.setHeader("Pragma", "no-cache");
					resp.setHeader("Cache-Control", "no-cache");
					resp.setDateHeader("Expires", 0);
					resp.setContentType("image/png");
					// 将图像输出到Servlet输出流中。
					ServletOutputStream sos = resp.getOutputStream();
					ImageIO.write(bi, "png", sos);
					sos.close();
				}
			}
		}
	}
	
	/**
	 * 获取纪念日历史节点ID
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 * @throws Exception
	 */
    @RequestMapping("/getBirthdaySecret")
    public Map<String,Object> getBirthdaySecret(HttpServletRequest request,HttpServletResponse response) throws IOException, Exception {
    	Map<String,Object> result=new HashMap<String,Object>();
    	String key = request.getParameter("key");
    	BirthdaySecret bs=sysService.getBirthdaySecretByKey(key);
    	
    	if(null!=bs) {
    		result.put("secret",bs);
    		result.put("success", Boolean.TRUE);
    	}else {
    		result.put("success", Boolean.FALSE);
    	}
    	
    	return result;
    }
    
    /**
     * 用户系统设置
     * @param request
     * @return
     * @throws IOException
     * @throws Exception
     */
    @RequestMapping("/userSettingChange")
    public Map<String,Object> userSettingChange(HttpServletRequest request) throws IOException, Exception {
    	Map<String,Object> result=new HashMap<String,Object>();
    	String isOpen = request.getParameter("isOpen");
    	String sessionKey=request.getParameter("sessionKey");
    	String openid=sessionKey.substring(27, 55);
    	
    	if(!"".equals(openid)) {
    		Muser user=helperService.findUserByAppOpenId(openid);
    		
    		if(Constantutils.ADMIN_USER_CLOSED.equals(isOpen)) {
    			user.setRemark(Constantutils.ADMIN_USER_CLOSED);
    		}else {
    			user.setRemark("");
    		}
    		
    		helperService.updateByPrimaryKey(user);
    		result.put("success", Boolean.TRUE);
		}else {
			result.put("success", Boolean.FALSE);
		}
    	
    	return result;
    }
	
}
