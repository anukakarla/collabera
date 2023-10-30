package com.col.busmanagement.service;

import java.util.List;

import com.col.busmanagement.beans.Bus;
import com.col.busmanagement.beans.BusWoOwnerDetails;
import com.col.busmanagement.beans.OwnerDetails;

public interface OwnerDetailsService {
	
	public OwnerDetails saveSign(OwnerDetails ownerDetails) ;
	public Bus addBus(Bus bus);
	public List<Bus> getAll() ;

	public List<BusWoOwnerDetails> getAllWo(int ownerId) ;
	public boolean deleteBus(int busId) ;
	
	public Bus updateBus(Bus bus) ;
	
	public OwnerDetails getRole1(String role) ;
	
//	public List<BusWoOwnerDetails> place(BusWoOwnerDetails details) ;
}
