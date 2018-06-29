package com.stip.net.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.stip.net.dao.DateHistoryDao;
import com.stip.net.dao.DateListDao;
import com.stip.net.dao.DatePraiseDao;
import com.stip.net.dao.PraiseRecordsDao;
import com.stip.net.entity.DateHistory;
import com.stip.net.entity.DateList;
import com.stip.net.entity.DatePraise;
import com.stip.net.entity.PraiseRecords;
import com.stip.net.example.DateHistoryExample;
import com.stip.net.example.DateListExample;
import com.stip.net.example.DatePraiseExample;
import com.stip.net.example.PraiseRecordsExample;
import com.stip.net.utils.GrnerateUUID;
import com.stip.net.utils.TimeUtils;

@Service
public class DateService {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Resource
	public DatePraiseDao datePraiseDao;
	@Resource
	public PraiseRecordsDao praiseRecordsDao;
	@Resource
	public DateListDao dateListDao;
	@Resource
	public DateHistoryDao dateHistoryDao;
	
	public Map<String,Object> addPraise(String dateId,String userId,String addCount) {
		Map<String,Object> result=new HashMap<String,Object>();
		DatePraiseExample example=new DatePraiseExample();
		example.createCriteria().andDateIdEqualTo(dateId);
		
		List<DatePraise> dateList=datePraiseDao.selectByExample(example);
		
		if(dateList!=null&&dateList.size()>0) {
			DatePraise dp=dateList.get(0);
			dp.setPraiseCount((Integer.parseInt(dp.getPraiseCount())+Integer.parseInt(addCount))+"");
			
			datePraiseDao.updateByPrimaryKey(dp);
			result.put("praiseCount", dp.getPraiseCount());
			result.put("giftCount", dp.getGiftCount());
		}else {
			DatePraise dp=new DatePraise();
			dp.setDateId(dateId);
			dp.setDpId(GrnerateUUID.getUUID());
			dp.setGiftCount("0");
			dp.setPraiseCount(addCount);
			dp.setUpdateTime(new Date());
			
			datePraiseDao.insert(dp);
			result.put("praiseCount",addCount);
			result.put("giftCount", dp.getGiftCount());
		}
		
		addPraiseRecords(dateId,userId,addCount);
		
		List<DateList> relatedDateList=getRelatedDateList(dateId);
		
		if(relatedDateList!=null&&relatedDateList.size()>0) {
			for(DateList da:relatedDateList) {
				addPraiseForServer(da.getDateId(),userId,addCount);
			}
		}
		
		return result;
	}
	
	public Map<String,Object> addPraiseForServer(String dateId,String userId,String addCount) {
		Map<String,Object> result=new HashMap<String,Object>();
		DatePraiseExample example=new DatePraiseExample();
		example.createCriteria().andDateIdEqualTo(dateId);
		
		List<DatePraise> dateList=datePraiseDao.selectByExample(example);
		
		if(dateList!=null&&dateList.size()>0) {
			DatePraise dp=dateList.get(0);
			dp.setPraiseCount((Integer.parseInt(dp.getPraiseCount())+Integer.parseInt(addCount))+"");
			
			datePraiseDao.updateByPrimaryKey(dp);
			result.put("praiseCount", dp.getPraiseCount());
			result.put("giftCount", dp.getGiftCount());
		}else {
			DatePraise dp=new DatePraise();
			dp.setDateId(dateId);
			dp.setDpId(GrnerateUUID.getUUID());
			dp.setGiftCount("0");
			dp.setPraiseCount(addCount);
			dp.setUpdateTime(new Date());
			
			datePraiseDao.insert(dp);
			result.put("praiseCount",addCount);
			result.put("giftCount", dp.getGiftCount());
		}
		
		addPraiseRecords(dateId,userId,addCount);
		
		return result;
	}
	
	public void addPraiseRecords(String dateId,String userId,String addCount) {
		PraiseRecordsExample example=new PraiseRecordsExample();
		example.createCriteria().andDateIdEqualTo(dateId).andUserIdEqualTo(userId);
		List<PraiseRecords> recordsList=praiseRecordsDao.selectByExample(example);
		
		if(recordsList!=null&&recordsList.size()>0) {
			PraiseRecords records=recordsList.get(0);
			records.setPraiseCount((Integer.parseInt(records.getPraiseCount())+Integer.parseInt(addCount))+"");
			records.setType("praise");
			records.setUpdateTime(new Date());
			
			praiseRecordsDao.updateByPrimaryKey(records);
		}else {
			PraiseRecords records=new PraiseRecords();
			records.setDateId(dateId);
			records.setDrId(GrnerateUUID.getUUID());
			records.setPraiseCount(addCount);
			records.setType("praise");
			records.setUpdateTime(new Date());
			records.setUserId(userId);
			
			praiseRecordsDao.insert(records);
		}
		
	}
	
