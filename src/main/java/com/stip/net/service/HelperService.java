package com.stip.net.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.stip.net.dao.DateListDao;
import com.stip.net.dao.MessageDao;
import com.stip.net.dao.MuserDao;
import com.stip.net.entity.DateList;
import com.stip.net.entity.Message;
import com.stip.net.entity.Muser;
import com.stip.net.example.DateListExample;
import com.stip.net.example.DateListExample.Criteria;
import com.stip.net.example.MessageExample;
import com.stip.net.example.MuserExample;
import com.stip.net.utils.Constantutils;
import com.stip.net.utils.Lunar;
import com.stip.net.utils.LunarSolarConverter;
import com.stip.net.utils.Solar;
import com.stip.net.utils.TimeUtils;

@Service
public class HelperService {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Resource
	public MuserDao muserDao;
	@Resource
	public DateListDao dateListDao;
	@Resource
	public MessageDao messageDao;
	
	public Muser findUserByLoginName(String id) {
		MuserExample example=new MuserExample();
		example.createCriteria().andIdEqualTo(id);
		List<Muser> userList=muserDao.selectByExample(example);
		
		if(userList!=null&&userList.size()>0){
			return userList.get(0);
		}else{
			return null;
		}
	}
	
	public Muser findUserByOpenId(String openId) {
		MuserExample example=new MuserExample();
		example.createCriteria().andOpenidEqualTo(openId);
		List<Muser> userList=muserDao.selectByExample(example);
		
		if(userList!=null&&userList.size()>0){
			return userList.get(0);
		}else{
			return null;
		}
	}
	
	public Muser findUserByAppOpenId(String openId) {
		MuserExample example=new MuserExample();
		example.createCriteria().andAppOpenidEqualTo(openId);
		List<Muser> userList=muserDao.selectByExample(example);
		
		if(userList!=null&&userList.size()>0){
			return userList.get(0);
		}else{
			return null;
		}
	}
	
	public Muser findUserByUnionId(String unionid) {
		MuserExample example=new MuserExample();
		example.createCriteria().andUnionidEqualTo(unionid);
		List<Muser> userList=muserDao.selectByExample(example);
		
		if(userList!=null&&userList.size()>0){
			return userList.get(0);
		}else{
			return null;
		}
	}
	
	public Muser findUserByMaOpenId(String openid) {
		MuserExample example=new MuserExample();
		example.createCriteria().andAppOpenidEqualTo(openid);
		List<Muser> userList=muserDao.selectByExample(example);
		
		if(userList!=null&&userList.size()>0){
			return userList.get(0);
		}else{
			return null;
		}
	}
	
	public Muser findUserByUserId(String userId) {
		MuserExample example=new MuserExample();
		example.createCriteria().andIdEqualTo(userId);
		List<Muser> userList=muserDao.selectByExample(example);
		
		if(userList!=null&&userList.size()>0){
			return userList.get(0);
		}else{
			return null;
		}
	}
	
	public List<Muser> getUserWithNotNullOpenId() {
		MuserExample example=new MuserExample();
		example.createCriteria().andOpenidNotEqualTo("1").andAppOpenidNotEqualTo("1");
		List<Muser> userList=muserDao.selectByExample(example);
		
		if(userList!=null&&userList.size()>0){
			return userList;
		}else{
			return null;
		}
	}
	
	public Muser getUserByTOpenId(String openId) {
		MuserExample example=new MuserExample();
		example.createCriteria().andEqualTOpenid(openId);
		List<Muser> userList=muserDao.selectByExample(example);
		
		if(userList!=null&&userList.size()>0){
			return userList.get(0);
		}else{
			return null;
		}
	}
	
	/**
	 * 查询出所有未取消
	 * 关注系统任务的用户
	 * @param status
	 * @return
	 */
	public List<Muser> getUserBySetting(String status) {
		MuserExample example=new MuserExample();
		example.createCriteria().andRemarkNotEqualTo(status).andOpenidNotEqualTo("1");
		List<Muser> userList=muserDao.selectByExample(example);
		
		if(userList!=null&&userList.size()>0){
			return userList;
		}else{
			return null;
		}
	}
	
