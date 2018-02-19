package com.example.redoyahmed.ezyperl.Services;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String BASE_URL = "https://api.jdoodle.com/v1/";
    public static final String CLIENT_ID = "e961d05b4710df1545223cb83822edca";
    public static final String CLIENT_SECRET = "290208e794df2b5f13163f0098bff459eac5c486f31b09ef237d4c7639100cb5";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
