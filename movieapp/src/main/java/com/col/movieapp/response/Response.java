package com.col.movieapp.response;

import lombok.Data;

@Data
public class Response {
	private String errormsg;
	private boolean error;
	private Object obj;
	
	
	public Response(String errormsg, boolean error) {
		super();
		this.errormsg = errormsg;
		this.error = error;
		
	}


	public Response() {
		// TODO Auto-generated constructor stub
	}


	public Response(String error, boolean b, Object obj) {
		this.errormsg = error;
		this.error = b;
		this.obj=obj;
	}
	


}
