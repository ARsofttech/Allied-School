package com.example.alliedschool.activities.studentActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alliedschool.R;
import com.example.alliedschool.Fragments.studentFragments.DailyAttadenceFragment;
import com.example.alliedschool.Fragments.studentFragments.MonthlyAttendanceFragment;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.LoadAdError;

public class StudentAttendanceActivity extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;

    ImageView  ivBack;
    TextView tvSelected,tvUnSelected;
    FrameLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);
        AdRequest adRequest = new AdRequest.Builder().build();
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(adRequest);
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
                super.onAdLoaded();
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
                super.onAdFailedToLoad(adError);
                mInterstitialAd.loadAd(adRequest);
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when the ad is displayed.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdLeftApplication() {
                // Code to be executed when the user has left the app.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the interstitial ad is closed.
            }
        });


        ivBack = findViewById(R.id.iv_attendance_back);
        tvSelected = findViewById(R.id.tv_daily);
        tvUnSelected = findViewById(R.id.tv_monthly);
        container = findViewById(R.id.attendance_container);
        getSupportFragmentManager().beginTransaction().replace(R.id.attendance_container, new DailyAttadenceFragment(), "Daily").commit();

       ivBack.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               finish();
           }
       });
        tvSelected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSelected.setBackground(getResources().getDrawable(R.drawable.bg_select));
                tvUnSelected.setBackground(getResources().getDrawable(R.drawable.bg_unselected));
                getSupportFragmentManager().beginTransaction().replace(R.id.attendance_container, new DailyAttadenceFragment(), "Daily").commit();
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });

        tvUnSelected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSelected.setBackground(getResources().getDrawable(R.drawable.bg_unselected));
                tvUnSelected.setBackground(getResources().getDrawable(R.drawable.bg_select));
                getSupportFragmentManager().beginTransaction().replace(R.id.attendance_container, new MonthlyAttendanceFragment(), "Monthly").commit();
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
    }
}