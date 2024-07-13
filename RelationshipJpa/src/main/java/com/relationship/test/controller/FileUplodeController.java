package com.relationship.test.controller;

import java.io.IOException;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.relationship.test.entities.File;
import com.relationship.test.repository.FileRepository;

@RestController
public class FileUplodeController {
	@Autowired
	private FileRepository fileRepository;
	@PostMapping("/savefile")
	public ResponseEntity saveFile(@RequestParam("myfile") MultipartFile file) throws IOException
	{
//		System.out.println(file.getName());
//		System.out.println(file.getContentType());
//		System.out.println(file.getSize());
//		System.out.println(file.getOriginalFilename());
		String name=file.getOriginalFilename();
		byte[]data = file.getBytes();
		File obj_file = new File(1,name,data);
		fileRepository.save(obj_file);
		return ResponseEntity.ok("Working");
	}
}
