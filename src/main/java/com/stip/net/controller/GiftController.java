package com.stip.net.controller;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stip.net.entity.AlipayRecords;
import com.stip.net.entity.GiftList;
import com.stip.net.entity.GiftRecords;
import com.stip.net.entity.Muser;
import com.stip.net.mp.dto.AliGiftInfo;
import com.stip.net.mp.dto.GiftInfo;
import com.stip.net.mp.dto.GiftOrderInfo;
import com.stip.net.service.AlipayService;
import com.stip.net.service.GiftService;
import com.stip.net.service.HelperService;
import com.stip.net.service.PushService;
import com.stip.net.service.WalletService;
import com.stip.net.utils.GrnerateUUID;
import com.stip.net.utils.TimeUtils;

/**
 * @author cja
 */
@RestController
@RequestMapping("/gift")
public class GiftController {
	@Autowired
    private GiftService giftService;
	@Autowired
	private AlipayService alipayService;
	@Autowired
    private HelperService helperService;
	@Autowired
	private WalletService walletService;
	@Resource
	public PushService pushService;
	@Resource
	private ThreadPoolTaskExecutor threadPoolTaskExecutor;
	
	/**
	 * @Description: 查询所有礼物
	 * @param request
	 */
	@RequestMapping("/getGiftList")
	public Map<String, Object> getGiftList(HttpServletRequest request){
		Map<String,Object> result=new HashMap<String,Object>();
		List<GiftList> giftList=giftService.getGiftList();
		
		if(giftList!=null&&giftList.size()>0) {
			result.put("giftList", giftList);
			result.put("success", Boolean.TRUE);
		}else {
			result.put("success", Boolean.FALSE);
		}
		
		return result;
	}
	
	/**
	 * @Description: 根据礼物ID查询单个礼物详情
	 * @param request
	 */
	@RequestMapping("/getGiftById")
	public Map<String, Object> getGiftById(HttpServletRequest request){
		Map<String,Object> result=new HashMap<String,Object>();
		String giftId=request.getParameter("giftId");
		
		if(StringUtils.isNoneBlank(giftId)) {
			GiftList gift=giftService.getGiftById(Integer.parseInt(giftId));
			
			if(gift!=null) {
				result.put("gift", gift);
				result.put("success", Boolean.TRUE);
			}else {
				result.put("success", Boolean.FALSE);
			}
		}else {
			result.put("success", Boolean.FALSE);
		}
		
		return result;
	}
	
	/**
	 * @Description: 查询订单信息
	 * @param request
	 */
	@RequestMapping("/getOrderInfo")
	public Map<String, Object> getOrderInfo(HttpServletRequest request){
		Map<String,Object> result=new HashMap<String,Object>();
		String sessionKey=request.getParameter("sessionKey");
		String openid=sessionKey.substring(27, 55);
		String outTradeNo=request.getParameter("outTradeNo");
		
		AlipayRecords records=alipayService.getRecordsByOrderId(outTradeNo);
		
		if(records!=null) {
			GiftOrderInfo orderInfor=new GiftOrderInfo();
			GiftList gift=giftService.getGiftById(records.getGiftId());
			Muser outUser=helperService.getUserByTOpenId(records.getOpenId());
			orderInfor.setOutUserName(outUser.getNickname());
			orderInfor.setOutUserPic(outUser.getHeadimgurl());
			
			if(!StringUtils.isBlank(records.getOrderDes())) {
				orderInfor.setGiftDesc(records.getOrderDes());
			}else {
				orderInfor.setGiftDesc(gift.getGiftDesc());
			}
			orderInfor.setGiftImage(gift.getGiftImage());
			orderInfor.setGiftName(gift.getGiftName());
			orderInfor.setGiftPrice(gift.getGiftPrice());
			orderInfor.setGiftBg(gift.getRemark());
			
			if(openid.equals(records.getOpenId())) {
				orderInfor.setOwner("true");
			}else {
				orderInfor.setOwner("false");
			}
			
			if(records.getStatus().equals("SUCCESS")) {
				orderInfor.setUpdate_at(TimeUtils.dateToString(records.getUpdatedAt(), "yyyy-MM-dd HH:mm:ss"));
				orderInfor.setStatus("SUCCESS");
			}else if(records.getStatus().equals("GET_SUCCESS")) {
				orderInfor.setGetTime(TimeUtils.dateToString(records.getUpdatedAt(), "yyyy-MM-dd HH:mm:ss"));
				GiftRecords gr=giftService.getGiftRecordByOrderId(records.getOutTradeNo());
				Muser inUser=helperService.getUserByTOpenId(gr.getInOpenId());
				orderInfor.setInUserPic(inUser.getHeadimgurl());
				orderInfor.setInUserName(inUser.getNickname());
				orderInfor.setStatus("GET_SUCCESS");
				if(!openid.equals(gr.getInOpenId())&&"false".equals(orderInfor.getOwner())) {
					orderInfor.setOwner("other");
				}
			}else {
				orderInfor.setStatus("TIME_OUT");
			}
			
			result.put("orderInfo", orderInfor);
			result.put("success", Boolean.TRUE);
		}else {
			result.put("success", Boolean.FALSE);
		}
		
		return result;
	}
	
