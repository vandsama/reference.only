package com.techelevator.dao;

import com.techelevator.model.Person;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcPersonDao implements PersonDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcPersonDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Person> getActorsForMovie(int id) {
        final String sql = "SELECT person_id, person_name, birthday, deathday, biography, profile_path, home_page\n" +
                "FROM person p\n" +
                "\tINNER JOIN movie_actor ma ON p.person_id = ma.actor_id\n" +
                "WHERE ma.movie_id = ?;";

        SqlRowSet results = this.jdbcTemplate.queryForRowSet(sql, id);
        List<Person> actors = new ArrayList<>();
        while (results.next()) {
            Person actor = mapPersonFromResult(results);
            actors.add(actor);
        }

        return actors;
    }

    private Person mapPersonFromResult(SqlRowSet results) {

        return new Person(
                results.getInt("person_id"),
                results.getString("person_name"),
                DaoHelpers.safeGetLocalDateFromResult(results, "birthday"),
                DaoHelpers.safeGetLocalDateFromResult(results, "deathday"),
                results.getString("biography"),
                results.getString("profile_path"),
                results.getString("home_page")
        );

    }

}
