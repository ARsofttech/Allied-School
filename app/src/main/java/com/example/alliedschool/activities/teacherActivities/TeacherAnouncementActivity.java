package com.example.alliedschool.activities.teacherActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.alliedschool.Adapters.teacherAdapter.TeacherAnnouncementAdapter;
import com.example.alliedschool.R;

public class TeacherAnouncementActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_anouncement);
        findViewById(R.id.iv_t_announcement_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        recyclerView = findViewById(R.id.recycler_teachers_announcement);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(new TeacherAnnouncementAdapter(getApplicationContext()));
    }
}