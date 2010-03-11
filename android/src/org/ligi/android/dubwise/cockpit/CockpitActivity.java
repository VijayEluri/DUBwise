/**************************************************************************
 *                                          
 * Activity to show a Cockpit
 *                                          
 * Author:  Marcus -LiGi- Bueschleb   
 *
 * Project URL:
 *  http://mikrokopter.de/ucwiki/en/DUBwise
 * 
 * License:
 *  http://creativecommons.org/licenses/by-nc-sa/2.0/de/ 
 *  (Creative Commons / Non Commercial / Share Alike)
 *  Additionally to the Creative Commons terms it is not allowed
 *  to use this project in _any_ violent manner! 
 *  This explicitly includes that lethal Weapon owning "People" and 
 *  Organisations (e.g. Army & Police) 
 *  are not allowed to use this Project!
 *
 **************************************************************************/

package org.ligi.android.dubwise.cockpit;

import org.ligi.android.dubwise.con.MKProvider;
import org.ligi.android.dubwise.helper.ActivityCalls;
import org.ligi.ufo.MKCommunicator;

import android.app.Activity;
import android.os.Bundle;

public class CockpitActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		MKProvider.getMK().user_intent=MKCommunicator.USER_INTENT_RAWDEBUG;	
		
		ActivityCalls.beforeContent(this);
		
		//this.setContentView(new GraphView(this));
		setContentView(new CockpitView(this));
		ActivityCalls.afterContent(this);
	}

	
	@Override
	protected void onResume() {
		super.onResume();
		ActivityCalls.afterContent(this);	
	}

	@Override
	protected void onPause() {
		super.onPause();

	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}

}