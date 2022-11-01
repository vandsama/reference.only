package com.techelevator.dao;

import com.techelevator.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcMovieDao implements MovieDao {
    private final JdbcTemplate jdbcTemplate;

    public JdbcMovieDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Movie> getAllMovies() {
        final String sql = "SELECT movie_id, title, overview, tagline, poster_path, home_page, release_date, length_minutes, director_id\n" +
                "\tFROM movie;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

        List<Movie> movielist = new ArrayList<>();
        while (results.next()) {
            Movie m = mapMovieFromResult(results);
            movielist.add(m);
        }
        return movielist;
    }

    @Override
    public Movie getMovieById(int id) {
        final String sql = "SELECT movie_id, title, overview, tagline, poster_path, home_page, release_date, length_minutes\n" +
                "\tFROM movie WHERE movie_id = ?;";

        SqlRowSet results = this.jdbcTemplate.queryForRowSet(sql, id);
        Movie movie = null;
        if (results.next()) {
            movie = this.mapMovieFromResult(results);
        }
        return movie;
    }

    private Movie mapMovieFromResult(SqlRowSet results) {
        // handle the case where release date is null
        LocalDate releaseDate = null;
        if (results.getDate("release_date") != null) {
            releaseDate = results.getDate("release_date").toLocalDate();
        }

        Movie m = new Movie(
                results.getInt("movie_id"),
                results.getString("title"),
                results.getString("overview"),
                results.getString("tagline"),
                results.getString("poster_path"),
                results.getString("home_page"),
                releaseDate,
                results.getInt("length_minutes"),
                null); // director
        return m;
    }
}
