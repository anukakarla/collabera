package com.col.movieapp.service;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.col.movieapp.entity.MovieTime;
import com.col.movieapp.entity.ScreenDetails;
import com.col.movieapp.repo.MovieTimeRepo;
import com.col.movieapp.repo.ScreenRepo;
import com.col.movieapp.response.MovieListHome;
import com.col.movieapp.response.Response;
import com.col.movieapp.response.TodayMovies;


@Service
public class MovieService {
	@Autowired
	MovieTimeRepo movieRepo;
	
	@Autowired
	ScreenRepo screenRepo;
	

	public Response addNewMovie(MovieTime movie, Integer screenNo) {
		System.out.println("fine30");
		if(movieRepo.getMovie(movie.getDate(),movie.getTime(),screenNo)==0) {
			System.out.println("fine32");
			ScreenDetails screen=screenRepo.getById(screenNo);
			List<Time> mov=movieRepo.getMovie(movie.getDate(),screenNo);
			boolean time_perfect=true;
			for(Time time:mov) {
				// Calendar cal = Calendar.getInstance();
				//   String timee=sdf.format(time);
	             SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		        LocalTime tim=LocalTime.parse(sdf.format(time));
//		        LocalTime plus=tim.plusSeconds(10800);
//		        LocalTime minus=tim.minusSeconds(10800);
		       // System.out.println(plus +" "+minus);
		        Duration durationAfter = Duration.between(  movie.getTime(),tim );
		        Duration durationBefore = Duration.between( tim,  movie.getTime() );
		        
		        
		        int time_1=Math.round((float)(Math.abs(durationAfter.getSeconds())/3600f));
		        int time_2=Math.round((float)(Math.abs(durationBefore.getSeconds())/3600f));
		        
		        System.out.println(" after "+Math.round((float)(Math.abs(durationAfter.getSeconds())/3600f)));
		        System.out.println(" before "+Math.round((float)(Math.abs(durationBefore.getSeconds())/3600f)));
		        
		       if(3<=time_1 && 3<=time_2) {
		    	   System.out.println("perfect Time");
		    	   time_perfect=true;
		       }
		       else {
		    	   time_perfect=false;
		    	   System.out.println("not perfect");
		       }
		        
			}
			if(time_perfect) {
				movie.setAddedTime(LocalTime.now());
				movie.setScreen(screen);
				
				movieRepo.save(movie);
				return new Response("SUCCESS",false);
			}
			else {
				return new Response("CHENGE THE TIME FOE MOVIE",true);
			}
			
             
		}
		
		else {
			return new Response("ALREADY MOVIE ENTERED",true);
		}
		
}


	public Response getMovie(int id) {
		
		MovieTime movie=movieRepo.findById(id).get();
		if(movie==null) {
			return new Response("Movie NOt Found",true);
		}
		else {
			return new Response("Movie Found",false,movie);
		}
		
	
	}
	
public TodayMovies getMoviesForThisDate(LocalDate date) {
		
		List<MovieTime> res=movieRepo.getAllMovieForThisDate(date);
		ArrayList<MovieListHome> listOfMovies=new ArrayList<MovieListHome>();
		if(res.size()!=0) {
			
			
			for(MovieTime resObj:res) {
				MovieListHome obj=new MovieListHome();
				obj.setMovieId(resObj.getMovieId());
				obj.setMovieName(resObj.getMovieName());
				List<Time> times=movieRepo.getAllMovieTimes(resObj.getMovieName(),date);
				System.out.println(times);
				obj.setTimes(times);
				if(listOfMovies.size()!=0) {
					for(int i=0;listOfMovies.size()>i;i++) {
						if(listOfMovies.get(i).getMovieName().equals(resObj.getMovieName())) {
							
						}
						else {
							listOfMovies.add(obj);
						}
					}
				}
				else {
					listOfMovies.add(obj);
				}
				
				
	     	}
			
			
			
			return new TodayMovies("Movie  FOUND",false,listOfMovies);
		}
		else {
			return new TodayMovies("Movies Not FOUND",true,listOfMovies);
		}
		
		
	}


}
