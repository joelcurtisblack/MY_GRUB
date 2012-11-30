/**
 * PantryManagement.java
 *
 * Copyright (c) 2009 Mo Better Tech, Co.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Mo Better Tech, Co.
 */
package com.mobettertech.grub.android.pantry;

import com.mobettertech.grub.R;
import com.mobettertech.grub.android.catalog.CatalogRowHolder;
import com.mobettertech.grub.android.utils.RowViewArrayAdapter;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

/**
 * This class implements an Activity that manages
 * 
 * @author Joel C. Black
 *
 */
public class PantryActivity extends ListActivity
{
   static final String[] PANTRY_ITEMS = new String[] 
   {
      "Lettuce","Cucumber","Bananas","Oranges","Apples",
      "Lemons","Onions","Milk","Cheese","Butter","Rice",
      "Beans","Oatmeal","Grits","Eggs"
   };   

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
      RowViewArrayAdapter<String> appItems = null;
      
      // A ViewHolder keeps references to children views to avoid unnecessary
      // calls to findViewById() on each row.
      PantryRowHolder rowHolder = new PantryRowHolder();
      
      appItems = new RowViewArrayAdapter<String>(this, rowHolder, 
	       PANTRY_ITEMS, "pantryrow", "com.mobettertech.grub.android");

      setListAdapter(appItems);
   }

}
