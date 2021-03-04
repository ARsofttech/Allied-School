package com.example.alliedschool.activities.teacherActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.alliedschool.R;
import com.example.alliedschool.activities.GalleryActivity;
import com.example.alliedschool.activities.studentActivities.StudentFeedBackActivity;
import com.example.alliedschool.activities.studentActivities.StudentLeaveApplicationActivity;
import com.example.alliedschool.activities.SettingsActivity;
import com.example.alliedschool.activities.studentActivities.StudentStudyMaterialActivity;
import com.example.alliedschool.activities.studentActivities.StudentTimeTableActivity;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.LoadAdError;

public class TeacherDashboardActivity extends AppCompatActivity {
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    private LinearLayout layoutAttendance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_dashboard);

        layoutAttendance = findViewById(R.id.layout_t_attendance);

        mAdView = findViewById(R.id.adView_t_dashboard);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
                super.onAdLoaded();
//                Toast.makeText(StudentDashboardActivity.this, "ad load", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
                super.onAdFailedToLoad(adError);
                mAdView.loadAd(adRequest);
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
                super.onAdOpened();
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
                super.onAdClicked();
            }

            @Override
            public void onAdLeftApplication() {
                // Code to be executed when the user has left the app.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        });

        findViewById(R.id.layout_t_view_profile).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TeacherDashboardActivity.this, TeacherProfileActivity.class));
            }
        });
        findViewById(R.id.iv_t_settings).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TeacherDashboardActivity.this, SettingsActivity.class));
            }
        });
        findViewById(R.id.layout_t_announcement).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TeacherDashboardActivity.this, TeacherAnouncementActivity.class));
            }
        });
        layoutAttendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TeacherDashboardActivity.this, TeacherAttendanceActivity.class));
            }
        });

        findViewById(R.id.layout_t_time_table).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TeacherDashboardActivity.this, StudentTimeTableActivity.class));
            }
        });
        findViewById(R.id.layout_t_calender).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TeacherDashboardActivity.this, TeacherHolidayCalenderActivity.class));
            }
        });

        findViewById(R.id.layout_t_salary).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TeacherDashboardActivity.this, TeacherSalaryActivity.class));
            }
        });

        findViewById(R.id.layout_t_gallery).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TeacherDashboardActivity.this, GalleryActivity.class));
            }
        });
        findViewById(R.id.layout_t_leave_application).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TeacherDashboardActivity.this, StudentLeaveApplicationActivity.class));
            }
        });
        findViewById(R.id.layout_t_feedback).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TeacherDashboardActivity.this, StudentFeedBackActivity.class));
            }
        });
        findViewById(R.id.layout_t_study_material).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TeacherDashboardActivity.this, StudentStudyMaterialActivity.class));
            }
        });
    }
}