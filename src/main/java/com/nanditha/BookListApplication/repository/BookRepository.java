/**
 * 
 */
package com.nanditha.BookListApplication.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nanditha.BookListApplication.model.Book;

/**
 * @author NANDITHA
 *
 */
public interface BookRepository extends JpaRepository<Book,Integer> {

	/**
	 * @param author
	 * @return
	 */
	Optional<Book> findByAuthor(String author);

	/**
	 * @param genre
	 * @return
	 */
	Optional<List<Book>> findByGenre(String genre);

	
	

}
