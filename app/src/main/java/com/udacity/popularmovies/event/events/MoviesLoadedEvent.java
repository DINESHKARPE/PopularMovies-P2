package com.udacity.popularmovies.event.events;

import com.udacity.popularmovies.entity.Movie;
import com.udacity.popularmovies.entity.MovieResults;

import java.util.List;


public final class MoviesLoadedEvent {

    public final List<Movie> movies;
    public final MovieResults.SortCriteria sortCriteria;

    public MoviesLoadedEvent(List<Movie> movies, MovieResults.SortCriteria sortCriteria) {
        this.movies = movies;
        this.sortCriteria = sortCriteria;
    }

}
