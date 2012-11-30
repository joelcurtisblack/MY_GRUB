/**
 * IconRowViewHolder.java
 * 
 * Copyright (c) 2009 Mo Better Tech, Co. All rights reserved.
 * 
 * This software is the confidential and proprietary information of Mo Better
 * Tech, Co.
 */
package com.mobettertech.grub.android.catalog;

import com.mobettertech.grub.R;
import com.mobettertech.grub.android.utils.RowHolder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 
 * This class holds the view items needed to create an View instance of the 
 * Grocery Catalog row it represents.
 * 
 * @author Joel
 * 
 */
public class CatalogRowHolder implements RowHolder
{
   private static final String LOGTAG = "CatalogRowHolder";

   private ImageView icon;
   private TextView mainText;
   private TextView subText;

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



   /*
    * (non-Javadoc)
    * 
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString()
   {
      return "CatalogRowHolder [icon=" + this.icon + ", Maintext="
	       + this.mainText + ", SubText=" + this.subText + "]";
   }
   

   /*
    * (non-Javadoc)
    * 
    * @see com.mobettertech.grub.android.utils.RowHolder#setView(android.view.View)
    */
   public void setView(View aConvertView)
   {
      this.setMainText((TextView) aConvertView.findViewById(R.id.main_txt));
      Log.d(LOGTAG, "Task Name:" + this.mainText);

      this.setSubText((TextView) aConvertView.findViewById(R.id.sub_txt));
      Log.d(LOGTAG, "Task Details:" + this.subText);
      
      this.setIcon((ImageView) aConvertView.findViewById(R.id.icon_img));
      Log.d(LOGTAG, "ImageView:" + this.icon);
   }

   /**
    * @return the mainText
    */
   public TextView getMainText()
   {
      return this.mainText;
   }

   /**
    * @param aMainText the mainText to set
    */
   public void setMainText(TextView aMainText)
   {
      this.mainText = aMainText;
   }

   /**
    * @return the subText
    */
   public TextView getSubText()
   {
      return this.subText;
   }

   /**
    * @param aSubText the subText to set
    */
   public void setSubText(TextView aSubText)
   {
      this.subText = aSubText;
   }

   /* (non-Javadoc)
    * @see com.mobettertech.grub.android.utils.RowHolder#populate(android.content.Context, java.lang.Object, java.lang.String)
    */
   public void populate(Context aContext, Object aRowData, String aDefPkg)
   {
      String str = (String) aRowData;
      String iconStr = str;

      Log.d(LOGTAG, "Fetching resource id for " + iconStr);
      int resourceId = 
	 aContext.getResources().getIdentifier(iconStr, "drawable", aDefPkg);
      Log.d(LOGTAG, "Resource id for " + iconStr + ": " + resourceId);

      Bitmap image = 
	 BitmapFactory.decodeResource(aContext.getResources(), resourceId);

      mainText.setText(str);
      subText.setText(str);
      icon.setImageBitmap(image);
   }

}
