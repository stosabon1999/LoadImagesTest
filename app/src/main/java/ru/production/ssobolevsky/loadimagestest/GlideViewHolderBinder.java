package ru.production.ssobolevsky.loadimagestest;

import android.support.v7.widget.RecyclerView;

/**
 * Created by pro on 20.07.2018.
 */

public class GlideViewHolderBinder extends ViewHolderBinder {

    private final GlideItem mItem;

    public GlideViewHolderBinder(BaseItem item, int viewType) {
        super(viewType);
        mItem = (GlideItem) item;
    }

    @Override
    public void bindViewHolder(RecyclerView.ViewHolder holder) {
        CustomAdapter.GlideViewHolder myHolder = (CustomAdapter.GlideViewHolder) holder;
        //myHolder.mImageView
        //TODO glide
    }

    @Override
    public BaseItem getItem() {
        return mItem;
    }
}
