package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Exception.StudentNotFoundException;
import com.example.demo.Repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired 
	private StudentRepository repo;
	
	private int value = 0;

	@Override
	public Student save(Student student) {
		String id = "studentNumber :- " + getValue() + "- 2023";
		student.setId(id);
		Student studentToSave = repo.save(student);
		return studentToSave;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> getAll = repo.findAll();
		return getAll;
	}

	@Override
	public void delete(Student student) throws StudentNotFoundException{
		Student studentToDelete = getStudentById(student.getId());
		repo.delete(studentToDelete);
	}

	@Override
	public Student update(Student student,String id) throws StudentNotFoundException{
		Student studentGetById = getStudentById(id);
		studentGetById.setEmail(student.getEmail());
		studentGetById.setPhoneNumber(student.getPhoneNumber());
		studentGetById.setStudentName(student.getStudentName());
		studentGetById.setStudentAddress(student.getStudentAddress());
		
		repo.save(studentGetById);
		
		return studentGetById;
	}

	@Override
	public Student getStudentById(String id) throws StudentNotFoundException{
		Student studentToGetById = new Student();
		if(repo.findById(id) != null ) {
			studentToGetById = repo.getById(id);
		}else {
			throw new StudentNotFoundException("");
		}
		return studentToGetById;
	}
	
	public int getValue() {
		return value++;
	}
	
}
