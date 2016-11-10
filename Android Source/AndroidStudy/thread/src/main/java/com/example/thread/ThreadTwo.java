package com.example.thread;

import android.os.Handler;

/**
 * Created by DOGN on 2016-11-07.
 */
public class ThreadTwo extends Thread {

    private int time;
    private Handler handler;

    public ThreadTwo(Handler mHandler, int time) {
        this.handler = mHandler;
        this.time = time;
    }

    @Override
    public void run() {
        while(true) {
            try {
                sleep(time);
                handler.sendEmptyMessage(1);
            } catch (InterruptedException e) {

            }
        }
    }
}
