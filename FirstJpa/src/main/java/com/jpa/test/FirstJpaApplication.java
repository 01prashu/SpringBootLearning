package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class FirstJpaApplication {

	public static void main(String[] args) {
	 System.out.println("Working....");
	 ConfigurableApplicationContext context =	SpringApplication.run(FirstJpaApplication.class, args);
	 UserRepository userRepo = context.getBean(UserRepository.class);
	 
	 User user1 = new User();
	 user1.setId(12);
	 user1.setCity("Mumbai");
	 user1.setName("Abc");
	 
	 System.out.println("Working....");
	 User user = userRepo.save(user1);
	 System.out.println(user);
	}

}
