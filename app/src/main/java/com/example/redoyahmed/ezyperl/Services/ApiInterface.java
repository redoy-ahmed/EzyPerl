package com.example.redoyahmed.ezyperl.Services;

import com.example.redoyahmed.ezyperl.Model.Data;
import com.example.redoyahmed.ezyperl.Model.OutputResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;


public interface ApiInterface {

    @POST("execute")
    @Headers({"Content-Type: application/json"})
    Call<OutputResponse> requestOutput(@Body Data data);
}
