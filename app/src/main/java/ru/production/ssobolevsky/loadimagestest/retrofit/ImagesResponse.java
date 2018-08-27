package ru.production.ssobolevsky.loadimagestest.retrofit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by pro on 20.07.2018.
 */

public class ImagesResponse {

    @SerializedName("images")
    private List<DispalySize> mData;

    public List<DispalySize> getData() {
        return mData;
    }

    public void setData(List<DispalySize> data) {
        mData = data;
    }
}
