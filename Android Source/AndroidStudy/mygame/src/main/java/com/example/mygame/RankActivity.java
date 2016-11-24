package com.example.mygame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by DOGN on 2016-11-14.
 */

public class RankActivity extends AppCompatActivity {

    private int []rank = new int[10];

    Intent rankIntent;
    ListView rankList;
    RankAdapter rankAdapter;

    public RankActivity() {
        rankIntent = getIntent();
        rank = rankIntent.getExtras().getIntArray("rank");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rank_activiry);

        rankList = (ListView) findViewById(R.id.rankList);
        rankAdapter = new RankAdapter(rank);

        rankIntent = getIntent();

        if(rankIntent.getExtras() == null) {
            rankList.setAdapter(rankAdapter);
            rankAdapter.notifyDataSetChanged();
            return;
        }

        int score = rankIntent.getExtras().getInt("score");
        rankAdapter.addItem(score, rank);

        rankList.setAdapter(rankAdapter);
        rankAdapter.notifyDataSetChanged();
    }
}