package com.example.semesterproject;
import static android.content.ContentValues.TAG;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

public class Register extends AppCompatActivity {

    private EditText nameEditText;
    private EditText emailEditText;
    private EditText passwordEditText;
    private EditText confirmPasswordEditText;

    private EditText phoneNumberEditText;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        nameEditText = findViewById(R.id.nameEditText);
        emailEditText = findViewById(R.id.editTextTextRegisterEmailAddress);
        passwordEditText = findViewById(R.id.editTextRegisterPassword);
        confirmPasswordEditText = findViewById(R.id.confirmRegisterTextPassword);
        phoneNumberEditText = findViewById(R.id.phoneNumberEditText);
        Button registerButton = findViewById(R.id.submitRegistrationButton);
        mAuth = FirebaseAuth.getInstance();

        registerButton.setOnClickListener(v -> {
            String email = emailEditText.getText().toString();
            String password = passwordEditText.getText().toString();
            String confirmPassword = confirmPasswordEditText.getText().toString();
            String phoneNumberString = phoneNumberEditText.getText().toString();

            // Some basic validation, but you should add more
            if (email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                Toast.makeText(Register.this, "Please enter all the details", Toast.LENGTH_SHORT).show();
            } else if (!password.equals(confirmPassword)) {
                Toast.makeText(Register.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
            } else {
                int phoneNumber = Integer.parseInt(phoneNumberString);
                mAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(this, task -> {
                            if (task.isSuccessful()) {
                                Toast.makeText(Register.this, "Registration successful", Toast.LENGTH_SHORT).show();
                                createUserDocument(email); // Create user document in Firestore
                                startActivity(new Intent(Register.this, Login.class));
                                finish(); // Finish the registration activity
                            } else {
                                Toast.makeText(Register.this, "Registration failed", Toast.LENGTH_SHORT).show();
                            }
                        });
            }
        });
    }

    private void createUserDocument(String email) {
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser != null) {
            String uid = currentUser.getUid();
            User user = new User(uid);
            FirebaseFirestore db = FirebaseFirestore.getInstance();
            db.collection("users").document(uid).set(user)
                    .addOnSuccessListener(aVoid -> Log.d(TAG, "DocumentSnapshot successfully written!"))
                    .addOnFailureListener(e -> Log.w(TAG, "Error writing document", e));
        }
    }
}