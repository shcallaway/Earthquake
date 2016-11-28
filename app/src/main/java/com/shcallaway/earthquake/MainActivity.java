package com.shcallaway.earthquake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> quakes = new ArrayList<>();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quakes.add("Hello world");
        quakes.add("I am a quake");

        // Assign ListView to the listView object in layout.
        listView = (ListView) findViewById(R.id.listView);

        // Create an ArrayAdapter from quakes Array and set it to listView.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, quakes);
        listView.setAdapter(adapter);
    }
}
