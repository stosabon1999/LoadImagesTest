package ru.production.ssobolevsky.loadimagestest;

import android.support.v7.widget.RecyclerView;

/**
 * Created by pro on 20.07.2018.
 */

public abstract class ViewHolderBinder {

    protected final int viewType;

    public ViewHolderBinder(int viewType) {
        this.viewType = viewType;
    }

    public abstract void bindViewHolder(RecyclerView.ViewHolder holder);
    public abstract BaseItem getItem();
}
