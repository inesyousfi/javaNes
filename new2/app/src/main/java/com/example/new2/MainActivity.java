package com.example.new2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void open(View view){

        Intent i=new Intent(this,MainActivity3.class);
        startActivity(i);
        Intent ii= new Intent(Intent.ACTION_CALL, Uri.parse("tel:06506506"))





    }


    }
