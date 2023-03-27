package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentServiceImpl;

@RestController
public class StudentController {
	
	@Autowired
	private StudentServiceImpl service;
	
	@PostMapping("/saveStudent")
	private ResponseEntity<Student> saveStudent(@RequestBody Student student){
		Student studentToSave = service.save(student);
		return ResponseEntity.status(HttpStatus.OK).body(studentToSave);
	}
	
	@GetMapping("/getAllStudent")
	private ResponseEntity<List<Student>> getAllStudent(){
		List<Student> getAll = service.getAllStudents();
		return ResponseEntity.status(HttpStatus.OK).body(getAll);
	}
	
	@PutMapping("/updateStudent/{id}")
	private ResponseEntity<Student> updateStudent(@RequestBody Student student,@PathVariable String id){
		//service.update(student, id);
		Student studentToupdate = service.update(student, id);
		return ResponseEntity.status(HttpStatus.OK).body(studentToupdate);
	}
	
	@DeleteMapping("/delete")
	private ResponseEntity<Object> deleteStudent(@RequestBody Student student){
		service.delete(student);
		return ResponseEntity.status(HttpStatus.OK).body("Deleted");
	}
	
	@GetMapping("/getStudentById/{id}")
	private ResponseEntity<Object> getStudentById(@PathVariable String id){
		Student student = service.getStudentById(id);
		return ResponseEntity.status(HttpStatus.OK).body(student);
	}
		
}
