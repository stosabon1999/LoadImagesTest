package ru.production.ssobolevsky.loadimagestest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by pro on 20.07.2018.
 */

class HTTPViewHolderFactory implements ViewHolderFactory {
    @Override
    public RecyclerView.ViewHolder createViewHolder(ViewGroup parent, LayoutInflater inflater) {
        View itemView = inflater.inflate(R.layout.item, parent, false);
        RecyclerView.ViewHolder holder = new CustomAdapter.HTTPViewHolder(itemView);
        return holder;
    }
}
