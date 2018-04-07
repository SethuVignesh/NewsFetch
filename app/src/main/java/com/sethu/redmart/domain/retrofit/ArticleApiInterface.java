package com.sethu.redmart.domain.retrofit;

import com.sethu.redmart.data.ProductsItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ArticleApiInterface {
    @GET("/v1.6.0/catalog/search?page=0&pageSize=20")
    Call<List<ProductsItem>> getUsersInfo();
}