	/**
	 * @Description: 领取礼物
	 * @param request
	 * @throws Exception 
	 * @throws IOException 
	 */
	@Transactional
	@RequestMapping("/getGift")
	public Map<String, Object> getGift(HttpServletRequest request) throws IOException, Exception{
		Map<String,Object> result=new HashMap<String,Object>();
		String sessionKey=request.getParameter("sessionKey");
		String openid=sessionKey.substring(27, 55);
		String outTradeNo=request.getParameter("outTradeNo");
		
		AlipayRecords records=alipayService.getRecordsByOrderId(outTradeNo);
		
		synchronized (outTradeNo) {
			if(records.getStatus().equals("SUCCESS")) {
				if(records!=null) {
					GiftRecords giftRecords=new GiftRecords();
					giftRecords.setDateId(records.getDateId());
					giftRecords.setGiftId(records.getGiftId());
					giftRecords.setInOpenId(openid);
					giftRecords.setOutOpenId(records.getOpenId());
					giftRecords.setOutOrderNo(records.getOutTradeNo());
					giftRecords.setRecordId(GrnerateUUID.getUUID());
					giftRecords.setStatus("SUCCESS");
					giftRecords.setCreateTime(new Date());
					
					records.setStatus("GET_SUCCESS");
					records.setUpdatedAt(new Date());
					alipayService.updateByPrimaryKey(records);
					giftService.insertGiftRecords(giftRecords);
					
					walletService.addWalletHistory(openid,"+"+records.getAmount(), "收到礼物");
					walletService.updateWalletByOpenid(openid, records.getAmount());
					
					result.put("success", Boolean.TRUE);
				}else {
					result.put("success", Boolean.FALSE);
				}
			}else {
				result.put("success", Boolean.FALSE);
			}
			
			threadPoolTaskExecutor.execute(new Runnable() {  
                public void run() { 
                	GiftList gift=giftService.getGiftById(records.getGiftId());
                	Muser outUser=helperService.getUserByTOpenId(openid);
                	try {
						pushService.sendGetGiftMsg(gift.getGiftName(), outUser.getNickname(), records.getOpenId(), records.getPrepayId(),records.getOutTradeNo());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                }
            });
		}
		
		return result;
	}
	
	/**
	 * @Description: 查询送出礼物的列表
	 * @param request
	 */
	@RequestMapping("/getGiveGiftList")
	public Map<String, Object> getGiveGiftList(HttpServletRequest request){
		Map<String,Object> result=new HashMap<String,Object>();
		String sessionKey=request.getParameter("sessionKey");
		String openid=sessionKey.substring(27, 55);
		
		List<AliGiftInfo> recordList=alipayService.getRecordsByOpenId(openid);
		
		if(recordList!=null&&recordList.size()>0) {
			result.put("outGifts", recordList);
			result.put("success", Boolean.TRUE);
		}else {
			result.put("success", Boolean.FALSE);
		}
		
		return result;
	}
	
	/**
	 * @Description: 查询收到的礼物列表
	 * @param request
	 */
	@RequestMapping("/getInGiftList")
	public Map<String, Object> getInGiftList(HttpServletRequest request){
		Map<String,Object> result=new HashMap<String,Object>();
		String sessionKey=request.getParameter("sessionKey");
		String openid=sessionKey.substring(27, 55);
		
		List<GiftInfo> recordList=giftService.getGiftRecordByOpenId(openid);
		
		if(recordList!=null&&recordList.size()>0) {
			result.put("gifts", recordList);
			result.put("success", Boolean.TRUE);
		}else {
			result.put("success", Boolean.FALSE);
		}
		
		return result;
	}
	
	/**
	 * @Description: 设置礼物祝福语
	 * @param request
	 * @throws Exception 
	 */
	@RequestMapping("/setGiftDesc")
	public Map<String, Object> setGiftDesc(HttpServletRequest request) throws Exception{
		Map<String,Object> result=new HashMap<String,Object>();
		String outTradeNo=request.getParameter("outTradeNo");
		String giftDesc=request.getParameter("giftDesc");
		
		AlipayRecords records=alipayService.getRecordsByOrderId(outTradeNo);
		
		if(records!=null) {
			giftDesc=new String(giftDesc.getBytes("ISO-8859-1"),"utf-8");
			records.setOrderDes(giftDesc);
			alipayService.updateByPrimaryKey(records);
			result.put("success", Boolean.TRUE);
		}else {
			result.put("success", Boolean.FALSE);
		}
		
		return result;
	}
	
}
