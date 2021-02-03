package com.springboot.practice.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.practice.model.Student;
import com.springboot.practice.repository.StudentRepository;

@RestController
public class StudentRestController {
	@Autowired
	private StudentRepository srepo;

	// create student
	@PostMapping("/add/student")
	public Student addStudent(@RequestBody Student s) {
		return srepo.save(s);
	}

	//getAll student
	@GetMapping("/list/student")
	public List<Student> getAllStudent() {
		return srepo.findAll();
	}

	//get Studentby Id
	@GetMapping("/getId/{id}")
	public Optional<Student> getById(@PathVariable("id") int id) {
		return srepo.findById(id);
	}
	
	//Update Student
	@PutMapping("/student/update")
	public Student updateStudent(@RequestBody Student s)
	{
		return srepo.save(s);
	}
	
	//delete student
	@DeleteMapping("/delete/student/{id}")
	public String deleteStd(@PathVariable("id")int id)
	{
		 srepo.deleteById(id);
		 return "Deleted success";
	}

}
