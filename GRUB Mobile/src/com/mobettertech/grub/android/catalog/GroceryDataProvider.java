/**
 * GroceryDataProvider.java
 *
 * Copyright (c) 2009 Mo Better Tech, Co.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Mo Better Tech, Co.
 */
package com.mobettertech.grub.android.catalog;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/**
 * This class implements
 *
 * @author Joel C. Black
 *
 */
public class GroceryDataProvider extends ContentProvider
{

   /* (non-Javadoc)
    * @see android.content.ContentProvider#delete(android.net.Uri, java.lang.String, java.lang.String[])
    */
   @Override
   public int delete(Uri aUri, String aSelection, String[] aSelectionArgs)
   {
      // TODO Auto-generated method stub
      return 0;
   }

   /* (non-Javadoc)
    * @see android.content.ContentProvider#getType(android.net.Uri)
    */
   @Override
   public String getType(Uri aUri)
   {
      // TODO Auto-generated method stub
      return null;
   }

   /* (non-Javadoc)
    * @see android.content.ContentProvider#insert(android.net.Uri, android.content.ContentValues)
    */
   @Override
   public Uri insert(Uri aUri, ContentValues aValues)
   {
      // TODO Auto-generated method stub
      return null;
   }

   /* (non-Javadoc)
    * @see android.content.ContentProvider#onCreate()
    */
   @Override
   public boolean onCreate()
   {
      // TODO Auto-generated method stub
      return false;
   }

   /* (non-Javadoc)
    * @see android.content.ContentProvider#query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String)
    */
   @Override
   public Cursor query(Uri aUri, String[] aProjection, String aSelection,
	    String[] aSelectionArgs, String aSortOrder)
   {
      // TODO Auto-generated method stub
      return null;
   }

   /* (non-Javadoc)
    * @see android.content.ContentProvider#update(android.net.Uri, android.content.ContentValues, java.lang.String, java.lang.String[])
    */
   @Override
   public int update(Uri aUri, ContentValues aValues, String aSelection,
	    String[] aSelectionArgs)
   {
      // TODO Auto-generated method stub
      return 0;
   }

}
