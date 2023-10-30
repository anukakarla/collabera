package com.col.movieapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.col.movieapp.entity.Bookings;
@Repository
public interface BookingRepo extends JpaRepository<Bookings, String>{

}
