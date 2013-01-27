/**
 * GroceryCatalog.java
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
 * This class implements a Grocery Catalog. The Grocery catalog
 * contains a default list of all the Grocery Items that can be
 * added to the Pantry or to a shopping list or a recipe.
 * 
 * @author Joel Black
 * 
 */
public class GroceryCatalog implements IGroceryCatalog
{
    
    private IGroceryCatalogDao groceryCatalogDao = null;
    
    /**
     * 
     */
    public GroceryCatalog()
    {
	super();
    }


 
    /*
     * @see
     * com.mobettertech.grub.catalog.IGroceryCatalog#addItems(java.util.Collection
     * )
     */
    @Override
    public void addItems(Collection<GroceryItem> aGroceryItem)
    {
	// TODO Auto-generated method stub

    }

    /*
     * @see
     * com.mobettertech.grub.catalog.IGroceryCatalog#addItem(com.mobettertech
     * .grub.catalog.GroceryItem)
     */
    @Override
    public void addItem(GroceryItem aGroceryItem)
    {
	// TODO Auto-generated method stub

    }

    /*
     * @see
     * com.mobettertech.grub.catalog.IGroceryCatalog#editItem(com.mobettertech
     * .grub.catalog.GroceryItem)
     */
    @Override
    public void editItem(GroceryItem aGroceryItem)
    {
	// TODO Auto-generated method stub

    }

    /*
     * @see com.mobettertech.grub.catalog.IGroceryCatalog#getAllItems()
     */
    @Override
    public Collection<GroceryItem> getAllItems()
    {
	// TODO Auto-generated method stub
	return null;
    }

    /*
     * @see
     * com.mobettertech.grub.catalog.IGroceryCatalog#getItems(com.mobettertech
     * .grub.catalog.ItemFilter)
     */
    @Override
    public Collection<GroceryItem> getItems(ItemFilter aItemFilter)
    {
	// TODO Auto-generated method stub
	return null;
    }

    /**
     * @return the groceryCatalogDao
     */
    public IGroceryCatalogDao getGroceryCatalogDao()
    {
        return groceryCatalogDao;
    }

    /**
     * @param aGroceryCatalogDao the groceryCatalogDao to set
     */
    public void setGroceryCatalogDao(IGroceryCatalogDao aGroceryCatalogDao)
    {
        groceryCatalogDao = aGroceryCatalogDao;
    }
    
    
}
