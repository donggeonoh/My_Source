package com.example.dogn.buttongame_dmaps_activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by DOGN on 2016-11-21.
 */

public class RankActivity extends AppCompatActivity {

    private Intent getGameIntent;

    private TextView rankField;
    private TextView scoreField;

    private TextView rankText;
    private TextView scoreText;

    private int score;
    private int rank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rank);

        getGameIntent = getIntent();
        rankField = (TextView) findViewById(R.id.rankText);
        scoreField = (TextView) findViewById(R.id.scoreText);
        rankText = (TextView) findViewById(R.id.rank);
        scoreText = (TextView) findViewById(R.id.score);

        SharedPreferences data = getSharedPreferences("rankFile", MODE_PRIVATE);
        SharedPreferences.Editor editor = data.edit();

        rank = data.getInt("rank", 1);

        if (getGameIntent.getExtras() == null) {
            rankField.setText("나의 최고점수");
            rankText.setText(rank + "");
            scoreField.setText("");
            scoreText.setText("");

            rankText.setText(rank + "");
            return;
        }

        score = getGameIntent.getExtras().getInt("score");

        if (score > rank) {
            editor.putInt("rank", score);
            rank = score;
            editor.commit();

            rankField.setText("최고기록 갱신!!!");
            rankText.setText(rank + "");

            scoreField.setText("");
            scoreText.setText("");
        } else {
            rankField.setText("나의 최고점수");
            rankText.setText(rank + "");

            scoreField.setText("점수");
            scoreText.setText(score + "");
        }
    }
}