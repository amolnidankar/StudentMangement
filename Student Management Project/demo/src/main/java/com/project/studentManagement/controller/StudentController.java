package com.project.studentManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.studentManagement.entity.Student;
import com.project.studentManagement.service.StudentService;



@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/student")
	public Student saveStudent( @RequestBody Student s){
		System.out.println("Saving Student's in DataBase : ");
		studentService.saveUser(s);
		return s;
		
	}
	
	@GetMapping("/student")
	public String getAllStudent(Model model){
		System.out.println("Fetching All the Student From DataBase ");
		model.addAttribute("list",studentService.getAllStudent() );
		return "index";
	}
	

}