	public List<Message> getMessageList(int start,int end) {
		MessageExample example=new MessageExample();
		example.setPager(start, end);
		example.setOrderByClause(" message.send_time desc");
		List<Message> userList=messageDao.selectMEByEx(example);
		
		if(userList!=null&&userList.size()>0){
			for(Message msg:userList) {
				msg.setRemark1(TimeUtils.dateToString(msg.getSendTime(), "yyyy-MM-dd HH:mm:ss"));
			}
			
			return userList;
		}else{
			return null;
		}
	}
	
	public void insertUser(Muser user) {
		muserDao.insert(user);
	}
	
	public void updateByPrimaryKey(Muser user) {
		muserDao.updateByPrimaryKey(user);
	}
	
	public void insertDate(DateList date) {
		dateListDao.insert(date);
	}
	
	public DateList selectByPrimaryKey(String dateId) {
		return dateListDao.selectByPrimaryKey(dateId);
	}
	
	public void insertMsg(Message msg) {
		messageDao.insert(msg);
	}
	
	public void updateByPrimaryKey(DateList date) {
		dateListDao.updateByPrimaryKey(date);
	}
	
	public void deleteByPrimaryKey(String id) {
		dateListDao.deleteByPrimaryKey(id);
	}
	
	/**
	 * 根据用户unionid查询纪念日集合
	 * @param unionid
	 * @return
	 */
	public List<DateList> getDateListByUnionId(String unionid){
		MuserExample example1=new MuserExample();
		example1.createCriteria().andUnionidEqualTo(unionid);
		List<Muser> userList=muserDao.selectByExample(example1);
		
		if(userList==null) return null;
		Muser user=userList.get(0);
		
		DateListExample example=new DateListExample();
		example.createCriteria().andEqualTOpenid(user.getOpenid(), user.getAppOpenid());
		example.setOrderByClause(" dateList.attention_date desc,dateList.date_time asc");
		List<DateList> dateList=dateListDao.selectByExample(example);
		
		if(dateList!=null&&dateList.size()>0){
			
			for(DateList date:dateList) {
				date=getDateInfo(date);
			}
			
			return dateList;
		}else{
			return null;
		}
	}
	
	/**
	 * 根据用户uinonid和dateID查询纪念日集合
	 * @param unionid
	 * @param dateId
	 * @return
	 */
	public List<DateList> getDateListByOpenId(String unionid,String dateId){
		MuserExample example1=new MuserExample();
		example1.createCriteria().andUnionidEqualTo(unionid);
		List<Muser> userList=muserDao.selectByExample(example1);
		
		if(userList==null&&userList.size()>0) return null;
		Muser user=userList.get(0);
		
		DateListExample example=new DateListExample();
		Criteria criteria=example.createCriteria();
		criteria.andEqualTOpenid(user.getOpenid(), user.getAppOpenid());
		
		if(null!=dateId) {
			criteria.andDateIdEqualTo(dateId);
		}
		example.setOrderByClause(" dateList.attention_date desc,dateList.date_time asc");
		List<DateList> dateList=dateListDao.selectByExample(example);
		
		if(dateList!=null&&dateList.size()>0){
			
			for(DateList date:dateList) {
				date=getDateInfo(date);
			}
			
			return dateList;
		}else{
			return null;
		}
	}
	
	/**
	 * 根据纪念日ID查询纪念日
	 * @param dateId
	 * @return
	 */
	public List<DateList> getDateListByDateId(String dateId){
		DateListExample example=new DateListExample();
		Criteria criteria=example.createCriteria();
		if(null!=dateId) {
			criteria.andDateIdEqualTo(dateId);
		}
		example.setOrderByClause(" dateList.attention_date desc,dateList.date_time asc");
		List<DateList> dateList=dateListDao.selectByExample(example);
		
		if(dateList!=null&&dateList.size()>0){
			
			for(DateList date:dateList) {
				date=getDateInfo(date);
			}
			
			return dateList;
		}else{
			return null;
		}
	}
	
	/**
	 * 查询每天需要提醒的纪念日
	 * @return
	 */
	public List<DateList> getDateListByDate(){
		DateListExample example=new DateListExample();
		Date date=new Date();
		date.setHours(00);
		date.setMinutes(00);
		date.setSeconds(00);
		
		Criteria criteria=example.createCriteria();
		criteria.andDayLessOne(TimeUtils.dateToString(date, "yyyy-MM-dd"),TimeUtils.dateToString(TimeUtils.setDateDay(date, 1), "yyyy-MM-dd"),TimeUtils.dateToString(TimeUtils.setDateDay(new Date(), 2), "yyyy-MM-dd"));
		example.setOrderByClause(" dateList.attention_date desc,dateList.date_time asc");
		List<DateList> dateList=dateListDao.selectByExample(example);
		
		if(dateList!=null&&dateList.size()>0){
			return dateList;
		}else{
			return null;
		}
	}
	
