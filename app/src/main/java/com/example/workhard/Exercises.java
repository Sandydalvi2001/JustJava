package com.example.workhard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Exercises extends AppCompatActivity {

    int score;

    LinearLayout fitone,fittwo,fitthree,fitfour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);

        fitone = (LinearLayout) findViewById(R.id.fitone);
        fittwo = (LinearLayout) findViewById(R.id.fittwo);
        fitthree = (LinearLayout) findViewById(R.id.fitthree);
        fitfour = (LinearLayout) findViewById(R.id.fitfour);

        fitone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exercises.this,Chest.class);
                GlobalClass globalClass = (GlobalClass)getApplicationContext();
                score = score +30;
                globalClass.setPoints(score);
                startActivity(intent);
            }
        });

        fittwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exercises.this,Biceps.class);
                GlobalClass globalClass = (GlobalClass)getApplicationContext();
                score = score +30;
                globalClass.setPoints(score);
                startActivity(intent);
            }
        });

        fitthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exercises.this,Shoulder.class);
                GlobalClass globalClass = (GlobalClass)getApplicationContext();
                score = score +30;
                globalClass.setPoints(score);
                startActivity(intent);

            }
        });

        fitfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exercises.this,Legs.class);
                GlobalClass globalClass = (GlobalClass)getApplicationContext();
                score = score +30;
                globalClass.setPoints(score);
                startActivity(intent);
            }
        });
    }
}