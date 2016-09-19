package com.udacity.gradle.builditbigger;

import com.udacity.gradle.builditbigger.api.Api;
import com.udacity.gradle.builditbigger.api.Constants;
import com.udacity.gradle.builditbigger.api.Pojo;

import org.junit.Assert;
import org.junit.Test;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class JokesTest {

    @Test
    public void jokeValidator(){
        Api apiCall = Constants.getRetrofitInstance();
        Call<Pojo> call = apiCall.getRandomJoke();
        call.enqueue(new Callback<Pojo>() {
            @Override
            public void onResponse(Call<Pojo> call, Response<Pojo> response) {
                if (response.isSuccessful()){
                    Pojo jokesResponse = response.body();
                    junit.framework.Assert.assertFalse(jokesResponse.getData().length() == 0);
                } else {
                    Assert.fail();
                }
            }

            @Override
            public void onFailure(Call<Pojo> call, Throwable t) {

            }
        });
    }
}