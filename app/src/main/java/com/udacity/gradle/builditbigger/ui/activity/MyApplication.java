package com.udacity.gradle.builditbigger.ui.activity;

import android.app.Application;

import com.udacity.gradle.builditbigger.ui.injection.module.ActivityModule;
import com.udacity.gradle.builditbigger.ui.injection.module.component.ActivityComponent;
import com.udacity.gradle.builditbigger.ui.injection.module.component.DaggerActivityComponent;

/**
 * User: pa1pal
 * Date: 9/16/16
 */
public class MyApplication extends Application {
    ActivityComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .build();
    }

    public ActivityComponent getComponent(){
        return component;
    }
}
