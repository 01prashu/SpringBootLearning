package com.api.test.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.test.entities.Book;
import com.api.test.repository.BookRepository;

@RestController
public class BookController {
	@Autowired
	private BookRepository bookRepository;
	@GetMapping("/books")
	public ArrayList<Book> getBooks()
	{
		ArrayList<Book>bookList = new ArrayList<>();
		Iterable<Book>ite = bookRepository.findAll();
		for(Book book:ite)
		{
			bookList.add(book);
		}
		return bookList;
	}
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") int id)
	{
		Optional<Book> book = bookRepository.findById(id);
		return book.get();
	}
	@PostMapping("/books")
	public Book postBook(@RequestBody Book book)
	{
		Book b = bookRepository.save(book);
		return b;
	}
	
//	Delete mapping - Delete Request Mapping
	
	@DeleteMapping("/books/{id}")
	public ResponseEntity<Book> removeBook(@PathVariable("id") int id)
	{
		Optional<Book>optional_book = bookRepository.findById(id);
		if(optional_book.isPresent())
		{
			Book book = optional_book.get();
			bookRepository.delete(book);
			return  ResponseEntity.status(HttpStatus.ACCEPTED).build();			
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		
		
	}
	
//	UpdateBook 
//	@PutMapping("/books/{bookId}") - use to update the Book data
	
	
	@PutMapping("/books-update/{bookId}")
	public Book updateBook(@RequestBody Book book , @PathVariable("bookId") int b_id)
	{
		Optional<Book> optional = bookRepository.findById(b_id);
		if(optional.isPresent())
		{
			Book existing_book = optional.get();
			existing_book.setTitle(book.getTitle());
			existing_book.setAuthor(book.getAuthor());
			bookRepository.save(existing_book);
			return existing_book;
		}
		return book;
	}
}

