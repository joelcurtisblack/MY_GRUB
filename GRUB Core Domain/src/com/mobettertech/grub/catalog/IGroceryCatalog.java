/**
 * IGroceryCatalog.java
 *
 * Copyright (c) 2012 Mo Better Tech, Co.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Mo Better Tech, Co.
 * 
 */
package com.mobettertech.grub.catalog;

import java.util.Collection;

/**
 * This method implements the API provided by the Grocery Catalog.
 * 
 * @author Joel
 *
 */
public interface IGroceryCatalog 
{
	public void addItem(GroceryItem aGroceryItem);

	//++++++++++++++++++++++++++++++++
	// Retrieval Methods
	//++++++++++++++++++++++++++++++++
	public Collection<GroceryItem> getAllItems();
	public Collection<GroceryItem> getItems( ItemFilter aItemFilter);
}
