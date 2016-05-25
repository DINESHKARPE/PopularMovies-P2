package com.udacity.popularmovies.model;


import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.udacity.popularmovies.entity.Review;

import java.lang.reflect.Type;

import io.realm.RealmList;

final class ReviewRealmListDeserializer implements JsonDeserializer<RealmList<Review>> {

    private static final String TAG = ReviewRealmListDeserializer.class.getSimpleName();

    @Override
    public RealmList<Review> deserialize(JsonElement element, Type type, JsonDeserializationContext context)
            throws JsonParseException {
        RealmList<Review> reviews = new RealmList<>();
        JsonArray ja = element.getAsJsonObject().get("results").getAsJsonArray();
        for (JsonElement je : ja) {
            reviews.add((Review) context.deserialize(je, Review.class));
        }
        return reviews;
    }

}
