package com.example.thread;

import android.os.Handler;

/**
 * Created by DOGN on 2016-11-07.
 */
public class ThreadOne extends Thread {

    private int time;
    private Handler handler;

    public ThreadOne(Handler mHandler, int time) {
        this.handler = mHandler;
        this.time = time;
    }

    @Override
    public void run() {
        while(true) {
            try {
                sleep(time);
                handler.sendEmptyMessage(0);
            } catch (InterruptedException e) {

            }
        }
    }
}
