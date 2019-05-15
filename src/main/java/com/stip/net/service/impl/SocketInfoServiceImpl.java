package com.stip.net.service.impl;

import com.stip.mybatis.generator.plugin.BaseService;
import com.stip.net.entity.SocketInfo;
import com.stip.net.example.SocketInfoExample;
import com.stip.net.service.SocketInfoService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocketInfoServiceImpl extends BaseService<SocketInfo, SocketInfoExample, Integer> implements SocketInfoService {
    @Override
    public List<SocketInfo> getSocketInforByPage(String page, String record) {
        SocketInfoExample example=new SocketInfoExample();
        example.setPager(Integer.parseInt(page),Integer.parseInt(record));
        example.setOrderByClause(" socketInfo.stock_id desc");

        List<SocketInfo> list=dao.selectByExample(example);

        if(CollectionUtils.isEmpty(list)){
            return null;
        }else{
            return list;
        }
    }

    @Override
    public List<SocketInfo> getSocketInforByPage(String page, String record, String keyWords) {
        SocketInfoExample example=new SocketInfoExample();
        example.setPager(Integer.parseInt(page),Integer.parseInt(record));
        example.createCriteria().andStockNameOrCodeLike(keyWords);

        List<SocketInfo> list=dao.selectByExample(example);

        if(CollectionUtils.isEmpty(list)){
            return null;
        }else{
            return list;
        }
    }
}