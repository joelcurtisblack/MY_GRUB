/**
 * PantryRowHolder.java
 *
 * Copyright (c) 2009 Mo Better Tech, Co.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Mo Better Tech, Co.
 */
package com.mobettertech.grub.android.pantry;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mobettertech.grub.R;
import com.mobettertech.grub.android.utils.RowHolder;

/**
 * This class holds the child view items needed to create a View instance of the 
 * Pantry row it represents.
 *
 * @author Joel C. Black
 *
 */
public class PantryRowHolder implements RowHolder
{      
   private static final String LOGTAG = "PantryRowHolder";

   private ImageView icon;
   private TextView itemName;
   private TextView category;

   
   
   
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

      itemName.setText(str);
      category.setText(str);
      icon.setImageBitmap(image);

   }

   /**
    * @return the icon
    */
   public ImageView getIcon()
   {
      return this.icon;
   }

   /**
    * @param aIcon the icon to set
    */
   public void setIcon(ImageView aIcon)
   {
      this.icon = aIcon;
   }

   /**
    * @return the itemName
    */
   public TextView getItemName()
   {
      return this.itemName;
   }

   /**
    * @param aItemName the itemName to set
    */
   public void setItemName(TextView aItemName)
   {
      this.itemName = aItemName;
   }

   /**
    * @return the category
    */
   public TextView getCategory()
   {
      return this.category;
   }

   /**
    * @param aCategory the category to set
    */
   public void setCategory(TextView aCategory)
   {
      this.category = aCategory;
   }

   /* (non-Javadoc)
    * @see com.mobettertech.grub.android.utils.RowHolder#setView(android.view.View)
    */
   public void setView(View aConvertView)
   {
      this.setItemName((TextView) aConvertView.findViewById(R.id.item_name));
      Log.d(LOGTAG, "Item Name:" + this.itemName);

      this.setCategory((TextView) aConvertView.findViewById(R.id.category_name));
      Log.d(LOGTAG, "Category:" + this.category);
      
      this.setIcon((ImageView) aConvertView.findViewById(R.id.icon_img));
      Log.d(LOGTAG, "ImageView:" + this.icon);

   }

}
