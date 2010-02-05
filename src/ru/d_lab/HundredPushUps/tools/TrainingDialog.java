/**
 * 
 */
package ru.d_lab.HundredPushUps.tools;

import ru.d_lab.HundredPushUps.R;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * @author Old Cyber
 *
 */
public class TrainingDialog extends Dialog {
	
	private Button ok_button; private Button cancel_button;
	private int trWeek; private int trDay; private int trLevel;
	private int iter=0;
	private String[] cPlan;
	
    public TrainingDialog(Context context, int trWeek, int trDay, int trLevel, String[] cPlan) {
		super(context);
		this.trWeek = trWeek;
		this.trDay = trDay;
		this.trLevel = trLevel;
		this.cPlan = cPlan;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState);

		setContentView(R.layout.training_dialog);
		ok_button = (Button) findViewById(R.id.ButtonOk);
		cancel_button = (Button) findViewById(R.id.ButtonCancel);
// Content begin		

			tTraining();
		
		
		

setOnOkClick(new View.OnClickListener() {
@Override
public void onClick(View v) {				
	//iter = iter + 1;
	restTime();
}
});
setOnCancelClick(new View.OnClickListener(){
@Override	
public void onClick(View v){
	dismiss();
	}
});	

}

	
// Content End

	
	public void setOnOkClick(View.OnClickListener l) {
	        ok_button.setOnClickListener(l);
	}
	public void setOnCancelClick(View.OnClickListener l){
			cancel_button.setOnClickListener(l);
	}
	
	public void restTime(){
		
		final TextView TimeTimer = (TextView)findViewById(R.id.DialogTrainingTex);
		setTitle(R.string.Rest);
       new CountDownTimer(5000, 1000) {

            public void onTick(long millisUntilFinished) {
            	TimeTimer.setText(" " + millisUntilFinished / 1000+" ");
            }

            public void onFinish() {
            	iter = iter + 1;
            	tTraining();
            }
         }.start();
	}

	public void tTraining(){
		if (iter<cPlan.length){
			if (iter == 1){
	setTitle(R.string.Training1);
}
else if (iter == 2){
	setTitle(R.string.Training2);
}
else if (iter == 3){
	setTitle(R.string.Training3);
}
else if (iter == 4){
	setTitle(R.string.Training4);
}
else if (iter == 5){
	setTitle(R.string.Training5);
}
else if (iter == 6){
	setTitle(R.string.Training6);
}
else if (iter == 7){
	setTitle(R.string.Training7);
}
else if (iter == 8){
	setTitle(R.string.Training8);
}
else if (iter == 0){
	setTitle(R.string.TrainingMax);
}

TextView Test = (TextView)findViewById(R.id.DialogTrainingTex);
Test.setText(cPlan[iter]);
}
		else {
			dismiss();
		}
	}

//-----------
}
