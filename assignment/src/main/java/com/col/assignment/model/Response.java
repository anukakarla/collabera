package com.col.assignment.model;

import java.util.List;

import com.col.assignment.domain.Currencies;
import com.col.assignment.domain.Name;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@JsonIgnoreProperties
@JsonFilter(value = "getCountry")
public class Response {

	public Response(Currencies currencies2, List<String> capital2, Name name2) {
		// TODO Auto-generated constructor stub
	}
	private List<String> capital;
	private String currencies;
	private String name;
	

}
