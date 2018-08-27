package ru.production.ssobolevsky.loadimagestest;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pro on 20.07.2018.
 */

public class CustomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<BaseItem> mData;
    private final List<ViewHolderBinder> mBinders;
    private SparseArray<ViewHolderFactory> mFactory;

    public CustomAdapter(List<BaseItem> data) {
        mData = data;
        mBinders = new ArrayList<>();
        setData(data);
        mFactory = new SparseArray<>();
        mFactory.put(ItemTypes.HTTP.getType(), new HTTPViewHolderFactory());
        mFactory.put(ItemTypes.PICASSO.getType(), new PicassoViewHolderFactory());
        mFactory.put(ItemTypes.GLIDE.getType(), new GlideViewHolderFactory());
        mFactory.put(ItemTypes.FRESCO.getType(), new FrescoViewHolderFactory());
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewHolderFactory factory = mFactory.get(viewType);
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return factory.createViewHolder(parent, inflater);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolderBinder binder = mBinders.get(position);
        if (binder != null) {
            binder.bindViewHolder(holder);
        }
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (mData.get(position).getType() == ItemTypes.HTTP.getType()) {
            return ItemTypes.HTTP.getType();
        } else if (mData.get(position).getType() == ItemTypes.PICASSO.getType()) {
            return ItemTypes.PICASSO.getType();
        } else if (mData.get(position).getType() == ItemTypes.GLIDE.getType()) {
            return ItemTypes.GLIDE.getType();
        } else if (mData.get(position).getType() == ItemTypes.FRESCO.getType()) {
            return ItemTypes.FRESCO.getType();
        }
        return mData.get(position).getType();
    }

    private ViewHolderBinder generateBinder(BaseItem item) {
        if (item.getType() == ItemTypes.HTTP.getType()) {
            return new HTTPViewHolderBinder(item, ItemTypes.HTTP.getType());
        } else if (item.getType() == ItemTypes.PICASSO.getType()) {
            return new PicassoViewHolderBinder(item, ItemTypes.PICASSO.getType());
        } else if (item.getType() == ItemTypes.GLIDE.getType()) {
            return new GlideViewHolderBinder(item, ItemTypes.GLIDE.getType());
        } else if (item.getType() == ItemTypes.FRESCO.getType()) {
            return new FrescoViewHolderBinder(item, ItemTypes.FRESCO.getType());
        }
        return null;
    }

    public void setData(List<BaseItem> items) {
        mBinders.clear();
        for (BaseItem item :items) {
            mBinders.add(generateBinder(item));
        }
        notifyDataSetChanged();
    }

    public static class HTTPViewHolder extends RecyclerView.ViewHolder {

        ImageView mImageView;

        public HTTPViewHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.image);
        }
    }

    public static class PicassoViewHolder extends RecyclerView.ViewHolder {
        ImageView mImageView;
        public PicassoViewHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.image);
        }
    }
    public static class GlideViewHolder extends RecyclerView.ViewHolder {
        ImageView mImageView;
        public GlideViewHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.image);
        }
    }
    public static class FrescoViewHolder extends RecyclerView.ViewHolder {
        SimpleDraweeView mImageView;
        public FrescoViewHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.drawee_image);
        }
    }
}
