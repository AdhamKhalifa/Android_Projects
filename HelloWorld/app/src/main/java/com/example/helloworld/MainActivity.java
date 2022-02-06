/*
        Adham Khalifa
        COM 350
        Homework 1
        Submitted on 04/02/2022
 */


package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This method will be called upon button click
    public void startClicked(View view) {
        TextView text = findViewById(R.id.textView);
        EditText name = findViewById(R.id.editTextTextPersonName);

        if (name.getText().toString().equals("") ) {
            text.setTextColor(Color.parseColor("#FF0000"));
            text.setText("Error: Please write your name!");
        }else {
            text.setTextColor(Color.parseColor("#000000"));
            text.setText("Hi, " + name.getText() + "!");
        }
    }

    public void anotherActivityClicked(View view) {
        Intent intent = new Intent(this, GIF.class);
        startActivity(intent);
    }
}