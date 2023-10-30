package com.col.movieapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.col.movieapp.entity.User;
import com.col.movieapp.response.Response;
import com.col.movieapp.service.AdminUserService;


@RestController
@RequestMapping
public class UserAdminController {
	
	@Autowired
	 private AdminUserService adminUserService;
	
	@PostMapping("/newAdmin")
	public ResponseEntity<?> createNewAdmin(@RequestBody User user){
		user.setRole("ROLE_ADMIN");
		Response response=adminUserService.createUser(user);
		return  ResponseEntity.ok(response);
		
		
	}

}
