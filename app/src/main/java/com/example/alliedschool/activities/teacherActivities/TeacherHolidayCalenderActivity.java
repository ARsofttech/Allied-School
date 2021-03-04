package com.example.alliedschool.activities.teacherActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.alliedschool.Adapters.teacherAdapter.TeacherHolidaysAdapter;
import com.example.alliedschool.R;

public class TeacherHolidayCalenderActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    private String[] holidays = {"Kashmir Solidarity day","Pakistan day","Labour day","Eid Ul Fitar","Eid Ul Adha","Independence day of pakistan","Ashura","Prophets's Birthday","Cristmas day","Quaid-e-Azam day"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_holiday_calender);
        findViewById(R.id.iv_t_holidays_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        recyclerView = findViewById(R.id.recycler_teachers_holidays);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(new TeacherHolidaysAdapter(getApplicationContext(),holidays));

    }
}