package com.col.assignment.service;

import com.col.assignment.domain.Country;

public interface ParsingService {
	
	Country[] parse(String url);

}
