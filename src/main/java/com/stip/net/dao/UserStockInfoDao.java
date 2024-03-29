package com.stip.net.dao;

import com.stip.mybatis.generator.plugin.GenericMapper;
import com.stip.net.entity.UserStockInfo;
import com.stip.net.example.UserStockInfoExample;

/**
 * 可添加自定义查询语句，方便后续扩展
 **/
public interface UserStockInfoDao extends GenericMapper<UserStockInfo, UserStockInfoExample, Integer> {
}