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
package com.mobettertech.grub.service.catalog;

import java.util.Collection;

import com.mobettertech.grub.core.catalog.dto.GroceryItem;
import com.mobettertech.grub.core.catalog.IGroceryCatalogManager;
import com.mobettertech.grub.core.catalog.ItemFilter;
import com.mobettertech.grub.service.catalog.dao.IGroceryCatalogDao;


/**
 * This class implements a Grocery Catalog. The Grocery catalog
 * contains a default list of all the Grocery Items that can be
 * added to the Pantry or to a shopping list or a recipe.
 * 
 * @author Joel C. Black
 * 
 */
public class GroceryCatalog implements IGroceryCatalogManager
{
    
    private IGroceryCatalogDao groceryCatalogDao = null;


    
}
