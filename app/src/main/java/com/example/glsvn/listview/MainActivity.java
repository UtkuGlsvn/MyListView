package com.example.glsvn.listview;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Dialog builder = new Dialog(MainActivity.this);
                builder.setTitle("İnfo:"+position);
                builder.setCancelable(true);
                builder.show();
            }
        });
    }

}
