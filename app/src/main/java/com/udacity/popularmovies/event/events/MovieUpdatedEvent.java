package com.udacity.popularmovies.event.events;

import android.support.annotation.NonNull;

import com.udacity.popularmovies.entity.Movie;


public final class MovieUpdatedEvent {

    public final Movie movie;

    public MovieUpdatedEvent(@NonNull Movie movie) {
        this.movie = movie;
    }

}
