package com.sethu.redmart.presentation.adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.sethu.redmart.R;
import com.sethu.redmart.data.ProductsItem;
import com.sethu.redmart.presentation.activity.CustomAlertDialog;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ProductListAdapter extends RecyclerView.Adapter<ProductListAdapter.MyViewHolder> {

    private  Context context;
    private List<ProductsItem> articlesList;

    public ProductListAdapter(List<ProductsItem> usersList, Context context) {
        this.articlesList = usersList;
        this.context = context;
    }
    public ProductListAdapter(){}

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item, parent, false);
        return new MyViewHolder(itemView);
    }

    public void setProducts(List<ProductsItem> productsItemList){
        this.articlesList  = productsItemList;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final ProductsItem productsItem = articlesList.get(position);
        holder.title.setText(productsItem.getTitle());
        holder.desc.setText(productsItem.getPricing().getPrice() + " SGD");
//        holder.time.setText(articles.getPublishedAt());
        Picasso.get().load("http://media.redmart.com/newmedia/200p" + productsItem.getImages().get(0).getName()).into(holder.imageView);

        holder.card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomAlertDialog.getInstance().showConfirmDialog(productsItem.getTitle(), productsItem.getDesc(), "Buy", "Cancel", context, 0,productsItem.getImages().get(0).getName(),productsItem.getPricing().getPrice() + " SGD");

            }
        });
    }

    @Override
    public int getItemCount() {
        return articlesList.size();
    }

    public ProductsItem getItemAtPos(int pos){
        return articlesList.get(pos);
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {


        @BindView(R.id.title)
        TextView title;
        @BindView(R.id.desc)
        TextView desc;
        @BindView(R.id.time)
        TextView time;
        @BindView(R.id.imageViewItem)
        ImageView imageView;
        @BindView(R.id.card_view)
        CardView card_view;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}