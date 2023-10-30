package com.col.movieapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
public class User {
	@Id
	private String userID;
	private String userName;
	private String password;
	private long mobile;
	private String role;  //ROLE_USER or ROLE_ADMIN
	

}
