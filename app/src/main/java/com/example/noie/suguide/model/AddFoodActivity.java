package com.example.noie.suguide.model;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.noie.suguide.R;

public class AddFoodActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_food);

        Spinner spinner = findViewById(R.id.SpinnerFoodTypeChoose);
        ArrayAdapter<CharSequence> ChooseType = ArrayAdapter.createFromResource(this,R.array.name,android.R.layout.simple_spinner_item);
        ChooseType.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(ChooseType);
        spinner.setOnItemClickListener((AdapterView.OnItemClickListener) this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
         String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),text,Toast.LENGTH_SHORT).show();;
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
