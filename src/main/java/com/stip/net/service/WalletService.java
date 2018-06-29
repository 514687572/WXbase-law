package com.stip.net.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stip.net.dao.UserWalletDao;
import com.stip.net.dao.WalletHistoryDao;
import com.stip.net.entity.UserWallet;
import com.stip.net.entity.WalletHistory;
import com.stip.net.example.UserWalletExample;
import com.stip.net.utils.GrnerateUUID;

@Service
public class WalletService{
	@Resource
	public UserWalletDao userWalletDao;
	@Resource
	public WalletHistoryDao walletHistoryDao;

	/**
	 * 添加钱包记录
	 */
	public void addWalletHistory(String openid,String changeBalance,String type) {
		WalletHistory history=new WalletHistory();
		history.setBalanceChange(changeBalance+"");
		history.setCreateTime(new Date());
		history.setHistoryId(GrnerateUUID.getUUID());
		history.setOpenId(openid);
		history.setStatus("SUCCESS");
		history.setType(type);
		
		walletHistoryDao.insert(history);
	}
	
	/**
	 * 根据openid更新用户钱包金额
	 * @param openid
	 */
	public void updateWalletByOpenid(String openid,int change) {
		UserWalletExample example=new UserWalletExample();
		example.createCriteria().andOpenIdEqualTo(openid);
		List<UserWallet> walletList=userWalletDao.selectByExample(example);
		
		if(walletList!=null&&walletList.size()==1) {
			UserWallet wallet=walletList.get(0);
			wallet.setBalance(getNewValue(wallet.getBalance(),change));
			wallet.setUpdateTime(new Date());
			
			userWalletDao.updateByPrimaryKey(wallet);
		}else {
			if(change>0) {
				UserWallet wallet=new UserWallet();
				wallet.setBalance(change+"");
				wallet.setUpdateTime(new Date());
				wallet.setOpenId(openid);
				wallet.setWalletId(GrnerateUUID.getUUID());
				
				userWalletDao.insert(wallet);
			}
		}
	}
	
	public String getNewValue(String currentValue,int change) {
		long current=Long.parseLong(currentValue);
		long newValue=current+change;
		
		return newValue+"";
	}
	
	/**
	 * 根据openid查询用户钱包金额
	 * @param openid
	 * @return 
	 */
	public String getWalletBalance(String openid) {
		UserWalletExample example=new UserWalletExample();
		example.createCriteria().andOpenIdEqualTo(openid);
		List<UserWallet> walletList=userWalletDao.selectByExample(example);
		
		if(walletList!=null&&walletList.size()==1) {
			return walletList.get(0).getBalance();
		}else {
			return "0";
		}
	}
	
}
