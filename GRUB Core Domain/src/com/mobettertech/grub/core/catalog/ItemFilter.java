/**
 * ItemFilter.java
 *
 * Copyright (c) 2012 Mo Better Tech, Co.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Mo Better Tech, Co.
 * 
 */
package com.mobettertech.grub.core.catalog;

import com.mobettertech.grub.core.catalog.model.GroceryItem;

/**
 * This class implements a Filter that defines the parameters that should be
 * used to identify specific GroceryItems in the catalog.
 * 
 * @author Joel C. Black
 * 
 */
public class ItemFilter
{
    private GroceryCategory groceryCategory = null;
    private String genericName = null;
    private String specificName = null;
    private String brandName = null;
    private UPC upcCode = null;

    
    /**
     * constructor
     */
    public ItemFilter()
    {
    }
    
    /**
     * constructor
     * 
     * @param categoryID
     * @param genericName
     * @param specificName
     * @param brandName
     * @param upcCode
     */
    public ItemFilter(GroceryCategory aCategory, String aGenericName, String aSpecificName,
	    String aBrandName, UPC aUpcNumber)
    {
	super();
	this.groceryCategory = aCategory;
	this.genericName = aGenericName;
	this.specificName = aSpecificName;
	this.brandName = aBrandName;
	this.upcCode = aUpcNumber;
    }

    public boolean isItemMatched(GroceryItem aGroceryItem)
    {
	boolean matchResult = true;
	
	if (aGroceryItem == null)
	{
	    return false;
	}
	if( (groceryCategory != null) && (!groceryCategory.equals(aGroceryItem.getCategory()))  )
	{
	    return false;
	}
	if( genericName != null )
	{
	    if(!genericName.equals(aGroceryItem.getGenericItemName()))
	    {
		return false;
	    }	    
	}
	if ( specificName != null )
	{
	    if(!specificName.equals(aGroceryItem.getSpecificItemName()))
	    {
		return false;
	    }	    
	}
	if ( brandName != null )
	{
	    if(!brandName.equals(aGroceryItem.getBrandName()))
	    {
		return false;
	    }	    
	}
	if ( upcCode != null )
	{
	    if(!upcCode.equals(aGroceryItem.getUpcCode()))
	    {
		return false;
	    }	    
	}
	
	
	
	return matchResult;
    }
    
    
    /**
     * @return the categoryID
     */
    public GroceryCategory getCategory()
    {
	return groceryCategory;
    }

    /**
     * @return the genericName
     */
    public String getGenericName()
    {
	return genericName;
    }

    /**
     * @return the specificName
     */
    public String getSpecificName()
    {
	return specificName;
    }

    /**
     * @return the brandName
     */
    public String getBrandName()
    {
	return brandName;
    }

    /**
     * @return the upcCode
     */
    public UPC getUpcCode()
    {
	return upcCode;
    }

    /**
     * @param aCategory
     */
    public void setCategoryID(GroceryCategory aCategory)
    {
	this.groceryCategory = aCategory;
    }

    /**
     * @param genericName
     *            the genericName to set
     */
    public void setGenericName(String genericName)
    {
	this.genericName = genericName;
    }

    /**
     * @param specificName
     *            the specificName to set
     */
    public void setSpecificName(String specificName)
    {
	this.specificName = specificName;
    }

    /**
     * @param brandName
     *            the brandName to set
     */
    public void setBrandName(String brandName)
    {
	this.brandName = brandName;
    }

    /**
     * @param upcCode
     */
    public void setUpcCode(UPC upcCode)
    {
	this.upcCode = upcCode;
    }
}
