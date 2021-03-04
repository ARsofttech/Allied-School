package com.example.alliedschool.Fragments.studentFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.alliedschool.R;
import com.example.alliedschool.Adapters.studentAdapters.DailyDaysAdapter;
import com.example.alliedschool.Adapters.studentAdapters.DailyDaysClassesAdapter;


public class DailyAttadenceFragment extends Fragment {
    RecyclerView recyclerDailyDays, recyclerDailyClasses;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_daily_attadence, container, false);
        recyclerDailyDays = view.findViewById(R.id.recycler_daily_days);
        recyclerDailyClasses = view.findViewById(R.id.recycler_daily_classes);

        recyclerDailyDays.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerDailyDays.setAdapter(new DailyDaysAdapter());

        recyclerDailyClasses.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerDailyClasses.setAdapter(new DailyDaysClassesAdapter());

        return view;
    }
}