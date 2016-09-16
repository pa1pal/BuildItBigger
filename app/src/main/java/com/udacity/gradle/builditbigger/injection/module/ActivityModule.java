package com.udacity.gradle.builditbigger.ui.injection.module;

import com.example.Jokes;
import com.udacity.gradle.builditbigger.ui.activity.MainActivity;
import com.udacity.gradle.builditbigger.ui.activity.MyApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * User: pa1pal
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
