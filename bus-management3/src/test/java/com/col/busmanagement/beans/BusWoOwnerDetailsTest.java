//package com.col.busmanagement.beans;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.JsonMappingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//@SpringBootTest
//@ExtendWith(MockitoExtension.class)
//class BusWoOwnerDetailsTest {
//
//	private ObjectMapper mapper = new ObjectMapper();
//	String json = "{\"busId\":1,\"busName\":null,\"source\":null,\"destination\":null,\"busPrice\":67.87,\"distance\":98.76,\"username\":null}";
//
//	@Test
//	void busWoTestS() throws JsonMappingException, JsonProcessingException {
//
//		BusWoOwnerDetails details = new BusWoOwnerDetails(1, null, null, null, 67.87, 98.76, null);
//		BusWoOwnerDetails ownerDetails = mapper.readValue(json, BusWoOwnerDetails.class);
//		String write = mapper.writeValueAsString(ownerDetails);
//		assertEquals(json, write);
//	}
//
//}
