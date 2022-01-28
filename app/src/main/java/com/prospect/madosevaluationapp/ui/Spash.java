package com.prospect.madosevaluationapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.prospect.madosevaluationapp.R;


public class Spash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final int SPLASH_TIME_OUT = 5000;
        setContentView(R.layout.activity_spash);

        // now we create the handler : what will count the time in my device
        //post delayed checks for a timing before executing a function
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //dictate where to move next
                Intent intent = new Intent(Spash.this, Login.class);
                startActivity(intent);
                finish();
            }

        },SPLASH_TIME_OUT);
    }
}