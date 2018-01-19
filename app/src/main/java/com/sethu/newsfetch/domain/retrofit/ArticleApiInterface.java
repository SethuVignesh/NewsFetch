package com.sethu.newsfetch.domain.retrofit;

import com.sethu.newsfetch.data.Articles;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ArticleApiInterface {
    @GET("/bins/d7qol")
    Call<List<Articles>> getUsersInfo();
}