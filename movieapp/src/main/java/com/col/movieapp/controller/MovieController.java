package com.col.movieapp.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.col.movieapp.entity.MovieTime;
import com.col.movieapp.response.Response;
import com.col.movieapp.response.TodayMovies;
import com.col.movieapp.service.MovieService;

@RequestMapping
@RestController
public class MovieController {
	
	@Autowired
	private MovieService service;
	
	
	@PostMapping("/addMovie/{screenId}")
	public ResponseEntity<?> newMovie(@RequestBody MovieTime movie,@PathVariable Integer screenId){
		Response  response=service.addNewMovie(movie, screenId);
	    return ResponseEntity.ok(response);
		
	}
	
	
	@GetMapping("/getmovie/{id}")
	public ResponseEntity<?> getAllMovieById(@PathVariable int id){
		 Response response=service.getMovie(id);
		 
		    return ResponseEntity.ok(response);
	}
	
	@GetMapping("/getMovieforTdy/{date}")
	public ResponseEntity<?> getMoviesForToday(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate  date ){
		TodayMovies res=service.getMoviesForThisDate(date);
		
		return ResponseEntity.ok(res );
		
	}

}
