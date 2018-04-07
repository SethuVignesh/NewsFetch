package com.sethu.redmart.domain;


import dagger.Component;
import retrofit2.Retrofit;

@Component(modules = {NetworkModule.class})
public interface MainApplicationComponent {
    Retrofit getRetrofitInstance();
}
