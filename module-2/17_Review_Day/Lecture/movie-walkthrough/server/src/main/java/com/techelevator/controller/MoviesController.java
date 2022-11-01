package com.techelevator.controller;


import com.techelevator.dao.MovieDao;
import com.techelevator.dao.PersonDao;
import com.techelevator.model.Movie;
import com.techelevator.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MoviesController {

    private MovieDao movieDao;
    private PersonDao personDao;

    public MoviesController(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @GetMapping
    public List<Movie> getMovieList() {
        return this.movieDao.getAllMovies();
    }

    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable int id) {
        return this.movieDao.getMovieById(id);
    }

    @GetMapping("/{id}/actors")
    public List<Person> getActorsByMovieId(@PathVariable int id) {
        return this.personDao.getActorsForMovie(id);
    }
}
