/**
 * 
 */
package com.nanditha.BookListApplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author NANDITHA
 *

 */
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name="bookdetails")
public class Book {
	@Column
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int id;
	@Column(nullable= false)
	public String title;
	@Column(nullable= false)
	public String author;
	@Column(nullable= false)
	public String genre;
	@Column(nullable= false)
	public String category;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	

}
