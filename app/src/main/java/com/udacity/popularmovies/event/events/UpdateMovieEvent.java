package com.udacity.popularmovies.event.events;


import com.udacity.popularmovies.entity.Movie;

public class UpdateMovieEvent {

    public final Movie movie;

    public UpdateMovieEvent(Movie movie) {
        this.movie = movie;
    }

}
