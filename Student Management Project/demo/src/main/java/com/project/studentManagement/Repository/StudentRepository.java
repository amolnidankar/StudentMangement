package com.project.studentManagement.Repository;

import org.springframework.data.repository.CrudRepository;

import com.project.studentManagement.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long>{
	
}
