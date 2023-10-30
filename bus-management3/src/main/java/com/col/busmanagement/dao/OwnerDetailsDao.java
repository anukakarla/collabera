package com.col.busmanagement.dao;

import org.springframework.data.repository.CrudRepository;

import com.col.busmanagement.beans.OwnerDetails;

public interface OwnerDetailsDao extends CrudRepository<OwnerDetails, Integer>{
	
	public OwnerDetails findByOwnerId(int ownerId) ;
	public OwnerDetails findByUsername(String name) ;

	
	

}
