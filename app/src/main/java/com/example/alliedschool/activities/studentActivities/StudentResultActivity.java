package com.example.alliedschool.activities.studentActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.alliedschool.Adapters.studentAdapters.StudentsResultAdapter;
import com.example.alliedschool.R;

import java.util.ArrayList;

public class StudentResultActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ImageView ivBack;
    String[] subjects = {"Maths", "Urdu", "English", "Islamiyat", "His/Deo", "Computer Science", "Science", "Drawing", "Total Marks", "%Age", "Grade/Position"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_result);
        recyclerView = findViewById(R.id.recyclerStudentResult);
        ivBack = findViewById(R.id.iv_result_back);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(new StudentsResultAdapter(getApplicationContext(), subjects));

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}