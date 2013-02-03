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
package com.mobettertech.grub.core.catalog;

import java.util.Collection;

/**
 * This method implements the API provided by the Grocery Catalog.
 * 
 * @author Joel Black
 *
 */
public interface IGroceryCatalog 
{
	//++++++++++++++++++++++++++++++++
	// Addition Methods
	//++++++++++++++++++++++++++++++++
	public void addItems(Collection<GroceryItem> aGroceryItem);
	public void addItem(GroceryItem aGroceryItem);

	//++++++++++++++++++++++++++++++++
	// Edit Methods
	//++++++++++++++++++++++++++++++++
	public void editItem(GroceryItem aGroceryItem);
	
	//++++++++++++++++++++++++++++++++
	// Retrieval Methods
	//++++++++++++++++++++++++++++++++
	public Collection<GroceryItem> getAllItems();
	public Collection<GroceryItem> getItems( ItemFilter aItemFilter);
}
