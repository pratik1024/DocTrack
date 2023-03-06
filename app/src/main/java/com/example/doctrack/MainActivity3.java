package com.example.doctrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        EditText mUsernameEditText = findViewById(R.id.editTextPhone);
        EditText mPasswordEditText = findViewById(R.id.editTextTextPassword);
        Button mLoginButton = findViewById(R.id.button3);
        Button mLoginButton1 = findViewById(R.id.button4);
        // Set up a click listener for the login button
        mLoginButton.setOnClickListener(v -> {
            // Check if the username and password are correct
            if (mUsernameEditText.getText().toString().equals("123456") &&
                    mPasswordEditText.getText().toString().equals("password")) {
                // If the credentials are correct, navigate to the main activity
                Intent intent = new Intent(MainActivity3.this, MainActivity6.class);
                startActivity(intent);
            } else {
                // If the credentials are incorrect, display an error message
                Toast.makeText(MainActivity3.this, "Incorrect username or password", Toast.LENGTH_SHORT).show();
            }
        });
        mLoginButton1.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(intent);
            });
    }
}