package com.col.movieapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
public class TheatreEntity {
	@Id
	private int id;
	private String theatrename;
	private String location;

}
