package com.company;

public class Movie {
    private String title;
    private MovieCategory movieCategory;

    public Movie(String title, MovieCategory movieCategory) {
        this.title = title;
        this.movieCategory = movieCategory;
    }

    public String getTitle() {
        return title;
    }

    public MovieCategory getMovieCategory() {
        return movieCategory;
    }
}
