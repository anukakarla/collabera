package com.col.assignment.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.col.assignment.bean.Country;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;

@RestController
public class MainController {

	@GetMapping("/country")
	public List<Country> getCountry() {
		String countryUrl = "https://restcountries.com/v3.1/all";
		RestTemplate filter = new RestTemplate();
		List<Country> named = (List<Country>) filter.getForObject(countryUrl, Object.class);

		return named;

	}

}
