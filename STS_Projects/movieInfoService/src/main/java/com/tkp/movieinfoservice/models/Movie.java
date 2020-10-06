package com.tkp.movieinfoservice.models;

public class Movie {
	private String movieId;
	private String name;

	public Movie(String movieId, String name) {
		super();
		movieId = movieId;
		this.name = name;
	}

	public String getmovieId() {
		return movieId;
	}

	public void setmovieId(String movieId) {
		movieId = movieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
