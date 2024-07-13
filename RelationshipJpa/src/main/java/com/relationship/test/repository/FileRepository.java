package com.relationship.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.relationship.test.entities.File;

public interface FileRepository extends CrudRepository<File,Integer> {

}
