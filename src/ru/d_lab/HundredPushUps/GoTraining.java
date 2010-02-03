package ru.d_lab.HundredPushUps;

import ru.d_lab.HundredPushUps.tools.MakePlan;
import ru.d_lab.HundredPushUps.tools.TrainingWindow;
import ru.d_lab.HundredPushUps.tools.WriteResult;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.DialogInterface.OnDismissListener;
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
        final int trainingWeek = settings.getInt("TrainingWeek", 1);
    	final int trainingDay = settings.getInt("TrainingDay", 1);
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
                    	if (trainingWeek < 5){
                    		saveResult();
                    		}
                    	else if (trainingWeek > 4){
                    		if (trainingDay == 1){
                    			//showDialog(DIALOG_REST_2);
                    			saveResult();
                    		}
                    		else {
                    		showDialog(DIALOG_REST_5);
                    		}
                    	}
                    } 
                })  
                .create(); 

        case DIALOG_6:
        	LayoutInflater factory6 = LayoutInflater.from(this); 
            final View textEntryView6 = factory6.inflate(R.layout.gotraining, null); 
            TextView tv26 = (TextView) textEntryView6.findViewById(R.id.goTrainingText);
            tv26.setText(cPlan[5]);
            return new AlertDialog.Builder(GoTraining.this) 
                .setIcon(R.drawable.light) 
                .setTitle(R.string.Training6) 
                .setView(textEntryView6)
                .setPositiveButton(R.string.dialog_Next, new DialogInterface.OnClickListener() { 
                    public void onClick(DialogInterface dialog, int whichButton) { 
                    	showDialog(DIALOG_REST_6);
                    } 
                })  
                .create(); 

        case DIALOG_7:
        	LayoutInflater factory7 = LayoutInflater.from(this); 
            final View textEntryView7 = factory7.inflate(R.layout.gotraining, null); 
            TextView tv27 = (TextView) textEntryView7.findViewById(R.id.goTrainingText);
            tv27.setText(cPlan[6]);
            return new AlertDialog.Builder(GoTraining.this) 
                .setIcon(R.drawable.light) 
                .setTitle(R.string.Training7) 
                .setView(textEntryView7)
                .setPositiveButton(R.string.dialog_Next, new DialogInterface.OnClickListener() { 
                    public void onClick(DialogInterface dialog, int whichButton) { 
                    	if (trainingWeek == 5){
                    		// do save
                    		saveResult();
                    	}
                    	else {
                    	showDialog(DIALOG_REST_7);
                    	}
                    } 
                })  
                .create(); 

        case DIALOG_8:
        	LayoutInflater factory8 = LayoutInflater.from(this); 
            final View textEntryView8 = factory8.inflate(R.layout.gotraining, null); 
            TextView tv28 = (TextView) textEntryView8.findViewById(R.id.goTrainingText);
            tv28.setText(cPlan[7]);
            return new AlertDialog.Builder(GoTraining.this) 
                .setIcon(R.drawable.light) 
                .setTitle(R.string.Training8) 
                .setView(textEntryView8)
                .setPositiveButton(R.string.dialog_Next, new DialogInterface.OnClickListener() { 
                    public void onClick(DialogInterface dialog, int whichButton) { 
                    	showDialog(DIALOG_REST_8);
                    } 
                })  
                .create(); 

        case DIALOG_9:
        	LayoutInflater factory9 = LayoutInflater.from(this); 
            final View textEntryView9 = factory9.inflate(R.layout.gotraining, null); 
            TextView tv29 = (TextView) textEntryView9.findViewById(R.id.goTrainingText);
            tv29.setText(cPlan[8]);
            return new AlertDialog.Builder(GoTraining.this) 
                .setIcon(R.drawable.light) 
                .setTitle(R.string.Training6) 
                .setView(textEntryView9)
                .setPositiveButton(R.string.dialog_Next, new DialogInterface.OnClickListener() { 
                    public void onClick(DialogInterface dialog, int whichButton) { 
                    	//showDialog(DIALOG_SAVE);
                    	saveResult();
                    	
                    } 
                })  
                .create(); 

