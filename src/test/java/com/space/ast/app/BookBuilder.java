package com.space.ast.app;

import com.space.ast.app.domain.Book;

public class BookBuilder {
	
	private Book book = new Book();
	
	public BookBuilder(){}
	
	public Book build(){
		return book;
	}

	public BookBuilder author(String author) {
		this.book.setAuthor(author);
		return this;
	}

	public BookBuilder title(String title) {
		this.book.setTitle(title);
		return this;
	}

}
