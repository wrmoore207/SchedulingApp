package com.example.semesterproject;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.navigation_home) {
                return true;
            } else if (item.getItemId() == R.id.navigation_dashboard) {
                // GoTo activity_emp_ind_schedule
                startActivity(new Intent(MainActivity.this, my_schedule.class));
                finish();
                return true;
            } else if (item.getItemId() == R.id.navigation_notifications) {
                // GoTo activity_emp_requests
                startActivity(new Intent(MainActivity.this, requests.class));
                return true;
            } else if (item.getItemId() == R.id.navigation_profile) {
                // GoTo activity_employee_info
                startActivity(new Intent(MainActivity.this, my_info.class));
                return true;
            } else {
                return false;
            }
        });
    }
}