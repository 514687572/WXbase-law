package com.stip.net.dao;

import java.util.List;

import com.stip.mybatis.generator.plugin.GenericMapper;
import com.stip.net.entity.PraiseRecords;
import com.stip.net.example.PraiseRecordsExample;

 /**
 * generator XML
 **/
public interface PraiseRecordsDao extends GenericMapper<PraiseRecords, PraiseRecordsExample, String> {
	
	List<PraiseRecords> selectwithUserByDateId(String dateId);
}