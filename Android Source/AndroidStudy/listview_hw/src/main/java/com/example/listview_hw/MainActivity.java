package com.example.listview_hw;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    Button button;
    ListView listView;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new CustomAdapter();

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
                Date time = new Date();

                String currentTime = dateFormat.format(time);

                if((int) (Math.random() * 2) == 0)
                    adapter.addItem(ContextCompat.getDrawable(v.getContext(), R.drawable.gr), currentTime, "오빠 자?? ㅎㅎㅎ");
                else {
                    adapter.addItem(ContextCompat.getDrawable(v.getContext(), R.drawable.ss), currentTime, "머해? ^^");
                }

                adapter.notifyDataSetChanged();
            }
        });

        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
