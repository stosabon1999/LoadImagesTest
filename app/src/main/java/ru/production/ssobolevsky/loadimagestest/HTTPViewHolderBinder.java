package ru.production.ssobolevsky.loadimagestest;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import retrofit2.http.HTTP;

/**
 * Created by pro on 20.07.2018.
 */

public class HTTPViewHolderBinder extends ViewHolderBinder {

    private final HTTPItem mItem;

    public HTTPViewHolderBinder(BaseItem item, int viewType) {
        super(viewType);
        mItem = (HTTPItem) item;
    }

    @Override
    public void bindViewHolder(RecyclerView.ViewHolder holder) {
        final CustomAdapter.HTTPViewHolder myHolder = (CustomAdapter.HTTPViewHolder) holder;
        new DownloadImageTask(myHolder.mImageView).execute(mItem.getImageUri());
    }

    @Override
    public BaseItem getItem() {
        return mItem;
    }

    private Bitmap getImage(URL url) {
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            int responseCode = connection.getResponseCode();
            if (responseCode == 200) {
                return BitmapFactory.decodeStream(connection.getInputStream());
            } else {
                return null;
            }
        } catch (IOException e) {
            return null;
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    private Bitmap getImageFromString(String urlString) {
        try {
            URL url = new URL(urlString);
            return getImage(url);
        } catch (MalformedURLException e) {
            return null;
        }
    }

    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView bmImage;

        public DownloadImageTask(ImageView bmImage) {
            this.bmImage = bmImage;
        }

        protected Bitmap doInBackground(String... urls) {
            return getImageFromString(urls[0]);
        }

        protected void onPostExecute(Bitmap result) {
            bmImage.setImageBitmap(result);
        }
    }
}
