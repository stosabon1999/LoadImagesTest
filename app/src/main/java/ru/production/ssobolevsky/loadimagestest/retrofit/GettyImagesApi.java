package ru.production.ssobolevsky.loadimagestest.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by pro on 20.07.2018.
 */

public interface GettyImagesApi {

    @GET("images?fields=id,title,thumb,referral_destinations&phrase=moscow&sort_order=best")
    Call<ImagesResponse> getImages();
}
