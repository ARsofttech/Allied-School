package com.example.alliedschool.activities.studentActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.alliedschool.Adapters.studentAdapters.StudentTimeTableAdapter;
import com.example.alliedschool.R;

public class StudentTimeTableActivity extends AppCompatActivity {
    ImageView ivBack;
    RecyclerView recyclerSTimeTable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_time_table);

        ivBack = findViewById(R.id.iv_s_time_table_back);
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        recyclerSTimeTable = findViewById(R.id.recycler_s_time_table);
        recyclerSTimeTable.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerSTimeTable.setAdapter(new StudentTimeTableAdapter());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}