	/**
	 * 查询每天需要提醒的纪念日
	 * @return
	 */
	public List<DateList> getAdminDateListByDate(){
		DateListExample example=new DateListExample();
		Date date=new Date();
		date.setHours(00);
		date.setMinutes(00);
		date.setSeconds(00);
		
		Criteria criteria=example.createCriteria();
		criteria.andDayLessOne(TimeUtils.dateToString(date, "yyyy-MM-dd"),TimeUtils.dateToString(TimeUtils.setDateDay(date, 1), "yyyy-MM-dd"),TimeUtils.dateToString(TimeUtils.setDateDay(new Date(), 2), "yyyy-MM-dd"))
		.andOpenIdEqualTo(Constantutils.ADMIN_USER);
		example.setOrderByClause(" dateList.attention_date desc,dateList.date_time asc");
		List<DateList> dateList=dateListDao.selectByExample(example);
		
		if(dateList!=null&&dateList.size()>0){
			return dateList;
		}else{
			return null;
		}
	}
	
	/**
	 * 查询出需要周年提醒的纪念日
	 * @return
	 */
	public List<DateList> getAnniversaryDate(){
		DateListExample example=new DateListExample();
		Date date=new Date();
		date.setHours(00);
		date.setMinutes(00);
		date.setSeconds(00);
		
		Criteria criteria=example.createCriteria();
		criteria.andDateTypeNotEqualTo(Constantutils.BIRTHDAY);
		criteria.andRemindTypeEqualTo(Constantutils.remindTypeo);
		criteria.andDateTimeLessThan(date);
		
		example.setOrderByClause(" dateList.attention_date desc,dateList.date_time asc");
		List<DateList> dateList=dateListDao.selectByExample(example);
		
		if(dateList!=null&&dateList.size()>0){
			return dateList;
		}else{
			return null;
		}
	}
	
	/**
	 * 恋爱类默认天数520,1000,1314天提醒
	 * 查询默认规则提醒的纪念日
	 * @return
	 */
	public List<DateList> getDefaultRemindDate(){
		DateListExample example=new DateListExample();
		Date date=new Date();
		date.setHours(0);
		date.setMinutes(0);
		date.setSeconds(0);
		
		Criteria criteria=example.createCriteria();
		criteria.andDateTypeEqualTo(Constantutils.LOVE);
		criteria.andDefaultRemindDates(date);
		
		List<DateList> dateList=dateListDao.selectByExample(example);
		
		if(dateList!=null&&dateList.size()>0){
			return dateList;
		}else{
			return null;
		}
	}
	
	/**
	 * 生日类提前7天提醒
	 * 查询默认规则提醒的纪念日
	 * @return
	 */
	public List<DateList> getBirthdayRemindDate(){
		DateListExample example=new DateListExample();
		Date date=new Date();
		date.setHours(0);
		date.setMinutes(0);
		date.setSeconds(0);
		
		Criteria criteria=example.createCriteria();
		criteria.andDateTypeEqualTo(Constantutils.BIRTHDAY);
		criteria.andBirthdayRemindDates(date);
		
		List<DateList> dateList=dateListDao.selectByExample(example);
		
		if(dateList!=null&&dateList.size()>0){
			return dateList;
		}else{
			return null;
		}
	}
	
	/**
	 * 查询出每年每周每月类型的纪念日
	 * @return
	 */
	public List<DateList> getDateListForUpdete(){
		DateListExample example=new DateListExample();
		List<String> typeList=new ArrayList<String>();
		typeList.add("每月");
		typeList.add("每周");
		typeList.add("每年");
		example.createCriteria().andIsNullOrGreater(TimeUtils.dateToString(new Date(), "yyyy-MM-dd hh:mm:ss")).andRemindTypeIn(typeList);
		example.setOrderByClause(" dateList.attention_date desc,dateList.date_time asc");
		List<DateList> dateList=dateListDao.selectByExample(example);
		
		if(dateList!=null&&dateList.size()>0){
			return dateList;
		}else{
			return null;
		}
	}
	
