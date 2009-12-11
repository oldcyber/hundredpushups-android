package ru.d_lab.HundredPushUps;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class GoTraining extends Activity implements OnClickListener {
	/** Called when the activity is first created. */
	private static final int DIALOG_1 = 1;
	
	@Override
    protected Dialog onCreateDialog(int id) {
		switch (id) {
        case DIALOG_1:
        	return new AlertDialog.Builder(GoTraining.this)
            .setIcon(R.drawable.light)
            .setTitle(R.string.WelcomeFirstInit)
            .setMessage(R.string.WelcomeFirstInit1)
            .setPositiveButton(R.string.Ok, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                	//setContentView(R.layout.firstinitinit);
                    /* User clicked OK so do some stuff */
                }
            })		
            .create();
		
		}
		return null;
	}
	
	
	
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
TextView tv1 = (TextView) findViewById(R.id.TextView01);
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

tv1.setText("План тренировки: "+cPlan[0]+" / "+cPlan[1]+" / "+cPlan[2]+" / "+cPlan[3]+" Финальная попытка: <b>"+cPlan[4]+"</b>");


Button mFirstRunOk = (Button)findViewById(R.id.BeginTraining);
mFirstRunOk.setOnClickListener(this);
}
	public void onClick(View v)
    {
		showDialog(DIALOG_1);	
		
		//Intent intent = new Intent();
        //intent.setClass(this, HundredPushUps.class);
        //startActivity(intent);
    }
}

