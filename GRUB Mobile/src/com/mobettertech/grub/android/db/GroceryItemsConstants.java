/**
 * GroceryItemsConstants.java
 *
 * Copyright (c) 2009 Mo Better Tech, Co.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Mo Better Tech, Co.
 */
package com.mobettertech.grub.android.db;

import android.provider.BaseColumns;

/**
 * This class implements the constants interface for the Grocery Catalog 
 * database table. It contains definitions specific to the Grocery 
 * Catalog.
 *
 * @author Joel C. Black
 *
 */
public interface GroceryItemsConstants extends BaseColumns
{
   public static final String TABLE_NAME = "grocery_items";
   
   //Columns in the GROCERY_CATALOG table
   public static final String CATEGORY_ID = "category_id";
   public static final String GENERIC_ITEM_NAME = "generic_item_name";
   public static final String SPECIFIC_ITEM_NAME = "specific_item_name";
   public static final String BRAND_NAME = "brand_name";
   public static final String UPC_NUMBER = "upc_number";
   public static final String ITEM_IMAGE = "item__image";
   public static final String BARCODE_IMAGE = "barcode_image";
   
}
