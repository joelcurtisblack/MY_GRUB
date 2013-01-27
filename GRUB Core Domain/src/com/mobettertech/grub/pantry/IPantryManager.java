/**
 * PantryManagerInterface.java
 *
 * Copyright (c) 2012 Mo Better Tech, Co.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Mo Better Tech, Co.
 */
package com.mobettertech.grub.pantry;

import java.util.List;

import com.mobettertech.grub.catalog.GroceryItem;

/**
 * This class implements the business interface of the Pantry SubSystem.
 * The Pantry houses the grocery inventory and provides access
 * to the items contained therein.
 *
 * @author Joel C. Black
 *
 */
public interface IPantryManager
{
   /**
    * This method is used to add a new item to the Pantry.
    * 
    * @param aItem
    * @throws PantryException
    */
   public void addItem(GroceryItem aItem) throws PantryException;

   /**
    * 
    * @param aItemId
    * @throws PantryException
    */
   public void removeItem(GroceryItem aItemId) throws PantryException;

   /**
    * This method is used to update the information
    * associated with a pantry item.
    * 
    * @throws PantryException
    */
   public void updateItem() throws PantryException;
   
   /**
    * 
    * @throws PantryException
    */
   public void markDepleted() throws PantryException;
   
   /**
    * 
    * @return
    * @throws PantryException
    */
   public GroceryItem retrieveItem() throws PantryException;
   
   /**
    * This method is used to retrieve items from the Pantry.
    * 
    * @return
    * @throws PantryException
    */
   public List<GroceryItem> reitrieveItemList() throws PantryException;

}
