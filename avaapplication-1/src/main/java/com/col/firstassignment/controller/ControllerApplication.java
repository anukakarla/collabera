package com.col.firstassignment.controller;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.col.firstassignment.model.Country;
import com.col.firstassignment.model.Response;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;


@RestController
public class ControllerApplication {
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private Gson gson;
	
	private String url="https://restcountries.com/v3.1/all";
	
	
	
	@GetMapping("/getC")
	public ResponseEntity<List<Response>> getDetails()  {
		
//		String url="http://restcountries.com/v3.1/all";
		
			ResponseEntity<String> response=restTemplate.exchange(url, HttpMethod.GET, HttpEntity.EMPTY, String.class);
			
			Type type = new TypeToken<Country>() {}.getType();
			
			ArrayList<Country> details=gson.fromJson(response.getBody(), type);
			
			List<Response> filterRes=new ArrayList<Response>();
			
			for ( Country resp : details) {
				Response res=new Response(resp.getCapital(), resp.getCurrencies());
				filterRes.add(res);
				System.out.println(filterRes);
				
				
				
			}
			return ResponseEntity.ok().body(filterRes);
		


		
		
		
	}

}
