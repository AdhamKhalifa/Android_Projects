/*
        Adham Khalifa
        COM 350
        Homework 1
        Submitted on 02/06/2022
 */


package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
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
        TextView text = findViewById(R.id.textView); // Identifying the textView
        EditText name = findViewById(R.id.editTextTextPersonName); // Identifying the EditText name
    // Checking if the name input is empty to throw an error
        if (name.getText().toString().equals("") ) {
            text.setTextColor(Color.parseColor("#FF0000"));
            text.setText("Error: Please write your name!");
        }else { // If not
            int ascii = name.getText().toString().charAt(0); // This variable stores the ASCII value of the first letter of the name as an initialization
            int sum = 0;  // This is the sum of the ASCII variables
            for (int i=0; i<name.length(); i++) {   // Looping over the characters and adding up their values
                ascii = name.getText().toString().charAt(i);
                sum = sum + ascii;
            }
            text.setTextColor(Color.parseColor("#000000"));     // Changing the color
            text.setText("Hi, " + name.getText() + "!" + "\r\n" + "Did you know that your name has an ASCII value of " + sum +"?");     // Saying hi and returning the ASCII value
        }
    }

}