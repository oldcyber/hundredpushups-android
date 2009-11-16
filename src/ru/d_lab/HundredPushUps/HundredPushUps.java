package ru.d_lab.HundredPushUps;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//TODO: Переделать main.xml в соответствии с первоначальной концепцией описанной в Google Wave
//TODO: Make preferences for application


public class HundredPushUps extends Activity {

	 public static final String MY_SETTINGS ="FileSettings";
	 
    /** Called when the activity is first created. */
	private Button mFirstInit;
	private Button mGoTraining, mFirstRun;
	String abc;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);      
     
        // применение настроек
        SharedPreferences settings = getSharedPreferences("FileSettings", 0);
        boolean firstRun = settings.getBoolean("FirstRun", true);
        int trainingWeek = settings.getInt("TrainingWeek", 1);
        int trainingDay = settings.getInt("TrainingDay", 1);
        
        if (firstRun == true){
        	abc = "первый запуск";}
        else
        	{abc = "повторный запуск";}
        
        // UserInfo welcome text
        int uDay=2; int uWeek=3; int uLevel = 2;
        TextView tv1 = (TextView) findViewById(R.id.TextView01);
        tv1.setText(getString(R.string.tv1T1)+" "+uDay+" "+getString(R.string.tv1T2)+" "+uWeek+" "+getString(R.string.tv1T3)+abc);        
        TextView tv2 = (TextView) findViewById(R.id.TextView02);
        tv2.setText(getString(R.string.tv2T1)+" "+ uLevel);       

        
        // Buttons
            mFirstInit = (Button) findViewById(R.id.FirstInit);
            mFirstInit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
  			Intent intent = new Intent();
  			intent.setClass(this, FirstInit.class);
  			startActivity(intent);
  			finish();
            	//           	setContentView(R.layout.firstinit);
            
          mFirstRun = (Button) findViewById(R.id.FirstRunAgree);
          mFirstRun.setOnClickListener(new View.OnClickListener() {
          	public void onClick(View v) {

          			}
//          	SharedPreferences settings = getSharedPreferences("FileSettings", 0);
//            	SharedPreferences.Editor editor = settings.edit();
//            	editor.putBoolean("FirstRun", false);
//            	editor.commit();
//          	setContentView(R.layout.main);
//          	}

          });
            }   
            
            });
            mGoTraining = (Button) findViewById(R.id.GoTraining);
            mGoTraining.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            setContentView(R.layout.training);
            }
        });
//            mFirstRun = (Button) findViewById(R.id.FirstRunAgree);
//            mFirstRun.setOnClickListener(new View.OnClickListener() {
//            	public void onClick(View v) {
//            	setContentView(R.layout.main);
//            	}
//
//            });
    
    
    }

//    @Override
//    protected void onStop(){
//       super.onStop();
//        SharedPreferences settings = getSharedPreferences("FileSettings", 0);
//    	SharedPreferences.Editor editor = settings.edit();
//    	editor.putBoolean("FirstRun", true);
//    	editor.commit();
//    }
//    
    //home_menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }       
    // обработка пунктов меню в home_menu
	public boolean onOptionsItemSelected(MenuItem item) {

		switch (item.getItemId()) {
		case R.id.AboutMenuItem:
			mWindowAbout.makeDialog(this).show();
			return true;
		case R.id.ExitMenuItem:
			//Activity.finishActivity(this);
			finish();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
    
}