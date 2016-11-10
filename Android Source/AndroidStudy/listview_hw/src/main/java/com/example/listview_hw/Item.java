package com.example.listview_hw;

import android.graphics.drawable.Drawable;

/**
 * Created by DOGN on 2016-11-07.
 */

public class Item {
    private Drawable image;
    private String dateText;
    private String contentText;

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getDateText() {
        return dateText;
    }

    public void setDateText(String dateText) {
        this.dateText = dateText;
    }

    public String getContentText() {
        return contentText;
    }

    public void setContentText(String contentText) {
        this.contentText = contentText;
    }
}

