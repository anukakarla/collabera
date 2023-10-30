package com.col.assignment.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.ModelMap;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfig {
	
	@Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
	
	
	
	
//	@Bean
//	public RestTemplate restTemplate() {
//		return new RestTemplate();
//	}

}
