package com.nanditha.BookListApplication;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nanditha.BookListApplication.controller.BookListController;
import com.nanditha.BookListApplication.controller.WelcomeController;
import com.nanditha.BookListApplication.model.Book;

@SpringBootTest
class BookListApplicationTests {
	@Autowired
	private BookListController booklistcontroller;
	
	@Autowired
	private WelcomeController welcomecontroller;

	@Test
	void contextLoads() {
		assertThat(booklistcontroller).isNotNull();
		assertThat(welcomecontroller).isNotNull();
	}
	
	@Test
	void getBookTest() {
		List<Book> l= booklistcontroller.getBooks();
		assertEquals(7,l.size());
	}

}
