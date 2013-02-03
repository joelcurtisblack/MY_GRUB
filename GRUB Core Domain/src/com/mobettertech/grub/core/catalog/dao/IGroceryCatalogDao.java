/**
 * IGroceryCatalogDao.java
 *
 * Copyright (c) 2013 Mo Better Tech, Co.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Mo Better Tech, Co.
 * 
 */
package com.mobettertech.grub.core.catalog.dao;

import java.util.Collection;

import com.mobettertech.grub.core.catalog.GroceryItem;
import com.mobettertech.grub.core.catalog.ItemFilter;


/**
 * This class implements an interface that describes the methods available
 * for accessing the GroceryCatalog data.
 *
 * @author Joel Black
 *
 */
public interface IGroceryCatalogDao
{
    //+++++++++++++++++++++++++++++++
    // Create Methods
    //+++++++++++++++++++++++++++++++

    /**
     * This method can be used to create a new GroceryItem in the database.
     * 
     * @param aGroceryItem
     */
    public void createItem(GroceryItem aGroceryItem);
    
    /**
     * This method can be used to create new GroceryItems in the database.
     * 
     * @param aGroceryItemList
     */
    public void createItems(Collection<GroceryItem> aGroceryItemList);
    
    //+++++++++++++++++++++++++++++++
    // Retrieval Methods
    //+++++++++++++++++++++++++++++++
    
    /**
     * This method is used to retrieve all of the existing
     * GroceryItems from the catalog.
     * 
     * @return
     */
    public Collection<GroceryItem> retrieveAllItems();
    
    /**
     * This method is used to retrieve a specific GroceryItem 
     * from the catalog.
     * 
     * @param aItemFIlter a filter used to identify a GroceryItem
     * @return
     */
    public GroceryItem retrieveItems(ItemFilter aItemFIlter);

    /**
     * This method is used to retrieve a specific GroceryItem 
     * from the catalog.
     * 
     * @param aGroceryItem a specific Grocery Item
     * @return
     */
    public GroceryItem retrieveItem(GroceryItem aGroceryItem);

    
    //+++++++++++++++++++++++++++++++
    // Update Methods
    //+++++++++++++++++++++++++++++++
    
    /**
     * This method can be used to update a GroceryItem.
     * 
     * @param aGroceryItem
     */
    public void updateItem(GroceryItem aGroceryItem);
    
    /**
     * This method can be used to update a list of GroceryItems.
     * 
     * @param aGroceryItem
     */
    public void updateItems(Collection<GroceryItem> aGroceryItemList);
    
    //+++++++++++++++++++++++++++++++
    // Delete Methods
    //+++++++++++++++++++++++++++++++

    /**
     * This method can be used to delete a GroceryItem from the database.
     * 
     * @param aGroceryItem
     */
    public void deleteItem(GroceryItem aGroceryItem);
    
    /**
     * This method can be used to delete a list of GroceryItems from the database.
     * 
     * @param aGroceryItemList
     */
    public void deleteItems(Collection<GroceryItem> aGroceryItemList);
}
