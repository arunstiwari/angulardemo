package com.space.ast.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.space.ast.app.domain.Book;
import com.space.ast.app.domain.BookService;

@RestController 
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="/books", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Iterable<Book>> listAllBooks(){
		Iterable<Book> books = bookService.fetchAllBooks();
		return new ResponseEntity<Iterable<Book>>(books, HttpStatus.OK);
	}

}
