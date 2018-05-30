package com.soecode.lyf.service.impl;

import static org.junit.Assert.fail;

import com.soecode.lyf.entity.Book;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.soecode.lyf.BaseTest;
import com.soecode.lyf.dto.AppointExecution;
import com.soecode.lyf.service.BookService;

public class BookServiceImplTest extends BaseTest {

	@Autowired
	private BookService bookService;

	@Test
	public void testAppoint() throws Exception {
		long bookId = 1001;
		long studentId = 12345678910L;
		AppointExecution execution = bookService.appoint(bookId, studentId);
		System.out.println(execution);
	}

	@Test
	public void getID(){
		long bookId = 1001;
		Book book = bookService.getById(bookId);
		System.out.println("执行结果："+book);
	}

}
