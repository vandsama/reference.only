package com.techelevator.dao;

import com.techelevator.model.Park;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcParkDao implements ParkDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcParkDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Park getPark(int parkId) {
        return new Park();
    }

    @Override
    public List<Park> getParksByState(String stateAbbreviation) {

        final String sql = "SELECT park_id, park_name, date_established, area, has_camping\n" +
                "FROM park\n" +
                "JOIN park_state ON park.park_id = park_state.park_id\n" +
                "WHERE state_abbreviation = ?;\n";

        final List<Park> parks = new ArrayList<>();

        final SqlRowSet results = jdbcTemplate.queryForRowSet(sql,stateAbbreviation);
        while (results.next()) {
            parks.add(mapRowToPark(results));
        }

        return parks;
    }

    private Park mapRowToPark(SqlRowSet rowSet) {
        final Park park = new Park();

        park.setParkId(rowSet.getInt("park_id"));
        park.setParkName(rowSet.getString("park_name"));

        return park;
    }


    @Override
    public Park createPark(Park park) {
        return new Park();
    }

    @Override
    public void updatePark(Park park) {

    }

    @Override
    public void deletePark(int parkId) {

    }

    @Override
    public void addParkToState(int parkId, String stateAbbreviation) {

    }

    @Override
    public void removeParkFromState(int parkId, String stateAbbreviation) {

    }
}
