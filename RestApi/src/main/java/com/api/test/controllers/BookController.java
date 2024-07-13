package com.api.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.test.controllers.entities.Book;

@RestController
public class BookController {
	
//	@RequestMapping(value="/books" ,method=RequestMethod.GET)
	@GetMapping("/books")
	public Book getBook()
	{
		Book b1 = new Book(2323,"The java Foundation", "ABc");
		return b1;
	}
}
