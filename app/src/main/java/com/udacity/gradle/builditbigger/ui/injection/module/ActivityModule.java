package com.udacity.gradle.builditbigger.ui.injection.module;

import com.example.Jokes;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * User: pa1pal
 * Date: 9/16/16
 */
@Module
public class ActivityModule {

    @Provides @Singleton
    Jokes provideJoke(){
        return new Jokes();
    }
}
