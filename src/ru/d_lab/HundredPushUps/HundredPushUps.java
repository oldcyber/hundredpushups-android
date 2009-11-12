package ru.d_lab.HundredPushUps;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

//TODO: Переделать main.xml в соответствии с первоначальной концепцией описанной в Google Wave

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
                //setContentView(R.xml.frstinit);
            	setContentView(R.menu.main_menu);
            }
        });
 
        
    }
    //home_menu.xml
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }       
 // Обработка пунктов меню в home_menu
	public boolean onOptionsItemSelected(MenuItem item) {

		switch (item.getItemId()) {
		case R.id.LogoutMenuItem:
			//try {
				// // todo async				
				//ServiceHelper.getService().logout();
				//login();
				return true;
			//} catch (RemoteException e) {
				//e.printStackTrace();
				//AppHelper.showFatalError(this, "Error while logging out");
			//}
		case R.id.AboutMenuItem:
			mWindowAbout.makeDialog(this).show();
			return true;
		case R.id.ExitMenuItem:
		//	try {
		//		ServiceHelper.getService().stop();
		//	} catch (RemoteException e) {
		//		e.printStackTrace();
		//	}
		//	finish();
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
    
}