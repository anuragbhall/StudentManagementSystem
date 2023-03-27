package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Entity.Student;

public interface StudentService {

	// save student

	Student save(Student student);

	// getAllStudents student
	List<Student> getAllStudents();

	// delete student
	void delete(Student student);

	// update student
	Student update(Student student, String id);
	
	Student getStudentById(String id);

}
