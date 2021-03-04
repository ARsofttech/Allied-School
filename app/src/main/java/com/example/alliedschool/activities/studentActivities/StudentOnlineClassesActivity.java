package com.example.alliedschool.activities.studentActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.alliedschool.R;

public class StudentOnlineClassesActivity extends AppCompatActivity {
ImageView ivBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_online_classes);

        ivBack = findViewById(R.id.iv_s_online_classes_back);

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}