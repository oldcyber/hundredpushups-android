package ru.d_lab.HundredPushUps;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class HundredPushUps extends Activity {
    /** Called when the activity is first created. */
	private Button mFirstInit;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        mFirstInit = (Button) findViewById(R.id.FirstInit);
        
        mFirstInit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.xml.frstinit);
            }
        });
        
        
    }
}