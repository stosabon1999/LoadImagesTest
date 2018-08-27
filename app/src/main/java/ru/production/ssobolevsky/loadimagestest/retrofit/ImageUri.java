package ru.production.ssobolevsky.loadimagestest.retrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pro on 20.07.2018.
 */

public class ImageUri {

    @SerializedName("uri")
    private String uri;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
