/**
 * EfficientAdapter.java
 * 
 * Copyright (c) 2009 Mo Better Tech, Co. All rights reserved.
 * 
 * This software is the confidential and proprietary information of Mo Better
 * Tech, Co.
 */
package com.mobettertech.grub.android.utils;

import com.mobettertech.grub.R;
import com.mobettertech.grub.android.tasks.TasksRowHolder;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 
 * This class implements a View Adapter that creates a horizontal row for each item 
 * provided by the cursor. Each row contains a ImageView and a TextView. 
 * 
 * @author Joel
 * 
 */
public class RowViewCursorAdapter extends CursorAdapter
{
   private LayoutInflater mInflater;
   private Bitmap mIcon1;

   /**
    * constructor
    * 
    * @param aContext - Android System object
    * @param aCursor - provides access to database result set
    */
   public RowViewCursorAdapter(Context aContext, Cursor aCursor)
   {
      super(aContext, aCursor, false);

      // Cache the LayoutInflate to avoid asking for a new one each time.
      mInflater = LayoutInflater.from(aContext);
   }

   /**
    * constructor
    * 
    * @param aContext
    * @param aCursor
    * @param aAutoRequeryFlag
    */
   public RowViewCursorAdapter(Context aContext, Cursor aCursor,
	    boolean aAutoRequeryFlag)
   {
      super(aContext, aCursor, aAutoRequeryFlag);

      // Cache the LayoutInflate to avoid asking for a new one each time.
      mInflater = LayoutInflater.from(aContext);
   }

   /**
    * Make a view to hold each row.
    * 
    * @see android.widget.ListAdapter#getView(int, android.view.View,
    *      android.view.ViewGroup)
    */
   public View getView(int position, View convertView, ViewGroup parent)
   {
      // A ViewHolder keeps references to children views to avoid unnecessary
      // calls
      // to findViewById() on each row.
      RowHolder holder;

      // When convertView is not null, we can reuse it directly, there is no
      // need
      // to re-inflate it. We only inflate a new View when the convertView
      // supplied
      // by ListView is null.
      if (convertView == null)
      {
	 convertView = mInflater.inflate(R.layout.catalogrow, null);

	 // Creates a ViewHolder and store references to the two children views
	 // we want to bind data to.
//	 holder = new RowHolder();
//	 holder.setMainText( (TextView)convertView.findViewById(R.id.main_txt) );
//	 holder.setSubText((TextView)convertView.findViewById(R.id.sub_txt) );	 
//	 holder.setIcon((ImageView) convertView.findViewById(R.id.icon_img));

//	 convertView.setTag(holder);
      }
      else
      {
	 // Get the ViewHolder back to get fast access to the TextView
	 // and the ImageView.
	 holder = (TasksRowHolder) convertView.getTag();
      }

//      // Bind the data efficiently with the holder.
//      holder.setMainTxt(DATA[position]);
//      
//      aContext.getResources();
//      holder.setIcon( BitmapFactory.decodeResource(   );

      return convertView;
   }



   /*
    * (non-Javadoc)
    * 
    * @see android.widget.CursorAdapter#bindView(android.view.View,
    * android.content.Context, android.database.Cursor)
    */
   @Override
   public void bindView(View aView, Context aContext, Cursor aCursor)
   {
      // TODO Auto-generated method stub

   }

   /*
    * (non-Javadoc)
    * 
    * @see android.widget.CursorAdapter#newView(android.content.Context,
    * android.database.Cursor, android.view.ViewGroup)
    */
   @Override
   public View newView(Context aContext, Cursor aCursor, ViewGroup aParent)
   {
      // TODO Auto-generated method stub
      return null;
   }

}
