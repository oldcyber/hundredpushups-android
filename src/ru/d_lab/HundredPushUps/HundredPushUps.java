package ru.d_lab.HundredPushUps;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class HundredPushUps extends Activity implements OnClickListener {
	
	public static final String MY_SETTINGS ="FileSettings";
	boolean sfirstrun;
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
        //int trainingLevel = settings.getInt("TrainingLevel", 0);
        int userLevel = settings.getInt("UserLevel", 0);
        //int userAge = settings.getInt("UserAge", 0);
        
       //boolean firstRun = true;
        //check applications state and set button text
        if (firstRun == true)
        {
        	Button mFirstInit = (Button)findViewById(R.id.MainButton);
        	mFirstInit.setText("начать тестирование");
        	mFirstInit.setOnClickListener(this);
        	
        }
        else
        {
           	Button mFirstInit = (Button)findViewById(R.id.MainButton);
        	mFirstInit.setText("начать тренировку");
        	mFirstInit.setOnClickListener(this);
        }
        
        //Go settings
    	Button mGoSettings = (Button)findViewById(R.id.ConfigurationButton);
    	mGoSettings.setOnClickListener(this);
    	//Go stats
    	Button mGoStats = (Button)findViewById(R.id.StatsButton);
    	mGoStats.setOnClickListener(this);
        
        //init main screen
        TextView tv1 = (TextView) findViewById(R.id.TextView01);
        TextView tv2 = (TextView) findViewById(R.id.TextView02);
        String[] dweek = this.getResources().getStringArray(R.array.tweeks);
        String[] dday = this.getResources().getStringArray(R.array.tdays);
        if (firstRun == true)
        {
        	tv1.setText(getString(R.string.tv1T2));
        	tv2.setText(getString(R.string.tv2T1)+" "+ getString(R.string.tv2T2));
        }
        else
        {
        tv1.setText(getString(R.string.tv1T1)+" "+dday[trainingDay-1]+" "+dweek[trainingWeek-1]);        
        tv2.setText(getString(R.string.tv2T1)+" "+ userLevel);
        }
        sfirstrun = firstRun;       
    	}
    
    /** Buttons */
    public void onClick(View v)
    {
    	switch (v.getId())
    	{
    	case R.id.MainButton:
    	{
    		Intent intent = new Intent();
 			if (sfirstrun == true)
    		intent.setClass(this, FirstInit.class);
            else
    		intent.setClass(this, GoTraining.class);
            startActivity(intent);	
    		break;
    	}
    	case R.id.ConfigurationButton:
    	{
    		Intent intent = new Intent();
    		intent.setClass(this, Configuration.class);
    		startActivity(intent);
    		break;
    	}
       	case R.id.StatsButton:
    	{
    		Intent intent = new Intent();
    		intent.setClass(this, GoStats.class);
    		startActivity(intent);
    		break;
    	}
    	default:
    		break;
    	}
    	
    }
}
