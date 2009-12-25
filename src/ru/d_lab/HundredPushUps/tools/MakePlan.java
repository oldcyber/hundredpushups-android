package ru.d_lab.HundredPushUps.tools;

import ru.d_lab.HundredPushUps.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;

public class MakePlan  extends Activity {

	//@SuppressWarnings("unused")
	private int tLevel, tDay, tWeek;
	
	public MakePlan (final int tLevel, final int tDay, final int tWeek){
		this.tDay = tDay;
		this.tWeek = tWeek;
		this.tLevel = tLevel;
	}
public String[] gettTrainingPlan(Context context) {
		String[] cLocalPlan=null; 
		Resources res = context.getResources();

		//trainingLevel = 1;
		if (tWeek==1){
			if (tDay==1){
				if (tLevel==1){cLocalPlan = res.getStringArray(R.array.week1day1level1);}
				else if (tLevel==2){cLocalPlan = res.getStringArray(R.array.week1day1level2);}
				else {cLocalPlan = res.getStringArray(R.array.week1day1level3);}
			}
			else if (tDay==2){
				if (tLevel==1){cLocalPlan = res.getStringArray(R.array.week1day2level1);}
				else if (tLevel==2){cLocalPlan = res.getStringArray(R.array.week1day2level2);}
				else {cLocalPlan = res.getStringArray(R.array.week1day2level3);}
			}
			else if(tDay==3){
				if (tLevel==1){cLocalPlan = res.getStringArray(R.array.week1day3level1);}
				else if (tLevel==2){cLocalPlan = res.getStringArray(R.array.week1day3level2);}
				else {cLocalPlan = res.getStringArray(R.array.week1day3level3);}
			
			}

		}
		
return cLocalPlan;
			
	}

}
