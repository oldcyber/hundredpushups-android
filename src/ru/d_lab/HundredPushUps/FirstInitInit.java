package ru.d_lab.HundredPushUps;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class FirstInitInit extends Activity implements OnClickListener {

	/** Called when the activity is first created. */
	@Override
public void onCreate(Bundle savedInstanceState)
{
super.onCreate(savedInstanceState);
setContentView(R.layout.firstinitinit);

//Confirm training level
Button mFirstRunAgree = (Button)findViewById(R.id.FirstRunAgree);
mFirstRunAgree.setOnClickListener(this);

}
	public void onClick(View v)
    {
		//read parametrs
		EditText CountPushUpsEditor = (EditText)findViewById(R.id.CountPushUps);
		EditText UserAgeEditor = (EditText)findViewById(R.id.UserAge);	
		int result = Integer.parseInt(CountPushUpsEditor.getText().toString());
		int userage = Integer.parseInt(UserAgeEditor.getText().toString());		
		
		//select training level
		int presult = 0;
		int plevel = 0;
		
	if (userage<40)	
		{
		if (result<5){presult = 1;}
		else if (result > 5 & result < 14){presult = 2;}
		else if (result > 14 & result < 29){presult = 3;}
		else if (result > 29 & result < 49){presult = 4;}
		else if (result > 49 & result < 99){presult = 5;}
		else if (result > 99 & result < 150){presult = 6;}
		else if (result > 150){presult = 7;}	
		}
		else if (userage >40 & userage < 55)
		{
		if (result<5){presult = 1;}
		else if (result > 5 & result < 12){presult = 2;}
		else if (result > 12 & result < 24){presult = 3;}
		else if (result > 24 & result < 44){presult = 4;}
		else if (result > 44 & result < 74){presult = 5;}
		else if (result > 74 & result < 124){presult = 6;}
		else if (result > 124){presult = 7;}	
		}
		else if (userage > 55)
		{
		if (result<5){presult = 1;}
		else if (result > 5 & result < 10){presult = 2;}
		else if (result > 10 & result < 19){presult = 3;}
		else if (result > 19 & result < 34){presult = 4;}
		else if (result > 34 & result < 64){presult = 5;}
		else if (result > 64 & result < 99){presult = 6;}
		else if (result > 99){presult = 7;}	
		}

		if (result <6){plevel = 1;}
		else if (result > 5 & result <12){plevel=2;}
		else if (result > 11 & result <22){plevel=3;}
		else if (result > 21){plevel=4;}
		
	//set config to new parameters
		SharedPreferences settings = getSharedPreferences("FileSettings", 0);
	    SharedPreferences.Editor editor = settings.edit();
	    editor.putBoolean("FirstRun", false);
	    editor.putInt("TrainingLevel", presult);
	    editor.putInt("UserAge", userage);
	    editor.putInt("UserLevel",plevel);
	    editor.commit();

	    // return to main screen
		Intent intent = new Intent();
	    intent.setClass(this, HundredPushUps.class);
	    startActivity(intent);
	    }
}