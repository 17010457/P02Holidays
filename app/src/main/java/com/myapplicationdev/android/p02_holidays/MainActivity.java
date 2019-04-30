package com.myapplicationdev.android.p02_holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    ListView lv;
    ArrayList<String> al;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tvType);
        lv = findViewById(R.id.lvType);
        tv.setText("Types of public holidays in SG");

        al = new ArrayList<String>();
        al.add("Secular");
        al.add("Ethnic & Religion");

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,al);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                if (position == 1){
                  //  intent.putExtra("type","Secular");
                } else{
                  //  intent.putExtra("type","Ethnic & Religion");
                }

            }


        });


    }
}
