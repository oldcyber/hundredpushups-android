/**
 * 
 */
package ru.d_lab.HundredPushUps.tools;

import ru.d_lab.HundredPushUps.R;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

/**
 * @author Old Cyber
 *
 */
public class RestWindow extends Dialog {

	// private Button next_button;
	private long rest_time;

    public RestWindow(Context context, long rest_time) {
		super(context);
		this.rest_time = rest_time;
	}

    @Override
	public void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState);
   
		setContentView(R.layout.timer);
		setTitle(R.string.Rest);
	
        final TextView TimeTimer = (TextView)findViewById(R.id.TimerText);
        
        new CountDownTimer(rest_time, 1000) {

            public void onTick(long millisUntilFinished) {
            	TimeTimer.setText(" " + millisUntilFinished / 1000+" ");
            }

            public void onFinish() {
            	//TimeTimer.setText("done!");
            	dismiss();
            }
         }.start();
        
    }
}
        
    		


