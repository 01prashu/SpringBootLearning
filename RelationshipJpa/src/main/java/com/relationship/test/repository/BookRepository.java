package com.relationship.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.relationship.test.entities.Book;

public interface BookRepository extends CrudRepository<Book,Integer> {

}
