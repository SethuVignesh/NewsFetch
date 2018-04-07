package com.sethu.redmart;

import android.app.Application;

import com.sethu.redmart.domain.DaggerMainApplicationComponent;
import com.sethu.redmart.domain.MainApplicationComponent;
import com.sethu.redmart.domain.NetworkModule;


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
