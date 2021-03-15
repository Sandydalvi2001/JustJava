package com.example.workhard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Shoulder extends AppCompatActivity {

    LinearLayout normalPushup,inclinePushup,declinePushup,diamondPushup,btnexercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulder);

        normalPushup = (LinearLayout)findViewById(R.id.normalPushup);
        inclinePushup = (LinearLayout)findViewById(R.id.inclinePushup);
        declinePushup = (LinearLayout)findViewById(R.id.declinePushup);
        diamondPushup = (LinearLayout)findViewById(R.id.diamondPushup);


        normalPushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Shoulder.this,BarbellOverhead.class);
                startActivity(intent);
            }
        });

        inclinePushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Shoulder.this,Incline.class);
                startActivity(intent);
            }
        });

        declinePushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Shoulder.this,decline.class);
                startActivity(intent);
            }
        });

        diamondPushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Shoulder.this,NormalPushUps.class);
                startActivity(intent);
            }
        });

    }
}