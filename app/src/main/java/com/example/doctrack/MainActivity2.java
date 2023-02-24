package com.example.doctrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btnGoToDoctor = findViewById(R.id.button);
        Button btnGoToPatient = findViewById(R.id.button2);
        btnGoToDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Write code to navigate to the new screen here
                Intent intent;
                intent = new Intent(MainActivity2.this, MainActivity9.class);
                startActivity(intent);
            }
        });
        btnGoToPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Write code to navigate to the new screen here
                Intent intent;
                intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}