package com.udacity.gradle.builditbigger.ui.activity;

import android.app.Application;

import com.udacity.gradle.builditbigger.injection.component.ActivityComponent;
import com.udacity.gradle.builditbigger.injection.component.DaggerActivityComponent;
import com.udacity.gradle.builditbigger.injection.module.ActivityModule;

/**
 * author: pa1pal
 * Date: 9/16/16
 */
public class MyApplication extends Application {
    ActivityComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(getApplicationContext()))
                .build();
    }

    public ActivityComponent getComponent(){
        return this.component;
    }
}
