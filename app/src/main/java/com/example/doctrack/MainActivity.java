package com.example.doctrack;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result= (TextView) findViewById(R.id.textView);
    }
    public void button(View view) {
        result.setText(String.valueOf("Sport..."));
    }
    public void button2(View view) {
        result.setText(String.valueOf("Politics..."));
    }
    public void button3(View view) {
        result.setText(String.valueOf("Education...."));
    }
}
