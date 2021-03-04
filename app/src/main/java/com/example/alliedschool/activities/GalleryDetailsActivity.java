package com.example.alliedschool.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alliedschool.Adapters.studentAdapters.StudentGalleryDetailsAdapter;
import com.example.alliedschool.R;

public class GalleryDetailsActivity extends AppCompatActivity {
    private ImageView ivBack;
    private RecyclerView recyclerView;
    private TextView tvName;
    private int[] images = {R.drawable.ab_hadi,R.drawable.ic_books,R.drawable.ab_hadi,R.drawable.ic_books,R.drawable.ab_hadi,R.drawable.ic_books};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_details);

        tvName = findViewById(R.id.tv_stdnt_gllry_dtls_evnt_name);
        tvName.setText(getIntent().getStringExtra("event name"));
        recyclerView = findViewById(R.id.recycler_student_gallery_details);
        ivBack = findViewById(R.id.iv_s_gallery_detials_back);
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));
        recyclerView.setAdapter(new StudentGalleryDetailsAdapter(getApplicationContext(),images));
    }
}