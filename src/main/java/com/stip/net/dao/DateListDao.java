package com.stip.net.dao;

import java.util.List;

import com.stip.mybatis.generator.plugin.GenericMapper;
import com.stip.net.entity.DateList;
import com.stip.net.example.DateListExample;

 /**
 * generator XML
 **/
public interface DateListDao extends GenericMapper<DateList, DateListExample, String> {
	
	List<DateList> selectNotEqualOpenId();
	
	List<DateList> selectNotEqualUserId();
	
	List<DateList> selectByOrder(DateListExample example);
}