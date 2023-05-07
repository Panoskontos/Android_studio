package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tview;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        R = Resourses
        tview = findViewById(R.id.textView);
    }


    public void go1(View view){
        tview.setText("Panos1");
    }

    public void go2(View view){
        Intent intent = new Intent( this, MainActivity2.class);
        startActivity(intent);
    }


}