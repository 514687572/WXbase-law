package com.stip.net.service.impl;

import com.stip.mybatis.generator.plugin.BaseService;
import com.stip.net.entity.SocketInfo;
import com.stip.net.entity.UserStock;
import com.stip.net.example.SocketInfoExample;
import com.stip.net.example.UserStockExample;
import com.stip.net.service.UserStockService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserStockServiceImpl extends BaseService<UserStock, UserStockExample, Integer> implements UserStockService {
    public List<UserStock> getSocketByPage(String page, String record,String openid) {
        UserStockExample example=new UserStockExample();
        example.setPager(Integer.parseInt(page),Integer.parseInt(record));
        example.createCriteria().andUserOpenIdEqualTo(openid);

        List<UserStock> list=dao.selectByExample(example);

        if(CollectionUtils.isEmpty(list)){
            return null;
        }else{
            return list;
        }
    }
}