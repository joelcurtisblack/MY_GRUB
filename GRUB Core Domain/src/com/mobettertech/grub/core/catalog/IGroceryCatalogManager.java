/**
 * IGroceryCatalogService.java
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

import com.mobettertech.grub.core.catalog.dto.GroceryItem;

/**
 * This interface defines the API provided by the Grocery Catalog.
 * 
 * @author Joel C. Black
 * 
 */
public interface IGroceryCatalogManager
{
    // ++++++++++++++++++++++++++++++++
    // Addition Methods
    // ++++++++++++++++++++++++++++++++
    public void addItems(Collection<GroceryItem> aGroceryItem);

    public void addItem(GroceryItem aGroceryItem);

    
    // ++++++++++++++++++++++++++++++++
    // Edit Methods
    // ++++++++++++++++++++++++++++++++
    public void editItem(GroceryItem aGroceryItem);

    
    
    // ++++++++++++++++++++++++++++++++
    // Retrieval Methods
    // ++++++++++++++++++++++++++++++++
    
    /**
     * Get a specific item from the catalog using the items unique id.
     * 
     * @param aItemid
     * @return
     */
    public GroceryItem getItem(int aItemid);
    
    /**
     * Retrieve all the items from the Grocery Catalog.
     * 
     * @return
     */
    public Collection<GroceryItem> getAllItems();

    /**
     * Retrieve all items from the Grocery Catalog meeting the specified 
     * filter.
     * 
     * @param aItemFilter
     * @return
     */
    public Collection<GroceryItem> getItems(ItemFilter aItemFilter);
}