	/**
	 * 查询农历纪念日类型为每月每周每年
	 * @return
	 */
	public List<DateList> getDateListLunar(){
		DateListExample example=new DateListExample();
		List<String> typeList=new ArrayList<String>();
		typeList.add("每月");
		typeList.add("每周");
		typeList.add("每年");
		example.createCriteria().andGcEqualTo(false).andRemindTypeIn(typeList);
		example.setOrderByClause(" dateList.attention_date desc,dateList.date_time asc");
		List<DateList> dateList=dateListDao.selectByExample(example);
		
		if(dateList!=null&&dateList.size()>0){
			return dateList;
		}else{
			return null;
		}
	}
	
	/**
	 * 更新纪念日下次提醒时间
	 * @param dates
	 */
	public void getNextRemind(DateList dates) {
		if(!dates.getGc()) {
			getLunarNextRemind(dates);
		}else {
			Date now=new Date();
			if("每周".equals(dates.getRemindType())) {
				Calendar cal = Calendar.getInstance();
				cal.setTime(dates.getDateTime());
				int a=cal.get(Calendar.DAY_OF_WEEK) - 1;
				if(a==0) {
					a=7;
				}
				
				Calendar cal1 = Calendar.getInstance();
				cal1.setTime(now);
				int a1=cal1.get(Calendar.DAY_OF_WEEK) - 1;
				if(a1==0) {
					a1=7;
				}
				
				int temp=a-a1;
				if(temp>0) {
					dates.setNextRemindTime(TimeUtils.setDateDay(now, temp));
					dates.setDateTime(TimeUtils.setDateDay(now, temp));
				}else if(temp==0) {
					if(now.getHours()>22) {
						dates.setNextRemindTime(TimeUtils.setDateDay(now, 7));
						dates.setDateTime(TimeUtils.setDateDay(now, 7));
					}else {
						dates.setNextRemindTime(dates.getDateTime());
					}
				}else if(temp<0) {
					now=TimeUtils.setDateDay(now, temp);
					now=TimeUtils.setDateDay(now, 7);
					dates.setNextRemindTime(now);
					dates.setDateTime(now);
				}
				
			}else if("每月".equals(dates.getRemindType())) {
				if(dates.getDateTime().getDate()>now.getDate()) {
					int temp=dates.getDateTime().getDate()-now.getDate();
					dates.setNextRemindTime(dates.getDateTime());
					dates.setDateTime(dates.getDateTime());
					dates.getDateTime().setYear(now.getYear());
					dates.getNextRemindTime().setYear(now.getYear());
					dates.getNextRemindTime().setMonth(now.getMonth());
					dates.getDateTime().setMonth(now.getMonth());
				}else if(dates.getDateTime().getDate()==now.getDate()){
					if(now.getHours()>22) {
						dates.getDateTime().setYear(now.getYear());
						dates.getDateTime().setMonth(now.getMonth());
						dates.setDateTime(TimeUtils.setDateMonth(dates.getDateTime(), 1));
						dates.setNextRemindTime(dates.getDateTime());
					}else {
						dates.setNextRemindTime(dates.getDateTime());
					}
				}else{
					dates.getDateTime().setYear(now.getYear());
					dates.getDateTime().setMonth(now.getMonth());
					dates.setDateTime(TimeUtils.setDateMonth(dates.getDateTime(), 1));
					dates.setNextRemindTime(dates.getDateTime());
				}
			}else if("每年".equals(dates.getRemindType())||Constantutils.BIRTHDAY.equals(dates.getDateType())) {
				if(dates.getDateTime().getYear()>now.getYear()) {
					dates.setNextRemindTime(dates.getDateTime());
				}if(dates.getDateTime().getYear()<now.getYear()) {
					if(dates.getDateTime().getMonth()>now.getMonth()) {
						dates.setNextRemindTime(TimeUtils.setDateYear(dates.getDateTime(), now.getYear()-dates.getDateTime().getYear()));
					}else if(dates.getDateTime().getMonth()<now.getMonth()) {
						dates.setNextRemindTime(TimeUtils.setDateYear(dates.getDateTime(), now.getYear()-dates.getDateTime().getYear()+1));
					}else {
						if(dates.getDateTime().getDate()>now.getDate()) {
							dates.setNextRemindTime(TimeUtils.setDateYear(dates.getDateTime(), now.getYear()-dates.getDateTime().getYear()));
						}else if(dates.getDateTime().getDate()<now.getDate()){
							dates.setNextRemindTime(TimeUtils.setDateYear(dates.getDateTime(), now.getYear()-dates.getDateTime().getYear()+1));
						}else if(dates.getDateTime().getDate()==now.getDate()) {
							dates.setNextRemindTime(TimeUtils.setDateYear(dates.getDateTime(), now.getYear()-dates.getDateTime().getYear()));
						}
						
					}
				}else if(dates.getDateTime().getYear()==now.getYear()) {
					if(dates.getDateTime().getMonth()>now.getMonth()) {
						dates.setNextRemindTime(dates.getDateTime());
					}else if(dates.getDateTime().getMonth()<now.getMonth()) {
						dates.setNextRemindTime(TimeUtils.setDateYear(dates.getDateTime(),1));
					}else if(dates.getDateTime().getMonth()==now.getMonth()) {
						if(dates.getDateTime().getDate()>now.getDate()) {
							dates.setNextRemindTime(dates.getDateTime());
						}else if(dates.getDateTime().getDate()<now.getDate()) {
							dates.setNextRemindTime(TimeUtils.setDateYear(dates.getDateTime(), 1));
						}else {
							dates.setNextRemindTime(dates.getDateTime());
						}
					}
				}
			}
			
		}
		
		updateByPrimaryKey(dates);
	}
	
