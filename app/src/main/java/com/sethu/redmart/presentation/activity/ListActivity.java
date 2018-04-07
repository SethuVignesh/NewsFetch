package com.sethu.redmart.presentation.activity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.sethu.redmart.MainApplication;
import com.sethu.redmart.R;
import com.sethu.redmart.Utility.Util;
import com.sethu.redmart.data.ProductsItem;
import com.sethu.redmart.domain.MainApplicationComponent;
import com.sethu.redmart.domain.retrofit.ArticleApiInterface;
import com.sethu.redmart.presentation.adapters.ProductListAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class ListActivity extends AppCompatActivity implements DialogClickInterface{

    MainApplicationComponent component;
    @BindView(R.id.recycler_view)
    public RecyclerView recyclerView;
    @BindView(R.id.empty_view)
    public TextView emptyView;
    private ProductListAdapter articleListAdapter;
    private List productList = new ArrayList<>();
    private String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @Override
    protected void onResume() {
        super.onResume();
        if (Util.isNetworkAvailable(ListActivity.this)) {

            articleListAdapter = new ProductListAdapter(productList, ListActivity.this);
//            RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
            RecyclerView.LayoutManager mLayoutManager = new StaggeredGridLayoutManager(2, 1);
            recyclerView.setLayoutManager(mLayoutManager);
            recyclerView.setAdapter(articleListAdapter);
            getMainApplicationComponent();
            getUsersInfo();
        } else {
            emptyView.setVisibility(View.VISIBLE);
            emptyView.setText("Internet not available,Please try again");
        }

    }

    void getMainApplicationComponent() {
        component = MainApplication.getMainApplicationComponent();
    }

    Retrofit getRetrofitInstance() {
        return component.getRetrofitInstance();
    }

    void getUsersInfo() {

        ArticleApiInterface articleApiInterface = getRetrofitInstance().create(ArticleApiInterface.class);
        Call<List<ProductsItem>> call = articleApiInterface.getUsersInfo();
        call.enqueue(new Callback<List<ProductsItem>>() {
            @Override
            public void onResponse(Call<List<ProductsItem>> call, Response<List<ProductsItem>> response) {
                Log.d(TAG, "onResponse: call " + call + "  response " + response);
                ArrayList<ProductsItem> arrayList =(ArrayList<ProductsItem>)response.body();
                productList.addAll(arrayList);
                try {
                    if (productList.isEmpty()) {
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
            public void onFailure(Call<List<ProductsItem>> call, Throwable t) {
                Log.d(TAG, "onFailure: " + t);
                try {
                    emptyView.setVisibility(View.VISIBLE);
                    emptyView.setText("Internet not available,Please try again");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    public void onClickPositiveButton(DialogInterface pDialog, int pDialogIntefier) {
        pDialog.cancel();
    }

    @Override
    public void onClickNegativeButton(DialogInterface pDialog, int pDialogIntefier) {
        pDialog.cancel();
    }
}
