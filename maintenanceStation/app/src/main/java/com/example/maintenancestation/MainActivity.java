package com.example.maintenancestation;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText user;
    EditText pass;
    Button tap;
    ImageView google;
    ImageView twitter;
    ImageView facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tap = findViewById(R.id.press);
        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);
        google=findViewById(R.id.google);
        twitter=findViewById(R.id.twitterr);
        facebook=findViewById(R.id.facebook);

        SharedPreferences mypref = getSharedPreferences("mydata", Context.MODE_PRIVATE);
        if (mypref.contains("user" + "pass")) {
            user.setVisibility(View.GONE);
            pass.setVisibility(View.GONE);


        }
    }