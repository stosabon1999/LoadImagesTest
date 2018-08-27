package ru.production.ssobolevsky.loadimagestest;

/**
 * Created by pro on 20.07.2018.
 */

public class FrescoItem implements BaseItem {

    private String imageUri;

    public FrescoItem(String imageUri) {
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
        return ItemTypes.FRESCO.getType();
    }
}
