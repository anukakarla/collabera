package com.col.busmanagement.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OwnerRequest {
	
	private String username;
	private String password;

}
