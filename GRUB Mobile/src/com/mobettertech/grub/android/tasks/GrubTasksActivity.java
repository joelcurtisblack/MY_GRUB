/**
 * GrubTasksActivity.java
 * 
 * Copyright (c) 2009 Mo Better Tech, Co. All rights reserved.
 * 
 * This software is the confidential and proprietary information of Mo Better
 * Tech, Co.
 */
package com.mobettertech.grub.android.tasks;

import com.mobettertech.grub.R;
import com.mobettertech.grub.android.catalog.GroceryCatalogActivity;
import com.mobettertech.grub.android.meal.MealPlanningActivity;
import com.mobettertech.grub.android.pantry.PantryActivity;
import com.mobettertech.grub.android.shopping.ShoppingActivity;
import com.mobettertech.grub.android.utils.RowViewArrayAdapter;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

/**
 * This class implements the main activity for the Grub application. It creates
 * a Tab View that presents the user with the available tasks to perform in the
 * application.
 * 
 * @author Joel
 * 
 */
public class GrubTasksActivity extends ListActivity
{
   private static final String LOGTAG = "GrubTasksActivity";   
   
   static final Class[] APPLICATION_MODULES = new Class[] {
	    GroceryCatalogActivity.class, PantryActivity.class, 
	    ShoppingActivity.class, MealPlanningActivity.class };


   /* (non-Javadoc)
    * @see android.app.Activity#onCreate(android.os.Bundle)
    */
   @Override
   protected void onCreate(Bundle aSavedInstanceState)
   {
      super.onCreate(aSavedInstanceState);
      setContentView(R.layout.main);
      setupListAdapter();
      getListView().setTextFilterEnabled(true);
   }

   /**
    * Setup the List Adapter with the list data
    */
   private void setupListAdapter()
   {
      RowViewArrayAdapter<Class<ListActivity>> appItems = null;
      
      // A ViewHolder keeps references to children views to avoid unnecessary
      // calls to findViewById() on each row.
      TasksRowHolder rowHolder = new TasksRowHolder();
      appItems = new RowViewArrayAdapter<Class<ListActivity>>(this, rowHolder, 
	       APPLICATION_MODULES, "tasksrow", "com.mobettertech.grub.android");

      setListAdapter(appItems);
   }
   
   @Override
   public void onListItemClick(ListView parent, View v, int position, long id)
   {
      Log.d(LOGTAG, "Starting Activity:" + APPLICATION_MODULES[position]);
      
      Intent startActivityIntent = new Intent(this, APPLICATION_MODULES[position]);
      startActivity( startActivityIntent );
   }

}
