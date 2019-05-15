package com.stip.net.service.impl;

import com.stip.mybatis.generator.plugin.BaseService;
import com.stip.net.entity.BlogContent;
import com.stip.net.example.BlogContentExample;
import com.stip.net.service.BlogContentService;
import org.springframework.stereotype.Service;

@Service
public class BlogContentServiceImpl extends BaseService<BlogContent, BlogContentExample, Long> implements BlogContentService {
}