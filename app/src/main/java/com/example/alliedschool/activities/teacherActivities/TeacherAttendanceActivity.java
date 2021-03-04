package com.example.alliedschool.activities.teacherActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.ImageView;

import com.example.alliedschool.R;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;

import sun.bob.mcalendarview.vo.DateData;

public class TeacherAttendanceActivity extends AppCompatActivity {
    CalendarView calendarView;
    PieChart pieChart;
    PieData pieData;
    PieDataSet pieDataSet;
    ArrayList pieEntries;
    private ImageView ivBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_attendance);
        ArrayList<DateData> dates = new ArrayList<>();
        dates.add(new DateData(2018, 04, 26));
        dates.add(new DateData(2018, 04, 27));
        findViewById(R.id.iv_t_atten_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        calendarView = findViewById(R.id.t_calender_view);
        pieChart = findViewById(R.id.t_pieChart);
        getEntries();
        pieDataSet = new PieDataSet(pieEntries, "");
        pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieDataSet.setColors(Color.RED, Color.GREEN, Color.YELLOW);
        pieDataSet.setSliceSpace(2f);
        pieDataSet.setValueTextColor(Color.parseColor("#2A367D"));
        pieDataSet.setValueTextSize(10f);
        pieDataSet.setSliceSpace(5f);
    }

    private void getEntries() {
        pieEntries = new ArrayList<>();
        pieEntries.add(new PieEntry(2f, "absent", 0));
        pieEntries.add(new PieEntry(4f, "present", 1));
        pieEntries.add(new PieEntry(6f, "Holiday", 2));
    }
}