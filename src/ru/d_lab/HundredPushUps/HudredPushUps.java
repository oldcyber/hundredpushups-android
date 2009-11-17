package ru.d_lab.HundredPushUps;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class HudredPushUps extends Activity implements OnClickListener {
	
	public static final String MY_SETTINGS ="FileSettings";
	String abc;
	
	/** Called when the activity is first created. */
    @Override
    	public void onCreate(Bundle savedInstanceState) 
    	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //Load application preferences
        SharedPreferences settings = getSharedPreferences("FileSettings", 0);
        boolean firstRun = settings.getBoolean("FirstRun", true);
        int trainingWeek = settings.getInt("TrainingWeek", 1);
        int trainingDay = settings.getInt("TrainingDay", 1);
        int trainingLevel = settings.getInt("TrainingLevel", 0);
        int userAge = settings.getInt("UserAge", 0);
 
        //check applications state and set button text
        if (firstRun == true)
        {
        	Button mFirstInit = (Button)findViewById(R.id.FirstInit);
        	mFirstInit.setText("Кнопка 1");
        	abc = "первый запуск";
        	mFirstInit.setOnClickListener(this);
        	
        }
        else
        {
           	Button mFirstInit = (Button)findViewById(R.id.FirstInit);
        	mFirstInit.setText("Начать тренировку");
        	abc = "повторный запуск";
        	mFirstInit.setOnClickListener(this);
        }
        
        /** Temporary blocked
    	//Continue training
    	Button mGoTraining = (Button)findViewById(R.id.GoTraining);
    	mGoTraining.setOnClickListener(this);
    	*/
        
        //init main screen
        TextView tv1 = (TextView) findViewById(R.id.TextView01);
        tv1.setText(getString(R.string.tv1T1)+" "+trainingDay+" "+getString(R.string.tv1T2)+" "+trainingWeek+" "+getString(R.string.tv1T3)+" и это "+ abc);        
        TextView tv2 = (TextView) findViewById(R.id.TextView02);
        tv2.setText(getString(R.string.tv2T1)+" "+ trainingLevel);       
    	}
    
    /** Buttons */
    public void onClick(View v)
    {
    	switch (v.getId())
    	{
    	case R.id.FirstInit:
    	{
    		Intent intent = new Intent();
            intent.setClass(this, FirstInit.class);
            startActivity(intent);
            break;
    	}
    	/** Temporary blocked
    	case R.id.GoTraining:
    	{
    		break;
    	}
    	*/
    	default:
    		break;
    	}
    	
    }
}
