package com.example.alliedschool.activities.teacherActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.alliedschool.Adapters.teacherAdapter.TeacherSalaryAdapter;
import com.example.alliedschool.R;

public class TeacherSalaryActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_salary);
        recyclerView = findViewById(R.id.recycler_teacher_salary);

        findViewById(R.id.iv_t_salary_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(new TeacherSalaryAdapter());
    }
}