	public Map<String,Object> getDatePraise(String dateId,String userId) {
		Map<String,Object> result=new HashMap<String,Object>();
		DatePraiseExample example=new DatePraiseExample();
		example.createCriteria().andDateIdEqualTo(dateId);
		
		List<DatePraise> dateList=datePraiseDao.selectByExample(example);
		
		if(dateList!=null&&dateList.size()>0) {
			DatePraise dp=dateList.get(0);
			result.put("praiseCount", dp.getPraiseCount());
			result.put("giftCount", dp.getGiftCount());
			
			PraiseRecordsExample recordsExample=new PraiseRecordsExample();
			recordsExample.createCriteria().andDateIdEqualTo(dateId).andUserIdEqualTo(userId);
			List<PraiseRecords> recordsList=praiseRecordsDao.selectByExample(recordsExample);
			
			if(recordsList!=null&&recordsList.size()>0) {
				PraiseRecords records=recordsList.get(0);
				result.put("userPraiseCount", records.getPraiseCount());
			}else {
				result.put("userPraiseCount", "0");
			}
			
		}else {
			result.put("praiseCount","0");
			result.put("giftCount","0");
			result.put("userPraiseCount", "0");
		}
		
		return result;
	
	}
	
	public Map<String,Object> getDatePraiseRecords(String dateId) {
		Map<String,Object> result=new HashMap<String,Object>();
		List<PraiseRecords> userRecordsList=praiseRecordsDao.selectwithUserByDateId(dateId);
		
		if(userRecordsList!=null&&userRecordsList.size()>0) {
			result.put("userRecords", userRecordsList);
		}else {
			result.put("userRecords", null);
		}
		
		return result;
	}
	
	public List<PraiseRecords> getDatePraiseRecordsList(String dateId) {
		List<PraiseRecords> userRecordsList=praiseRecordsDao.selectwithUserByDateId(dateId);
		
		if(userRecordsList!=null&&userRecordsList.size()>0) {
			return userRecordsList;
		}else {
			return null;
		}
	}
	
	/**
	 * 得到相关联的纪念日集合
	 * @param unionid
	 * @param dateId
	 * @return
	 */
	public List<DateList> getRelatedDateList(String dateId){
		DateListExample example=new DateListExample();
		example.createCriteria().andDateIdEqualTo(dateId);
		List<DateList> dateList=dateListDao.selectByExample(example);
		
		if(dateList!=null&&dateList.size()>0){
			DateList date=dateList.get(0);
			
			if(date.getRemarkt()!=null&&!"".equals(date.getRemarkt())) {
				DateListExample exampleb=new DateListExample();
				exampleb.createCriteria().andDateIdEqualTo(date.getRemarkt());
				List<DateList> dateListb=dateListDao.selectByExample(exampleb);
				
				if(dateListb!=null&&dateListb.size()>0){
					return dateListb;
				}else {
					return null;
				}
			}else {
				DateListExample examplea=new DateListExample();
				examplea.createCriteria().andRemarktEqualTo(dateId);
				List<DateList> dateLista=dateListDao.selectByExample(examplea);
				
				if(dateLista!=null&&dateLista.size()>0){
					return dateLista;
				}else {
					return null;
				}
			}
		}
		
		return null;
	}
	
	/**
	 * 更具dateId得到相应date
	 * @param unionid
	 * @param dateId
	 * @return
	 */
	public DateList getDateListById(String dateId){
		DateListExample example=new DateListExample();
		example.createCriteria().andDateIdEqualTo(dateId);
		List<DateList> dateList=dateListDao.selectByExample(example);
		
		if(dateList!=null&&dateList.size()>0){
			return dateList.get(0);
		}
		
		return null;
	}
	
	public void insertDateHistory(DateHistory dateHistory) {
		dateHistoryDao.insert(dateHistory);
	}
	
	public void updateByPrimaryKey(DateHistory dateHistory) {
		dateHistoryDao.updateByPrimaryKey(dateHistory);
	}
	
	public DateHistory selectByPrimaryKey(String id) {
		 return dateHistoryDao.selectByPrimaryKey(id);
	}
	
	public int deleteByPrimaryKey(String id) {
		return dateHistoryDao.deleteByPrimaryKey(id);
	}
	public int deleteByPrimaryKey(DateHistory record) {
		return dateHistoryDao.deleteByPrimaryKey(record.getHisId());
	}
	
	public List<DateHistory> selectByExampleByPage(String dateId,int page,int rec) {
		DateHistoryExample example=new DateHistoryExample();
		example.createCriteria().andDateIdEqualTo(dateId);
		example.setPager(page, rec);
		example.setOrderByClause(" dateHistory.HIS_DATE_TIME desc,dateHistory.CREATE_TIME desc");
		List<DateHistory> hisList=dateHistoryDao.selectByExample(example);
		
		if(hisList!=null&&hisList.size()>0){
			return hisList;
		}else {
			return null;
		}
	}
	
	/**
	 * 查询出无效的历史记录
	 * @param dateId
	 * @param page
	 * @param rec
	 * @return
	 */
	public List<DateHistory> selectByExampleToDelete() {
		DateHistoryExample example=new DateHistoryExample();
		Date now=new Date();
		Date newDate=TimeUtils.setDateHour(now, -3);
		example.createCriteria().andDateIdIsNull().andUpdateTimeLessThan(newDate);
		List<DateHistory> hisList=dateHistoryDao.selectByExample(example);
		
		if(hisList!=null&&hisList.size()>0){
			return hisList;
		}else {
			return null;
		}
	}
	
}
