package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String tag = "LifeCycle Event";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "Message");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(tag, "In OnStart");
    }
}