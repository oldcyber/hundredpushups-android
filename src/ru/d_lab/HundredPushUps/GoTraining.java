package ru.d_lab.HundredPushUps;

import ru.d_lab.HundredPushUps.tools.MakePlan;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TableRow;
import android.widget.TextView;

public class GoTraining extends Activity implements OnClickListener {
	/** Called when the activity is first created. */
	private static final int DIALOG_1 = 1;
	private static final int DIALOG_2 = 2;
	private static final int DIALOG_3 = 3;
	private static final int DIALOG_4 = 4;
	private static final int DIALOG_5 = 5;
	private static final int DIALOG_6 = 11;
	private static final int DIALOG_7 = 12;
	private static final int DIALOG_8 = 13;
	private static final int DIALOG_9 = 14;
	private static final int DIALOG_REST_1=6;
	private static final int DIALOG_REST_2=7;
	private static final int DIALOG_REST_3=8;
	private static final int DIALOG_REST_4=9;
	private static final int DIALOG_REST_5=15;
	private static final int DIALOG_REST_6=16;
	private static final int DIALOG_REST_7=17;
	private static final int DIALOG_REST_8=18;
	private static final int DIALOG_SAVE = 10;
	// Welcome training screen
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

if (trainingWeek < 5){
	TextView tv1 = (TextView) findViewById(R.id.Trainig1);
	TextView tv2 = (TextView) findViewById(R.id.Trainig2);
	TextView tv3 = (TextView) findViewById(R.id.Trainig3);
	TextView tv4 = (TextView) findViewById(R.id.Trainig4);
	TextView tv5 = (TextView) findViewById(R.id.Trainig5);

	MakePlan WeekPlan = new MakePlan(trainingLevel, trainingDay, trainingWeek);
	String[] cPlan = WeekPlan.gettTrainingPlan(this);
		
	tv1.setText(cPlan[0]);
	tv2.setText(cPlan[1]);
	tv3.setText(cPlan[2]);
	tv4.setText(cPlan[3]);
	tv5.setText("max ("+getText(R.string.TrainingMax)+" "+cPlan[4]+")");
}
else if (trainingWeek ==5 ){
	if (trainingDay == 1){
		TextView tv1 = (TextView) findViewById(R.id.Trainig1);
		TextView tv2 = (TextView) findViewById(R.id.Trainig2);
		TextView tv3 = (TextView) findViewById(R.id.Trainig3);
		TextView tv4 = (TextView) findViewById(R.id.Trainig4);
		TextView tv5 = (TextView) findViewById(R.id.Trainig5);

		MakePlan WeekPlan = new MakePlan(trainingLevel, trainingDay, trainingWeek);
		String[] cPlan = WeekPlan.gettTrainingPlan(this);

		tv1.setText(cPlan[0]);
		tv2.setText(cPlan[1]);
		tv3.setText(cPlan[2]);
		tv4.setText(cPlan[3]);
		tv5.setText("max ("+getText(R.string.TrainingMax)+" "+cPlan[4]+")");	
	}
	else {
	TextView tv1 = (TextView) findViewById(R.id.Trainig1);
	TextView tv2 = (TextView) findViewById(R.id.Trainig2);
	TextView tv3 = (TextView) findViewById(R.id.Trainig3);
	TextView tv4 = (TextView) findViewById(R.id.Trainig4);
	TextView tv5 = (TextView) findViewById(R.id.Trainig5);
	TextView tv6 = (TextView) findViewById(R.id.Trainig6);
	TextView tv7 = (TextView) findViewById(R.id.Trainig7);
	
	MakePlan WeekPlan = new MakePlan(trainingLevel, trainingDay, trainingWeek);
	String[] cPlan = WeekPlan.gettTrainingPlan(this);
		
	TableRow rec6 = (TableRow)findViewById(R.id.TTrainig6);
	rec6.setVisibility(View.VISIBLE);
	TableRow rec7 = (TableRow)findViewById(R.id.TTrainig6);
	rec7.setVisibility(View.VISIBLE);
		
	tv1.setText(cPlan[0]);
	tv2.setText(cPlan[1]);
	tv3.setText(cPlan[2]);
	tv4.setText(cPlan[3]);
	tv5.setText(cPlan[4]);
	tv6.setText(cPlan[5]);
	tv7.setText("max ("+getText(R.string.TrainingMax)+" "+cPlan[6]+")");
	}
}
	
else if (trainingWeek == 6){
	if (trainingDay == 1){
	TextView tv1 = (TextView) findViewById(R.id.Trainig1);
	TextView tv2 = (TextView) findViewById(R.id.Trainig2);
	TextView tv3 = (TextView) findViewById(R.id.Trainig3);
	TextView tv4 = (TextView) findViewById(R.id.Trainig4);
	TextView tv5 = (TextView) findViewById(R.id.Trainig5);

	MakePlan WeekPlan = new MakePlan(trainingLevel, trainingDay, trainingWeek);
	String[] cPlan = WeekPlan.gettTrainingPlan(this);

	tv1.setText(cPlan[0]);
	tv2.setText(cPlan[1]);
	tv3.setText(cPlan[2]);
	tv4.setText(cPlan[3]);
	tv5.setText("max ("+getText(R.string.TrainingMax)+" "+cPlan[4]+")");
	}
	else {
		TextView tv1 = (TextView) findViewById(R.id.Trainig1);
		TextView tv2 = (TextView) findViewById(R.id.Trainig2);
		TextView tv3 = (TextView) findViewById(R.id.Trainig3);
		TextView tv4 = (TextView) findViewById(R.id.Trainig4);
		TextView tv5 = (TextView) findViewById(R.id.Trainig5);
		TextView tv6 = (TextView) findViewById(R.id.Trainig6);
		TextView tv7 = (TextView) findViewById(R.id.Trainig7);
		TextView tv8 = (TextView) findViewById(R.id.Trainig8);
		TextView tv9 = (TextView) findViewById(R.id.Trainig9);
		
		MakePlan WeekPlan = new MakePlan(trainingLevel, trainingDay, trainingWeek);
		String[] cPlan = WeekPlan.gettTrainingPlan(this);

		TableRow rec6 = (TableRow)findViewById(R.id.TTrainig6);
		rec6.setVisibility(View.VISIBLE);
		TableRow rec7 = (TableRow)findViewById(R.id.TTrainig6);
		rec7.setVisibility(View.VISIBLE);
		TableRow rec8 = (TableRow)findViewById(R.id.TTrainig6);
		rec8.setVisibility(View.VISIBLE);
		TableRow rec9 = (TableRow)findViewById(R.id.TTrainig6);
		rec9.setVisibility(View.VISIBLE);
		
		tv1.setText(cPlan[0]);
		tv2.setText(cPlan[1]);
		tv3.setText(cPlan[2]);
		tv4.setText(cPlan[3]);
		tv5.setText(cPlan[4]);
		tv6.setText(cPlan[5]);
		tv7.setText(cPlan[6]);
		tv8.setText(cPlan[7]);
		tv9.setText("max ("+getText(R.string.TrainingMax)+" "+cPlan[8]+")");		
	}
}



Button mFirstRunOk = (Button)findViewById(R.id.BeginTraining);
mFirstRunOk.setOnClickListener(this);
}
	// Training windows
	@Override

	public Dialog onCreateDialog(int id) {
		
		SharedPreferences settings = getSharedPreferences("FileSettings", 0);
        long restTime = settings.getLong("RestTime", 10);
        restTime = (restTime+1)*1000;
        int trainingWeek = settings.getInt("TrainingWeek", 1);
    	int trainingDay = settings.getInt("TrainingDay", 1);
    	int trainingLevel = settings.getInt("TrainingLevel", 0);    	
    	
    	MakePlan WeekPlan = new MakePlan(trainingLevel, trainingDay, trainingWeek);
    	String[] cPlan = WeekPlan.gettTrainingPlan(this);  	
    	
    	switch (id) {
        case DIALOG_1:
        	
            LayoutInflater factory1 = LayoutInflater.from(this); 
            final View textEntryView1 = factory1.inflate(R.layout.gotraining, null); 
            TextView tv21 = (TextView) textEntryView1.findViewById(R.id.goTrainingText);
            tv21.setText(cPlan[0]);
            return new AlertDialog.Builder(GoTraining.this) 
                .setIcon(R.drawable.light) 
                .setTitle(R.string.Training1) 
                .setView(textEntryView1)
                .setPositiveButton(R.string.dialog_Next, new DialogInterface.OnClickListener() { 
                    public void onClick(DialogInterface dialog, int whichButton) { 
                    	showDialog(DIALOG_REST_1);
                    } 
                })  
                .create(); 
         	
        case DIALOG_2:
        	LayoutInflater factory2 = LayoutInflater.from(this); 
            final View textEntryView2 = factory2.inflate(R.layout.gotraining, null); 
            TextView tv22 = (TextView) textEntryView2.findViewById(R.id.goTrainingText);
            tv22.setText(cPlan[1]);
            return new AlertDialog.Builder(GoTraining.this) 
                .setIcon(R.drawable.light) 
                .setTitle(R.string.Training2) 
                .setView(textEntryView2)
                .setPositiveButton(R.string.dialog_Next, new DialogInterface.OnClickListener() { 
                    public void onClick(DialogInterface dialog, int whichButton) { 
                    	showDialog(DIALOG_REST_2);
                    } 
                })  
                .create(); 

        case DIALOG_3:
        	LayoutInflater factory3 = LayoutInflater.from(this); 
            final View textEntryView3 = factory3.inflate(R.layout.gotraining, null); 
            TextView tv23 = (TextView) textEntryView3.findViewById(R.id.goTrainingText);
            tv23.setText(cPlan[2]);
            return new AlertDialog.Builder(GoTraining.this) 
                .setIcon(R.drawable.light) 
                .setTitle(R.string.Training3) 
                .setView(textEntryView3)
                .setPositiveButton(R.string.dialog_Next, new DialogInterface.OnClickListener() { 
                    public void onClick(DialogInterface dialog, int whichButton) { 
                    	showDialog(DIALOG_REST_3);
                    } 
                })  
                .create(); 
            
        case DIALOG_4:
        	LayoutInflater factory4 = LayoutInflater.from(this); 
            final View textEntryView4 = factory4.inflate(R.layout.gotraining, null); 
            TextView tv24 = (TextView) textEntryView4.findViewById(R.id.goTrainingText);
            tv24.setText(cPlan[3]);
            return new AlertDialog.Builder(GoTraining.this) 
                .setIcon(R.drawable.light) 
                .setTitle(R.string.Training4) 
                .setView(textEntryView4)
                .setPositiveButton(R.string.dialog_Next, new DialogInterface.OnClickListener() { 
                    public void onClick(DialogInterface dialog, int whichButton) { 
                    	showDialog(DIALOG_REST_4);
                    } 
                })  
                .create(); 
            
        case DIALOG_5:
        	LayoutInflater factory5 = LayoutInflater.from(this); 
            final View textEntryView5 = factory5.inflate(R.layout.gotraining, null); 
            TextView tv25 = (TextView) textEntryView5.findViewById(R.id.goTrainingText);
            tv25.setText(cPlan[4]);
            return new AlertDialog.Builder(GoTraining.this) 
                .setIcon(R.drawable.light) 
                .setTitle(R.string.Training5) 
                .setView(textEntryView5)
                .setPositiveButton(R.string.dialog_Next, new DialogInterface.OnClickListener() { 
                    public void onClick(DialogInterface dialog, int whichButton) { 
                    	//showDialog(DIALOG_REST_2);
                    } 
                })  
                .create(); 
        
        case DIALOG_REST_1:
        	Dialog dialog1 = new Dialog(this);
        	dialog1.setContentView(R.layout.timer);
        	dialog1.setTitle(R.string.Rest);
        	final TextView tv11 = (TextView) dialog1.findViewById(R.id.TimerText);
            new CountDownTimer(restTime, 1000) {
                public void onTick(long millisUntilFinished) {
                    tv11.setText(" "+millisUntilFinished / 1000+" ");
                }
                public void onFinish() {
                showDialog(DIALOG_2);
                removeDialog(6);
                //dismissDialog(6);
                }
             }.start(); 
         	return dialog1;
         	
        case DIALOG_REST_2:
        	Dialog dialog2 = new Dialog(this);
        	dialog2.setContentView(R.layout.timer);
        	dialog2.setTitle(R.string.Rest);
        	final TextView tv12 = (TextView) dialog2.findViewById(R.id.TimerText);
            new CountDownTimer(restTime, 1000) {
                public void onTick(long millisUntilFinished) {
                    tv12.setText(" "+millisUntilFinished / 1000+" ");
                }
                public void onFinish() {
                showDialog(DIALOG_3);
                removeDialog(7);
                }
             }.start(); 
         	return dialog2;
         	
        case DIALOG_REST_3:
        	Dialog dialog3 = new Dialog(this);
        	dialog3.setContentView(R.layout.timer);
        	dialog3.setTitle(R.string.Rest);
        	final TextView tv13 = (TextView) dialog3.findViewById(R.id.TimerText);
            new CountDownTimer(restTime, 1000) {
                public void onTick(long millisUntilFinished) {
                    tv13.setText(" "+millisUntilFinished / 1000+" ");
                }
                public void onFinish() {
                showDialog(DIALOG_4);
                removeDialog(8);
                }
             }.start(); 
         	return dialog3;

        case DIALOG_REST_4:
        	Dialog dialog4 = new Dialog(this);
        	dialog4.setContentView(R.layout.timer);
        	dialog4.setTitle(R.string.Rest);
        	final TextView tv14 = (TextView) dialog4.findViewById(R.id.TimerText);
            new CountDownTimer(restTime, 1000) {
                public void onTick(long millisUntilFinished) {
                    tv14.setText(" "+millisUntilFinished / 1000+" ");
                }
                public void onFinish() {
                showDialog(DIALOG_5);
                removeDialog(9);
                }
             }.start(); 
         	return dialog4;
         	//finish
        case DIALOG_SAVE:
        	return new AlertDialog.Builder(GoTraining.this)
        	.setIcon(R.drawable.light)
            .setTitle(R.string.Training5)
        	.setMessage(getText(R.string.TrainigNum)+" "+cPlan[4])
            .setView(getCurrentFocus())
        	.setPositiveButton(R.string.dialog_Next, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                	//showDialog(DIALOG_REST);
                }
            })		
            .create();   	
    	}
		return null;
	}	
	// Button Listener	
	public void onClick(View v)
    {
		switch (v.getId())
    	{
		case R.id.BeginTraining:
    	{
    		showDialog(DIALOG_1);
    		break;
    	}
//		case R.id.dialog_Next:
//		{
//			showDialog(DIALOG_REST_1);
//            removeDialog(1);
//			break;
//		}
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

