package com.example.my_recyclerview_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView JustDoIT;
    private  JustDoItAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JustDoIT = findViewById(R.id.JustDoIT_id);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        JustDoIT.setLayoutManager(layoutManager);
        JustDoIT.setHasFixedSize(true);

        myAdapter = new JustDoItAdapter(30);
        JustDoIT.setAdapter(myAdapter);
    }
}