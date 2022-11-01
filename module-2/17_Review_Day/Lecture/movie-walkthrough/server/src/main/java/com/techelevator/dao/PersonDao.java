package com.techelevator.dao;

import com.techelevator.model.Person;

import java.util.List;

public interface PersonDao {
    List<Person> getActorsForMovie(int id);
}
