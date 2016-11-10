package com.example.listview_hw;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DOGN on 2016-11-07.
 */

public class CustomAdapter extends BaseAdapter {

    ArrayList<Item> list = new ArrayList<>();

    public CustomAdapter() {

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Context context = parent.getContext();

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.girl_friend_list, parent, false);
        }

        ImageView image = (ImageView) convertView.findViewById(R.id.image);
        TextView dateText = (TextView) convertView.findViewById(R.id.dateText);
        TextView contentText = (TextView) convertView.findViewById(R.id.contentText);

        Item item = list.get(position);

        image.setBackground(new ShapeDrawable(new OvalShape()));
        image.setClipToOutline(true);
        image.setImageDrawable(item.getImage());
        dateText.setText(item.getDateText());
        contentText.setText(item.getContentText());

        return convertView;
    }

    public void addItem(Drawable image, String dateText, String contentText) {
        Item item = new Item();

        item.setImage(image);
        item.setDateText(dateText);
        item.setContentText(contentText);

        list.add(item);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}
