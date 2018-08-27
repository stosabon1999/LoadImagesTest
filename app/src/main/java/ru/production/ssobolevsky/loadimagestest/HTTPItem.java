package ru.production.ssobolevsky.loadimagestest;

/**
 * Created by pro on 20.07.2018.
 */

public class HTTPItem implements BaseItem {

    private String imageUri;

    public HTTPItem(String imageUri) {
        this.imageUri = imageUri;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    @Override
    public int getType() {
        return ItemTypes.HTTP.getType();
    }
}
