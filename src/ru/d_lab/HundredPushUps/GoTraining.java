package ru.d_lab.HundredPushUps;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class GoTraining extends Activity implements OnClickListener {
	/** Called when the activity is first created. */
	private static final int DIALOG_1 = 1;
	private static final int DIALOG_REST=5;
	
	@Override
public void onCreate(Bundle savedInstanceState)
{
super.onCreate(savedInstanceState);
setContentView(R.layout.training);

//Load application preferences
SharedPreferences settings = getSharedPreferences("FileSettings", 0);
int trainingWeek = settings.getInt("TrainingWeek", 1);
int trainingDay = settings.getInt("TrainingDay", 1);
int trainingLevel = settings.getInt("TrainingLevel", 0);
TextView tv1 = (TextView) findViewById(R.id.Trainig1);
TextView tv2 = (TextView) findViewById(R.id.Trainig2);
TextView tv3 = (TextView) findViewById(R.id.Trainig3);
TextView tv4 = (TextView) findViewById(R.id.Trainig4);
TextView tv5 = (TextView) findViewById(R.id.Trainig5); 
String[] cPlan = null;
//trainingLevel = 1;

if (trainingWeek==1){
	if (trainingDay==1){
		if (trainingLevel==1){cPlan = this.getResources().getStringArray(R.array.week1day1level1);}
		else if (trainingLevel==2){cPlan = this.getResources().getStringArray(R.array.week1day1level2);}
		else {cPlan = this.getResources().getStringArray(R.array.week1day1level3);}
	}
	else if (trainingDay==2){
		if (trainingLevel==1){cPlan = this.getResources().getStringArray(R.array.week1day2level1);}
		else if (trainingLevel==2){cPlan = this.getResources().getStringArray(R.array.week1day2level2);}
		else {cPlan = this.getResources().getStringArray(R.array.week1day2level3);}
	}
	else if(trainingDay==3){
		if (trainingLevel==1){cPlan = this.getResources().getStringArray(R.array.week1day3level1);}
		else if (trainingLevel==2){cPlan = this.getResources().getStringArray(R.array.week1day3level2);}
		else {cPlan = this.getResources().getStringArray(R.array.week1day3level3);}
	
	}

}

tv1.setText(cPlan[0]);
tv2.setText(cPlan[1]);
tv3.setText(cPlan[2]);
tv4.setText(cPlan[3]);
tv5.setText("max ("+getText(R.string.TrainingMax)+" "+cPlan[4]+")");

Button mFirstRunOk = (Button)findViewById(R.id.BeginTraining);
mFirstRunOk.setOnClickListener(this);


}

	@Override

	protected Dialog onCreateDialog(int id) {
		
		SharedPreferences settings = getSharedPreferences("FileSettings", 0);
        long restTime = settings.getLong("RestTime", 10);
        restTime = restTime*1000;
        
		switch (id) {
        case DIALOG_1:
        	return new AlertDialog.Builder(GoTraining.this)
            //.setIcon(R.drawable.light)
            .setTitle(R.string.Training1)
            .setMessage("")
            .setPositiveButton(R.string.Ok, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                	showDialog(DIALOG_REST);
                }
            })		
            .create();
        
        case DIALOG_REST:
        	Dialog dialog = new Dialog(this);
        	dialog.setContentView(R.layout.timer);
        	dialog.setTitle("Rest Time!");
        	final TextView tv1 = (TextView) dialog.findViewById(R.id.TimerText);
            new CountDownTimer(restTime, 1000) {
                public void onTick(long millisUntilFinished) {
                    tv1.setText("seconds remaining: " + millisUntilFinished / 1000);
                }
                public void onFinish() {
                showDialog(DIALOG_1);
                removeDialog(5);
                //dismissDialog(5);
                }
             }.start(); 
         	return dialog;
		}
		return null;
	}	
	
	public void onClick(View v)
    {
		switch (v.getId())
    	{
		case R.id.BeginTraining:
    	{
    		showDialog(DIALOG_1);
    		break;
    	}
    	default:
    		break;
    	}
		/*
		Intent intent = new Intent();
        intent.setClass(this, Timer.class);
        startActivity(intent);
        */
    }
}

