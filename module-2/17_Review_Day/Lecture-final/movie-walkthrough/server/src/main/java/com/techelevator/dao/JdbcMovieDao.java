package com.techelevator.dao;

import com.techelevator.model.Movie;
import com.techelevator.model.Person;
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
        final String sql = "SELECT movie_id, title, overview, tagline, poster_path, m.home_page, release_date, length_minutes, \n" +
                "director_id, person_name, birthday, deathday, biography, profile_path, d.home_page AS director_home_page\n" +
                "FROM movie m LEFT JOIN person d ON m.director_id = d.person_id\n";
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
        final String sql = "SELECT movie_id, title, overview, tagline, poster_path, m.home_page, release_date, length_minutes, \n" +
                "director_id, person_name, birthday, deathday, biography, profile_path, d.home_page AS director_home_page\n" +
                "FROM movie m LEFT JOIN person d ON m.director_id = d.person_id\n" +
                "WHERE movie_id = ?;";

        SqlRowSet results = this.jdbcTemplate.queryForRowSet(sql, id);
        Movie movie = null;
        if (results.next()) {
            movie = this.mapMovieFromResult(results);
        }
        return movie;
    }

    private Movie mapMovieFromResult(SqlRowSet results) {

        /**
         * 'director_id` is nullable in the Movie table. If we fetch a movie with a null
         * director_id, getInt() will return a zero (0) and wasNull() will return TRUE
         */
        Person director = null;
        int directorId = results.getInt("director_id");
        if (!results.wasNull())
            director = new Person(
                directorId,
                results.getString("person_name"),
                DaoHelpers.safeGetLocalDateFromResult(results, "birthday"),
                DaoHelpers.safeGetLocalDateFromResult(results, "deathday"),
                results.getString("biography"),
                results.getString("profile_path"),
                results.getString("home_page")
        );

        return new Movie(
                results.getInt("movie_id"),
                results.getString("title"),
                results.getString("overview"),
                results.getString("tagline"),
                results.getString("poster_path"),
                results.getString("home_page"),
                DaoHelpers.safeGetLocalDateFromResult(results, "release_date"),
                results.getInt("length_minutes"),
                director);
    }
}
