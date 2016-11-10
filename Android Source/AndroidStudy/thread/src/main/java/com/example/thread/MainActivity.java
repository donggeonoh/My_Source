package com.example.thread;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text1;
    TextView text2;

    int count1 = 0;
    int count2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);

        ThreadOne thread1 = new ThreadOne(mHandler, 1000);
        ThreadTwo thread2 = new ThreadTwo(mHandler, 1000);

        thread1.start();
        thread2.start();
    }

    Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {

            if(msg.what == 0) {
                text1.setText("Thread1 : " + (++count1));
            } else {
                text2.setText("Thread2 : " + (++count2));
            }
        }
    };
}
