package com.example.noie.suguide.model;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.noie.suguide.R;

public class MainActivity extends AppCompatActivity {

    ImageButton Add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ImageButton Add = (ImageButton) findViewById(R.id.Addd_Button);
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,AddFoodActivity.class);
                startActivity(i);
            }
        });
        //@SuppressLint("WrongViewCast") Button button = findViewById(R.id.button);
        /*Button Add = findViewById(R.id.Addd_Button);
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,AddFoodActivity.class);
                startActivity(i);
            }
        });*/

    }
}
