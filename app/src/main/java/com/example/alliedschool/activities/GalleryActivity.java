package com.example.alliedschool.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.alliedschool.Adapters.studentAdapters.StudentGalleryAdapter;
import com.example.alliedschool.R;

public class GalleryActivity extends AppCompatActivity {
private ImageView ivBack;
private RecyclerView recyclerView;
private String[] events={"News", "Ceremony","Market place","Camera"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        recyclerView = findViewById(R.id.recycler_student_gallery);
        ivBack = findViewById(R.id.iv_s_gallery_back);
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),3));
        recyclerView.setAdapter(new StudentGalleryAdapter(getApplicationContext(),events));
    }
}