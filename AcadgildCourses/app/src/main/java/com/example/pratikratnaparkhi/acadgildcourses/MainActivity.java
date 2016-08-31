package com.example.pratikratnaparkhi.acadgildcourses;

import android.app.Activity;
import android.app.backup.FullBackupDataOutput;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void java(View view) {

        String button_text;
        button_text =( (Button) view).getText().toString();

        if(button_text.equals("Java"))
        {

       Intent intent = new Intent(this, Java_Activity.class);
       startActivity(intent);

        }
        else if(button_text.equals("Android Development")){

       Intent intent = new Intent(this, Android.class);
        startActivity(intent);

        }

        else if(button_text.equals("FrontEnd Development")){

            Intent intent = new Intent(this, Frontend.class);
            startActivity(intent);

        }
        else if(button_text.equals("Big Data")){

            Intent intent = new Intent(this, Big_Data.class);
            startActivity(intent);

        }else if(button_text.equals("Digital Marketing")){

            Intent intent = new Intent(this, digitalMarketing.class);
            startActivity(intent);

        }else if(button_text.equals("Scala Programming")){

            Intent intent = new Intent(this, calaProgramming.class);
            startActivity(intent);

        }else if(button_text.equals("NodeJS")){

            Intent intent = new Intent(this, NodeJs.class);
            startActivity(intent);

        }else if(button_text.equals("FullStack Web Developer")){

            Intent intent = new Intent(this, FulStackWeb.class);
            startActivity(intent);

        }else if(button_text.equals("Advance J2e")){

            Intent intent = new Intent(this, advanceJ2ee.class);
            startActivity(intent);

        }else if(button_text.equals("Robotics")){

            Intent intent = new Intent(this, robotics.class);
            startActivity(intent);

        }else if(button_text.equals("Business Analytics")){

            Intent intent = new Intent(this, BusinessAnalytics.class);
            startActivity(intent);

        }else if(button_text.equals("Cloud ComputingR")){

            Intent intent = new Intent(this, loudComputing.class);
            startActivity(intent);

        }else if(button_text.equals("ApacheSpark")){

            Intent intent = new Intent(this, ApacheSpark.class);
            startActivity(intent);

        }else if(button_text.equals("Data Science")){

            Intent intent = new Intent(this, DataScience.class);
            startActivity(intent);

        }else if(button_text.equals("Arduino")){

            Intent intent = new Intent(this, Arduino.class);
            startActivity(intent);

        }else if(button_text.equals("RaspberryPi")){

            Intent intent = new Intent(this, Raspberry.class);
            startActivity(intent);

        }else if(button_text.equals("unity2D")){

            Intent intent = new Intent(this, unity2d.class);
            startActivity(intent);

        }

        else if(button_text.equals("iOS programming")){

            Intent intent = new Intent(this, iosdeveloper.class);
            startActivity(intent);

        }

        else if(button_text.equals("React JS")){

            Intent intent = new Intent(this, Reactjs.class);
            startActivity(intent);

        }

        else if(button_text.equals("Ethical Hacking")){

            Intent intent = new Intent(this, ethicalHack.class);
            startActivity(intent);

        }

        else if(button_text.equals("ITIL")){

            Intent intent = new Intent(this, til.class);
            startActivity(intent);

        }


        else if(button_text.equals("Prince2")){

            Intent intent = new Intent(this, prince2.class);
            startActivity(intent);

        }
        else if(button_text.equals("Machine Learning")){

            Intent intent = new Intent(this, mAchiinelearning.class);
            startActivity(intent);

        }
        else if(button_text.equals("MongoDB")){

            Intent intent = new Intent(this, MongoDb.class);
            startActivity(intent);

        }




    }











}





