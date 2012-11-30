/**
 * ShoppingRowHolder.java
 *
 * Copyright (c) 2009 Mo Better Tech, Co.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Mo Better Tech, Co.
 */
package com.mobettertech.grub.android.shopping;

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
 * Shopping List row it represents.
 *
 * @author Joel C. Black
 *
 */
public class ShoppingRowHolder implements RowHolder
{
   private static final String LOGTAG = "ShoppingRowHolder";

   private ImageView icon;
   private TextView listName;
   private TextView groceryStore;
   
   

   /* (non-Javadoc)
    * @see com.mobettertech.grub.android.utils.RowHolder#populate(android.content.Context, java.lang.Object, java.lang.String)
    */
   public void populate(Context aContext, Object aRowData, String aDefPkg)
   {
      String str = (String) aRowData;
      String iconStr = "mygrub";

      Log.d(LOGTAG, "Fetching resource id for " + iconStr);
      int resourceId = 
	 aContext.getResources().getIdentifier(iconStr, "drawable", aDefPkg);
      Log.d(LOGTAG, "Resource id for " + iconStr + ": " + resourceId);

      Bitmap image = 
	 BitmapFactory.decodeResource(aContext.getResources(), resourceId);

      listName.setText(str);
      groceryStore.setText("Walmart");
      icon.setImageBitmap(image);
   }

   /* (non-Javadoc)
    * @see com.mobettertech.grub.android.utils.RowHolder#setView(android.view.View)
    */
   public void setView(View aConvertView)
   {
      this.setIcon((ImageView) aConvertView.findViewById(R.id.icon_img));
      Log.d(LOGTAG, "ImageView:" + this.icon);
      
      this.setListName((TextView) aConvertView.findViewById(R.id.shopping_list_name));
      Log.d(LOGTAG, "Item Name:" + this.listName);

      this.setGroceryStore((TextView) aConvertView.findViewById(R.id.assigned_grocery_store));
      Log.d(LOGTAG, "Category:" + this.groceryStore);      
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
    * @return the listName
    */
   public TextView getListName()
   {
      return this.listName;
   }

   /**
    * @param aListName the listName to set
    */
   public void setListName(TextView aListName)
   {
      this.listName = aListName;
   }

   /**
    * @return the groceryStore
    */
   public TextView getGroceryStore()
   {
      return this.groceryStore;
   }

   /**
    * @param aGroceryStore the groceryStore to set
    */
   public void setGroceryStore(TextView aGroceryStore)
   {
      this.groceryStore = aGroceryStore;
   }

}
