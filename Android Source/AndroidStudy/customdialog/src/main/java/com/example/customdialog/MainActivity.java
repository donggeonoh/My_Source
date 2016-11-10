package com.example.customdialog;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements DialogInterface.OnDismissListener {

    Button btn;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                CustomDialog mCD = new CustomDialog(MainActivity.this);
                mCD.setOnDismissListener(MainActivity.this);
                WindowManager.LayoutParams params = mCD.getWindow().getAttributes();
                params.width = WindowManager.LayoutParams.MATCH_PARENT;
                params.height = WindowManager.LayoutParams.MATCH_PARENT;
                mCD.getWindow().setAttributes(params);
                mCD.show();
            }
        });
    }
    @Override
    public void onDismiss(DialogInterface dialog){
        CustomDialog dialog1 = (CustomDialog) dialog;
        String name = dialog1.getName();
        textView.setText(name);
    }

}