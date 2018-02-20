package com.example.redoyahmed.ezyperl.Services;

import com.example.redoyahmed.ezyperl.Model.Data;
import com.example.redoyahmed.ezyperl.Model.OutputResponse;
import com.example.redoyahmed.ezyperl.Model.PlaylistResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;


public interface ApiInterface {

    @POST("execute")
    @Headers({"Content-Type: application/json"})
    Call<OutputResponse> requestOutput(@Body Data data);

    @GET("playlistItems?part=snippet&maxResults=50&playlistId=PL_RGaFnxSHWpqRBcStwV0NwMA3nXMh5GC&key=AIzaSyBA64lBDSLyo485gA5e1UqmTtxT8T4G4F8")
    Call<PlaylistResponse> getPlaylist();
}
