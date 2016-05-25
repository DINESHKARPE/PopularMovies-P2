package com.udacity.popularmovies.event.events;


public class LoadMovieEvent implements com.udacity.popularmovies.event.events.ApiEvent {

    public final int id;

    public LoadMovieEvent(int id) {
        this.id = id;
    }

}
