package com.example.progettoboh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ciao extends AppCompatActivity {

    TextView textView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciao);
        Intent intent = getIntent();
        textView = findViewById(R.id.textView);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("EXTRA_TEXT");
            textView.setText(value);

        }

    }
}