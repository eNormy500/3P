package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        Intent intent= getIntent();

        String tekst = intent.getStringExtra("wiadomość");

        TextView textView = findViewById(R.id.pytanie);
        textView.setText(tekst);

    }
}