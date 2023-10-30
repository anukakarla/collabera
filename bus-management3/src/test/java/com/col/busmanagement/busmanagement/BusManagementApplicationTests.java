//package com.col.busmanagement.busmanagement;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//import com.col.busmanagement.beans.Bus;
//import com.col.busmanagement.beans.OwnerDetails;
//import com.col.busmanagement.dao.BusDao;
//import com.col.busmanagement.dao.OwnerDetailsDao;
//import com.col.busmanagement.service.OwnerDetailsService;
//
//@SpringBootTest
//class BusManagementApplicationTests {
//	@Autowired
//	private OwnerDetailsService detailsService;
//	@Autowired
//	private OwnerDetailsDao dao;
//	@Autowired
//	private BusDao busDao;
//
//	@Test
//	public void ownerAdmin() {
//		OwnerDetails details = new OwnerDetails();
//		details.setPassword("1111");
//		details.setUsername("Anu");
////		OwnerDetails details2=dao.save(details);
//		OwnerDetails details2 = detailsService.save(details);
//
//	}
//	@Test
//	public void addDetails() {
//		Bus  bus=new Bus();
//		bus.setBusName("red");
//		bus.setDestination("rjy");
//		Bus bus2=detailsService.addBus(bus);
////		assertEquals("Data Added Successfuly", ResponseEntity<>);
//		bus2.equals(bus);
//		
//	}
//	@Test
//	public void list() {
//		List<Bus> bus=(List<Bus>) detailsService.getAll();
//		assertThat(bus).size().isGreaterThan(0);
//
//		
//		
//		
//		
//	}
//	
//}
