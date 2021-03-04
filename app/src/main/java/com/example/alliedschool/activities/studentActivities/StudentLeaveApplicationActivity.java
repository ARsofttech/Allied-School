package com.example.alliedschool.activities.studentActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alliedschool.R;

public class StudentLeaveApplicationActivity extends AppCompatActivity {

    private ImageView ivBack;
    private TextView tvCancel,tvSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_leave_application);

        ivBack = findViewById(R.id.iv_student_leave_app);
        tvCancel = findViewById(R.id.tv_cancel_s_leave_app);
        tvSubmit = findViewById(R.id.tv_submit_s_leave_app);

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        tvCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}