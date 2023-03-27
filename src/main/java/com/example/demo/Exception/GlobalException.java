package com.example.demo.Exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<Map<String,Object>> handleStudentNotFound(StudentNotFoundException ex){
		Map map = new HashMap();
		map.put("message", ex.getMessage());
		map.put("success", true);
		map.put("status", HttpStatus.NOT_FOUND);
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
	}

}
