/**
 * 
 */
package com.nanditha.BookListApplication.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nanditha.BookListApplication.model.Book;
import com.nanditha.BookListApplication.service.BookService;

/**
 * @author NANDITHA
 *
 */

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class BookListController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public List<Book> getBooks() {
		return bookService.getAllBooks();
	}
	
	@PostMapping(path="/books", consumes="application/json", produces="application/json")
    public void create(@RequestBody Book book) {
        bookService.create(book);;
    }
	
	@GetMapping("/books/{genre}")
	public Optional<List<Book>> getGenre(@PathVariable("genre") String genre) {
		return bookService.getAllBooksbyGenre(genre);
	}

}
