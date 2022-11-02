package com.techelevator.model;

import java.time.LocalDate;

public class Person {
    private int id;
    private String name;
    private LocalDate birthday;
    private LocalDate deathday;
    private String biography;
    private String homePage;
    private String profilePath;

    public Person(int id, String name, LocalDate birthday, LocalDate deathday, String biography, String homePage, String profilePath) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.deathday = deathday;
        this.biography = biography;
        this.homePage = homePage;
        this.profilePath = profilePath;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public LocalDate getDeathday() {
        return deathday;
    }

    public String getBiography() {
        return biography;
    }

    public String getHomePage() {
        return homePage;
    }

    public String getProfilePath() {
        return profilePath;
    }
}
