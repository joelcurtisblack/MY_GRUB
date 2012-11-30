/**
 * GroceryItemsData.java
 *
 * Copyright (c) 2009 Mo Better Tech, Co.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Mo Better Tech, Co.
 */
package com.mobettertech.grub.android.db;

import static android.provider.BaseColumns._ID;
import static com.mobettertech.grub.android.db.GroceryItemsConstants.*;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

/**
 * This class implements
 *
 * @author Joel C. Black
 *
 */
public class GroceryItemsData extends SQLiteOpenHelper
{
   private static final String DATABASE_NAME = "my_grub.db";
   private static final int DATABASE_VERSION = 1;

   private static final String CREATE_TBL_DDL = "";
   private static final String DROP_TBL_DDL = "";
   
   
   /**
    * Constructor
    * 
    * @param aContext - current Activity context
    * @param aName - database name
    * @param aFactory - 
    * @param aVersion - database version
    */
   public GroceryItemsData(Context aContext)
   {
      super(aContext, DATABASE_NAME, null, DATABASE_VERSION);
   }

   /* (non-Javadoc)
    * @see android.database.sqlite.SQLiteOpenHelper#onCreate(android.database.sqlite.SQLiteDatabase)
    */
   @Override
   public void onCreate(SQLiteDatabase db)
   {
      db.execSQL( CREATE_TBL_DDL );
      // TODO Auto-generated method stub

   }

   /* (non-Javadoc)
    * @see android.database.sqlite.SQLiteOpenHelper#onUpgrade(android.database.sqlite.SQLiteDatabase, int, int)
    */
   @Override
   public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
   {
      // TODO Auto-generated method stub
      db.execSQL( DROP_TBL_DDL );
      this.onCreate(db);
   }

}
