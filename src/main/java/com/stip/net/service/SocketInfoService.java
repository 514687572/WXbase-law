package com.stip.net.service;

import com.stip.mybatis.generator.plugin.IService;
import com.stip.net.entity.SocketInfo;
import com.stip.net.example.SocketInfoExample;

import java.util.List;

/**
 * Extensible custom interface
 **/
public interface SocketInfoService extends IService<SocketInfo, SocketInfoExample, Integer> {
  List<SocketInfo> getSocketInforByPage(String page, String record);
  List<SocketInfo> getSocketInforByPage(String page, String record,String keyWords);
}