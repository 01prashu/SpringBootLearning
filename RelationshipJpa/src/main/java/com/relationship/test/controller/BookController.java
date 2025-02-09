package com.relationship.test.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.relationship.test.entities.Author;
import com.relationship.test.entities.Book;
import com.relationship.test.repository.BookRepository;

@RestController
public class BookController {
	@Autowired
	private BookRepository bookRepository;
	@GetMapping("/books")
	public ArrayList<Book>getBooks()
	{
		Iterable<Book> iterable =bookRepository.findAll();
		ArrayList<Book>bookList = new ArrayList<>();
		for(Book b : iterable)
		{
			bookList.add(b);
		}
		return bookList;
	}
	
	@PostMapping("/books")
	public Book createBook(@RequestBody Book req_book)
	{
		bookRepository.save(req_book);
		return req_book;
	}
}
