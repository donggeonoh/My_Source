package com.example.mygame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by DOGN on 2016-11-14.
 */

public class RankActivity extends AppCompatActivity {

    Intent rankIntent;

    TextView firstRank;
    TextView secondRank;
    TextView thirdRank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rank_activiry);

        rankIntent = getIntent();

        firstRank = (TextView) findViewById(R.id.firstRank);
        secondRank = (TextView) findViewById(R.id.secondRank);
        thirdRank = (TextView) findViewById(R.id.thirdRank);

        int score = rankIntent.getExtras().getInt("score");

        if(Integer.parseInt((String) firstRank.getText()) < score)
            firstRank.setText("" + score);
    }
}