//-------------------------------------------------------------------------------------           

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
         	
        case DIALOG_REST_5:
        	Dialog dialog5 = new Dialog(this);
        	dialog5.setContentView(R.layout.timer);
        	dialog5.setTitle(R.string.Rest);
        	final TextView tv15 = (TextView) dialog5.findViewById(R.id.TimerText);
            new CountDownTimer(restTime, 1000) {
                public void onTick(long millisUntilFinished) {
                    tv15.setText(" "+millisUntilFinished / 1000+" ");
                }
                public void onFinish() {
                showDialog(DIALOG_6);
                removeDialog(15);
                }
             }.start(); 
         	return dialog5;

        case DIALOG_REST_6:
        	Dialog dialog6 = new Dialog(this);
        	dialog6.setContentView(R.layout.timer);
        	dialog6.setTitle(R.string.Rest);
        	final TextView tv16 = (TextView) dialog6.findViewById(R.id.TimerText);
            new CountDownTimer(restTime, 1000) {
                public void onTick(long millisUntilFinished) {
                    tv16.setText(" "+millisUntilFinished / 1000+" ");
                }
                public void onFinish() {
               	showDialog(DIALOG_7);
                removeDialog(16);
                }
             }.start(); 
         	return dialog6;
         	
        case DIALOG_REST_7:
        	Dialog dialog7 = new Dialog(this);
        	dialog7.setContentView(R.layout.timer);
        	dialog7.setTitle(R.string.Rest);
        	final TextView tv17 = (TextView) dialog7.findViewById(R.id.TimerText);
            new CountDownTimer(restTime, 1000) {
                public void onTick(long millisUntilFinished) {
                    tv17.setText(" "+millisUntilFinished / 1000+" ");
                }
                public void onFinish() {
                showDialog(DIALOG_8);
                removeDialog(17);
                }
             }.start(); 
         	return dialog7;
         	
        case DIALOG_REST_8:
        	Dialog dialog8 = new Dialog(this);
        	dialog8.setContentView(R.layout.timer);
        	dialog8.setTitle(R.string.Rest);
        	final TextView tv18 = (TextView) dialog8.findViewById(R.id.TimerText);
            new CountDownTimer(restTime, 1000) {
                public void onTick(long millisUntilFinished) {
                    tv18.setText(" "+millisUntilFinished / 1000+" ");
                }
                public void onFinish() {
                showDialog(DIALOG_9);
                removeDialog(18);
                }
             }.start(); 
         	return dialog8;
 
        case DIALOG_SAVE:
        	
        	/*
        	final WriteResult wr = new WriteResult(this);
            wr.setTitle(R.string.EndTraining);
            wr.setCancelable(false);
            wr.show();
            */
        	
        	/*
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
            .create(); */   	
    	}
    	saveResult();
    	return null;
	}	
	private void saveResult(){
	final WriteResult wr = new WriteResult(this);
    wr.setTitle(R.string.EndTraining);
    wr.setCancelable(false);
    wr.show();
	}
	
    // Button Listener	
	public void onClick(View v)
    {	
		switch (v.getId())
    	{
		case R.id.BeginTraining:
    	{
    		int num_tr=0;
    		long time_rest = 1000;
    		//reading config
    		SharedPreferences settings = getSharedPreferences("FileSettings", 0);
    		int trainingWeek = settings.getInt("TrainingWeek", 1);
    		int trainingDay = settings.getInt("TrainingDay", 1);
    		int trainingLevel = settings.getInt("TrainingLevel", 0);
    		
    		//calculate data
    		MakePlan WeekPlan = new MakePlan(trainingLevel, trainingDay, trainingWeek);
    		String[] cPlan = WeekPlan.gettTrainingPlan(this);
			
    		//begin training
    		
    		Dialog[] dialogs = new Dialog[cPlan.length];
    		for (int i = 0; i < cPlan.length; i++) {
    			final TrainingWindow tw = new TrainingWindow(this, cPlan[i], i);
    			dialogs[i]= tw;
    		}
    		for (int i = 0; i < cPlan.length-1; i++) {
    			//dialogs[i].setNextDialog(dialogs[i+1]);
    			
    		}
    		dialogs[1].show();
    		
/*    		int num_dialog=0;
			if (num_dialog<cPlan.length){
    			dialogs[num_dialog].show();
    			num_dialog = num_dialog+1;
    		}*/
        		/*tw.setOnDismissListener(new OnDismissListener() { 
        			public void onDismiss(DialogInterface arg0) { 
        				//tw.cancel();
        				//rw.show(); 
        				} */
 
    		
    		break;
    	}
    	default:
    		break;
    	}
    }

}

