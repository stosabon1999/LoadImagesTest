package ru.production.ssobolevsky.loadimagestest.retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by pro on 20.07.2018.
 */

public class RetrofitHelper {

    private static final String BASE_URL = "https://api.gettyimages.com/v3/search/";

    public GettyImagesApi getApi() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        return retrofit.create(GettyImagesApi.class);
    }

}
