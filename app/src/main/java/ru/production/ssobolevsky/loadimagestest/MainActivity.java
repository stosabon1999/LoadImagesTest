package ru.production.ssobolevsky.loadimagestest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import ru.production.ssobolevsky.loadimagestest.retrofit.ApiMapper;
import ru.production.ssobolevsky.loadimagestest.retrofit.DispalySize;
import ru.production.ssobolevsky.loadimagestest.retrofit.GettyImagesApi;
import ru.production.ssobolevsky.loadimagestest.retrofit.ImagesResponse;
import ru.production.ssobolevsky.loadimagestest.retrofit.RetrofitHelper;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private CustomAdapter mAdapter;
    private LinearLayoutManager mManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.rv_photos);
        mManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(mManager);
        List<BaseItem> list = new ArrayList<>();
        list.add(new PicassoItem("http://bipbap.ru/wp-content/uploads/2017/10/0_8eb56_842bba74_XL-220x220.jpg"));
        list.add(new HTTPItem("http://qaru.site/img/2d43ceebad8dfea4e135920122ce3f83.png"));
        list.add(new FrescoItem("http://qaru.site/img/2d43ceebad8dfea4e135920122ce3f83.png"));
        mAdapter = new CustomAdapter(list);
        mRecyclerView.setAdapter(mAdapter);

    }
}
