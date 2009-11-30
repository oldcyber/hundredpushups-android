package ru.d_lab.HundredPushUps;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Configuration extends Activity implements OnClickListener {
	/** Called when the activity is first created. */
	@Override
public void onCreate(Bundle savedInstanceState)
{
super.onCreate(savedInstanceState);
setContentView(R.layout.configuration);

Button mResetButton = (Button)findViewById(R.id.ResetButton);
mResetButton.setOnClickListener(this);
}
	public void onClick(View v)
    {
		//Reset config
		SharedPreferences settings = getSharedPreferences("FileSettings", 0);
	    SharedPreferences.Editor editor = settings.edit();
	    editor.putBoolean("FirstRun", true);
	    editor.putInt("TrainingWeek", 1);
	    editor.putInt("TrainingDay", 1);
	    editor.putInt("TrainingLevel", 0);
	    editor.putInt("UserAge", 0);
	    editor.putInt("UserLevel",0);
	    editor.putInt("UserProgress", 0);
	    editor.commit();
		
		//Return to main menu
		Intent intent = new Intent();
        intent.setClass(this, HundredPushUps.class);
        startActivity(intent);
    }
}

