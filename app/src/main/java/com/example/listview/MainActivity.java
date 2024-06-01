package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView v;
ArrayList<String> a=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v=findViewById(R.id.ls);
        a.add("Nizamuddin");
        a.add("Shamsuddin");
        a.add("Shaziya Parveen");
        a.add("Parveen");
        a.add("Shahazade Ali");
        a.add("Heena Parveen");
        a.add("Amanat Rasoul");
        a.add("Hasnain");
        a.add("Nizamuddin");
        a.add("Shamsuddin");
        a.add("Shaziya Parveen");
        a.add("Parveen");
        a.add("Shahazade Ali");
        a.add("Heena Parveen");
        a.add("Amanat Rasoul");
        a.add("Hasnain");
        a.add("Nizamuddin");
        a.add("Shamsuddin");
        a.add("Shaziya Parveen");
        a.add("Parveen");
        a.add("Shahazade Ali");
        a.add("Heena Parveen");
        a.add("Amanat Rasoul");
        a.add("Hasnain");
        a.add("Nizamuddin");
        a.add("Shamsuddin");
        a.add("Shaziya Parveen");
        a.add("Parveen");
        a.add("Shahazade Ali");
        a.add("Heena Parveen");
        a.add("Amanat Rasoul");
        a.add("Hasnain");
        ArrayAdapter<String> at= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,a);
        v.setAdapter(at);
        v.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    Toast.makeText(MainActivity.this, "First Clicked", Toast.LENGTH_SHORT).show();
                }
                else if(i==1)
                {
                    Toast.makeText(MainActivity.this, "Second Clicked", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "All Clicked", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}