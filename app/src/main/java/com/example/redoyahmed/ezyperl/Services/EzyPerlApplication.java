package com.example.redoyahmed.ezyperl.Services;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EzyPerlApplication {
    private static GsonBuilder builder;
    private static Gson gson;
    private static CustomSharedPreference shared;

    public static CustomSharedPreference getShared(Context context) {
        if (shared == null) {
            shared = new CustomSharedPreference(context);
        }
        return shared;
    }

    public static Gson getGsonObject() {
        if (gson == null) {
            builder = new GsonBuilder();
            gson = builder.create();
        }
        return gson;
    }
}
