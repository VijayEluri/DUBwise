/*
 * Copyright (C) 2009 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ligi.android.dubwise;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class GraphActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ActivityCalls.beforeContent(this);
		
		setContentView(new GraphView(this));
		 // getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, new GraphView(this));


		
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

	public final static int MENU_GRID=0;
	public final static int MENU_LEGEND=1;
	public final static int MENU_SETTINGS=2;
	
	/* Creates the menu items */
	public boolean onCreateOptionsMenu(Menu menu) {
	    
		MenuItem settings_menu=menu.add(0,MENU_SETTINGS,0,"Settings");
		settings_menu.setIcon(android.R.drawable.ic_menu_preferences);
		/*
	    Menu features_menu=menu.addSubMenu("Features");
	    features_menu.add(0, MENU_LEGEND, 0, "New Game").setCheckable(true);
	    features_menu.add(0, MENU_GRID, 0, "Quit").setCheckable(true);
	    */
	    return true;
	}

	/* Handles item selections */
	public boolean onOptionsItemSelected(MenuItem item) {
		
	    switch (item.getItemId()) {
	    case MENU_LEGEND:
	    	item.setChecked(!item.isChecked());
	       // newGame();
	        return true;
	    case MENU_GRID:
	    	item.setChecked(!item.isChecked());
	        //quit();
	        return true;
	        
	    case MENU_SETTINGS:
	        //quit();
	    	startActivity(new Intent(this, GraphSettingsActivity.class));
	        return true;
	    }
	    return false;
	}

}