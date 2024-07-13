package com.jpa.test.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entities.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {
	public List<Student>findByNameAndCity(String name , String city);
	
}
