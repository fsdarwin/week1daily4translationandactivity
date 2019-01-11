package com.example.mac.week1daily2translationandactivity2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        TextView tvNext = findViewById(R.id.tvNext);

        Intent sentIntent = getIntent();
        Bundle sentBundle = sentIntent.getExtras();
        String sentString = sentBundle.getString("sentValue");
        tvNext.setText(sentString);
    }
}
