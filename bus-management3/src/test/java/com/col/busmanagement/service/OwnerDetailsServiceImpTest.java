//package com.col.busmanagement.service;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.col.busmanagement.beans.Bus;
//import com.col.busmanagement.beans.BusWoOwnerDetails;
//import com.col.busmanagement.beans.OwnerDetails;
//import com.col.busmanagement.dao.BusDao;
//import com.col.busmanagement.dao.OwnerDetailsDao;
//
//@ExtendWith(MockitoExtension.class)
//class OwnerDetailsServiceImpTest {
//	@Mock
//	private BusDao busDao;
//	@Mock
//	private OwnerDetailsDao detailsDao;
//	@InjectMocks
//	private OwnerDetailsServiceImp imp;
//
//	@Test
//	void testSave() {
//		OwnerDetails details = new OwnerDetails();
//		details.setOwnerId(0);
//		details.setUsername("anu");
//		details.setPassword("1111");
//		when(detailsDao.save(details)).thenReturn(details);
//		OwnerDetails details2 = imp.save(details);
//		assertEquals("anu", details2.getUsername());
//
//	}
//
//	@Test
//	void testAddBus() {
//		Bus bus = new Bus();
//		bus.setBusName("Red");
//		bus.setDestination("rjy");
//		bus.setSource("blr");
//		when(busDao.save(bus)).thenReturn(bus);
//		Bus bus2 = imp.addBus(bus);
//		assertEquals("Red", bus2.getBusName());
//	}
//
//	@Test
//	void testGetAll() {
//		List<Bus> bus = imp.getAll();
//		assertTrue(bus.isEmpty());
//
//	}
//
//	@Test
//	void testDeleteBus() {
//		
//		Bus bus=new Bus();
//		boolean b=imp.deleteBus(1);
//		assertTrue(b);
//	}
//	
//
//	@Test
//	void testGetAllWo() {
//		List<BusWoOwnerDetails> b=imp.getAllWo(1);
//		assertTrue(b.isEmpty());
//		
//	}
//
//}
