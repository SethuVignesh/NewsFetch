package com.sethu.redmart.domain.retrofit;

import com.google.gson.annotations.SerializedName;
import com.sethu.redmart.data.ProductsItem;

import java.util.List;

public class ArticleEnvelop<T> {

    @SerializedName("products")
    List<ProductsItem> products;

}