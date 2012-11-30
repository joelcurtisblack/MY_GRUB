/**
 * GroceryItem.java
 *
 * Copyright (c) 2009 Mo Better Tech, Co.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Mo Better Tech, Co.
 */
package com.mobettertech.grub.catalog;

import java.awt.image.BufferedImage;





/**
 * This class implements an item that can be purchased from a grocery store.
 *
 * @author Joel C. Black
 *
 */
public class GroceryItem
{
   
   private int itemId = 0;
   private String categoryId = null;
   private String genericItemName = null;
   private String specificItemName = null;
   private String brandName = null;
   private UPC upcCode = null;
   private BufferedImage itemImage = null;
   
   
   /**
    * This class represents an item listed in the default grocery catalog.
    * 
    * @param aItemId Unique identifier of a grocery item
    * @param aCategoryId Identifies grocery category the item belongs to
    * @param aGenericItemName The generic name of an item
    * @param aSpecificItemName The specific name of an item
    * @param aBrandName The brand name of an item
    * @param aUpcCode The UPC product code
    * @param aItemImage - an image of the item
    */
   public GroceryItem(int aItemId, String aCategoryId, String aGenericItemName,
            String aSpecificItemName, String aBrandName, UPC aUpcCode,
            BufferedImage aItemImage)
   {
      this.itemId = aItemId;
      this.categoryId = aCategoryId;
      this.genericItemName = aGenericItemName;
      this.specificItemName = aSpecificItemName;
      this.brandName = aBrandName;
      this.upcCode = aUpcCode;
      this.itemImage = aItemImage;
   }
   
   
   /**
    * @return the itemId
    */
   public int getItemId()
   {
      return this.itemId;
   }
   
   /**
    * @return the categoryId
    */
   public String getCategoryId()
   {
      return this.categoryId;
   }
   
   
   /**
    * @return the genericItemName
    */
   public String getGenericItemName()
   {
      return this.genericItemName;
   }
   
   /**
    * @return the specificItemName
    */
   public String getSpecificItemName()
   {
      return this.specificItemName;
   }
   
   /**
    * @return the brandName
    */
   public String getBrandName()
   {
      return this.brandName;
   }
   
   /**
    * @return the upcCode
    */
   public UPC getUpcCode()
   {
      return this.upcCode;
   }
   
   /**
    * @return the itemImage
    */
   public BufferedImage getItemImage()
   {
      return this.itemImage;
   }
   
   
   

}
