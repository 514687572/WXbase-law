package com.stip.net.controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.stip.net.dto.PhoneDto;
import com.stip.net.entity.*;
import com.stip.net.example.BlogContentExample;
import com.stip.net.example.SocketInfoExample;
import com.stip.net.example.SysDictExample;
import com.stip.net.example.UserStockInfoExample;
import com.stip.net.miniapp.api.WxMaQrcodeService;
import com.stip.net.miniapp.api.WxMaService;
import com.stip.net.miniapp.api.impl.WxMaQrcodeServiceImpl;
import com.stip.net.miniapp.bean.WxMaJscode2SessionResult;
import com.stip.net.miniapp.bean.WxMaUserInfo;
import com.stip.net.miniapp.util.crypt.WxMaCryptUtils;
import com.stip.net.miniapp.util.json.WxMaGsonBuilder;
import com.stip.net.service.*;
import com.stip.net.utils.GrnerateUUID;
import com.stip.net.utils.JsonUtils;
import me.chanjar.weixin.common.exception.WxErrorException;
import org.apache.avro.LogicalTypes;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 微信小程序用户接口
 *
 * @author cja
 */
@RestController
@RequestMapping("/stock")
public class StockController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public SocketInfoService socketInfoService;
    @Autowired
    private WxMaService wxMaService;
    @Autowired
    private UserStockInfoService userStockInfoService;
    @Autowired
    private UserStockService userStockService;
    @Autowired
    private SysDictService sysDictService;
    @Autowired
    private BlogContentService blogContentService;

    /**
     * 获取系统股票信息
     * @throws Exception 
     */
    @GetMapping("getStockList")
    public Map<String,Object> getStockList(HttpServletRequest request) throws Exception {
		Map<String,Object> result=new HashMap<String,Object>();
    	String page=request.getParameter("page");
    	String record=request.getParameter("record");

		List<SocketInfo> list=socketInfoService.getSocketInforByPage(page,record);

		if(null==list){
			result.put("status","空记录");
			result.put("success",Boolean.FALSE);
		}else{
			result.put("date",list);
			result.put("success",Boolean.TRUE);
		}

		return result;
    }

    /**
     * 登陆接口
     * @throws Exception
     */
    @GetMapping("searchStock")
    public Map<String,Object> searchStock(HttpServletRequest request) throws Exception {
        Map<String,Object> result=new HashMap<String,Object>();
        String page=request.getParameter("page");
        String record=request.getParameter("record");
        String keyWords=request.getParameter("keyWords");

        List<SocketInfo> list=socketInfoService.getSocketInforByPage(page,record,keyWords);

        if(null==list){
            result.put("status","空记录");
            result.put("success",Boolean.FALSE);
        }else{
            result.put("date",list);
            result.put("success",Boolean.TRUE);
        }

        return result;
    }

    /**
     * <pre>
     * 解密用户手机号
     * </pre>
     */
    public static String decryptPhone(String sessionKey, String encryptedData, String iv) {
        // 解密用户信息
        String userInfo = WxMaCryptUtils.wxDecrypt(encryptedData,sessionKey, iv);

        return userInfo;
    }

    /**
     * 解密用户手机号
     * @throws Exception
     */
    @PostMapping("getPhone")
    public Map<String,Object> getPhone(HttpServletRequest request) throws Exception {
        Map<String,Object> result=new HashMap<String,Object>();
        String encryptedData=request.getParameter("encryptedData");
        String sessionKey=request.getParameter("sessionKey");
        String iv=request.getParameter("iv");

        System.out.println(encryptedData);
        System.out.println(sessionKey);
        System.out.println(iv);

        String pString=decryptPhone(sessionKey,encryptedData,iv);

        if(null!=pString){
            result.put("success",Boolean.TRUE);
            result.put("date",pString);
        }else{
            result.put("success",Boolean.FALSE);
        }

        return result;

    }

    /**
     * 加入索赔
     * @throws Exception
     */
    @PostMapping("joinClaim")
    public Map<String,Object> joinClaim(HttpServletRequest request) throws Exception {
        Map<String,Object> result=new HashMap<String,Object>();
        String phone=request.getParameter("phone");
        String money=request.getParameter("money");
        String name=request.getParameter("name");
        String address=request.getParameter("address");
        String sName=request.getParameter("sname");
        String sNum=request.getParameter("snum");
        String sid=request.getParameter("sid");
        String[] sessionKey=request.getParameter("sessionKey").split("&\\$&");
        String openid=sessionKey[1];


        UserStockInfo userStockInfo=new UserStockInfo();
        userStockInfo.setCreateTime(new Date());
        userStockInfo.setOutMoney(money);
        userStockInfo.setStockName(sName);
        if(null!=sid&&!"".equals(sid)){
            userStockInfo.setStockNum(Integer.parseInt(sid));
        }
        userStockInfo.setStockCode(sNum);
        userStockInfo.setUserAddress(address);
        userStockInfo.setUserName(name);
        userStockInfo.setUserPhone(phone);
        userStockInfo.setUserOpenId(openid);

        int rt=userStockInfoService.insert(userStockInfo);

        if(rt==1){
            result.put("msg","信息录入成功");
            result.put("success",Boolean.TRUE);
        }else{
            result.put("success",Boolean.FALSE);
        }

        return result;

    }

    /**
     * 加入索赔
     * @throws Exception
     */
    @PostMapping("addStock")
    public Map<String,Object> addstock(HttpServletRequest request) throws Exception {
        Map<String,Object> result=new HashMap<String,Object>();
        String sName=request.getParameter("sname");
        String sNum=request.getParameter("snum");
        String[] sessionKey=request.getParameter("sessionKey").split("&\\$&");
        String openid=sessionKey[1];


        UserStock userStock=new UserStock();
        userStock.setStockName(sName);
        userStock.setUserOpenId(openid);
        userStock.setStockCode(sNum);

        int rt=userStockService.insert(userStock);

        if(rt==1){
            result.put("msg","信息录入成功");
            result.put("success",Boolean.TRUE);
        }else{
            result.put("success",Boolean.FALSE);
        }

        return result;

    }

    /**
     * 加入索赔
     * @throws Exception
     */
    @PostMapping("deleteStock")
    public Map<String,Object> deleteStock(HttpServletRequest request) throws Exception {
        Map<String,Object> result=new HashMap<String,Object>();
        String sockId=request.getParameter("sockId");
        String[] sessionKey=request.getParameter("sessionKey").split("&\\$&");
        String openid=sessionKey[1];


        int rt=userStockService.deleteByPrimaryKey(Integer.parseInt(sockId));

        if(rt==1){
            result.put("msg","删除成功");
            result.put("success",Boolean.TRUE);
        }else{
            result.put("success",Boolean.FALSE);
        }

        return result;

    }

    /**
     * 查询用户股票
     * @throws Exception
     */
    @GetMapping("getUserStock")
    public Map<String,Object> getUserStock(HttpServletRequest request) throws Exception {
        Map<String,Object> result=new HashMap<String,Object>();
        String page=request.getParameter("page");
        String record=request.getParameter("record");
        String[] sessionKey=request.getParameter("sessionKey").split("&\\$&");
        String openid=sessionKey[1];

        List<UserStock> list=userStockService.getSocketByPage(page,record,openid);

        if(null==list){
            result.put("status","空记录");
            result.put("success",Boolean.FALSE);
        }else{
            result.put("date",list);
            result.put("success",Boolean.TRUE);
        }

        return result;
    }

    /**
     * 客服电话
     * @throws Exception
     */
    @GetMapping("getCosPhone")
    public Map<String,Object> getCosPhone(HttpServletRequest request) throws Exception {
        Map<String,Object> result=new HashMap<String,Object>();

        SysDictExample example=new SysDictExample();
        example.createCriteria().andTypeEqualTo("cos_phone");

        List<SysDict> list=sysDictService.selectByExample(example);

        if(null==list){
            result.put("status","空记录");
            result.put("success",Boolean.FALSE);
        }else{
            result.put("date",list);
            result.put("success",Boolean.TRUE);
        }

        return result;
    }

    /**
     * 指南
     * @throws Exception
     */
    @GetMapping("getReadMe")
    public Map<String,Object> getReadMe(HttpServletRequest request) throws Exception {
        Map<String,Object> result=new HashMap<String,Object>();

        BlogContentExample example=new BlogContentExample();
        example.createCriteria().andCidEqualTo(122l);

        List<BlogContent> list=blogContentService.selectByExample(example);

        if(null==list){
            result.put("status","空记录");
            result.put("success",Boolean.FALSE);
        }else{
            result.put("date",list);
            result.put("success",Boolean.TRUE);
        }

        return result;
    }

    /**
     * 根据ID获取详情
     * @throws Exception
     */
    @GetMapping("getDetailById")
    public Map<String,Object> getDetailById(HttpServletRequest request) throws Exception {
        Map<String,Object> result=new HashMap<String,Object>();
        String id=request.getParameter("id");

        BlogContentExample example=new BlogContentExample();
        example.createCriteria().andCategoriesEqualTo(id);

        List<BlogContent> list=blogContentService.selectByExample(example);

        if(null==list){
            result.put("status","空记录");
            result.put("success",Boolean.FALSE);
        }else{
            result.put("date",list);
            result.put("success",Boolean.TRUE);
        }

        return result;
    }

    /**
     * 根据ID获取详情
     * @throws Exception
     */
    @GetMapping("getUserStockList")
    public Map<String,Object> getUserStockList(HttpServletRequest request) throws Exception {
        Map<String,Object> result=new HashMap<String,Object>();
        String[] sessionKey=request.getParameter("sessionKey").split("&\\$&");
        String openid=sessionKey[1];
        String page=request.getParameter("page");
        String record=request.getParameter("record");

        UserStockInfoExample example=new UserStockInfoExample();
        example.createCriteria().andUserOpenIdEqualTo(openid);
        example.setPager(Integer.parseInt(page),Integer.parseInt(record));

        List<UserStockInfo> list=userStockInfoService.selectByExample(example);

        if(null==list){
            result.put("status","空记录");
            result.put("success",Boolean.FALSE);
        }else{
            result.put("date",list);
            result.put("success",Boolean.TRUE);
        }

        return result;
    }

}
