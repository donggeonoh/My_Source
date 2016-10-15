package com.cafa3naver.buttongame;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
    implements View.OnClickListener {

    private static final int BTN_COUNT = 9;

    private GridLayout btnGrid;
    private TextView scoreText;
    private TextView stageText;
    private Button[] buttons = new Button[BTN_COUNT];

    private int stageCount = 1;
    private int gameCount = 0;
    private int btnCount = 0;
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stageText = (TextView) findViewById(R.id.stageTextView);
        scoreText = (TextView) findViewById(R.id.scoreTextView);
        btnGrid = (GridLayout) findViewById(R.id.btnGrid);

        setScore();
        setButtons();
    }

    private void setScore() {
        stageText.setText("Stage : " + stageCount);
        scoreText.setText("score : " + score);
    }

        private void setButtons() {

        for(int i = 0; i < BTN_COUNT; i++) {
            int randNum = (int) (Math.random() * 9 + 1);

            buttons[i] = new Button(this);
            buttons[i].setText(randNum + "");

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

    private void init() {

        for(int i = 0; i < BTN_COUNT; i++) {
            int randNum = (int) (Math.random() * 9 + 1);

            buttons[i].setText(randNum + "");

            for(int j = 0; j < i; j++) {
                if(buttons[i].getText().equals(buttons[j].getText()))
                    i--;
            }
        }

        for(int i = 0; i < BTN_COUNT; i++) {
            buttons[i].setBackgroundColor(Color.GRAY);
            buttons[i].setTextColor(Color.BLACK);
        }
    }

    public void onClick(View v) {

        if(gameCount == 3) {
            Toast.makeText(this, "게임이 끝났습니다.", Toast.LENGTH_SHORT).show();
            return;
        }

        for(int i = 0; i < BTN_COUNT; i++) {
           buttons[i].setBackgroundColor(Color.RED);
           buttons[i].setTextColor(Color.RED);
        }

        if (((Button) v).getText().equals(btnCount + 1 + "")) {

            btnCount++;
            score += stageCount * btnCount;
            setScore();
        } else {

            init();
            gameCount++;
            Toast.makeText(this, "남은 게임 횟수 : " + (3 - gameCount), Toast.LENGTH_LONG).show();
            btnCount = 0;
        }

        if(btnCount == BTN_COUNT) {

            Toast.makeText(this, "완료! 다음 스테이지", Toast.LENGTH_SHORT).show();
            init();
            stageCount++;
            setScore();
            btnCount = 0;
        }
    }
}