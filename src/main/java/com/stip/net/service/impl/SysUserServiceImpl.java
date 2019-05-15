package com.stip.net.service.impl;

import com.stip.mybatis.generator.plugin.BaseService;
import com.stip.net.dao.SysUserDao;
import com.stip.net.entity.SysUser;
import com.stip.net.example.SysUserExample;
import com.stip.net.service.SysUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl extends BaseService<SysUser, SysUserExample, String> implements SysUserService {
    @Override
    public SysUser findUserByUnionId(String unionId) {
        SysUserExample example=new SysUserExample();
        example.createCriteria().andUnionidEqualTo(unionId);
        List<SysUser> userList= dao.selectByExample(example);

        if(userList!=null&&userList.size()>0){
            return userList.get(0);
        }else{
            return null;
        }
    }
}