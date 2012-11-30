/**
 * IconRowViewHolder.java
 * 
 * Copyright (c) 2009 Mo Better Tech, Co. All rights reserved.
 * 
 * This software is the confidential and proprietary information of Mo Better
 * Tech, Co.
 */
package com.mobettertech.grub.android.utils;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 
 * This interface defines the methods that all RowHolders must implement.
 * RowHolders are used to store the child views used to create the individual 
 * rows of a ListView. The general structure of all rows is common but the
 * individual components contained in a row are specific to all implementers
 * of the RowHolder interface.
 * 
 * @author Joel
 * 
 */
public interface RowHolder
{
   /**
    * Used to associate a view with this holder.
    * 
    * @param convertView - a View this holder contains
    */
   public void setView(View convertView);

   /**
    * Used to bind the row data to the View contained in this holder.
    * 
    * @param aContext - current application Context  
    * @param rowData - row data to be bound to this holder's View
    * @param defPkg - default application java package
    */
   public void populate(Context aContext, Object rowData, String defPkg);  
}
