package ru.d_lab.HundredPushUps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class GoTraining extends Activity implements OnClickListener {
	/** Called when the activity is first created. */
	@Override
public void onCreate(Bundle savedInstanceState)
{
super.onCreate(savedInstanceState);
setContentView(R.layout.training);

Button mFirstRunOk = (Button)findViewById(R.id.BeginTraining);
mFirstRunOk.setOnClickListener(this);
}
	public void onClick(View v)
    {
		Intent intent = new Intent();
        intent.setClass(this, HudredPushUps.class);
        startActivity(intent);
    }
}

