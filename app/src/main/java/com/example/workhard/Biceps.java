package com.example.workhard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Biceps extends AppCompatActivity {

    LinearLayout normalPushup,inclinePushup,declinePushup,diamondPushup,btnexercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biceps);

        normalPushup = (LinearLayout)findViewById(R.id.normalPushup);
        inclinePushup = (LinearLayout)findViewById(R.id.inclinePushup);
        declinePushup = (LinearLayout)findViewById(R.id.declinePushup);
        diamondPushup = (LinearLayout)findViewById(R.id.diamondPushup);

        normalPushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Biceps.this,TakeWeights.class);
                startActivity(intent);
            }
        });

        inclinePushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Biceps.this,Incline.class);
                startActivity(intent);
            }
        });

        declinePushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Biceps.this,decline.class);
                startActivity(intent);
            }
        });

        diamondPushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Biceps.this,Diamond.class);
                startActivity(intent);
            }
        });
    }
}