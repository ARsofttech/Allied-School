package com.example.alliedschool.activities.studentActivities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

import com.example.alliedschool.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class StudentEditProfileActivity extends AppCompatActivity {
private ImageView ivBack,ivChangeImage;
private CircleImageView ivUserProfile;
private int PICK_IMAGE=1;
private Uri imageUri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_edit_profile);
        ivChangeImage = findViewById(R.id.iv_change_profile_image);
        ivUserProfile = findViewById(R.id.iv_selected_image_e_p);
        ivBack = findViewById(R.id.iv_student_edit_profile_back);
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ivChangeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGallery();
            }
        });
    }
    private void openGallery() {
        Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(gallery, PICK_IMAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == PICK_IMAGE){
            imageUri = data.getData();
            ivUserProfile.setImageURI(imageUri);
        }
    }
}