package ru.d_lab.HundredPushUps;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//TODO: Переделать main.xml в соответствии с первоначальной концепцией описанной в Google Wave

public class HundredPushUps extends Activity {

    /** Called when the activity is first created. */
	private Button mFirstInit;
	private Button mGoTraining;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);      
     // применение настроек

        // UserInfo welcome text
        int uDay=2; int uWeek=3; int uLevel = 2;
        TextView tv1 = (TextView) findViewById(R.id.TextView01);
        tv1.setText(getString(R.string.tv1T1)+" "+uDay+" "+getString(R.string.tv1T2)+" "+uWeek+" "+getString(R.string.tv1T3));        
        TextView tv2 = (TextView) findViewById(R.id.TextView02);
        tv2.setText(getString(R.string.tv2T1)+" "+ uLevel);       

        // Buttons
            mFirstInit = (Button) findViewById(R.id.FirstInit);
            mFirstInit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
           	setContentView(R.layout.firstinit);
            }
        });
            mGoTraining = (Button) findViewById(R.id.GoTraining);
            mGoTraining.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            setContentView(R.layout.training);
            }
        });
    }
    //home_menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }       
    // Обработка пунктов меню в home_menu
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