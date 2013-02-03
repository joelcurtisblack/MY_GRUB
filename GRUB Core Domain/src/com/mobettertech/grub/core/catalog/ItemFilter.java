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

/**
 * This class implements a Filter that defines the parameters
 * that should be used to identify GroceryItems specific grecery
 * items in the catalog.
 * 
 * @author Joel Black
 *
 */
public class ItemFilter 
{
	private int categoryID = 0;
	private String genericName = null;
	private String specificName = null;
	private String brandName = null;
	private UPC upcNumber = null;
	
	
	
	
	
	/**
	 * constructor
	 * 
	 * @param categoryID
	 * @param genericName
	 * @param specificName
	 * @param brandName
	 * @param upcNumber
	 */
	public ItemFilter(int categoryID, String genericName, String specificName,
			String brandName, UPC upcNumber) 
	{
		super();
		this.categoryID = categoryID;
		this.genericName = genericName;
		this.specificName = specificName;
		this.brandName = brandName;
		this.upcNumber = upcNumber;
	}
	
	/**
	 * @return the categoryID
	 */
	public int getCategoryID() 
	{
		return categoryID;
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
	public String getSpecificName() {
		return specificName;
	}
	/**
	 * @return the brandName
	 */
	public String getBrandName() {
		return brandName;
	}
	/**
	 * @return the upcNumber
	 */
	public UPC getUpcNumber() {
		return upcNumber;
	}
	/**
	 * @param categoryID the categoryID to set
	 */
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	/**
	 * @param genericName the genericName to set
	 */
	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}
	/**
	 * @param specificName the specificName to set
	 */
	public void setSpecificName(String specificName) {
		this.specificName = specificName;
	}
	/**
	 * @param brandName the brandName to set
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	/**
	 * @param upcNumber the upcNumber to set
	 */
	public void setUpcNumber(UPC upcNumber) {
		this.upcNumber = upcNumber;
	}
}
