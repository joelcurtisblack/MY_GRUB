/**
 * GroceryCategory.java
 *
 * Copyright (c) 2013 Mo Better Tech, Co.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Mo Better Tech, Co.
 * 
 */
package com.mobettertech.grub.core.catalog;

/**
 * This class implements
 *
 * @author Joel Black
 *
 */
public enum GroceryCategory
{
    BAKERY(1),
    DELI(2),
    FRUITS(3),
    VEGTABLES(4),
    BREAD(5),
    DAIRY(6),
    CONDIMENTS(7),
    BEVERAGES(8),
    BAKING(9),
    SPICES(10),
    SAUCES(11),
    MEAT(12),
    CAN_JAR_GOODS(13),
    PACKAGED_FOODS(14),
    FROZEN_FOODS(15),
    SNACKS(16),
    BREAKFAST(17),
    PAPER_WRAPS(18),
    CLEANING(19),
    PERSONAL_CARE(20),
    BABY(21),
    PETS(22),    
    OILS(23),
    SEAFOOD(34);
    
    
    private int id = 0;

    /**
     * constructor
     * 
     * @param aId
     */
    private GroceryCategory(int aId)
    {
	id = aId;
    }
  
    
    /**
     * This method returns the unique id assigned to the category.
     * 
     * @return unique id associated with this grocery category
     */
    public int getId()
    {
	return id;
    }
        
    
}
