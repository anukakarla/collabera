package com.col.movieapp.response;

import java.sql.Time;
import java.util.List;

import lombok.Data;
@Data
public class MovieListHome {
	private int movieId;
	private String movieName;
	private List<Time> times;
	public MovieListHome(int movieId, String movieName, List<Time> times) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.times = times;
	}
	public MovieListHome() {
		// TODO Auto-generated constructor stub
	}

}
