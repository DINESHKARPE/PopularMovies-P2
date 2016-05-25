package com.udacity.popularmovies.event.events;

import com.udacity.popularmovies.entity.MovieResults;

public final class LoadMoviesEvent implements ApiEvent {

    public final MovieResults.SortCriteria sortCriteria;

    public LoadMoviesEvent(MovieResults.SortCriteria sortCriteria) {
        this.sortCriteria = sortCriteria;
    }

}
