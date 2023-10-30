package com.col.busmanagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import com.col.busmanagement.beans.Bus;
import com.col.busmanagement.beans.BusWoOwnerDetails;
@EnableJpaRepositories
public interface BusDao extends CrudRepository<Bus, Integer> {

	public Bus findByBusId(int busId);

	@Query("from Bus where details.ownerId=?1")
	public List<Bus> findallByOwnerId(int ownerId);

//	@Query("from Bus where source=:source and destination=:destination")
//	public List<Bus> findByPlace(String source, String destintion);

}
