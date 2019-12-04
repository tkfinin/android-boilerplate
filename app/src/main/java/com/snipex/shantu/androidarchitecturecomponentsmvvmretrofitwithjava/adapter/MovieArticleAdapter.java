package com.snipex.shantu.androidarchitecturecomponentsmvvmretrofitwithjava.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.snipex.shantu.androidarchitecturecomponentsmvvmretrofitwithjava.R;
import com.snipex.shantu.androidarchitecturecomponentsmvvmretrofitwithjava.databinding.ListEachRowMovieArticleBinding;
import com.snipex.shantu.androidarchitecturecomponentsmvvmretrofitwithjava.model.Article;

import java.util.ArrayList;

public class MovieArticleAdapter extends RecyclerView.Adapter<MovieArticleAdapter.MovieArticleViewHolder> {

    private Context context;
    ArrayList<Article> articleArrayList;
    LayoutInflater layoutInflater;

    public MovieArticleAdapter(Context context, ArrayList<Article> articleArrayList) {
        this.context = context;
        this.articleArrayList = articleArrayList;
    }

    @NonNull
    @Override
    public MovieArticleAdapter.MovieArticleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
        }
        ListEachRowMovieArticleBinding articleRowItemBinding = DataBindingUtil.inflate(layoutInflater, R.layout.list_each_row_movie_article, viewGroup, false);
        return new MovieArticleViewHolder(articleRowItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieArticleAdapter.MovieArticleViewHolder viewHolder, int i) {
        viewHolder.articleRowItemBinding.setArticle(articleArrayList.get(i));

    }

    @Override
    public int getItemCount() {
        return articleArrayList.size();
    }

    public class MovieArticleViewHolder extends RecyclerView.ViewHolder {
        ListEachRowMovieArticleBinding articleRowItemBinding;

        public MovieArticleViewHolder(final ListEachRowMovieArticleBinding itemBinding) {
            super(itemBinding.getRoot());
            this.articleRowItemBinding = itemBinding;


        }


    }
}
