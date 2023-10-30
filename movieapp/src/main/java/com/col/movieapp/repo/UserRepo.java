package com.col.movieapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.col.movieapp.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, String>{
	boolean findByUserName(String userName);

	boolean findByMobile(long mobile);

}
