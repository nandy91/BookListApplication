/**
 * 
 */
package com.nanditha.BookListApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nanditha.BookListApplication.model.Book;
import com.nanditha.BookListApplication.repository.BookRepository;

/**
 * @author NANDITHA
 *
 */
@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public List<Book> getAllBooks() {
		
		return bookRepository.findAll();
	}

	@Override
	public Optional<List<Book>> getAllBooksbyGenre(String genre) {
		
		return bookRepository.findByGenre(genre);
	}

	@Override
	public Optional<Book> getAllBooksByAuthor(String author) {
		
		return bookRepository.findByAuthor(author);
	}

	@Override
	public void create(Book book) {
		bookRepository.save(book);
		
	}

	@Override
	public void delete(int id) {
		Optional<Book> book = bookRepository.findById(id);
		// TODO Improve this part
		if(book.isPresent()) {
			bookRepository.delete(book.get()) ;
		}
		
	}

	@Override
	public void update(Book book) {
		
		bookRepository.save(book);
	}

	

}
