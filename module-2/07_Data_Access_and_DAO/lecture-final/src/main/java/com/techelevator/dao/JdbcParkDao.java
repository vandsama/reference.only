package com.techelevator.dao;

import com.techelevator.model.Park;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class JdbcParkDao implements ParkDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcParkDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Park getPark(int parkId) {
        final String sql = "SELECT park_id, park_name, date_established, area, has_camping\n" +
                "\tFROM park\n" +
                "\tWHERE park_id = ?;\n";

        SqlRowSet result = this.jdbcTemplate.queryForRowSet(sql, parkId);
        Park park = null;
        if (result.next()) {
            park = mapRowToPark(result);
        }

        return park;
    }

    @Override
    public List<Park> getParksByState(String stateAbbreviation) {

        final String sql = "SELECT park.park_id, park_name, date_established, area, has_camping\n" +
                "FROM park\n" +
                "JOIN park_state ON park.park_id = park_state.park_id\n" +
                "WHERE state_abbreviation = ?;\n";

        final List<Park> parks = new ArrayList<>();

        final SqlRowSet results = jdbcTemplate.queryForRowSet(sql, stateAbbreviation);
        while (results.next()) {
            parks.add(mapRowToPark(results));
        }

        return parks;
    }

    private Park mapRowToPark(SqlRowSet rowSet) {
        final Park park = new Park();

        park.setParkId(rowSet.getInt("park_id"));
        park.setParkName(rowSet.getString("park_name"));

        Date date_established = rowSet.getDate("date_established");
        if (date_established != null) {
            park.setDateEstablished(date_established.toLocalDate());
        }

        park.setArea(rowSet.getDouble("area"));
        park.setHasCamping(rowSet.getBoolean("has_camping"));

        return park;
    }

    @Override
    public Park createPark(Park park) {
        final String sql = "INSERT INTO park (park_name, date_established, area, has_camping)\n" +
                "VALUES (?, ?, ?, ?) RETURNING park_id;\n";

        Integer newId = this.jdbcTemplate.queryForObject(sql, Integer.class,
                park.getParkName(),
                park.getDateEstablished(),
                park.getArea(),
                park.getHasCamping());

        return this.getPark(newId);
    }

    @Override
    public void updatePark(Park park) {
        final String sql = "UPDATE park\n" +
                "SET park_name=?, date_established=?, area=?, has_camping=?\n" +
                "WHERE park_id=?;\n";

        this.jdbcTemplate.update(sql,
                park.getParkName(),
                park.getDateEstablished(),
                park.getArea(),
                park.getHasCamping(),
                park.getParkId());
    }

    @Override
    public void deletePark(int parkId) {

    }

    @Override
    public void addParkToState(int parkId, String stateAbbreviation) {
        final String sql = "INSERT INTO park_state(park_id, state_abbreviation)\n" +
                "VALUES (?, ?);\n";

        this.jdbcTemplate.update(sql, parkId, stateAbbreviation);
    }

    @Override
    public void removeParkFromState(int parkId, String stateAbbreviation) {

    }
}
