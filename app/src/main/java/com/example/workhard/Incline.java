package com.example.workhard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Incline extends AppCompatActivity {

    TextView timerValue;
    private static  final long START_TIME_IN_MILLIS = 60000;
    private CountDownTimer countDownTimer;
    private boolean mTimerRunning;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incline);

//        int points=((GlobalClass) getApplicationContext()).points;
//        points = points + 5;

        timerValue = (TextView)findViewById(R.id.timerValue);

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