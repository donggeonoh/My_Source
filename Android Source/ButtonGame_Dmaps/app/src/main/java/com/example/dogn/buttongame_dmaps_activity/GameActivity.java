package com.example.dogn.buttongame_dmaps_activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by DOGN on 2016-11-21.
 */

public class GameActivity extends AppCompatActivity
    implements View.OnClickListener {

    private static final int BTN_COUNT = 9;

    ProgressBar timer;
    ButtonGameTimer trd;
    Handler handler;
    private GridLayout btnGrid;

    private TextView scoreText;
    private TextView stageText;
    private TextView countLeftText;

    private Button[] buttons = new Button[BTN_COUNT];

    private int stageCount = 1;
    private int gameCount = 3;
    private int btnCount = 0;
    private int score = 0;
    private int startBtn = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_game);

        timer = (ProgressBar) findViewById(R.id.timer);

        handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                trd.initialize();
                timeOver();
            }
        };

        stageText = (TextView) findViewById(R.id.stageTextView);
        scoreText = (TextView) findViewById(R.id.scoreTextView);
        countLeftText = (TextView) findViewById(R.id.countLeft);
        countLeftText.setText(gameCount + "");

        btnGrid = (GridLayout) findViewById(R.id.btnGrid);
        trd = new ButtonGameTimer(timer, handler);

        setScore();
        setButtons();

        trd.start();
    }

    public void onClick(View v) {

        trd.initialize();

        if(startBtn == 0) {
            for (int i = 0; i < BTN_COUNT; i++) {
                buttons[i].setBackgroundColor(Color.RED);
                buttons[i].setTextColor(Color.RED);
            }
            startBtn = 1;
        }

        if (((Button) v).getText().equals(btnCount + 1 + "")) {
            btnCount++;
            score += stageCount * btnCount;

            v.setBackground(getDrawable(R.drawable.custom_button));
            setScore();
        } else {
            gameCount--;
            countLeftText.setText(gameCount + "");
            btnCount = 0;

            setButtons();
            isGameFinish();
        }

        if (btnCount == BTN_COUNT) {
            stageCount++;
            btnCount = 0;

            setButtons();
            setScore();
            Toast.makeText(this, "완료! 다음 스테이지", Toast.LENGTH_SHORT).show();
        }
    }

    private void setScore() {
        stageText.setText("Stage : " + stageCount);
        scoreText.setText("score : " + score);
    }

    private void setButtons() {
        startBtn = 0;
        btnGrid.removeAllViews();

        for(int i = 0; i < BTN_COUNT; i++) {
            int randNum = (int) (Math.random() * 9 + 1);

            buttons[i] = new Button(this);
            buttons[i].setText(randNum + "");
            buttons[i].setBackground(getDrawable(R.drawable.custom_button));

            for(int j = 0; j < i; j++) {
                if(buttons[i].getText().equals(buttons[j].getText()))
                    i--;
            }
        }

        for(int i = 0; i < BTN_COUNT; i++) {
            buttons[i].setOnClickListener(this);
            btnGrid.addView(buttons[i]);
        }
    }

    private void timeOver() {
        gameCount--;
        countLeftText.setText(gameCount + "");
        btnCount = 0;

        setButtons();
        isGameFinish();
    }

    private void isGameFinish() {
        if(gameCount == 0) {
            Intent rankIntent = new Intent(GameActivity.this, RankActivity.class);
            rankIntent.putExtra("score", score);

            startActivity(rankIntent);
            finish();
        }
    }
}