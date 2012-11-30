/**
 * Shopping.java
 * 
 * Copyright (c) 2009 Mo Better Tech, Co. All rights reserved.
 * 
 * This software is the confidential and proprietary information of Mo Better
 * Tech, Co.
 */
package com.mobettertech.grub.android.shopping;

import com.mobettertech.grub.R;
import com.mobettertech.grub.android.pantry.PantryRowHolder;
import com.mobettertech.grub.android.utils.RowViewArrayAdapter;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

/**
 * 
 * This class implements a Shopping activity.
 * 
 * @author Joel C. Black
 * 
 */
public class ShoppingActivity extends ListActivity
{

   static final String[] SHOPPING_LISTS = new String[] 
   { 
      "House Hold", "HolidayParty","Work Party"
   };

   /*
    * (non-Javadoc)
    * 
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
      RowViewArrayAdapter<String> appItems = null;
      
      // A ViewHolder keeps references to children views to avoid unnecessary
      // calls to findViewById() on each row.
      PantryRowHolder rowHolder = new PantryRowHolder();
      
      appItems = new RowViewArrayAdapter<String>(this, rowHolder, 
	       SHOPPING_LISTS, "shoppinglistrow", "com.mobettertech.grub.android");

      setListAdapter(appItems);
   }
   
}
