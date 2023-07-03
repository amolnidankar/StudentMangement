package com.project.studentManagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.studentManagement.Repository.StudentRepository;
import com.project.studentManagement.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	public StudentRepository studentRepository;
	
	
	
	public List<Student> getAllStudent(){
		
		List<Student> stu = new ArrayList<Student>();
 		studentRepository.findAll().forEach((student)->stu.add(student));
 		return stu;
	}
	
	public void saveUser(Student s) {
		 studentRepository.save(s);
	}
	
	
	
	
}
