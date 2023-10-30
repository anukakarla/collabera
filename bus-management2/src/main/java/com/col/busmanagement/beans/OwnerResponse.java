package com.col.busmanagement.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OwnerResponse {
	private String message;
	private boolean error;
	private String token;
	private String role;

}
