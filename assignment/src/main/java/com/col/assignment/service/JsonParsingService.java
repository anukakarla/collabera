package com.col.assignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.col.assignment.domain.Country;

@Service
public class JsonParsingService implements ParsingService {
	@Autowired
	private RestTemplate restTemplate;

	private HttpEntity<String> getHeaderEntity() {

		HttpHeaders headers = new HttpHeaders();
		
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		
		return entity;
	}

	@Override
	public Country[] parse(String url) {

//		return restTemplate.getForObject(url, Country.class);
		try {
			ResponseEntity<Country[]> result = restTemplate.exchange(url,
			        HttpMethod.GET, getHeaderEntity(), Country[].class);
			
			return result.getBody();
		} catch (RestClientException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	

}
