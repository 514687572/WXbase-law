package com.stip.net.service;

import com.stip.mybatis.generator.plugin.IService;
import com.stip.net.entity.UserStock;
import com.stip.net.example.UserStockExample;

import java.util.List;

/**
 * Extensible custom interface
 **/
public interface UserStockService extends IService<UserStock, UserStockExample, Integer> {
  List<UserStock> getSocketByPage(String page, String record,String openid);
}