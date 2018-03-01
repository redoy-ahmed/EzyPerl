package com.example.redoyahmed.ezyperl.Services;

import android.app.Application;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EzyPerlApplication extends Application {
    private GsonBuilder builder;
    private Gson gson;
    private CustomSharedPreference shared;

    public void onCreate() {
        super.onCreate();
        this.builder = new GsonBuilder();
        this.gson = this.builder.create();
        this.shared = new CustomSharedPreference(getApplicationContext());
    }

    public CustomSharedPreference getShared() {
        return this.shared;
    }

    public Gson getGsonObject() {
        return this.gson;
    }

    public boolean isUserLogin() {
        Gson mGson = getGsonObject();
        if (TextUtils.isEmpty(getShared().getUserData())) {
            return false;
        }
        return true;
    }
}
