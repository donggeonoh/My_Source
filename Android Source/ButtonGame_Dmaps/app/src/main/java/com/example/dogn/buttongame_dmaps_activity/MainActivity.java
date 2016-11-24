package com.example.dogn.buttongame_dmaps_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    RankActivity rankActivity;
    Intent rankIntent;

    Button startButtonGameButton;
    Button rankButton;
    Button exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rankActivity = new RankActivity();
        rankIntent = new Intent(MainActivity.this, rankActivity.getClass());

        startButtonGameButton = (Button) findViewById(R.id.startButtonGameButton);
        rankButton = (Button) findViewById(R.id.rankButton);
        exitButton = (Button) findViewById(R.id.exitButton);

        startButtonGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gameIntent = new Intent(MainActivity.this, GameActivity.class);
                gameIntent.putExtras(rankIntent);
                startActivity(gameIntent);
            }
        });

        rankButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(rankIntent);
            }
        });

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
