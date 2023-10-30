package com.col.student.dao;

import org.springframework.data.repository.CrudRepository;

import com.col.student.bean.StudentDetails;

public interface StudentDao extends CrudRepository<StudentDetails, Integer> {

	public StudentDetails findByStdName(String stdRollNumber);

}
