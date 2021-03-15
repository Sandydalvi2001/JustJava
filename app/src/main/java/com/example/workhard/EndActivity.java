package com.example.workhard;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EndActivity extends AppCompatActivity{

    TextView text;
    Button share;
    int tscore=100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        text =(TextView)findViewById(R.id.score);
        share =(Button) findViewById(R.id.share);

//        GlobalClass globalClass = (GlobalClass)getApplicationContext();
//        tscore=(int)globalClass.setPoints();

//      String points=getIntent().getStringExtra("Points");
//        text.setText(tscore);

//        tscore =((GlobalClass) getApplicationContext()).points;
//        text.setText(tscore);


        share.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("QueryPermissionsNeeded")
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_SUBJECT,"Score");
                intent.putExtra(Intent.EXTRA_TEXT,"I have scored :"+tscore+" points in Work Hard fitness app");

                intent.setType("text/plain");
//                intent.setData(Uri.parse("mailto:"));
                if(intent.resolveActivity(getPackageManager())!= null)
                {
                    startActivity(intent);
                }
            }
        });

//        public void share(View view) {
//            Intent intent = new Intent(Intent.ACTION_SEND);
//            intent.putExtra(Intent.EXTRA_SUBJECT, "Secret Message");
//            intent.putExtra(Intent.EXTRA_TEXT, rv);
//
//            intent.setType("text/plain");
////      Intent intent = new Intent(Intent.ACTION_SEND);
////        intent.setData(Uri.parse("mailto:"));
//            if (intent.resolveActivity(getPackageManager()) != null) {
//                startActivity(intent);
//            }
//        }

    }
}