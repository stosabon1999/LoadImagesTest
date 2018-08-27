package ru.production.ssobolevsky.loadimagestest;

import android.support.v7.widget.RecyclerView;

/**
 * Created by pro on 20.07.2018.
 */

public class FrescoViewHolderBinder extends ViewHolderBinder {
    private final FrescoItem mItem;

    public FrescoViewHolderBinder(BaseItem item, int viewType) {
        super(viewType);
        mItem = (FrescoItem) item;
    }

    @Override
    public void bindViewHolder(RecyclerView.ViewHolder holder) {
        CustomAdapter.FrescoViewHolder myHolder = (CustomAdapter.FrescoViewHolder) holder;
        myHolder.mImageView.setImageURI(mItem.getImageUri());
    }

    @Override
    public BaseItem getItem() {
        return mItem;
    }}
