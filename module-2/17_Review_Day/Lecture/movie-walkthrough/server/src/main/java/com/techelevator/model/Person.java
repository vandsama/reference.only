package com.techelevator.model;

import java.security.cert.LDAPCertStoreParameters;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setDeathday(LocalDate deathday) {
        this.deathday = deathday;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public void setProfilePath(String profilePath) {
        this.profilePath = profilePath;
    }
}
