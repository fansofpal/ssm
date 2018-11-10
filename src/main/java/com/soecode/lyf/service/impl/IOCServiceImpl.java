package com.soecode.lyf.service.impl;

import com.soecode.lyf.service.BookService;
import com.soecode.lyf.service.IOCService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * user:hudawei1
 * date:2018/9/5
 * time:10:34
 */
@Service
public class IOCServiceImpl implements IOCService{
    @Resource
    private BookService bookService;

    @Override
    public void testIOC() {
        bookService.getList();
    }
}
