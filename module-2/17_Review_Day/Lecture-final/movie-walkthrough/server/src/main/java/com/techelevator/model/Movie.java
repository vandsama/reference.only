package com.techelevator.model;

import java.time.LocalDate;

public class Movie {

    private int id;
    private String title;
    private String overview;
    private String tagline;
    private String posterPath;
    private String homePage;
    private LocalDate releaseDate;
    private int lengthInMinutes;
    private Person director;

    public Movie(int id, String title, String overview, String tagline, String posterPath,
                 String homePage, LocalDate releaseDate, int lengthInMinutes, Person director) {
        this.id = id;
        this.title = title;
        this.overview = overview;
        this.tagline = tagline;
        this.posterPath = posterPath;
        this.homePage = homePage;
        this.releaseDate = releaseDate;
        this.lengthInMinutes = lengthInMinutes;

        this.director = director;
    }

    public Person getDirector() {
        return director;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getTagline() {
        return tagline;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getHomePage() {
        return homePage;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }
}
