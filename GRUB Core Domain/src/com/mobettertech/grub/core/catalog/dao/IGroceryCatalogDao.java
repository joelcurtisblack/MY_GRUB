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

import com.mobettertech.grub.core.catalog.TestGroceryItem;
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
     * @throws GroceryCatalogDataAccessException
     */
    public void createItem(TestGroceryItem aGroceryItem) throws GroceryCatalogDataAccessException;
    
    /**
     * This method can be used to create new GroceryItems in the database.
     * 
     * @param aGroceryItemCollection
     * @throws GroceryCatalogDataAccessException
     */
    public void createItems(Collection<TestGroceryItem> aGroceryItemCollection) throws GroceryCatalogDataAccessException;
    
    //+++++++++++++++++++++++++++++++
    // Retrieval Methods
    //+++++++++++++++++++++++++++++++
    
    /**
     * This method is used to retrieve all of the existing
     * GroceryItems from the catalog.
     * 
     * @return a Collection of GroceryItems
     * @throws GroceryCatalogDataAccessException
     */
    public Collection<TestGroceryItem> retrieveAllItems() throws GroceryCatalogDataAccessException;
    
    /**
     * This method is used to retrieve GroceryItems from the catalog that match the 
     * ItemFilter passed in. If the filter is completely filled in the only 
     * one item will be found that matches
     * 
     * @param aItemFIlter identifying specific characteristics to match on 
     * @return a Collection of matching GroceryItems
     * @throws GroceryCatalogDataAccessException
     */
    public TestGroceryItem retrieveItems(ItemFilter aItemFIlter) throws GroceryCatalogDataAccessException;

    
    //+++++++++++++++++++++++++++++++
    // Update Methods
    //+++++++++++++++++++++++++++++++
    
    /**
     * This method can be used to update a GroceryItem.
     * 
     * @param aGroceryItem
     * @throws GroceryCatalogDataAccessException
     */
    public void updateItem(TestGroceryItem aGroceryItem) throws GroceryCatalogDataAccessException;
    
    /**
     * This method can be used to update a list of GroceryItems.
     * 
     * @param aGroceryItemList
     * @throws GroceryCatalogDataAccessException
     */
    public void updateItems(Collection<TestGroceryItem> aGroceryItemList) throws GroceryCatalogDataAccessException;
    
    //+++++++++++++++++++++++++++++++
    // Delete Methods
    //+++++++++++++++++++++++++++++++

    /**
     * This method can be used to delete a GroceryItem from the database.
     * 
     * @param aGroceryItem
     * @throws GroceryCatalogDataAccessException
     */
    public void deleteItem(TestGroceryItem aGroceryItem) throws GroceryCatalogDataAccessException;
    
    /**
     * This method can be used to delete a list of GroceryItems from the database.
     * 
     * @param aGroceryItemList
     * @throws GroceryCatalogDataAccessException
     */
    public void deleteItems(Collection<TestGroceryItem> aGroceryItemList) throws GroceryCatalogDataAccessException;
}
