package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.AsyncTask;
import android.view.View;
import java.io.OutputStream;
import java.net.URL;
import java.net.*;
import java.io.*;

public class GIF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gif);
    }

    public void goBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    public class CallAPI extends AsyncTask<String, String, String> {

        public CallAPI(){
            //set context variables if required
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(String... params) {
            String urlString = params[0]; // URL to call
            String data = params[1]; //data to post
            OutputStream out = null;

            try {
                URL url = new URL(urlString);
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                out = new BufferedOutputStream(urlConnection.getOutputStream());

                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out, "UTF-8"));
                writer.write(data);
                writer.flush();
                writer.close();
                out.close();

                urlConnection.connect();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}