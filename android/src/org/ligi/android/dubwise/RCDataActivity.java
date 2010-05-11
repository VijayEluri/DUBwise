/**************************************************************************
 *                                          
 * Activity to show the RC-Data
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

package org.ligi.android.dubwise;

import org.ligi.android.dubwise.conn.MKProvider;
import org.ligi.android.dubwise.helper.ActivityCalls;
import org.ligi.tracedroid.logging.Log;
import org.ligi.ufo.MKCommunicator;
import org.ligi.ufo.MKStickData;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;

import android.widget.TextView;

import android.app.Activity;

public class RCDataActivity extends Activity implements Runnable
{

	private boolean dead=false;
	private ProgressBar[] progress_bars;
	private int channels = MKStickData.MAX_STICKS;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ActivityCalls.beforeContent(this);

		ScrollView scroll=new ScrollView(this);
		
		TableLayout table=new TableLayout(this);
		
		scroll.addView(table);
		
		//LayoutParams lp=new TableLayout.LayoutParams();
		//lp.width=LayoutParams.FILL_PARENT;
		//table.setLayoutParams(lp);
		
		table.setColumnStretchable(1, true);
		progress_bars = new ProgressBar[channels];
		
		for (int i = 0; i < channels; i++) {
			TableRow row=new TableRow(this);
			table.addView(row);
			
			row.setPadding(0, 5, 0, 5);
			
			
			progress_bars[i] = new ProgressBar(this, null, android.R.attr.progressBarStyleHorizontal);;
			progress_bars[i].setMax(256);
			progress_bars[i].setVerticalFadingEdgeEnabled(false);
			progress_bars[i].setPadding(10, 0, 5, 0);
			
			
			TextView tmp_text = new TextView(this);
			tmp_text.setText("Channel " + (i+1)  );
			row.addView(tmp_text);
		
			
			row.addView(progress_bars[i]);
		}

		setContentView(scroll);

		dead=false;
		new Thread(this).start();

	}
	
	@Override
	protected void onResume() {
		super.onResume();
		ActivityCalls.afterContent(this);
	}

	 final Handler mHandler = new Handler();
	    
	 	// Create runnable for posting
	   final Runnable mUpdateResults = new Runnable() {
	       public void run() {
	    	   for (int i=0;i<channels;i++)
				{
					progress_bars[i].setProgress(MKProvider.getMK().stick_data.stick[i]+127);
				Log.i("channel " + i + " " + MKProvider.getMK().stick_data.stick[i]);
				}	
	       }
	    };

	public void run() {
		MKProvider.getMK().user_intent=MKCommunicator.USER_INTENT_RCDATA;
		while (!dead) {
			mHandler.post(mUpdateResults);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {	}
			
		}
	}


	@Override
	protected void onDestroy() {
		super.onDestroy();
		ActivityCalls.onDestroy(this);
		dead=true;
	}


}
