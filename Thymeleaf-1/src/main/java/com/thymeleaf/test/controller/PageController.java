package com.thymeleaf.test.controller;



import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping(value="/Home",method=RequestMethod.GET)
public class PageController {
	@GetMapping("/about")
	public String AboutPage(Model model)
	{
		model.addAttribute("name","Prashant Netke");
		model.addAttribute("city","Pune");
		model.addAttribute("a",23);
		model.addAttribute("b",56);
		
		List<String> names= List.of("prashant","aditya","sarthak","abhishek");
		model.addAttribute("names", names);
		
		return "about";
	}
	
	@GetMapping("/contact")
	public String ContactPage(Model model)
	{
		model.addAttribute("date",new Date().toLocaleString());
		return "contact";
	}
}
