package com.abd.zaher88.androidmoviedb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.abd.zaher88.androidmoviedb.DataObject.Movie;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.activity_main);
            RestClient.getApiService().getPopular(getString(R.string.movie_api_key),1,"en").enqueue(new Callback<List<Movie>>() {
                @Override
                public void onResponse(Call<List<Movie>> call, Response<List<Movie>> response) {
                    if (response.isSuccessful())
                    {
                        Log.d("moveList", String.valueOf(response.body().size()));
                    }
                }

                @Override
                public void onFailure(Call<List<Movie>> call, Throwable t) {

                }
            });

        } catch (Exception e) {
            Log.d("main", e.getMessage());
        }
    }
}
