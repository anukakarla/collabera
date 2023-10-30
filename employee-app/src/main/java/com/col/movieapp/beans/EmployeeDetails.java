package com.col.movieapp.beans;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class EmployeeDetails implements Serializable{
	@Id
	private int empId;
	private String empName;
	private int empAge;
	private Date empBirth;
	private String empMail;
	private long empPhoneNumber;
	private String empAddress;
	private String empMaritalstatus;
	private String empDesignation;
	private String empLocation;
	
	
	

}
