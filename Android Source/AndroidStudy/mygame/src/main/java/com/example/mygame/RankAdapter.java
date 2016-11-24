package com.example.mygame;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by DOGN on 2016-11-21.
 */

public class RankAdapter extends BaseAdapter {

    private int []rank;

    private TextView grade;
    private TextView score;


    public RankAdapter(int []rank) {
        this.rank = rank;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context context = parent.getContext();

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.rank_list, parent, false);
        }

        grade = (TextView) convertView.findViewById(R.id.rankGrade);
        score = (TextView) convertView.findViewById(R.id.rankScore);

        grade.setText("" + (position + 1));
        score.setText("" + rank[position]);

        return convertView;
    }

    public void addItem(int score, int []rank) {
        this.rank = rank;

        for(int i = 0; i < rank.length; i++) {
            if(score > rank[i]) {
                rank[i] = score;
                break;
            }
        }
    }

    @Override
    public int getCount() {
        return rank.length;
    }

    @Override
    public Object getItem(int position) {
        return rank[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}