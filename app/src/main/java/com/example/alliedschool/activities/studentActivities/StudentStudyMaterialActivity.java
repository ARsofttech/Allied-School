package com.example.alliedschool.activities.studentActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.alliedschool.Adapters.studentAdapters.StudentStudyMtAdapter;
import com.example.alliedschool.R;

import java.util.ArrayList;

public class StudentStudyMaterialActivity extends AppCompatActivity {
    private ImageView ivBack;
    private RecyclerView recyclerView;
    ArrayList<String> url = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_study_material);
        url.add("https://drive.google.com/file/d/1-TTsD-j5flwW1lZ8igIruaAs0kik3pQP/view?usp=sharing");

        ivBack = findViewById(R.id.iv_s_m_back);
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        recyclerView = findViewById(R.id.recycler_s_study_mt);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(new StudentStudyMtAdapter(getApplicationContext(),url));
    }
}