package com.col.movieapp.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
@Data
public class MovieTime {
	
	@Id
	private int movieId;
	
	private String movieName;
	private String description;
	private String movieCast;
	private int prize;
	
	private LocalTime addedTime;
	private LocalTime time;
	
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate date;
	private boolean bookingOpened;
	private String movieStatus;
	
	
    @OneToOne(cascade=CascadeType.ALL,orphanRemoval = true)
	private ScreenDetails screen;

}
