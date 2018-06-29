package com.stip.net.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.stip.net.entity.AlipayRecords;
import com.stip.net.entity.DateHistory;
import com.stip.net.entity.DateList;
import com.stip.net.entity.Muser;
import com.stip.net.service.AlipayService;
import com.stip.net.service.DateService;
import com.stip.net.service.HelperService;
import com.stip.net.service.PushService;
import com.stip.net.utils.Constantutils;

/**
 * 系统任务
 * 
 * @author cja
 *
 */
@Component
@Lazy(false)
public class TaskScheduledController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Resource
	public PushService pushService;
	@Autowired
	private HelperService helperService;
	@Autowired
    private DateService dateService;
	@Autowired
	private AlipayService alipayService;
	
	/**
	 * 每天8点运行修改用户openId
	 * 
	 * @return
	 * @throws Exception
	 */
	@Scheduled(cron = "0 5 0/1 * * ?")
	public void changeDateListOpenId1() throws Exception {
		List<DateList> dateList=helperService.selectNotEqualOpenId();
		if(dateList==null||dateList.size()<1) return;
		
		for(DateList date:dateList) {
			List<DateList> thisDate=helperService.getDateListByDateId(date.getDateId());
			if(thisDate!=null||thisDate.size()>0) {
				DateList dates=thisDate.get(0);
				Muser user=helperService.getUserByTOpenId(dates.getOpenId());
				if(user!=null) {
					if(!dates.getOpenId().equals(user.getOpenid())) {
						dates.setOpenId(user.getOpenid());
						helperService.updateByPrimaryKey(dates);
					}
				}
			}
		}
	}
	
	/**
	 * 每天9点运行提醒任务
	 * 
	 * @return
	 * @throws Exception
	 */
	@Scheduled(cron = "0 0 9 * * ?")
	public void remindUserDate() throws Exception {
		List<DateList> dateList=helperService.getDateListByDate();
		if(dateList==null||dateList.size()<1) return;
		
		for(DateList dates:dateList) {
			try {
				pushService.setSendTemplate(dates);
			} catch (Exception e) {
				logger.error(dates.getDateId()+" has error");
			}
			Thread.sleep(100);
		}
	}
	
	/**
	 * 每天9点零5点运行周年提醒
	 * 
	 * @return
	 * @throws Exception
	 */
	@Scheduled(cron = "0 5 9 * * ?")
	public void remindAnniversaryDate() throws Exception {
		List<DateList> dateList=helperService.getAnniversaryDate();
		if(dateList==null||dateList.size()<1) return;
		
		Date date=new Date();
		int d=date.getDate();
		int m=date.getMonth();
		int y=date.getYear();
		
		for(DateList dates:dateList) {
			if(m==dates.getDateTime().getMonth()&&d==dates.getDateTime().getDate()&&y!=dates.getDateTime().getYear()) {
				pushService.setAnniversary(dates);
				Thread.sleep(100);
			}
		}
	}
	
	/**
	 * 每天9点零2分运行系统默认提醒
	 * 恋爱类提醒
	 * @return
	 * @throws Exception
	 */
	@Scheduled(cron = "0 2 9 * * ?")
	public void defaultRemindDate() throws Exception {
		List<DateList> dateList=helperService.getDefaultRemindDate();
		if(dateList==null||dateList.size()<1) return;
		
		for(DateList dates:dateList) {
			pushService.sendDefaultRemind(dates);
			Thread.sleep(100);
		}
	}
	
	/**
	 * 系统节日提醒
	 * 每天9点8分运行提醒任务
	 * 
	 * @return
	 * @throws Exception
	 */
	@Scheduled(cron = "0 8 9 * * ?")
	public void systemDateRemindUserDate() throws Exception {
		List<DateList> dateList=helperService.getAdminDateListByDate();
		if(dateList==null||dateList.size()<1) return;
		
		for(DateList dates:dateList) {
			List<Muser> userList=helperService.getUserBySetting(Constantutils.ADMIN_USER_CLOSED);
			if(userList!=null&&userList.size()>0) {
				for(Muser user:userList) {
					dates.setOpenId(user.getOpenid());
					
					try {
						pushService.setSendTemplate(dates);
					} catch (Exception e) {
						logger.error(dates.getDateId()+" has error");
					}
					Thread.sleep(100);
				}
			}
			
		}
	}
	
	/**
	 * 每天9点零3分运行系统提醒
	 * 生日类提醒
	 * @return
	 * @throws Exception
	 */
	@Scheduled(cron = "0 3 9 * * ?")
	public void birthdayRemindDate() throws Exception {
		List<DateList> dateList=helperService.getBirthdayRemindDate();
		if(dateList==null||dateList.size()<1) return;
		
		for(DateList dates:dateList) {
			pushService.setSendTemplate(dates);
			Thread.sleep(100);
		}
	}
	
	/**
	 * 每三十分钟重新计算下次提醒时间
	 * 
	 * @return
	 * @throws Exception
	 */
	@Scheduled(cron = "0 0/30 * * * ?")
	public void updateNextRemindTime() throws Exception {
		List<DateList> dateList=helperService.getDateListForUpdete();
		if(dateList==null||dateList.size()<1) return;
		
		for(DateList dates:dateList) {
			helperService.getNextRemind(dates);
		}
	}
	
	/**
	 * 每天三点更新用户纪念日UserId
	 * 
	 * @return
	 * @throws Exception
	 */
	@Scheduled(cron = "0 0 3 * * ?")
	public void updateDateListUserId() throws Exception {
		List<DateList> dateList=helperService.selectNotEqualUserId();
		if(dateList==null||dateList.size()<1) return;
		System.out.println("更新数据"+dateList.size()+"条");
		for(DateList dates:dateList) {
			DateList date=dateService.getDateListById(dates.getDateId());
			Muser user=helperService.getUserByTOpenId(dates.getOpenId());
			
			if(date!=null&&user!=null) {
				date.setUserId(user.getId());
				helperService.updateByPrimaryKey(date);
			}
			
		}
	}
	
	/**
	 * 
	 * 执行未成功退款，退款任务
	 * @return
	 * @throws Exception
	 */
	@Scheduled(cron = "0 28 0/1 * * ?")
	public void checkUnRefundRecords() throws Exception {
		List<AlipayRecords> aliList=alipayService.getRecordsUnRefund();
		if(aliList==null||aliList.size()<1) return;
		
		for(AlipayRecords records:aliList) {
			alipayService.doRefund(records.getOutTradeNo());
		}
	}
	
	/**
	 * 删除错误数据和无效数据
	 * 每天凌晨三点执行
	 * @return
	 * @throws Exception
	 */
	@Scheduled(cron = "0 0 3 * * ?")
	public void deleteNotSuccessRecords() throws Exception {
		// 执行未支付删除记录
		List<AlipayRecords> aliList = alipayService.getNotSuccessRecords();
		if (aliList != null && aliList.size() > 0) {
			for (AlipayRecords record : aliList) {
				alipayService.deleteRecord(record);
			}
		}

		// 删除无效历史记录
		List<DateHistory> hisList = dateService.selectByExampleToDelete();
		if (hisList == null || hisList.size() < 1)
			return;

		for (DateHistory record : hisList) {
			dateService.deleteByPrimaryKey(record);
		}
	}
	
}
