package ru.production.ssobolevsky.loadimagestest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/**
 * Created by pro on 20.07.2018.
 */

public interface ViewHolderFactory {

    RecyclerView.ViewHolder createViewHolder(ViewGroup parent, LayoutInflater inflater);

}
