/**
 * IconRowViewHolder.java
 * 
 * Copyright (c) 2009 Mo Better Tech, Co. All rights reserved.
 * 
 * This software is the confidential and proprietary information of Mo Better
 * Tech, Co.
 */
package com.mobettertech.grub.android.tasks;

import com.mobettertech.grub.R;
import com.mobettertech.grub.android.utils.RowHolder;
import com.mobettertech.grub.android.utils.RowViewArrayAdapter;

import android.app.ListActivity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 
 * This class holds the view items needed to create an View instance of the row
 * it represents.
 * 
 * @author Joel
 * 
 */
public class TasksRowHolder implements RowHolder
{
   private static final String LOGTAG = "CatalogRowHolder";

   private ImageView icon;
   private TextView taskName;
   private TextView taskDetails;

   /**
    * @return the icon
    */
   public ImageView getIcon()
   {
      return this.icon;
   }

   /**
    * @param aIcon
    *           - the icon to set
    */
   public void setIcon(ImageView aIcon)
   {
      this.icon = aIcon;
   }


   public void populate(Context aContext, Object rowData, String defPkg)
   {
      Class<ListActivity> clazz = (Class<ListActivity>)rowData;
      String str = clazz.getName();
      String iconStr = "appicon";

      Log.d(LOGTAG, "Fetching resource id for " + iconStr);
      int resourceId = 
	 aContext.getResources().getIdentifier(iconStr, "drawable", defPkg);
      Log.d(LOGTAG, "Resource id for " + iconStr + ": " + resourceId);

      Bitmap image = 
	 BitmapFactory.decodeResource(aContext.getResources(), resourceId);

      taskName.setText(str);
      taskDetails.setText(str);
      icon.setImageBitmap(image);
   }

   /*
    * (non-Javadoc)
    * 
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString()
   {
      return "TasksRowHolder [icon=" + this.icon + ", TaskName="
	       + this.taskName + ", TaskDetails=" + this.taskDetails + "]";
   }

   /**
    * @return the taskName
    */
   public TextView getTaskName()
   {
      return this.taskName;
   }

   /**
    * @param aTaskName the taskName to set
    */
   public void setTaskName(TextView aTaskName)
   {
      this.taskName = aTaskName;
   }

   /**
    * @return the taskDetails
    */
   public TextView getTaskDetails()
   {
      return this.taskDetails;
   }

   /**
    * @param aTaskDetails the taskDetails to set
    */
   public void setTaskDetails(TextView aTaskDetails)
   {
      this.taskDetails = aTaskDetails;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.mobettertech.grub.android.utils.RowHolder#setView(android.view.View)
    */
   public void setView(View aConvertView)
   {
      this.setTaskName((TextView) aConvertView.findViewById(R.id.task_name));
      Log.d(LOGTAG, "Task Name:" + this.taskName);

      this.setTaskDetails((TextView) aConvertView.findViewById(R.id.task_details_txt));
      Log.d(LOGTAG, "Task Details:" + this.taskDetails);
      
      this.setIcon((ImageView) aConvertView.findViewById(R.id.module_icon_img));
      Log.d(LOGTAG, "ImageView:" + this.icon);
   }

}
