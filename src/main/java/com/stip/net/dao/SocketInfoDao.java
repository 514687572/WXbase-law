package com.stip.net.dao;

import com.stip.mybatis.generator.plugin.GenericMapper;
import com.stip.net.entity.SocketInfo;
import com.stip.net.example.SocketInfoExample;

 /**
 * 可添加自定义查询语句，方便后续扩展
 **/
public interface SocketInfoDao extends GenericMapper<SocketInfo, SocketInfoExample, Integer> {
}