package com.col.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.col.student.service.StudentServiceImp;

@RestController
public class StudentController {
	@Autowired
	private StudentServiceImp imp;
	
	

}
