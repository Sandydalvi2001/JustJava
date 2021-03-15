package com.example.workhard;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class Deadlifts extends AppCompatActivity {

    TextView timerValue;
    Button end;
//    Button end;
    private static  final long START_TIME_IN_MILLIS = 60000;
    private boolean mTimerRunning;
    private CountDownTimer countDownTimer;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deadlifts);

//        String points=getIntent().getStringExtra("Points");
//        int score =Integer.parseInt(points);

//        int points=((GlobalClass) getApplicationContext()).points;
//        points = points + 5;

        timerValue = (TextView)findViewById(R.id.timerValue);
        end = (Button) findViewById(R.id.end);
//        end = (Button)findViewById(R.id.end);


        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Deadlifts.this,EndActivity.class);
                try {
//                    intent.putExtra("Points",score);
                    startActivity(intent);
                }
                catch (Exception e)
                {
                    Toast.makeText(Deadlifts.this, "Error ", Toast.LENGTH_SHORT).show();
                }
            }
        });

        startTimer();
    }

    private void startTimer()
    {
        countDownTimer = new CountDownTimer(mTimeLeftInMillis,1000){
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();
            }
        }.start();
        mTimerRunning=true;
    }

    private void updateCountDownText(){
        int minutes = (int)(mTimeLeftInMillis/1000)/60;
        int seconds = (int)(mTimeLeftInMillis/1000)%60;

        String timeLeft = String.format(Locale.getDefault(),"%02d:%02d",minutes,seconds);
        timerValue.setText(timeLeft);
    }

}