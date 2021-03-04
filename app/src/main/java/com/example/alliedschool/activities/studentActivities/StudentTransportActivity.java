package com.example.alliedschool.activities.studentActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alliedschool.Adapters.studentAdapters.StudentTransportDetailsAdapter;
import com.example.alliedschool.Fragments.studentFragments.StudentTransportApplicationDialogFragment;
import com.example.alliedschool.R;

public class StudentTransportActivity extends AppCompatActivity {
    private ImageView ivBack;
private RecyclerView recyclerView;
private TextView tvSubmitApplication;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_transport);

        ivBack = findViewById(R.id.iv_s_transport);
        tvSubmitApplication = findViewById(R.id.tv_submit_s_transp_application);

        recyclerView = findViewById(R.id.recycler_s_transp_details);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(new StudentTransportDetailsAdapter());



        tvSubmitApplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StudentTransportApplicationDialogFragment dialogFragment = new StudentTransportApplicationDialogFragment();
                dialogFragment.show(getSupportFragmentManager(), "transport details");
            }
        });
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}