/**
 * GroceryCatalog.java
 *
 * Copyright (c) 2009 Mo Better Tech, Co.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Mo Better Tech, Co.
 */

package com.mobettertech.grub.android.catalog;

import com.mobettertech.grub.R;
import com.mobettertech.grub.android.tasks.TasksRowHolder;
import com.mobettertech.grub.android.utils.RowViewArrayAdapter;

import android.app.ListActivity;
import android.os.Bundle;

/**
 * This is an Activity that will display Grocery Catalog Items.
 * 
 * @author Joel C. Black
 */
public class GroceryCatalogActivity extends ListActivity 
{
   
  static final String[] GROCERY_ITEMS = new String[] 
  {
     "lettuce","cucumber","bannanas","oranges","apples",
     "lemons","onions","milk","cheese","butter","rice",
     "strawberries","grits","eggs"
  };   

  
  /* (non-Javadoc)
   * @see android.app.Activity#onCreate(android.os.Bundle)
   */
  @Override
  public void onCreate(Bundle aSavedInstanceState)
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
     CatalogRowHolder rowHolder = new CatalogRowHolder();
     
     RowViewArrayAdapter<String> appItems = new RowViewArrayAdapter<String>(this, rowHolder,
	      GROCERY_ITEMS, "catalogrow", "com.mobettertech.grub.android");

     setListAdapter(appItems);
  }
   
    
}