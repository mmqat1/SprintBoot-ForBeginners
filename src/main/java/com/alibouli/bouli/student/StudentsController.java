package com.alibouli.bouli.student;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/students")
public class StudentsController {
	
	
	@GetMapping
	public List<String> findAllStudents() {
		return List.of("amit","sumit");
	}
}
