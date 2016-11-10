package com.example.customdialog;

import android.app.Dialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by DOGN on 2016-11-07.
 */

public final class CustomDialog extends Dialog implements View.OnClickListener {
    Button register;
    Button cancel;
    EditText text;
    private OnDismissListener _listener;

    public CustomDialog(Context context) {
        super(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_dialog);
        setTitle( "Enter Your Name" ) ;
        register = (Button) findViewById(R.id.sendBtn);
        cancel = (Button) findViewById(R.id.closeBtn);
        text = (EditText) findViewById(R.id.edit);

        register.setOnClickListener(this);
        cancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.sendBtn) {
            if (_listener == null) {
            } else
                _listener.onDismiss(CustomDialog.this);
            dismiss();
        } else if (id == R.id.closeBtn) {

        }
    }

    public void setOnDismissListener(OnDismissListener listener){
        _listener=listener;
    }

    public String getName(){
        return text.getText().toString();
    }
}