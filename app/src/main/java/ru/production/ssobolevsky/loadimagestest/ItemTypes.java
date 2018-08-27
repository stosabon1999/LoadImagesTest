package ru.production.ssobolevsky.loadimagestest;

/**
 * Created by pro on 20.07.2018.
 */

public enum ItemTypes {

    HTTP(1),
    PICASSO(2),
    GLIDE(3),
    FRESCO(4);

    int type;

    ItemTypes(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
