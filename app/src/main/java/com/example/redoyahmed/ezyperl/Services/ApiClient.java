package com.example.redoyahmed.ezyperl.Services;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String PRACTISE_BASE_URL = "https://api.jdoodle.com/v1/";
    public static final String CLIENT_ID = "e961d05b4710df1545223cb83822edca";
    public static final String CLIENT_SECRET = "290208e794df2b5f13163f0098bff459eac5c486f31b09ef237d4c7639100cb5";
    public static final String YOUTUBE_URL = "https://www.youtube.com/channel/UCEpe5DhhS0HYFBaCVsU2Iwg/";
    public static final String SHA1_KEY = "8A:DF:46:31:A2:8F:A9:38:D0:5D:5C:3E:E3:6E:BF:56:22:3F:D0:19";
    public static final String YOUTUBE_API_KEY = "AIzaSyBA64lBDSLyo485gA5e1UqmTtxT8T4G4F8";
    public static final String YOUTBE_PLAY_LIST_ID = "PL_RGaFnxSHWpqRBcStwV0NwMA3nXMh5GC";
    public static final String YOUTUBE_PLAY_LIST_BASE_URL = "https://www.googleapis.com/youtube/v3/";
    private static Retrofit retrofit = null;

    public static Retrofit getPractiseClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(PRACTISE_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static Retrofit getYoutubeClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(YOUTUBE_PLAY_LIST_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
