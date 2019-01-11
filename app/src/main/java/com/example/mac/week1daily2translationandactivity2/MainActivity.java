package com.example.mac.week1daily2translationandactivity2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String savedString = new String("");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tvOne:
                savedString = ((TextView) view).getText().toString();
                break;
            case R.id.tvTwo:
                savedString = ((TextView) view).getText().toString();
                break;
            case R.id.tvThree:
                savedString = ((TextView) view).getText().toString();
                break;
            case R.id.tvFour:
                savedString = ((TextView) view).getText().toString();
                break;
            case R.id.tvFive:
                savedString = ((TextView) view).getText().toString();
                break;
            case R.id.btn:
                Intent intent = new Intent(this, NextActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("sentValue", savedString);
                intent.putExtras(bundle);
                startActivity(intent);
        }
    }
}
