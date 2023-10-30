package com.col.movieapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.col.movieapp.entity.User;
import com.col.movieapp.repo.UserRepo;
import com.col.movieapp.response.Response;


@Service
public class AdminUserService {
	@Autowired
	UserRepo userRepo;
	
	public Response createUser(User user) {
		Response res;
		if(userRepo.findByUserName(user.getUserName()) || userRepo.findByMobile(user.getMobile())) {
			res=new Response("alredyFound",true);
		}
		else {
			user =userRepo.save(user);
			res=new Response("created",false);
			
		}
		
		return null;
	}

}
