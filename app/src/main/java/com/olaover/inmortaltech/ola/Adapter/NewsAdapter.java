package com.olaover.inmortaltech.ola.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;

import android.widget.TextView;

import com.olaover.inmortaltech.ola.Activity.News;
import com.olaover.inmortaltech.ola.Activity.NewsDetail;
import com.olaover.inmortaltech.ola.R;
import com.olaover.inmortaltech.ola.beans.NewsResponse;
import com.squareup.picasso.Picasso;


import java.util.List;


public class NewsAdapter<s> extends RecyclerView.Adapter<NewsAdapter.MyViewHolder> {

    List<NewsResponse.ArticlesBean>newsdata;
        News news;

    Context context;

    public NewsAdapter(Context context, List<NewsResponse.ArticlesBean> newsdata) {
        this.newsdata=newsdata;
        this.context=context;

        news=new News();
    }


    @Override
    public NewsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemtype = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_list_layout, parent, false);
        return new NewsAdapter.MyViewHolder(itemtype);



    }


    @Override
    public void onBindViewHolder(NewsAdapter.MyViewHolder holder, int position) {


        Picasso.with(context)
                .load(newsdata.get(position).getUrlToImage())
                .into(holder.iv_news);


        holder.tv_news_text.setText(newsdata.get(position).getTitle());





    }

    @Override
    public int getItemCount() {
        return newsdata.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView iv_news;
        TextView tv_news_text;


        public MyViewHolder(final View itemView) {
            super(itemView);

            iv_news = (ImageView) itemView.findViewById(R.id.iv_news);
            tv_news_text = (TextView) itemView.findViewById(R.id.tv_news_text);



         /*itemView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                        news.changeActivity(
                                newsdata.get(getAdapterPosition()).getTitle(),
                                newsdata.get(getAdapterPosition()).getUrlToImage(),
                                newsdata.get(getAdapterPosition()).getDescription(),
                                newsdata.get(getAdapterPosition()).getPublishedAt());
             }
         });*/

            context=itemView.getContext();

         itemView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Bundle bundle= new Bundle();
                 bundle.putString("title",newsdata.get(getAdapterPosition()).getTitle());
                 bundle.putString("publish",newsdata.get(getAdapterPosition()).getPublishedAt());
                 bundle.putString("description",newsdata.get(getAdapterPosition()).getDescription());
                 bundle.putString("url",newsdata.get(getAdapterPosition()).getUrlToImage());

                 Intent intent=new Intent(context,NewsDetail.class);
                 intent.putExtras(bundle);
                 context.startActivity(intent);
             }
         });
        }
    }
}
