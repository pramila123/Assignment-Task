package com.springboot.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.practice.model.Student;
import com.springboot.practice.repository.StudentRepository;

@Controller
public class StudentController {
	@Autowired
	private StudentRepository srepo;
	@GetMapping({"/","/student"})
	public String getStudent()
	{
		return "student";
	}
	@PostMapping("/student")
	public String saveStudent(@ModelAttribute Student  s)
	{
		srepo.save(s);
		return "redirect:student";
	}
	

}
