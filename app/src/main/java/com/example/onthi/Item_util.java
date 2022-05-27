package com.example.onthi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Item_util extends BaseAdapter {
    int layout;
    Context context;
    ArrayList<Item_entity> item_entities;

    public Item_util(int layout, Context context, ArrayList<Item_entity> item_entities) {
        this.layout = layout;
        this.context = context;
        this.item_entities = item_entities;
    }

    @Override
    public int getCount() {
        return item_entities.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(context).inflate(layout,viewGroup,false);
        TextView txt_1=view.findViewById(R.id.txt1);
        TextView txt_2=view.findViewById(R.id.txt2);
        ImageView txt_img=view.findViewById(R.id.btn_img);
        txt_1.setText(item_entities.get(i).getTen());
        txt_2.setText(item_entities.get(i).getDuong());
        txt_img.setImageResource(item_entities.get(i).getIma());
        return view;
    }
}
