package com.sethu.redmart.domain.retrofit;

import com.google.gson.reflect.TypeToken;
import com.sethu.redmart.data.ProductsItem;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.Nullable;

import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

public class ArticleEnvelopConverter extends Converter.Factory {
    @Nullable
    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        Type envelopeType = TypeToken.getParameterized(ArticleEnvelop.class,type).getType();

        final Converter<ResponseBody,ArticleEnvelop<?>> delegate =
                retrofit.nextResponseBodyConverter(this,envelopeType,annotations);

        return new Converter<ResponseBody, List<ProductsItem>>() {
           @Override
           public List<ProductsItem> convert(ResponseBody body) throws IOException {
               ArticleEnvelop<?> envelop = delegate.convert(body);
               return envelop.products;
           }
       };
    }
}
