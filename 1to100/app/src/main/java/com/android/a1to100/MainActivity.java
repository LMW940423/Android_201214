package com.android.a1to100;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Integer> arGeneral = new ArrayList<>();

        for(int i = 1; i <= 100; i++){
            arGeneral.add(i);
        }

        // Adapter
        ArrayAdapter<Integer> adapter;
        adapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, arGeneral);

        // Adapter을 ListView에 연결
        ListView list = findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}