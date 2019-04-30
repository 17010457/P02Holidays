package com.myapplicationdev.android.p02_holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvHoliday;
    ArrayAdapter adapter;
    ArrayList<Holiday> holidayArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        lv = this.findViewById(R.id.lvHoliday);
        tvHoliday = this.findViewById(R.id.textView2);

        Intent i = getIntent();
        int type = i.getIntExtra("type",0);

        holidayArrayList = new ArrayList<Holiday>();
        if (type == 1) {
            tvHoliday.setText("Secular");
            holidayArrayList.add(new Holiday("New Year's Day", "1 Jan 2017", "newyear"));
            holidayArrayList.add(new Holiday("Labour Day", "1 May 2017", "labourday"));
        } else if (type == 2){
            tvHoliday.setText("Ethnic & Religion");
            holidayArrayList.add(new Holiday("Chinese New Year", "28-29 Jan 2017", "cny"));
            holidayArrayList.add(new Holiday("Good Friday", "14 April 2017", "goodfriday"));
        }
        adapter = new HolidayAdapter(this, R.layout.row, holidayArrayList);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holiday selectedHoliday = holidayArrayList.get(position);
                if (position == 1){
                    Toast.makeText(SecondActivity.this, selectedHoliday.getName() + " Date: " + selectedHoliday.getDate(), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(SecondActivity.this, selectedHoliday.getName() + " Date: " + selectedHoliday.getDate(), Toast.LENGTH_SHORT).show();
                }
            }
        });


    }



}
