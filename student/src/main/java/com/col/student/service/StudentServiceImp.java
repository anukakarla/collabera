package com.col.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.col.student.bean.StudentDetails;
import com.col.student.dao.StudentDao;

@Service
public class StudentServiceImp implements UserDetailsService {
	@Autowired
	private StudentDao dao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return null;
	}

	public StudentDetails addDetails(StudentDetails details) {

		return dao.save(details);

	}

	public List<StudentDetails> getAll() {
		return (List<StudentDetails>) dao.findAll();

	}

}
