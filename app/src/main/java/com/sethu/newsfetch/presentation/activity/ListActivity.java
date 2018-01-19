package com.sethu.newsfetch.presentation.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.sethu.newsfetch.R;
import com.sethu.newsfetch.data.Articles;
import com.sethu.newsfetch.MainApplication;
import com.sethu.newsfetch.domain.MainApplicationComponent;
import com.sethu.newsfetch.domain.retrofit.ArticleApiInterface;
import com.sethu.newsfetch.presentation.adapters.ArticleListAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class ListActivity extends AppCompatActivity {

    MainApplicationComponent component;
    @BindView(R.id.recycler_view)
    public RecyclerView recyclerView;
    @BindView(R.id.empty_view)
    public TextView emptyView;
    private ArticleListAdapter articleListAdapter;
    private List userList = new ArrayList<>();
    private String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        articleListAdapter = new ArticleListAdapter(userList, getApplicationContext());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(articleListAdapter);
        getMainApplicationComponent();
        getUsersInfo();
    }

    void getMainApplicationComponent() {
        component = MainApplication.getMainApplicationComponent();
    }

    Retrofit getRetrofitInstance() {
        return component.getRetrofitInstance();
    }

    void getUsersInfo() {

        ArticleApiInterface articleApiInterface = getRetrofitInstance().create(ArticleApiInterface.class);
        Call<List<Articles>> call = articleApiInterface.getUsersInfo();
        call.enqueue(new Callback<List<Articles>>() {
            @Override
            public void onResponse(Call<List<Articles>> call, Response<List<Articles>> response) {
                Log.d(TAG, "onResponse: call " + call + "  response " + response);
                ArrayList<Articles> arrayList = (ArrayList<Articles>) response.body();
                userList.addAll(arrayList);
                try {
                    if (userList.isEmpty()) {
                        emptyView.setVisibility(View.VISIBLE);
                        emptyView.setText("Please try again");
                    } else {
                        emptyView.setVisibility(View.GONE);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                articleListAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<Articles>> call, Throwable t) {
                Log.d(TAG, "onFailure: " + t);
                emptyView.setVisibility(View.GONE);
            }
        });
    }
}
