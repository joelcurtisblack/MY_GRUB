/**
 * GrocerCatalogJdbcDao.java
 *
 * Copyright (c) 2013 Mo Better Tech, Co.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Mo Better Tech, Co.
 * 
 */
package com.mobettertech.grub.server.catalog.dao;

import java.util.Collection;

import com.mobettertech.grub.core.catalog.GroceryItem;
import com.mobettertech.grub.core.catalog.IGroceryCatalogDao;
import com.mobettertech.grub.core.catalog.ItemFilter;

/**
 * This class implements
 *
 * @author Joel Black
 *
 */
public class GroceryCatalogJdbcDao implements IGroceryCatalogDao
{
    
    private static final String GROCERY_CATALOG_TABLE = "grocery_items";
    private static final String GROCERY_CATEGORIES_TABLE = "grocery_items";
    
    

    @Override
    public void createItem(GroceryItem aArg0)
    {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void createItems(Collection<GroceryItem> aArg0)
    {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void deleteItem(GroceryItem aArg0)
    {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void deleteItems(Collection<GroceryItem> aArg0)
    {
	// TODO Auto-generated method stub
	
    }

    @Override
    public Collection<GroceryItem> retrieveAllItems()
    {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public GroceryItem retrieveItem(GroceryItem aArg0)
    {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public GroceryItem retrieveItems(ItemFilter aArg0)
    {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void updateItem(GroceryItem aArg0)
    {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void updateItems(Collection<GroceryItem> aArg0)
    {
	// TODO Auto-generated method stub
	
    }

}
