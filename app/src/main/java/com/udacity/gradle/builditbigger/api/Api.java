package com.udacity.gradle.builditbigger.api;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * User: pa1pal
 * Date: 9/17/16
 */
public interface Api {
    @POST("sayHi/abcd")
    Call<Pojo> getRandomJoke();
}
