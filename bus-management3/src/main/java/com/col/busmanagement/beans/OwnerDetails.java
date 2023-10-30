package com.col.busmanagement.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OwnerDetails implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ownerId;
	private String username;
	private String password;
	private String role;

}