	/**
	 * 更新农历日期
	 * 
	 * @param dates
	 */
	@SuppressWarnings("deprecation")
	public static void getLunarNextRemind(DateList dates) {
		Date now = new Date();
		Date lunar=dates.getLunarDate();
		Date newlunar=SolarToLunar(now.getYear()+1900,now.getMonth()+1,now.getDate());
		Date newSolar=null;
		if(lunar.getMonth()>newlunar.getMonth()||(lunar.getMonth()==newlunar.getMonth()&&lunar.getDate()>=newlunar.getDate())) {
			newSolar=lunarToSolar(newlunar.getYear()+1900,lunar.getMonth()+1,lunar.getDate());
		}else {
			newSolar=lunarToSolar(now.getYear()+1900,lunar.getMonth()+1,lunar.getDate());
		}
		
		Date nextYear=null;
		if(newSolar.getYear() > now.getYear()) {
			dates.setNextRemindTime(newSolar);
			dates.setDateTime(newSolar);
		}if(newSolar.getYear() < now.getYear()) {
			nextYear=lunarToSolar(now.getYear()+1901,lunar.getMonth()+1,lunar.getDate());
			dates.setDateTime(nextYear);
			dates.setNextRemindTime(nextYear);
		}else if (newSolar.getYear() == now.getYear()) {
			if (newSolar.getMonth() > now.getMonth()) {
				dates.setDateTime(newSolar);
				dates.setNextRemindTime(newSolar);
			} else if (newSolar.getMonth() < now.getMonth()) {
				nextYear=lunarToSolar(now.getYear()+1901,lunar.getMonth()+1,lunar.getDate());
				dates.setDateTime(nextYear);
				dates.setNextRemindTime(nextYear);
			} else if (newSolar.getMonth() == now.getMonth()) {
				if (newSolar.getDate() > now.getDate()) {
					dates.setDateTime(newSolar);
					dates.setNextRemindTime(newSolar);
				} else if (newSolar.getDate() < now.getDate()) {
					nextYear=lunarToSolar(now.getYear()+1901,lunar.getMonth()+1,lunar.getDate());
					dates.setDateTime(nextYear);
					dates.setNextRemindTime(nextYear);
				}else if(newSolar.getDate() ==now.getDate()) {
					dates.setDateTime(newSolar);
					dates.setNextRemindTime(newSolar);
				}
			}
		}

	}
	
	/**
	 * 农历转换成阳历
	 * @param y年
	 * @param m月
	 * @param d日
	 * @return 阳历日期
	 */
	public static Date lunarToSolar(int y,int m,int d) {
		Lunar lr=new Lunar();
		lr.setLunarYear(y);
		lr.setLunarMonth(m);
		lr.setLunarDay(d);
		Solar newDate=LunarSolarConverter.LunarToSolar(lr);
		Date newSolar=TimeUtils.stringToDate(newDate.getSolarYear()+"-"+newDate.getSolarMonth()+"-"+newDate.getSolarDay(), "yyyy-MM-dd");
		
		return newSolar;
	}
	
