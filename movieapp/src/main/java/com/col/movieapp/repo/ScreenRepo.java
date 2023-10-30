package com.col.movieapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.col.movieapp.entity.ScreenDetails;
@Repository
public interface ScreenRepo extends JpaRepository<ScreenDetails, Integer>{

}
