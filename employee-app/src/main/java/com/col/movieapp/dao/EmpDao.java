package com.col.movieapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.col.movieapp.beans.EmployeeDetails;

public interface EmpDao extends CrudRepository<EmployeeDetails, Integer>{
	public EmployeeDetails findByEmpId(Integer empId);

}
