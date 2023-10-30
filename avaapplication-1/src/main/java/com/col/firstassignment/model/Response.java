package com.col.firstassignment.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Response {
	
	public Response(List<String> capital2, Currencies currencies2) {
		// TODO Auto-generated constructor stub
	}
	private String capital;
	private String currencies;

}
