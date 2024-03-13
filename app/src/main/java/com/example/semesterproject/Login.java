package com.example.semesterproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.firebase.auth.FirebaseAuth;

import androidx.appcompat.app.AppCompatActivity;

// This class represents the login activity
// It allows the user to login to their account
// It uses Firebase Authentication to authenticate the user
// If the user is already logged in, it will redirect them to the main activity
public class Login extends AppCompatActivity {
    private EditText emailEditText;
    private EditText passwordEditText;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        Button loginButton = findViewById(R.id.loginButton);
        Button registerButton = findViewById(R.id.registerButton);
        mAuth = FirebaseAuth.getInstance();


        loginButton.setOnClickListener(v -> {
            String email = emailEditText.getText().toString();
            String password = passwordEditText.getText().toString();


            // Some basic validation, but you should add more
            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(Login.this, "Please enter all the details", Toast.LENGTH_SHORT).show();
            } else {


                // Use Firebase Authentication to sign in the user
                // you can find how to do this in the documentation.
                // https://firebase.google.com/docs/auth/android/password-auth
                // keep in mind we will be logging in with a email and password.
            }
        });


        // If the user needs an account, they can click the register button to go to the registration activity.
        registerButton.setOnClickListener(v -> {
            Intent intent = new Intent(Login.this, Register.class);
            startActivity(intent);
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        if (mAuth.getCurrentUser() != null) {
            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }


    @Override
    protected void onResume() {
        super.onResume();
        if (mAuth.getCurrentUser() != null) {
            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        if (mAuth.getCurrentUser() != null) {
            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }


    // When we pause the we want to keep the user logged in
    @Override
    protected void onPause() {
        super.onPause();
        if (mAuth.getCurrentUser() != null) {
            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }


    // When we stop the we want to keep the user logged in
    @Override
    protected void onStop() {
        super.onStop();
        if (mAuth.getCurrentUser() != null) {
            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }


    // When we destroy the login we want to eliminate any resources that are being used
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // eliminate any resources that are being used here
    }
}
