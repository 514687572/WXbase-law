package com.stip.net.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stip.net.dao.GiftListDao;
import com.stip.net.dao.GiftRecordsDao;
import com.stip.net.entity.GiftList;
import com.stip.net.entity.GiftRecords;
import com.stip.net.example.GiftListExample;
import com.stip.net.example.GiftRecordsExample;
import com.stip.net.mp.dto.GiftInfo;

@Service
public class GiftService{
	@Resource
	public GiftListDao giftListDao;
	@Resource
	public GiftRecordsDao giftRecordsDao;

	/**
	 * 查询所有礼物
	 * @return
	 */
	public List<GiftList> getGiftList() {
		GiftListExample example = new GiftListExample();
		example.createCriteria().andGiftOrderNotEqualTo(9999);
		example.setOrderByClause(" giftList.gift_order desc ");
		List<GiftList> giftList = giftListDao.selectByExample(example);

		if (giftList != null && giftList.size() > 0) {
			return giftList;
		} else {
			return null;
		}
	}
	
	/**
	 * 根据礼物ID查询礼物
	 * @return
	 */
	public GiftList getGiftById(int id) {
		GiftListExample example = new GiftListExample();
		example.createCriteria().andGiftIdEqualTo(id);
		List<GiftList> giftList = giftListDao.selectByExample(example);
		
		if (giftList != null && giftList.size() > 0) {
			return giftList.get(0);
		} else {
			return null;
		}
	}
	
	public void insertGiftRecords(GiftRecords record) {
		giftRecordsDao.insert(record);
	}
	
	/**
	 * 根据礼物ID查询礼物
	 * @return
	 */
	public GiftRecords getGiftRecordByOrderId(String orderId) {
		GiftRecordsExample example = new GiftRecordsExample();
		example.createCriteria().andOutOrderNoEqualTo(orderId);
		List<GiftRecords> giftList = giftRecordsDao.selectByExample(example);
		
		if (giftList != null && giftList.size() > 0) {
			return giftList.get(0);
		} else {
			return null;
		}
	}
	
	/**
	 * 根据用户openid
	 * 查询收到的礼物
	 * @return
	 */
	public List<GiftInfo> getGiftRecordByOpenId(String openId) {
		List<GiftInfo> giftList = giftRecordsDao.selectGiftDetailByExample(openId);
		
		if (giftList != null && giftList.size() > 0) {
			return giftList;
		} else {
			return null;
		}
	}
	
}
