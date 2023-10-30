package com.col.assignment.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.col.assignment.domain.Country;
import com.col.assignment.domain.Currencies;
import com.col.assignment.model.Response;
import com.col.assignment.service.JsonParsingService;
import com.col.assignment.service.ParsingService;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.google.gson.Gson;

@RestController
public class MainController {

//	@Autowired
//	private Gson gson;

	@Autowired
	private JsonParsingService parsingService;

	@Autowired
	private RestTemplate restTemplate;

	private String url = "https://restcountries.com/v3/all";

	@GetMapping("/getData")
	public ResponseEntity<Country[]> getData() {

		return ResponseEntity.status(HttpStatus.OK).body(parsingService.parse(url));

	}

	@GetMapping("/filter")
	public MappingJacksonValue filterData() {
		Country[] countries = parsingService.parse(url);
		SimpleBeanPropertyFilter beanPropertyFilter = SimpleBeanPropertyFilter.filterOutAllExcept("name", "currencies",
				"capital");
		FilterProvider filterProvider = new SimpleFilterProvider().addFilter("getCountry", beanPropertyFilter);
		MappingJacksonValue jacksonValue = new MappingJacksonValue(countries);
		jacksonValue.setFilters(filterProvider);
		return jacksonValue;
	}

//	@GetMapping("/filter1")
//	public ResponseEntity<List<Response>> filtering() {
//
//		Country[] countries=parsingService.parse(url);
//		List<Response> list=new ArrayList<Response>();
//		for ( Country response : countries) {
//			Response res = new Response(response.getCurrencies(),response.getCapital(),response.getName());
//			list.add(res);
//		}
//		return ResponseEntity.ok().body(list);
//
//	}

//	@GetMapping("/filter1")
//	public ResponseEntity<List<Response>> filtering() {
//
//		Country[] countries=parsingService.parse(url);
//
//		for ( Country[] response : countries) {
//			
//			
//
//		}
//		return ResponseEntity.ok().body();
//
//	}

}
