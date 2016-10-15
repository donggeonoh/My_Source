package com.example.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Item> list;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);
        list = new ArrayList<Item>();
        adapter = new CustomAdapter(getLayoutInflater(), list, this);

        list.add(new Item("김수현", "오동건", "고현규", "신은총"));
        list.add(new Item("김수현", "오동건", "고현규", "신은총"));
        list.add(new Item("김수현", "오동건", "고현규", "신은총"));
        list.add(new Item("김수현", "오동건", "고현규", "신은총"));
        list.add(new Item("김수현", "오동건", "고현규", "신은총"));

        listView.setAdapter(adapter);
    }
}