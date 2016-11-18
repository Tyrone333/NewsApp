package com.example.android.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by tyrone3 on 18.11.16.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    private class ViewHolder {
        TextView title;
        TextView section;
        TextView time;

    }

    public NewsAdapter(Context context, ArrayList<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            holder.title = (TextView) convertView.findViewById(R.id.list_item_title);
            holder.section = (TextView) convertView.findViewById(R.id.list_item_section);
            holder.time = (TextView) convertView.findViewById(R.id.list_item_time);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.title.setText(getItem(position).getTitle());
        holder.section.setText(getItem(position).getSection());
        holder.time.setText(getItem(position).getPublishDate());
        return convertView;
    }
}
