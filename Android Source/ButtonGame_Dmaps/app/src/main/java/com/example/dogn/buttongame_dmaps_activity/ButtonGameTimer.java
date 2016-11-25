package com.example.dogn.buttongame_dmaps_activity;

import android.os.Handler;
import android.widget.ProgressBar;

/**
 * Created by DOGN on 2016-11-25.
 */

public class ButtonGameTimer extends Thread {

    Handler handler;
    ProgressBar progressBar;

    int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ButtonGameTimer(ProgressBar progressBar, Handler handler) {
        this.handler = handler;
        this.progressBar = progressBar;
    }

    public void initialize() {
        progressBar.setProgress(0);
        count = 0;
    }

    @Override
    public void run() {
        while(true) {
            try {
                sleep(1000);

                progressBar.setProgress(count += 20);

                if(count == 100) {
                    handler.sendMessage(handler.obtainMessage());
                }

            } catch (InterruptedException e) {

            }
        }
    }
}