	/**
	 * 农历转换成阳历
	 * @param y年
	 * @param m月
	 * @param d日
	 * @return 阳历日期
	 */
	public static String lunarToSolar(int y,int m,int d,boolean isleap) {
		Lunar lr=new Lunar();
		lr.setLunarYear(y);
		lr.setLunarMonth(m);
		lr.setLunarDay(d);
		lr.setIsleap(isleap);
		Solar newDate=LunarSolarConverter.LunarToSolar(lr);
		String newSolar=newDate.getSolarMonth()+"-"+newDate.getSolarDay();
		
		return newSolar;
	}
	
	public static void main(String[] args) {
		System.out.println(HelperService.lunarToSolar(1990, 5,4, true));
	}
	
	/**
	 * 阳历转换成农历
	 * @param y年
	 * @param m月
	 * @param d日
	 * @return 阳历日期
	 */
	public static Date SolarToLunar(int y,int m,int d) {
		Solar solar=new Solar();
		solar.setSolarYear(y);
		solar.setSolarMonth(m);
		solar.setSolarDay(d);
		Lunar newDate=LunarSolarConverter.SolarToLunar(solar);
		Date newSolar=TimeUtils.stringToDate(newDate.getLunarYear()+"-"+newDate.getLunarMonth()+"-"+newDate.getLunarDay(), "yyyy-MM-dd");
		
		return newSolar;
	}

	public List<DateList> getDateListByMaOpenId(String openid) {
		MuserExample example1=new MuserExample();
		example1.createCriteria().andAppOpenidEqualTo(openid);
		List<Muser> userList=muserDao.selectByExample(example1);
		
		if(userList==null&&userList.size()>0) return null;
		Muser user=userList.get(0);
		
		DateListExample example=new DateListExample();
		example.createCriteria().andEqualTOpenid(user.getOpenid(), user.getAppOpenid());
		example.setOrderByClause(" dateList.attention_date desc,dateList.date_time asc");
		List<DateList> dateList=dateListDao.selectByExample(example);
		
		if(dateList!=null&&dateList.size()>0){
			
			for(DateList date:dateList) {
				date=getDateInfo(date);
			}
			
			return dateList;
		}else{
			return null;
		}
	
	}
	
	public DateList getLastSecretByMaOpenId(String openid) {
		MuserExample example1=new MuserExample();
		example1.createCriteria().andAppOpenidEqualTo(openid);
		List<Muser> userList=muserDao.selectByExample(example1);
		
		if(userList==null&&userList.size()>0) return null;
		Muser user=userList.get(0);
		
		DateListExample example=new DateListExample();
		example.createCriteria().andEqualTOpenid(user.getOpenid(), user.getAppOpenid()).andAttentionDateEqualTo(Constantutils.SECRET);
		example.setOrderByClause(" dateList.create_time desc");
		List<DateList> dateList=dateListDao.selectByExample(example);
		
		if(dateList!=null&&dateList.size()>0){
			return dateList.get(0);
		}else{
			return null;
		}
	
	}
	
	/**
	 * 获取用户纪念日列表并返回是否关注(可分页)
	 * @param openid
	 * @return
	 */
	public List<DateList> getDateListAndAttentionByMaOpenId(String openid,Muser user,int page,int rec) {
		DateListExample example=new DateListExample();
		example.createCriteria().andEqualTOpenidOtherOrUserId(user.getOpenid(), user.getAppOpenid(),user.getId(),Constantutils.ADMIN_USER);
		example.setPager(page, rec);
		example.setOrderByClause(" IF ((TO_DAYS(dateList.next_remind_time) - TO_DAYS(NOW())) < 0,(TO_DAYS(dateList.next_remind_time) - TO_DAYS(NOW())) *- 10000000,(TO_DAYS(dateList.next_remind_time) - TO_DAYS(NOW()))) ASC");
		List<DateList> dateList=dateListDao.selectByOrder(example);
		
		if(dateList!=null&&dateList.size()>0){
			
			for(DateList date:dateList) {
				date=getDateInfo(date);
			}
			
			return dateList;
		}else{
			return null;
		}
		
	}
	
