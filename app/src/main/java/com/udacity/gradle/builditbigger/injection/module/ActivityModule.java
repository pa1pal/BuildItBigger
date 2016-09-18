package com.udacity.gradle.builditbigger.injection.module;

import android.content.Context;

import pa1pal.udacity.jokesprovider.Jokes;
import com.udacity.gradle.builditbigger.ui.activity.MyApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * author: pa1pal
 * Date: 9/16/16
 */
@Module
public class ActivityModule {

    private final Context context;

    public ActivityModule(Context context){
        this.context = context;
    }

    @Provides
    @Singleton
    public Context provideContext(){
        return this.context;
    }

    @Provides
    @Singleton
    Jokes provideJoke(){
        return new Jokes();
    }
}
