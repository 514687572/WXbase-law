package com.stip.net.dao;

import java.util.List;

import com.stip.mybatis.generator.plugin.GenericMapper;
import com.stip.net.entity.Message;
import com.stip.net.example.MessageExample;

 /**
 * generator XML
 **/
public interface MessageDao extends GenericMapper<Message, MessageExample, String> {
	
	List<Message> selectMEByEx(MessageExample me);
}