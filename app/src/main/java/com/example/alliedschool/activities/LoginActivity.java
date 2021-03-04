package com.example.alliedschool.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alliedschool.R;
import com.example.alliedschool.activities.studentActivities.StudentDashboardActivity;
import com.example.alliedschool.activities.teacherActivities.TeacherDashboardActivity;

public class LoginActivity extends AppCompatActivity {
    String[] users = {"Allied Kohat", "Allied City", "Allied Abbasyn", "Allied Hayatabad"};
    TextView tvLogin, tvId;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tvLogin = findViewById(R.id.tvLogin);
        tvId = findViewById(R.id.tv_login_id);
        Spinner spin = (Spinner) findViewById(R.id.spinner);
//        spin.setTag("Select branch");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, users);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor("#FFFFFF"));
                //Toast.makeText(getApplicationContext(), "Selected User: " + users[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
//                ((TextView)parent.getChildAt(0)).setText("Select branch");
            }
        });

        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = tvId.getText().toString().trim();

                if (id.equals("") || id == "") {
                    tvId.setError("Please enter id, Id should be start from pkk or tcr");
                } else if (id.length() < 4) {
                    tvId.setError("Password is weak");
                } else if (id.substring(0, 3).equalsIgnoreCase("pkk")) {
                    startActivity(new Intent(getApplicationContext(), StudentDashboardActivity.class));
                    tvId.setText("");
//                    finish();
                } else if (id.substring(0, 3).equalsIgnoreCase("tcr")){
                    startActivity(new Intent(getApplicationContext(), TeacherDashboardActivity.class));
//                    finish();
                    tvId.setText("");
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}