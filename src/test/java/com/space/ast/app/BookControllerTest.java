package com.space.ast.app;

import static com.jayway.restassured.module.mockmvc.RestAssuredMockMvc.given;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.space.ast.Application;

@SpringApplicationConfiguration(classes={Application.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class BookControllerTest {

	@Autowired
	private BookController bookController;
	
	@Test
	public void showListOfBooks() throws Exception {
		
		given()
			.standaloneSetup(bookController)
		.when()
		  .get("/books")
		.then()
			.log().all()
			.statusCode(HttpStatus.OK.value())
			.body("size()", Matchers.equalTo(5))
			.body("[0].author", Matchers.is("Rabindranath Tagore"));
	}
}
