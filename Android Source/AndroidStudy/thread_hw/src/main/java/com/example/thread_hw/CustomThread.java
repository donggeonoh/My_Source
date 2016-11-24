package com.example.thread_hw;

import android.os.Handler;
import android.widget.ProgressBar;

/**
 * Created by DOGN on 2016-11-14.
 */

public class CustomThread extends Thread {

    int count = 0;
    ProgressBar progressBar;

    public CustomThread(ProgressBar progressBar) {
        this.progressBar = progressBar;
    }

    @Override
    public void run() {
        while(true) {
            try {
                sleep(1000);

                progressBar.setProgress(count += 5);

                if(count == 100) {
                    count = 0;
                }

            } catch (InterruptedException e) {
                System.out.println(e.getCause() + "\n");
            }
        }
    }
}