package com.col.movieapp.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;


@Data
public class Bookings {
	@Id
	private String ticketId;
	private int noOdMembers;
	
	
    @OneToOne(cascade=CascadeType.ALL,orphanRemoval = true)
    private User user;
    

    @OneToOne(cascade=CascadeType.ALL,orphanRemoval = true)
    private MovieTime movieDetails;
	
	@OneToMany
	@JoinColumn(name="ticketId")
	private List<Seat> seatsForThisBooking=new ArrayList<Seat>();
	
	

}
