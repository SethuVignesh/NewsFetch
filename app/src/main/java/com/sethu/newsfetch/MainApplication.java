package com.sethu.newsfetch;

import android.app.Application;

import com.sethu.newsfetch.domain.DaggerMainApplicationComponent;
import com.sethu.newsfetch.domain.MainApplicationComponent;
import com.sethu.newsfetch.domain.NetworkModule;


public class MainApplication extends Application {

    static MainApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerMainApplicationComponent.builder()
                .networkModule(new NetworkModule())
                .build();
    }

    public static MainApplicationComponent getMainApplicationComponent() {
        return component;
    }

}
