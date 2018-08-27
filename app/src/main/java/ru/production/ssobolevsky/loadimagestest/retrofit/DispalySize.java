package ru.production.ssobolevsky.loadimagestest.retrofit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by pro on 20.07.2018.
 */

public class DispalySize {

    @SerializedName("display_sizes")
    private ImageUri mUri;

    public ImageUri getUri() {
        return mUri;
    }

    public void setUri(ImageUri uri) {
        mUri = uri;
    }
}
