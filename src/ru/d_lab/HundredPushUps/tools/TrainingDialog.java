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
public class TrainingDialog extends Dialog {
	
	private Button ok_button; private Button cancel_button;
	
	
    public TrainingDialog(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState);

		setContentView(R.layout.training_dialog);
		setTitle(R.string.Training8);
		ok_button = (Button) findViewById(R.id.ButtonOk);
		cancel_button = (Button) findViewById(R.id.ButtonCancel);
		TextView myDialogText = (TextView)findViewById(R.id.DialogTrainingTex);
        
        myDialogText.setText("10");
        
        setOnOkClick(new View.OnClickListener() {
			@Override
			public void onClick(View v) {				
				dismiss();
			}
		});
    	setOnCancelClick(new View.OnClickListener(){
    		@Override	
    		public void onClick(View v){
    			dismiss();
    			}
    	});
	}
	
	public void setOnOkClick(View.OnClickListener l) {
	        ok_button.setOnClickListener(l);
	}
	public void setOnCancelClick(View.OnClickListener l){
			cancel_button.setOnClickListener(l);
	}
}
