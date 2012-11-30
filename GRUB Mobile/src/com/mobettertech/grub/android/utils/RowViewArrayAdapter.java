/**
 * IconArrayAdapter.java
 * 
 * Copyright (c) 2009 Mo Better Tech, Co. All rights reserved.
 * 
 * This software is the confidential and proprietary information of Mo Better
 * Tech, Co.
 */
package com.mobettertech.grub.android.utils;

import com.mobettertech.grub.R;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * This class implements a List Adapter class. This specific adapter provides
 * am array adapter that produces row views for each element in the backing data
 * array. Each row will contain an ImageView with a major TextView and a minor
 * TextView.
 * 
 * @author Joel
 * @param <T>
 * 
 */
public class RowViewArrayAdapter<E> extends BaseAdapter
{
   private static final String LOGTAG = "RowViewArrayAdapter";
   
   private LayoutInflater mInflater;
   private RowHolder rowHolder = null;
   private String rowLayoutName = null;
   private String defaultPackage = null;
   private int rowLayoutResourceId = 0;
   private Context context;
   private E[] data;

   /**
    * 
    * @param aContext - Activity Context
    * @param objects - contains objects to add to ListView
    * @param layoutName - name of the Row XML Layout resource to use
    * @param defPkg - default package to use for resource id strings
    */
   public RowViewArrayAdapter(Context aContext, RowHolder aRowHolder ,E[] elements, 
	    String aLayoutName, String aDefPkg)
   {
      context = aContext;
      data = elements;
      rowHolder = aRowHolder;
      rowLayoutName = aLayoutName;
      defaultPackage = aDefPkg;
      
      Log.d( LOGTAG, "rowLayoutName:" + rowLayoutName);
      Log.d( LOGTAG, "defPkg:" + aDefPkg);
      
      rowLayoutResourceId = context.getResources().getIdentifier( rowLayoutName, "layout", defaultPackage);
      Log.d( LOGTAG, "rowLayoutResourceId: " + rowLayoutResourceId);
      
      mInflater = (LayoutInflater) aContext.getSystemService (Context.LAYOUT_INFLATER_SERVICE);
   }

   /**
    * Make a view to hold each row.
    * 
    * @see android.widget.ListAdapter#getView(int, android.view.View,
    *      android.view.ViewGroup)
    */
   public View getView(int position, View convertView, ViewGroup parent)
   {   
      // When convertView is not null, we can reuse it directly, there is no
      // need to re-inflate it. We only inflate a new View when the convertView
      // supplied by ListView is null.
      if (convertView == null)
      {
	 convertView = mInflater.inflate(rowLayoutResourceId, null);
         Log.d(LOGTAG, "Inflating new convetView:" + convertView);

         //Set the View for the RowHolder instance
         rowHolder.setView(convertView);
         
	 // Creates a ViewHolder and store references to the two children views
	 // we want to bind data to.
	 convertView.setTag(rowHolder);
      }
      else
      {
	 // Get the ViewHolder back to get fast access to the TextView
	 // and the ImageView.
         Log.d(LOGTAG, "Existing convetView:" + convertView);
	 rowHolder = (RowHolder) convertView.getTag();
      }

      // Bind the data efficiently with the holder.
      rowHolder.populate(this.context, data[position], this.defaultPackage);
      
      return convertView;
   }

   /* (non-Javadoc)
    * @see android.widget.Adapter#getCount()
    */
   public int getCount()
   {
      return data.length;
   }

   /* (non-Javadoc)
    * @see android.widget.Adapter#getItem(int)
    */
   public E getItem(int aPosition)
   {
      return data[aPosition];
   }

   /* (non-Javadoc)
    * @see android.widget.Adapter#getItemId(int)
    */
   public long getItemId(int aPosition)
   {
      return aPosition;
   }
   
   
   
}
