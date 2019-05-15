package com.stip.net.service.impl;

import com.stip.mybatis.generator.plugin.BaseService;
import com.stip.net.entity.UserStockInfo;
import com.stip.net.example.UserStockInfoExample;
import com.stip.net.service.UserStockInfoService;
import org.springframework.stereotype.Service;

@Service
public class UserStockInfoServiceImpl extends BaseService<UserStockInfo, UserStockInfoExample, Integer> implements UserStockInfoService {
}