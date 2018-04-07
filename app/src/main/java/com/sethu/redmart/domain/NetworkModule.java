package com.sethu.redmart.domain;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sethu.redmart.domain.retrofit.ArticleEnvelopConverter;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


@Module
public class NetworkModule {
    OkHttpClient client;
    GsonBuilder gsonBuilder;
    Retrofit retrofit;
    @Provides
    Gson provideGson() {
       if(gsonBuilder == null) {
           gsonBuilder = new GsonBuilder();
           gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
       }
        return gsonBuilder.create();
    }

    @Provides
    OkHttpClient provideOkHttpClient() {
        if(client == null) {
            client = new OkHttpClient();
        }
        return client;
    }

    @Provides
    Retrofit provideRetrofit(Gson gson, OkHttpClient okHttpClient) {
        if(retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .addConverterFactory(new EmptyToNullConverter())
                    .addConverterFactory(new ArticleEnvelopConverter())
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .baseUrl("https://api.redmart.com")
                    .client(okHttpClient)
                    .build();
        }
        return retrofit;
    }
}
