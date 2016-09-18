package com.udacity.gradle.builditbigger.api;

import android.content.Context;
import com.udacity.gradle.builditbigger.R;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Author: pa1pal
 * Date: 9/18/16
 */
public class Constants {

    static Api api;

    public static Api getRetrofitInstance(Context context){

        Retrofit retrofit= new Retrofit.Builder()
                .baseUrl(context.getString(R.string.base_url))
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        api=retrofit.create(Api.class);
        return api;

    }
}