	/**
	 * 获取用户纪念日列表并返回是否关注
	 * @param openid
	 * @return
	 */
	public List<DateList> getDateListAndAttentionByMaOpenId(String openid,Muser user) {
		DateListExample example=new DateListExample();
		example.createCriteria().andEqualTOpenidOtherOrUserId(user.getOpenid(), user.getAppOpenid(),user.getId(),Constantutils.ADMIN_USER);
		example.setOrderByClause(" IF ((TO_DAYS(dateList.next_remind_time) - TO_DAYS(NOW())) < 0,(TO_DAYS(dateList.next_remind_time) - TO_DAYS(NOW())) *- 10000000,(TO_DAYS(dateList.next_remind_time) - TO_DAYS(NOW()))) ASC");
		List<DateList> dateList=dateListDao.selectByOrder(example);
		
		if(dateList!=null&&dateList.size()>0){
			
			for(DateList date:dateList) {
				date=getDateInfo(date);
			}
			
			return dateList;
		}else{
			return null;
		}
		
	}

	/**
	 * 查询出openid不等于公众号openid的纪念日
	 * @return
	 */
	public List<DateList> selectNotEqualOpenId() {
		return dateListDao.selectNotEqualOpenId();
	}
	
	/**
	 * 查询出纪念日userId和用户USERID不相等的纪念日
	 * @return
	 */
	public List<DateList> selectNotEqualUserId() {
		return dateListDao.selectNotEqualUserId();
	}
	
	/**
	 * 根据小程序appid查询纪念日
	 * @param openId
	 * @param appOpenId
	 * @return
	 */
	public List<DateList> getDateListByTOpenId(String openId,String appOpenId){
		DateListExample example=new DateListExample();
		example.createCriteria().andEqualTOpenid(openId,appOpenId);
		example.setOrderByClause(" dateList.attention_date desc,dateList.date_time asc");
		List<DateList> dateList=dateListDao.selectByExample(example);
		
		if(dateList!=null&&dateList.size()>0){
			return dateList;
		}else{
			return null;
		}
	}
	
	/**
	 * 查询用户关注状态
	 * @param openId
	 * @return
	 * @throws Exception
	 * @throws IOException
	 */
	public boolean getUserStatus(String openId) throws Exception, IOException {
		String token = AccessTokenService.getAccesstoken();

		return judgeIsFollow(token, openId);
	}
	
	/**
	 * 判断用户是否关注了公众号
	 * 
	 * @param token
	 * @param openid
	 * @return
	 */
	public boolean judgeIsFollow(String token, String openid) {
		String url = "https://api.weixin.qq.com/cgi-bin/user/info?access_token="+token+"&openid=" + openid + "&lang=zh_CN";
		String subscribe = null;
		try {
			DefaultHttpClient httpClient = new DefaultHttpClient();
			HttpGet httpGet = new HttpGet(url);
			HttpResponse httpResponse = httpClient.execute(httpGet);
			HttpEntity httpEntity = httpResponse.getEntity();
			String response = EntityUtils.toString(httpEntity, "utf-8");
			Gson token_gson = new Gson();
			JsonObject demoJson = token_gson.fromJson(response, JsonObject.class);
			subscribe = demoJson.get("subscribe").toString();
		} catch (Exception e) {
			token=AccessTokenService.getNewAccesstoken();
			logger.error("----------------------------强制刷新TOKEN");
			return judgeIsFollow(token,openid);
		}
		return "1".equals(subscribe) ? true : false;
	}
	
