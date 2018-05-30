package com.soecode.lyf.service.impl;

import com.soecode.lyf.dto.AppointExecution;
import com.soecode.lyf.entity.Book;
import com.soecode.lyf.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 阅读spring源码的入口
 * 1、读取配置文件，封装成beanDefinition，注册到BeanFactory中
 * 2、getBean单例获取
 * user:hudawei1
 * date:2018/5/11
 * time:13:50
 */
public class IOCTest {

    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"classpath:spring/spring-service.xml","classpath:spring/spring-dao.xml"});
        BookService bookService = (BookService) ctx.getBean("bookServiceImpl");
        long bookId = 1001;
        long studentId = 12345678910L;
        AppointExecution execution = bookService.appoint(bookId, studentId);
        System.out.println(execution);
    }

}
