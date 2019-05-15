package com.stip.net.dao;

import com.stip.mybatis.generator.plugin.GenericMapper;
import com.stip.net.entity.UserStock;
import com.stip.net.example.UserStockExample;

 /**
 * 可添加自定义查询语句，方便后续扩展
 **/
public interface UserStockDao extends GenericMapper<UserStock, UserStockExample, Integer> {
}