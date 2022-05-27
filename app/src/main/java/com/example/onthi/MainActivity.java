package com.example.onthi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView btn_list;
    ArrayList<Item_entity> entityArrayList;
    Item_util item_util;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_list=findViewById(R.id.btn_list);
        entityArrayList=new ArrayList<>();
        entityArrayList.add(new Item_entity("Giày cao cấp addidas","1000.000đ",
                R.drawable.shoes_rm_yellow));
        entityArrayList.add(new Item_entity("Giày cao cấp addidas","1000.000đ",
                R.drawable.shoes_rm_yellow));
        entityArrayList.add(new Item_entity("Giày cao cấp addidas","1000.000đ",
                R.drawable.shoes_rm_yellow));
        entityArrayList.add(new Item_entity("Giày cao cấp addidas","1000.000đ",
                R.drawable.shoes_rm_yellow));
        item_util=new Item_util(R.layout.item_ban_hang,MainActivity.this,entityArrayList);
        btn_list.setAdapter(item_util);
    }
}