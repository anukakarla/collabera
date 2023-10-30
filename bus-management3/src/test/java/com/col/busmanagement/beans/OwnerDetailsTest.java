package com.col.busmanagement.beans;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@SpringBootTest
@ExtendWith(MockitoExtension.class)
class OwnerDetailsTest {
	
private	ObjectMapper mapper=new ObjectMapper();
String json="{\"ownerId\":1,\"username\":null,\"password\":null,\"role\":null}";

	@Test
	void ownerTest() throws JsonMappingException, JsonProcessingException {
		OwnerDetails details=new OwnerDetails(1, null, null,null);
		OwnerDetails details2=mapper.readValue(json, OwnerDetails.class);
		String write=mapper.writeValueAsString(details2);
		assertEquals(json, write);
	}

}
