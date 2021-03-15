package com.example.workhard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Legs extends AppCompatActivity {

    LinearLayout normalPushup,inclinePushup,declinePushup,diamondPushup,btnexercise;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs);

        normalPushup = (LinearLayout)findViewById(R.id.normalPushup);
        inclinePushup = (LinearLayout)findViewById(R.id.inclinePushup);
        declinePushup = (LinearLayout)findViewById(R.id.declinePushup);
        diamondPushup = (LinearLayout)findViewById(R.id.diamondPushup);

//        String points=getIntent().getStringExtra("Points");
//        final int[] score = {Integer.parseInt(points)};


        normalPushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Legs.this,Squats.class);
                startActivity(intent);
            }
        });

        inclinePushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Legs.this,Lunges.class);
                startActivity(intent);
            }
        });

        declinePushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Legs.this,PlankLeg.class);
                startActivity(intent);
            }
        });

        diamondPushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Legs.this,Deadlifts.class);
                startActivity(intent);
            }
        });

    }
}