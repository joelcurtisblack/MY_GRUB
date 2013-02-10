/**
 * GroceryItem.java
 *
 * Copyright (c) 2009 Mo Better Tech, Co.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Mo Better Tech, Co.
 */
package com.mobettertech.grub.core.catalog;

import java.awt.image.BufferedImage;



/**
 * This class implements an item that can be purchased from a grocery store.
 *
 * @author Joel C. Black
 *
 */
public class GroceryItem
{
   
   private static String DEFAULT_ITEM_IMAGE_LOCATION = "resources/default/image.png";
   
   private int itemId = 0;
   private GroceryCategory category = null;
   private String genericItemName = null;
   private String specificItemName = null;
   private String brandName = null;
   private UPC upcCode = null;   
   private BufferedImage itemImage = null;
   

   /**
    * This class represents an item listed in the default grocery catalog.
    * 
    * @param aItemId Unique identifier of a grocery item
    * @param aCategoryCategory Identifies grocery category the item belongs to
    * @param aGenericItemName The generic name of an item
    * @param aSpecificItemName The specific name of an item
    * @param aBrandName The brand name of an item
    * @param aUpcCode The UPC product code
    */
   public GroceryItem(int aItemId, GroceryCategory aCategory, String aGenericItemName,
            String aSpecificItemName, String aBrandName, UPC aUpcCode)
   {
      this.itemId = aItemId;
      this.category = aCategory;
      this.genericItemName = aGenericItemName;
      this.specificItemName = aSpecificItemName;
      this.brandName = aBrandName;
      this.upcCode = aUpcCode;
   }
   
   
   /**
    * This class represents an item listed in the default grocery catalog.
    * 
    * @param aItemId Unique identifier of a grocery item
    * @param aCategoryCategory Identifies grocery category the item belongs to
    * @param aGenericItemName The generic name of an item
    * @param aSpecificItemName The specific name of an item
    * @param aBrandName The brand name of an item
    * @param aUpcCode The UPC product code
    * @param aItemImage - an image of the item
    */
   public GroceryItem(int aItemId, GroceryCategory aCategory, String aGenericItemName,
            String aSpecificItemName, String aBrandName, UPC aUpcCode,
            BufferedImage aItemImage)
   {
      this.itemId = aItemId;
      this.category = aCategory;
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
    * @return the category
    */
   public GroceryCategory getCategory()
   {
      return this.category;
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




/*
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode()
{
    final int prime = 31;
    int result = 1;
    result = prime * result + ((brandName == null) ? 0 : brandName.hashCode());
    result = prime * result + ((category == null) ? 0 : category.hashCode());
    result = prime * result
	    + ((genericItemName == null) ? 0 : genericItemName.hashCode());
    result = prime * result
	    + ((specificItemName == null) ? 0 : specificItemName.hashCode());
    result = prime * result + ((upcCode == null) ? 0 : upcCode.hashCode());
    return result;
}




/*
 * @see java.lang.Object#equals(java.lang.Object)
 */
@Override
public boolean equals(Object obj)
{
    if (this == obj)
    {
	return true;
    }
    if (obj == null)
    {
	return false;
    }
    if (getClass() != obj.getClass())
    {
	return false;
    }
    GroceryItem other = (GroceryItem) obj;
    if (brandName == null)
    {
	if (other.brandName != null)
	{
	    return false;
	}
    }
    else if (!brandName.equals(other.brandName))
    {
	return false;
    }
    if (category != other.category)
    {
	return false;
    }
    if (genericItemName == null)
    {
	if (other.genericItemName != null)
	{
	    return false;
	}
    }
    else if (!genericItemName.equals(other.genericItemName))
    {
	return false;
    }
    if (specificItemName == null)
    {
	if (other.specificItemName != null)
	{
	    return false;
	}
    }
    else if (!specificItemName.equals(other.specificItemName))
    {
	return false;
    }
    if (upcCode == null)
    {
	if (other.upcCode != null)
	{
	    return false;
	}
    }
    else if (!upcCode.equals(other.upcCode))
    {
	return false;
    }
    return true;
}
   
   
   

}
