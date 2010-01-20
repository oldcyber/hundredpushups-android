/**
 * 
 */
package ru.d_lab.HundredPushUps.tools;

import ru.d_lab.HundredPushUps.R;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * @author Old Cyber
 *
 */
public class TrainingWindow extends Dialog {

	private Button next_button;
	private String num_pushup;
    private int num_training;

    public TrainingWindow(Context context, String num_pushup, int num_training) {
		super(context);
		this.num_pushup = num_pushup;
		this.num_training = num_training;
	}

    @Override
	public void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState);
        
		setContentView(R.layout.trainingwindow);
		
		if (num_training == 1){
			setTitle(R.string.Training1);
		}
		else if (num_training == 2){
			setTitle(R.string.Training2);
		}
		else if (num_training == 3){
			setTitle(R.string.Training3);
		}
		else if (num_training == 4){
			setTitle(R.string.Training4);
		}
		else if (num_training == 5){
			setTitle(R.string.Training5);
		}
		else if (num_training == 6){
			setTitle(R.string.Training6);
		}
		else if (num_training == 7){
			setTitle(R.string.Training7);
		}
		else if (num_training == 8){
			setTitle(R.string.Training8);
		}
		else if (num_training == 0){
			setTitle(R.string.TrainingMax);
		}

		next_button = (Button) findViewById(R.id.dialog_Next);
	
        TextView Test = (TextView)findViewById(R.id.goTrainingText);
        Test.setText(num_pushup);
        
        setOnNextClick(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				dismiss();
				// TODO Auto-generated method stub
			}
		});
	}
		
	   public void setOnNextClick(View.OnClickListener l) {
	        next_button.setOnClickListener(l);
	    }
}
