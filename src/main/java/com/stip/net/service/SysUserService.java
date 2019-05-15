package com.stip.net.service;

import com.stip.mybatis.generator.plugin.IService;
import com.stip.net.entity.SysUser;
import com.stip.net.example.SysUserExample;

 /**
 * Extensible custom interface
 **/
public interface SysUserService extends IService<SysUser, SysUserExample, String> {
     SysUser findUserByUnionId(String unionId);
 }