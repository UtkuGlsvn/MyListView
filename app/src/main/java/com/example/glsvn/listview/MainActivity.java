package com.example.glsvn.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<CustomClass> item = new ArrayList<>();
        for (int i=0;i<15;i++)
        item.add(new CustomClass(i+"",R.mipmap.ic_launcher));

        CustomAdapter adapter = new CustomAdapter(MainActivity.this,item);
        listView=findViewById(R.id.listview);
        listView.setAdapter(adapter);
    }

}
