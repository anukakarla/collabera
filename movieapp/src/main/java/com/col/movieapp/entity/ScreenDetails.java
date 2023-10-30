package com.col.movieapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
public class ScreenDetails {
	@Id
	private int screenId;
	private String type; //3d or 3d
	private String totalSeats;
	

}
