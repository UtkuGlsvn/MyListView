package com.example.glsvn.listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class CustomAdapter extends ArrayAdapter<CustomClass> {

    public CustomAdapter(@NonNull Context context, ArrayList<CustomClass> resource) {
        super(context,0, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //convertView = LayoutInflater.from((getContext()).inflate(R.layout.custom_list_item,parent,false));
        View layoutInflater = LayoutInflater.from(getContext()).inflate(R.layout.custom_list_item,parent,false);
        convertView=layoutInflater;
        CustomClass item = getItem(position);
        TextView title=convertView.findViewById(R.id.textView);
        CircleImageView img = convertView.findViewById(R.id.img);

        title.setText(item.getTitle());
        img.setImageResource(item.getImage());
        return  convertView;
    }
}
