package com.col.busmanagement.beans;

import java.io.Serializable;
import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GeneratorType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bus implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	@ManyToOne
	@JoinColumn(name = "ownerId")
	private OwnerDetails details;
	

}
