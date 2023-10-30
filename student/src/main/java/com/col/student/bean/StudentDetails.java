package com.col.student.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class StudentDetails implements Serializable{
	@Id
	private int stdId;
	private String stdRollNumber;
	private String stdName;
	private String stdDepartmentName;

}
