package com.col.busmanagement.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.col.busmanagement.beans.Bus;
import com.col.busmanagement.beans.BusResponse;
import com.col.busmanagement.beans.BusWoOwnerDetails;
import com.col.busmanagement.beans.OwnerDetails;
import com.col.busmanagement.dao.BusDao;
import com.col.busmanagement.service.OwnerDetailsService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.bytebuddy.agent.VirtualMachine.ForHotSpot.Connection.Response;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class OwnerDetailsControllerTest {
	@MockBean
	private OwnerDetailsService ownerDetailsService;

	private MockMvc mockMvc;
	@Autowired
	private WebApplicationContext applicationContext;
	@MockBean
	private BusDao busDao;

	private ObjectMapper mapper = new ObjectMapper();

	
	@BeforeEach
	void setUp() throws Exception {
		mockMvc = MockMvcBuilders.webAppContextSetup(applicationContext).build();

	}

	@Test
	void testOwnerAdmin() throws JsonProcessingException, UnsupportedEncodingException, Exception {

//		MockHttpServletRequest request=new MockHttpServletRequest();
		OwnerDetails details = new OwnerDetails();
//		details.setOwnerId(0);
		details.setUsername("anu");
		details.setPassword("qwertty");

		String content = mockMvc
				.perform(post("/admin").contentType(MediaType.APPLICATION_JSON_VALUE)
						.content(mapper.writeValueAsString(details)).accept(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk()).andReturn().getResponse().getContentAsString();

//		ResponseEntity<String> responseEntity=mapper.readValue(content, ResponseEntity.class);
		assertEquals("OwnerDetails Added successfully", content);

	}

	@Test
	void testAddDetails() throws JsonProcessingException, UnsupportedEncodingException, Exception {

		Bus bus = new Bus();
		bus.setBusName("asd");
		bus.setDestination("blr");
		bus.setSource("tpty");
		String content = mockMvc
				.perform(post("/addbus").contentType(MediaType.APPLICATION_JSON_VALUE)
						.content(mapper.writeValueAsString(bus)).accept(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
		assertEquals("Data Added Successfully", content);
	}

	@Test
	void testDeleteAllDetails() throws JsonProcessingException, UnsupportedEncodingException, Exception {
		Bus bus = new Bus();
		bus.setBusId(1);
		String content = mockMvc
				.perform(post("/bus/1").contentType(MediaType.APPLICATION_JSON_VALUE)
						.content(mapper.writeValueAsString(bus)).accept(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
		assertEquals("Deleted Data Successfully", content);
	}

//	@Test
//	void testGetAllDetails() throws JsonProcessingException, UnsupportedEncodingException, Exception {
////		List<BusWoOwnerDetails> details = ownerDetailsService.getAllWo(1);
//		List<BusWoOwnerDetails> details=new ArrayList<BusWoOwnerDetails>((Collection<? extends BusWoOwnerDetails>) Arrays.asList(details2));
//		Mockito.when(ownerDetailsService.getAllWo(1)).thenReturn(details2);
//		
//		String content = mockMvc
//				.perform(get("/bus/1").contentType(MediaType.APPLICATION_JSON_VALUE)
//						.content(mapper.writeValueAsString(details)).accept(MediaType.APPLICATION_JSON_VALUE))
//				.andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
//		assertThat(content);
//
//	}

	@Test
	void testGetAll() throws JsonProcessingException, UnsupportedEncodingException, Exception {
		List<Bus> bus = ownerDetailsService.getAll();
		when(ownerDetailsService.getAll()).thenReturn(bus);
		String content = mockMvc
				.perform(get("/getAll").contentType(MediaType.APPLICATION_JSON_VALUE)
						.content(mapper.writeValueAsString(bus)).accept(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
		BusResponse busResponse = mapper.readValue(content, BusResponse.class);
		assertEquals("got details", busResponse.getMessage());

	}

//	@Test
//	void testGetAllDetails() throws JsonProcessingException, UnsupportedEncodingException, Exception {
//		Mockito.when(ownerDetailsService.getAllWo(1));
////		.thenReturn(details3, null);
//
//
//		String content = mockMvc
//				.perform(get("/bus/1").contentType(MediaType.APPLICATION_JSON_VALUE)
//						.content(mapper.writeValueAsString(details3)).accept(MediaType.APPLICATION_JSON_VALUE))
//				.andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
//		assertThat(content);
//
//
//	}

}
