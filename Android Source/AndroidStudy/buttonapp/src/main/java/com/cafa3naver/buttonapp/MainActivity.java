package com.cafa3naver.buttonapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    /*
    private Button startBtn;
    private Button[] btn = new Button[9];

    final int[] btnId = {
            R.id.btn1,
            R.id.btn2,
            R.id.btn3,
            R.id.btn4,
            R.id.btn5,
            R.id.btn6,
            R.id.btn7,
            R.id.btn8,
            R.id.btn9
    };
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        GridLayout gridLayout = new GridLayout(this);
        LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        GridLayout.LayoutParams[] btnParams = new GridLayout.LayoutParams[9];

        gridLayout.setColumnCount(3);
        gridLayout.setRowCount(3);

        gridLayout.setLayoutParams(params);

        Button btn[] = new Button[9];

        for(int i = 0; i < 9; i++) {
            btn[i] = new Button(this);
            btn[i].setId(i);
            btn[i].setText(i + 1);

            btnParams[i] = new GridLayout.LayoutParams();
            btn[i].setLayoutParams(btnParams[i]);

            gridLayout.addView(btn[i]);
        }

        setContentView(gridLayout);

        //startBtn = (Button)findViewById(R.id.startBtn);

        /*
        for(int i = 0; i < 9; i++) {
            btn[i] = (Button)findViewById(btnId[i]);
        }
        */

        /*
        for(int i = 0; i < 9; i++) {
            final int finalI = i;

            btn[i].setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    btn[finalI].setBackgroundColor(Color.RED);
                    btn[finalI].setEnabled(false);

                    int index;

                    for(index = 0; index < 9; index++) {
                        if(btn[index].isEnabled())
                            break;
                    }

                    if(index == 9)
                        Toast.makeText(MainActivity.this, "성공!!!", Toast.LENGTH_SHORT).show();
                }
            });
        }

        startBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "시작!", Toast.LENGTH_SHORT).show();

                for(int i = 0; i < 9; i++) {
                    btn[i].setEnabled(true);
                }
            }
        });
        */

    }

}