package com.example.pratikratnaparkhi.acadgildcourses;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.button1);


    }

    public void java(View view) {

        String button_text;
        button_text =( (Button) view).getText().toString();

        if(button_text.equals("Java"))
        {

       Intent intent = new Intent(this, Java_Activity.class);


        }
        else if(button_text.equals("Android Development")){

       Intent intent = new Intent(this, Android.class);


        }

    }











}





