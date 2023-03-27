package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table
public class Student {

	@Id
	private String id;
	
	private String studentName;
	
	private String studentAddress;
	
	private String email;
	
	private int phoneNumber;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String id, String studentName, String studentAddress, String email, int phoneNumber) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
