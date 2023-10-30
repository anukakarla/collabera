package com.col.movieapp.repo;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.col.movieapp.entity.MovieTime;

@Repository
public interface MovieTimeRepo extends JpaRepository<MovieTime, Integer>{

	//NOT USED
	@Query(value="select case when exists(select * from movies WHERE date=:date AND time=:time AND screen_screen_id =:screenNo) then 'true' else 'false' end from movies  ",nativeQuery=true)
	 boolean isCorrectTime(LocalDate date, LocalTime time, Integer screenNo);
	

	
	
	@Query(value="SELECT count(*) FROM movies   WHERE date=:date  AND  time=:time AND screen_screen_id =:screenNo ",nativeQuery=true)
	Integer getMovie(LocalDate date,LocalTime time, Integer screenNo);
	
	
	//WORKING FINE
	@Query(value="SELECT time FROM movies   WHERE date=:date  AND screen_screen_id =:screenNo ",nativeQuery=true)
	List<Time> getMovie(LocalDate date, Integer screenNo);
	
	
	//WORKING FINE
	@Query(value="select COUNT(*) from movies WHERE screen_screen_id= :screenNo",nativeQuery=true)
	public Integer isCorrectTime( Integer screenNo);


	@Query(value="SELECT * FROM movies   WHERE date=:date ",nativeQuery=true)
	List<MovieTime> getAllMovieForThisDate(LocalDate date);



	@Query(value="SELECT time FROM movies   WHERE date=:date AND movie_name=:movieName",nativeQuery=true)
	List<Time> getAllMovieTimes(String movieName, LocalDate date);




//	Optional<MovieTime> findById(String id);
	


}
