package com.abd.zaher88.androidmoviedb;

import com.abd.zaher88.androidmoviedb.DataObject.Movie;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Zaher on 2016-07-19.
 */
public interface MovieDBInterface {
    @GET("movie/popular")
    Call<List<Movie>> getPopular(@Query("api_key") String apiKey,
                                 @Query("page") Integer page,
                                 @Query("language") String language);
}
