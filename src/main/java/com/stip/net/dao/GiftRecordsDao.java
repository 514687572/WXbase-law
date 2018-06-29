package com.stip.net.dao;

import java.util.List;

import com.stip.mybatis.generator.plugin.GenericMapper;
import com.stip.net.entity.GiftRecords;
import com.stip.net.example.GiftRecordsExample;
import com.stip.net.mp.dto.GiftInfo;

 /**
 * generator XML
 **/
public interface GiftRecordsDao extends GenericMapper<GiftRecords, GiftRecordsExample, String> {
	List<GiftInfo> selectGiftDetailByExample(String openid);
}