	/**
	 * 判断是否关注此事件
	 * @param unionid
	 * @param dateId
	 * @return
	 */
	public boolean getDateListByUnionIdAndRemark(String unionid,String dateId){
		MuserExample example1=new MuserExample();
		example1.createCriteria().andUnionidEqualTo(unionid);
		List<Muser> userList=muserDao.selectByExample(example1);
		
		if(userList==null) return false;
		Muser user=userList.get(0);
		
		DateListExample example=new DateListExample();
		example.createCriteria().andEqualTOpenid(user.getOpenid(), user.getAppOpenid()).andRemarktEqualTo(dateId);
		example.setOrderByClause(" dateList.attention_date desc,dateList.date_time asc");
		List<DateList> dateList=dateListDao.selectByExample(example);
		
		if(dateList!=null&&dateList.size()>0){
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * 判断是否关注此事件
	 * 查询是否是自己的
	 * @param unionid
	 * @param dateId
	 * @return
	 */
	public boolean getDateListByUnionIdAndDateId(String unionid,String dateId){
		MuserExample example1=new MuserExample();
		example1.createCriteria().andUnionidEqualTo(unionid);
		List<Muser> userList=muserDao.selectByExample(example1);
		
		if(userList==null) return false;
		Muser user=userList.get(0);
		
		DateListExample example=new DateListExample();
		example.createCriteria().andEqualTOpenid(user.getOpenid(), user.getAppOpenid()).andDateIdEqualTo(dateId);
		example.setOrderByClause(" dateList.attention_date desc,dateList.date_time asc");
		List<DateList> dateList=dateListDao.selectByExample(example);
		
		if(dateList!=null&&dateList.size()>0){
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * 获取纪念日距离今天的日期信息
	 * @param date
	 * @return
	 */
	public DateList getDateInfo(DateList date) {
		int dates=0;
		Date now=new Date();
		
		if("每年".equals(date.getRemindType())||"每周".equals(date.getRemindType())||"每月".equals(date.getRemindType())||Constantutils.BIRTHDAY.equals(date.getDateType())) {
			if(null==date.getNextRemindTime()||"".equals(date.getNextRemindTime())) {
				getNextRemind(date);
			}
			date.setRemark3(TimeUtils.dateToString(date.getNextRemindTime(), "yyyy-MM-dd"));
			dates=TimeUtils.nDaysBetweenTwoDate(now, date.getNextRemindTime());
		}else {
			date.setRemark3(TimeUtils.dateToString(date.getDateTime(), "yyyy-MM-dd"));
			dates=TimeUtils.nDaysBetweenTwoDate(now, date.getDateTime());
			if(Constantutils.remindTypeo.equals(date.getRemindType())) {
				if(dates>365) {
					date.startYear="还有";
					Date temp=new Date();
					temp.setYear(date.getDateTime().getYear());
					date.endYear="天";
					if(date.getDateTime().getMonth()<now.getMonth()||(date.getDateTime().getMonth()==now.getMonth()&&date.getDateTime().getDate()<now.getDate())) {
						date.middYear=(date.getDateTime().getYear()-now.getYear()-1)+"";
						date.middDay=(365-TimeUtils.nDaysBetweenTwoDate(date.getDateTime(),temp))+"";
					}else if(date.getDateTime().getMonth()>now.getMonth()||(date.getDateTime().getMonth()==now.getMonth()&&date.getDateTime().getDate()>now.getDate())) {
						date.middYear=(date.getDateTime().getYear()-now.getYear())+"";
						date.middDay=(TimeUtils.nDaysBetweenTwoDate(date.getDateTime(),temp)*-1)+"";
					}else {
						date.middYear=(date.getDateTime().getYear()-now.getYear())+"";
						date.endYear="";
					}
				}else if(dates<-365) {
					date.startYear="第";
					Date temp=new Date();
					temp.setDate(date.getDateTime().getDate());
					temp.setMonth(date.getDateTime().getMonth());
					date.endYear="天";
					if(date.getDateTime().getMonth()<now.getMonth()||(date.getDateTime().getMonth()==now.getMonth()&&date.getDateTime().getDate()<now.getDate())) {
						date.middYear=(now.getYear()-date.getDateTime().getYear())+"";
						date.middDay=((TimeUtils.nDaysBetweenTwoDate(now,temp)*-1)+1)+"";
					}else if(date.getDateTime().getMonth()>now.getMonth()||(date.getDateTime().getMonth()==now.getMonth()&&date.getDateTime().getDate()>now.getDate())){
						date.middYear=(now.getYear()-date.getDateTime().getYear()-1)+"";
						date.middDay=((365-TimeUtils.nDaysBetweenTwoDate(now,temp)+1))+"";
					}else {
						date.middYear=(now.getYear()-date.getDateTime().getYear())+"";
						date.endYear="";
					}
				}
			}
		}
		
		if(!date.getGc()) {
			date.setRemarko(TimeUtils.dateToString(date.getLunarDate(), "yyyy-MM-dd"));
		}else if(date.getGc()) {
			date.setRemarko(TimeUtils.dateToString(date.getDateTime(), "yyyy-MM-dd"));
		}
		
		if(dates<0) {
			dates=(dates*-1)+1;
			date.setRemark("第");
			date.setRemark1(dates+"");
			date.setRemark2("天");
		}else if(dates==0){
			date.setRemark("就是");
			date.setRemark1("今天");
			date.setRemark2("");
		}else {
			date.setRemark("还有");
			date.setRemark1(dates+"");
			date.setRemark2("天");
		}
		
		return date;
	
	}
	
}
