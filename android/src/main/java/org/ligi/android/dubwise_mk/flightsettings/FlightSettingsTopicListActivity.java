/**************************************************************************
 *
 * Author:  Marcus -LiGi- Bueschleb   
 *  http://ligi.de
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

package org.ligi.android.dubwise_mk.flightsettings;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.ligi.android.dubwise_mk.conn.MKProvider;
import org.ligi.android.dubwise_mk.helper.ActivityCalls;
import org.ligi.android.dubwise_mk.helper.DUBwiseStringHelper;
import org.ligi.ufo.MKParamsGeneratedDefinitionsToStrings;

/**
 * Activity to choose the topic which the user wants to
 * edit from the FlightSettings
 *
 * @author ligi
 */
public class FlightSettingsTopicListActivity extends ListActivity implements MKParamsGeneratedDefinitionsToStrings {

    private String[] menu_items;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityCalls.beforeContent(this);

        menu_items = new String[MKProvider.getMK().params.tab_stringids.length];
        for (int i = 0; i < menu_items.length; i++)
            menu_items[i] = getString(DUBwiseStringHelper.table[TABID2STRINGID[MKProvider.getMK().params.tab_stringids[i]]]);
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menu_items));
    }

    @Override
    public void onResume() {
        ActivityCalls.afterContent(this);
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        ActivityCalls.onDestroy(this);
        super.onDestroy();
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent edit_intent = new Intent(this, FlightSettingsTopicEditActivity.class);
        edit_intent.putExtra("topic", position);
        startActivity(edit_intent);    // Start the activity
    }
}
