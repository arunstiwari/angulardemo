package com.space.ast.app.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;

	public Iterable<Book> fetchAllBooks() {
		return bookRepository.findAll();
	}

}
