package com.udacity.gradle.builditbigger.ui.injection.module;

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

    //private final MainActivity mainActivity;
    private final MyApplication application;

    public ActivityModule(MyApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Jokes provideJoke(){
        return new Jokes();
    }

//    @Provides @Singleton
//    MainActivity provideActivity(){
//        return new MainActivity(new Jokes());
//    }
}
