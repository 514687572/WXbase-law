package com.stip.net.dao;

import com.stip.mybatis.generator.plugin.GenericMapper;
import com.stip.net.entity.BlogContent;
import com.stip.net.example.BlogContentExample;

 /**
 * 可添加自定义查询语句，方便后续扩展
 **/
public interface BlogContentDao extends GenericMapper<BlogContent, BlogContentExample, Long> {
}