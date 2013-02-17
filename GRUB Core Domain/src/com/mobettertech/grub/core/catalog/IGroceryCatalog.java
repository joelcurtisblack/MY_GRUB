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
    // ++++++++++++++++++++++++++++++++
    // Addition Methods
    // ++++++++++++++++++++++++++++++++
    public void addItems(Collection<TestGroceryItem> aGroceryItem);

    public void addItem(TestGroceryItem aGroceryItem);

    // ++++++++++++++++++++++++++++++++
    // Edit Methods
    // ++++++++++++++++++++++++++++++++
    public void editItem(TestGroceryItem aGroceryItem);

    // ++++++++++++++++++++++++++++++++
    // Retrieval Methods
    // ++++++++++++++++++++++++++++++++
    public Collection<TestGroceryItem> getAllItems();

    public Collection<TestGroceryItem> getItems(ItemFilter aItemFilter);
}
