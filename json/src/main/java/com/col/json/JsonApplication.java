package com.col.json;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpHeaders;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.col.json.bean.Country;

@SpringBootApplication
public class JsonApplication {

	public static void main(String[] args) throws URISyntaxException {
//		SpringApplication.run(JsonApplication.class, args);
		RestTemplate restTemplate = new RestTemplate();
//		String respList = restTemplate.getForObject("http://restcountries.com/v3.1/all", String.class);
//		System.out.println(respList);

//		ResponseEntity<String> entity = restTemplate.getForEntity("http://restcountries.com/v3.1/all", String.class);
//		String body = entity.getBody();
//
//		org.springframework.http.HttpHeaders headers = entity.getHeaders();
//		System.out.println(body);
//		System.out.println(headers);
		
		
		RequestEntity request=new RequestEntity(HttpMethod.GET,new URI("http://restcountries.com/v3.1/all"));
		ResponseEntity<Country> responseEntity=restTemplate.exchange(request, Country.class);
		Country country=responseEntity.getBody();
//		System.out.println(country.getCapital());
	}

}
