/**
 * 
 */
package com.nanditha.BookListApplication.service;
import java.util.List;
import java.util.Optional;

import  com.nanditha.BookListApplication.model.Book;
/**
 * @author NANDITHA
 *
 */
public interface BookService {
	
	public List<Book> getAllBooks();
	public Optional<List<Book>> getAllBooksbyGenre(String genre);
	public Optional<Book> getAllBooksByAuthor(String author);
	public void create(Book book);
	public void delete(int id);
	public void update(Book book);
 
}
