package com.col.movieapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.col.movieapp.entity.TheatreEntity;
@Repository
public interface TheatreEntityRepo extends JpaRepository<TheatreEntity, Integer>{

}
