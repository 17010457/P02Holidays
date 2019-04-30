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
        String year = i.getStringExtra("year");
        tvHoliday.setText(year);

        holidayArrayList = new ArrayList<Holiday>();
        holidayArrayList.add(new Holiday("C208", true));
        holidayArrayList.add(new Holiday("C200", false));
        holidayArrayList.add(new Holiday("C346", true));

        adapter = new HolidayAdapter(this, R.layout.row, holidayArrayList);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holiday selectedHoliday = holidayArrayList.get(position);

                if (selectedHoliday.isPic() == true){
                    Toast.makeText(SecondActivity.this, selectedHoliday.getName() + " is a Programming module", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(SecondActivity.this, selectedHoliday.getName() + " is not a Programming module", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }



}
