package com.udacity.popularmovies.model;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

import io.realm.RealmList;

final class VideoRealmListDeserializer implements JsonDeserializer<RealmList<com.udacity.popularmovies.entity.Video>> {

    private static final String TAG = VideoRealmListDeserializer.class.getSimpleName();

    @Override
    public RealmList<com.udacity.popularmovies.entity.Video> deserialize(JsonElement element, Type type, JsonDeserializationContext context)
            throws JsonParseException {
        RealmList<com.udacity.popularmovies.entity.Video> videos = new RealmList<>();
        JsonArray ja = element.getAsJsonObject().get("results").getAsJsonArray();
        for (JsonElement je : ja) {
            videos.add((com.udacity.popularmovies.entity.Video) context.deserialize(je, com.udacity.popularmovies.entity.Video.class));
        }
        return videos;
    }

}
