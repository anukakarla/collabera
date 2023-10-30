package com.col.movieapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
public class Seat {
	@Id
	private String seatId;
	private String seatLine; //klike A B C D.....
	private String seatNo; //A1, A2...
	private String status; //Locked , booked 
	

}
