/**
 * MealPlanningActivity.java
 *
 * Copyright (c) 2009 Mo Better Tech, Co.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Mo Better Tech, Co.
 */
package com.mobettertech.grub.android.meal;

import com.mobettertech.grub.R;
import com.mobettertech.grub.android.catalog.GroceryCatalogActivity;
import com.mobettertech.grub.android.pantry.PantryActivity;
import com.mobettertech.grub.android.shopping.ShoppingActivity;
import com.mobettertech.grub.android.tasks.TasksRowHolder;
import com.mobettertech.grub.android.utils.RowViewArrayAdapter;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * This class implements
 *
 * @author Joel C. Black
 *
 */
public class MealPlanningActivity extends ListActivity
{
   private static final String LOGTAG = "MealPlanningActivity";
   
//   static final Meals[] APPLICATION_MODULES = new Meals[] { };

   
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
      // A ViewHolder keeps references to children views to avoid unnecessary
      // calls to findViewById() on each row.
//      MealRowHolder rowHolder = new MealRowHolder();
//      RowViewArrayAdapter<Class> appItems = new RowViewArrayAdapter<Class>(this, rowHolder,
//	       APPLICATION_MODULES, "tasksrow", "com.mobettertech.grub.android");
//
//      setListAdapter(appItems);
   }

}
