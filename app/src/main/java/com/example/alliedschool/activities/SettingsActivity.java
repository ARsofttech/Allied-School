package com.example.alliedschool.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.alliedschool.R;
import com.example.alliedschool.activities.AboutActivity;
import com.example.alliedschool.activities.HelpActivity;
import com.example.alliedschool.activities.TermsAndConditionsActivity;
import com.example.alliedschool.activities.studentActivities.StudentEditProfileActivity;
import com.example.alliedschool.activities.teacherActivities.TeacherEditProfileActivity;

public class SettingsActivity extends AppCompatActivity {
    ImageView imageViewBack;
    private LinearLayout layoutEditProfile, layoutTermsC, layoutHelp, layoutAbout, layoutLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        imageViewBack = findViewById(R.id.iv_s_settings_back);
        layoutEditProfile = findViewById(R.id.layout_settings_edit_profile);
        layoutTermsC = findViewById(R.id.layout_settings_t_c);
        layoutHelp = findViewById(R.id.layout_settings_help);
        layoutAbout = findViewById(R.id.layout_settings_about);
        layoutLogout = findViewById(R.id.layout_logout);

        imageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        layoutEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), TeacherEditProfileActivity.class));
            }
        });
        layoutTermsC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), TermsAndConditionsActivity.class));

            }
        });
        layoutHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), HelpActivity.class));

            }
        });
        layoutAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AboutActivity.class));

            }
        });
    }
}