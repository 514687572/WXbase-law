package com.stip.net.dao;

import com.stip.mybatis.generator.plugin.GenericMapper;
import com.stip.net.entity.SysUser;
import com.stip.net.example.SysUserExample;

 /**
 * 可添加自定义查询语句，方便后续扩展
 **/
public interface SysUserDao extends GenericMapper<SysUser, SysUserExample, String> {
}