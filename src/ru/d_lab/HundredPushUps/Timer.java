package ru.d_lab.HundredPushUps;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class Timer extends Activity {
    //Chronometer mChronometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
             
        setContentView(R.layout.timer);
        SharedPreferences settings = getSharedPreferences("FileSettings", 0);
        long restTime = settings.getLong("RestTime", 10);
        restTime = restTime*1000;
        new CountDownTimer(restTime, 1000) {

            public void onTick(long millisUntilFinished) {
            	TextView tv1 = (TextView) findViewById(R.id.TimerText);
                tv1.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
            	TextView tv1 = (TextView) findViewById(R.id.TimerText);
            	tv1.setText("done!");
            }
         }.start();  
    }
}
