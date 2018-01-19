package com.sethu.newsfetch.presentation.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sethu.newsfetch.R;
import com.sethu.newsfetch.data.Articles;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ArticleListAdapter extends RecyclerView.Adapter<ArticleListAdapter.MyViewHolder> {

    private final Context context;
    private List<Articles> articlesList;

    public ArticleListAdapter(List<Articles> usersList, Context context) {
        this.articlesList = usersList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Articles articles = articlesList.get(position);
        holder.title.setText(articles.getTitle());
        holder.desc.setText(articles.getDescription());
        holder.time.setText(articles.getPublishedAt());

    }

    @Override
    public int getItemCount() {
        return articlesList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        @BindView(R.id.title)
        TextView title;
        @BindView(R.id.desc)
        TextView desc;
        @BindView(R.id.time)
        TextView time;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}