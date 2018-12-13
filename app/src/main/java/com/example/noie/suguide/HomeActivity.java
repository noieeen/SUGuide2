package com.example.noie.suguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class HomeActivity extends AppCompatActivity {

    //ImageButton HomeSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button HomeSave = findViewById(R.id.HomeSave_Button);
        HomeSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(HomeActivity.this,AddFoodActivity.class);
                startActivity(j);
            }
        });

       Button FoodList = findViewById(R.id.HomeFoodList_Button);
        FoodList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(i);
            }
        });



    }
}