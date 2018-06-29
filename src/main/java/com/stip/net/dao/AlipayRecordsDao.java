package com.stip.net.dao;

import java.util.List;

import com.stip.mybatis.generator.plugin.GenericMapper;
import com.stip.net.entity.AlipayRecords;
import com.stip.net.example.AlipayRecordsExample;
import com.stip.net.mp.dto.AliGiftInfo;

 /**
 * generator XML
 **/
public interface AlipayRecordsDao extends GenericMapper<AlipayRecords, AlipayRecordsExample, Integer> {
	List<AliGiftInfo> selectOutGiftListWithUser(String openid);
}