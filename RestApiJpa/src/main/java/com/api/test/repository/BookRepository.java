package com.api.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.api.test.entities.Book;

public interface BookRepository extends CrudRepository<Book , Integer> {

}
