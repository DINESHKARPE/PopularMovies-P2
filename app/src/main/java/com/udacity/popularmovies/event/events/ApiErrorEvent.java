package com.udacity.popularmovies.event.events;


public final class ApiErrorEvent implements ApiEvent {

    public final ApiEvent sourceEvent;
    public final Throwable throwable;

    public ApiErrorEvent(ApiEvent sourceEvent, Throwable throwable) {
        this.sourceEvent = sourceEvent;
        this.throwable = throwable;
    }

}
