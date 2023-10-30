package com.col.assignment.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
@Data
@JsonIgnoreProperties
public class Country {
	
	private String capital;
	private String currencies;
	private  List<Name> names;
 

}
