package com.example.dogn.buttongame_dmaps_activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by DOGN on 2016-11-21.
 */

public class RankActivity extends AppCompatActivity {

    private Intent getGameIntent;
    private TextView rankText;

    private static int rank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rank);

        getGameIntent = getIntent();
        rankText = (TextView) findViewById(R.id.rankText);

        if(getGameIntent.getExtras() == null) {
            rankText.setText(rank + "");
            return;
        }

        rank = getGameIntent.getExtras().getInt("score");
        rankText.setText(rank + "");
    }
}