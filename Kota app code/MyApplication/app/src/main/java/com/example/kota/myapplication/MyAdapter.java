package com.example.kota.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<item> {
    LayoutInflater layoutInflater = null;

    public MyAdapter(Context c, int id, ArrayList<item> items) {
        super(c, id, items);
        this.layoutInflater = (LayoutInflater) c.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE
        );
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = layoutInflater.inflate(
                    R.layout.item_list,
                    parent,
                    false
             );
        }

        item Item = (item) getItem(position);

        ((TextView)convertView.findViewById(R.id.name)).setText(Item.getName());
        ((TextView)convertView.findViewById(R.id.price)).setText(String.valueOf(Item.getPrice()));

        return convertView;
    }
}
