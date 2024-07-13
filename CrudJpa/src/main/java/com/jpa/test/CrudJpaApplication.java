package com.jpa.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.entities.Student;
import com.jpa.test.repository.StudentRepository;

@SpringBootApplication
public class CrudJpaApplication {

	public static void main(String[] args) {
		System.out.println("Working....");
		ConfigurableApplicationContext context =  SpringApplication.run(CrudJpaApplication.class, args);
//		Student student1 = new Student(1,"vijay","Pune");
//		
//		StudentRepository studRepo = context.getBean(StudentRepository.class);
//		
//		Student stud2 = studRepo.save(student1);
//		System.out.println(stud2);
//		System.out.println("Working....");
		StudentRepository studRepo = context.getBean(StudentRepository.class);
//		ArrayList<Student>studList = new ArrayList<>();
//		
//		studList.add(new Student(2 ,"Aniket" ,"Chat Sambhajinagar"));
//		studList.add(new Student(3 ,"Mahesh" ,"Nagar"));
//		studList.add(new Student(4 ,"Karan","Nashik"));
//		
//		 Iterable<Student>iter=studRepo.saveAll(studList);
//		 for(Student student:iter)
//		 {
//			 System.out.println(student);
//		 }
		 
		
//		## get student
//		Optional<Student> optional= studRepo.findById(2);
//		Student stud = optional.get();
//		stud.setName("Arohi");
//		
//		Student result = studRepo.save(stud);
//		System.out.println(result);
		
//		#delete Student 
//		Optional<Student>optional = studRepo.findById(3);
//		Student stud = optional.get();
//		studRepo.delete(stud);
//		
//		Iterable<Student>iter =studRepo.findAll();
//		for(Student student:iter)
//		{
//			System.out.println(student);
//		}
		
//		# Customer finder method
		
		List<Student>studList = studRepo.findByNameAndCity("Aniket", "Pune");
		for(Student s:studList)
		{
			System.out.println(s);
		}
		
	}

}
