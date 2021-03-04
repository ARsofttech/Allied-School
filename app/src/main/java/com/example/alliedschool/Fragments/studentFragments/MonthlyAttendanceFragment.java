package com.example.alliedschool.Fragments.studentFragments;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;

import com.example.alliedschool.R;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;

import sun.bob.mcalendarview.vo.DateData;

public class MonthlyAttendanceFragment extends Fragment {
    CalendarView calendarView;
    PieChart pieChart;
    PieData pieData;
    PieDataSet pieDataSet;
    ArrayList pieEntries;
    ArrayList PieEntryLabels;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_monthly_attendance, container, false);
        ArrayList<DateData> dates=new ArrayList<>();
        dates.add(new DateData(2018,04,26));
        dates.add(new DateData(2018,04,27));

        calendarView = view.findViewById(R.id.calender_view);
       /* for(int i=0;i<dates.size();i++) {
            calendarView.set(dates.get(i).getYear(),dates.get(i).getMonth(),dates.get(i).getDay());//mark multiple dates with this code.
        }*/
        pieChart = view.findViewById(R.id.pieChart);
        getEntries();
        pieDataSet = new PieDataSet(pieEntries, "");
        pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieDataSet.setColors(Color.RED, Color.GREEN, Color.YELLOW);
        pieDataSet.setSliceSpace(2f);
        pieDataSet.setValueTextColor(Color.parseColor("#2A367D"));
        pieDataSet.setValueTextSize(10f);
        pieDataSet.setSliceSpace(5f);
        return view;
    }

    private void getEntries() {
        pieEntries = new ArrayList<>();
        pieEntries.add(new PieEntry(2f, "absent",0));
        pieEntries.add(new PieEntry(4f, "present",1));
        pieEntries.add(new PieEntry(6f, "Holiday",2));
    }
}