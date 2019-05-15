package com.stip.net.service.impl;

import com.stip.mybatis.generator.plugin.BaseService;
import com.stip.net.entity.SysDict;
import com.stip.net.example.SysDictExample;
import com.stip.net.service.SysDictService;
import org.springframework.stereotype.Service;

@Service
public class SysDictServiceImpl extends BaseService<SysDict, SysDictExample, Long> implements SysDictService {
}