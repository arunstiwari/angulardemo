package com.space.ast.app.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book { 
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long isbn;
	private String author;
	private String title;
	
	public Book(){}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getIsbn() {
		return isbn;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}
	
}
