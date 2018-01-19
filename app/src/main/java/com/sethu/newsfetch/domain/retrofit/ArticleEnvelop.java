package com.sethu.newsfetch.domain.retrofit;

import com.google.gson.annotations.SerializedName;
import com.sethu.newsfetch.data.Articles;

import java.util.List;

public class ArticleEnvelop<T> {
    @SerializedName("status")
    String status;
    @SerializedName("totalResults")
    int totalResults;
    @SerializedName("articles")
    List<Articles> articles;
}