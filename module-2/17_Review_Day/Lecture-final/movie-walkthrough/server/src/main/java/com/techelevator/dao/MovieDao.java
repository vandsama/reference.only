package com.techelevator.dao;

import com.techelevator.model.Movie;

import java.util.List;

public interface MovieDao {
    List<Movie> getAllMovies();

    Movie getMovieById(int id);
}
