/**
 * 
 */
package ru.d_lab.HundredPushUps.tools;

import android.app.Activity;

/**
 * @author Old Cyber
 *
 */
public class RestTime  extends Activity {
	private int tDay, tWeek;
	
	public RestTime (final int tDay, final int tWeek){
		this.tDay = tDay;
		this.tWeek = tWeek;
	}
/*	public long getRestTime (Context context){
		Resources res = context.getResources();
		long tRest = 0;
		if (tWeek < 5){
			if (tDay == 1){
				tRest = 60000;
			}
			else if (tDay == 2){
				tRest = 90000;
			}
			else {
				tRest = 120000;
			}
		}
		else if (tWeek <7){
			if (tDay == 1){
				tRest = 60000;
			}
			else {
				tRest = 45000;
			}
		}
		return tRest;
		
	}*/
	public long getRestTime(TrainingDialog trainingDialog) {
		long tRest = 0;
		if (tWeek < 5){
			if (tDay == 1){
				tRest = 60000;
			}
			else if (tDay == 2){
				tRest = 90000;
			}
			else {
				tRest = 120000;
			}
		}
		else if (tWeek <7){
			if (tDay == 1){
				tRest = 60000;
			}
			else {
				tRest = 45000;
			}
		}
		return tRest;
	}
}
        
    		


