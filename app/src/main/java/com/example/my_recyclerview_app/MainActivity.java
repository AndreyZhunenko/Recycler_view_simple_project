package com.example.my_recyclerview_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView List_of_goods;
    private  JustDoItAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List_of_goods = findViewById(R.id.List_of_goods_id);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        List_of_goods.setLayoutManager(layoutManager);
        List_of_goods.setHasFixedSize(true);

        myAdapter = new JustDoItAdapter(2);
        List_of_goods.setAdapter(myAdapter);
    }
}