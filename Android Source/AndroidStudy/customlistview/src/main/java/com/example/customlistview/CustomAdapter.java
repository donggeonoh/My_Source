package com.example.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by DOGN on 2016-10-10.
 */

public class CustomAdapter extends BaseAdapter{

    Context context;
    LayoutInflater inflater;
    ArrayList<Item> itemlist;

    public CustomAdapter(LayoutInflater inflater, ArrayList<Item> itemlist, Context context) {
        this.context = context;
        this.inflater = inflater;
        this.itemlist = itemlist;
    }

    @Override
    public int getCount() {
        return itemlist.size();
    }

    @Override
    public Object getItem(int position) {
        return itemlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = inflater.inflate(R.layout.activity_custom, parent, false);
        }

        TextView text1 = (TextView) convertView.findViewById(R.id.text1);
        TextView text2 = (TextView) convertView.findViewById(R.id.text2);
        TextView text3 = (TextView) convertView.findViewById(R.id.text3);
        TextView text4 = (TextView) convertView.findViewById(R.id.text4);

        text1.setText(itemlist.get(position).getText1());
        text2.setText(itemlist.get(position).getText2());
        text3.setText(itemlist.get(position).getText3());
        text4.setText(itemlist.get(position).getText4());

        Button selectButton = (Button) convertView.findViewById(R.id.selectButton);
        selectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, (position + 1) + "번 째 버튼 입니다.", Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }
}