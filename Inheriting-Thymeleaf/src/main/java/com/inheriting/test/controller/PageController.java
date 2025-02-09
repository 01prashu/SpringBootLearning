package com.inheriting.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.inheriting.test.entities.ContactData;

import jakarta.validation.Valid;

@Controller
public class PageController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String getPage()
	{
		return "base";
	}
	
	@GetMapping("/about")
	public String getAbout()
	{
		return "about";
	}
	
	@GetMapping("/service")
	public String getService()
	{
		return "service";
	}
	@GetMapping("/contact")
	public String getContact(Model model)
	{
		model.addAttribute("logindata",new ContactData());
		return "contact"; 	
	}
	
	@PostMapping("/handle-form")
	public String HandleMethod(@Valid  @ModelAttribute("logindata") ContactData data , Model model , BindingResult result)
	{
		
		
		if(result.hasErrors())
		{
			System.out.println(result);
			return "contact";
		}
		model.addAttribute("name",data.getName());
		model.addAttribute("email",data.getEmail());
		model.addAttribute("message",data.getMessage());	
		System.out.println(data);
		return "success";
	}
}
