package com.col.busmanagement.beans;

import java.sql.Time;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusWoOwnerDetails {

	private int busId;
	private String busName;
	private String source;
	private String destination;
	private Double specialCharge;
	private Time arrivalTime;
	private Time departedTime;
	private double distance;
	private String busFeautre;
	private double normalCharge;
	private String sleeper;
	private String username;

}
