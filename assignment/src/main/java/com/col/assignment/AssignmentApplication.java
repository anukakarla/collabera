package com.col.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssignmentApplication {

	public static void main(String[] args) {
        System.setProperty("javax.net.ssl.trustStore", "jssecacerts");
		SpringApplication.run(AssignmentApplication.class, args);
	}

}
