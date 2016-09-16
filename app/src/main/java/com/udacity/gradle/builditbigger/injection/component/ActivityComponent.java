package com.udacity.gradle.builditbigger.ui.injection.module.component;

import com.udacity.gradle.builditbigger.ui.activity.MainActivity;
import com.udacity.gradle.builditbigger.ui.injection.module.ActivityModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * author: pa1pal
 * Date: 9/16/16
 */
@Singleton
@Component(modules = {ActivityModule.class})
public interface ActivityComponent {
    void injectMain(MainActivity mainActivity);
}
