package ru.production.ssobolevsky.loadimagestest;

import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.squareup.picasso.Picasso;

/**
 * Created by pro on 20.07.2018.
 */

public class PicassoViewHolderBinder extends ViewHolderBinder {

    private final PicassoItem mItem;

    public PicassoViewHolderBinder(BaseItem item, int viewType) {
        super(viewType);
        mItem = (PicassoItem) item;
    }

    @Override
    public void bindViewHolder(RecyclerView.ViewHolder holder) {
        CustomAdapter.PicassoViewHolder myHolder = (CustomAdapter.PicassoViewHolder) holder;
        Picasso.get()
                .load(mItem.getImageUri())
                .into(myHolder.mImageView);
    }

    @Override
    public BaseItem getItem() {
        return mItem;
    }
}
