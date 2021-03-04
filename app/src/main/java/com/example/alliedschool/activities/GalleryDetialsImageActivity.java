package com.example.alliedschool.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.alliedschool.R;

public class GalleryDetialsImageActivity extends AppCompatActivity {

    private ImageView ivBack,ivImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_detials_image);
        ivBack = findViewById(R.id.iv_s_g_d_image_back);
        ivImage = findViewById(R.id.iv_s_g_d_image);

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        int image =getIntent().getIntExtra("image",0);
//        Bitmap bitmap = new BitmapDrawable(image)
        ivImage.setImageResource(image);

    }
}