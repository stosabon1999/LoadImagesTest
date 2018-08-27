package ru.production.ssobolevsky.loadimagestest.retrofit;

import android.util.Log;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by pro on 20.07.2018.
 */

public class ApiMapper {


    private RetrofitHelper mHelper;

    public ApiMapper(RetrofitHelper helper) {
        mHelper = helper;
    }

    public void weatherAsync() throws IOException {
        mHelper.getApi().getImages().enqueue(new Callback<ImagesResponse>() {
            @Override
            public void onResponse(Call<ImagesResponse> call, Response<ImagesResponse> response) {
                Log.wtf("URI" , response.toString());
            }

            @Override
            public void onFailure(Call<ImagesResponse> call, Throwable t) {

            }
        });

    }

}
