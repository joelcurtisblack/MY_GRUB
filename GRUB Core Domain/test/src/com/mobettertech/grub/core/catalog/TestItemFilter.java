/**
 * TestItemFilter.java
 *
 * Copyright (c) 2013 Mo Better Tech, Co.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Mo Better Tech, Co.
 * 
 */
package com.mobettertech.grub.core.catalog;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mobettertech.grub.core.catalog.model.GroceryItem;

/**
 * This class implements
 *
 * @author Joel Black
 *
 */
public class TestItemFilter
{

    private ItemFilter itemFilter = null;
    
    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception
    {
    }
    

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception
    {
    }

    /**
     * Test method for {@link com.mobettertech.grub.core.catalog.ItemFilter#isItemMatched(com.mobettertech.grub.core.catalog.TestGroceryItem)}.
     */
    @Test
    public void testIsItemMatched()
    {	
	boolean isMatch = false;
	UPC aUPC = new UPC("12345ABCDE");		
	GroceryItem aGroceryItem = null;
	ItemFilter itemFilter = null;
	
	//++++++++++++++++++++++++++++++++++++++++
	// Positive Test - Matching just Category
	//++++++++++++++++++++++++++++++++++++++++	
	aGroceryItem = 	new GroceryItem( 1, GroceryCategory.BAKERY, "genericName", 
					 "specificName", "brandName", aUPC);

	itemFilter= getTestFilter( GroceryCategory.BAKERY, null, null, null, null);
	
	isMatch= itemFilter.isItemMatched(aGroceryItem);
	assertTrue("GroceryCategory doesn't match", isMatch);
	
	//++++++++++++++++++++++++++++++++++++++++++
	// Positive Test - Matching Generic Name
	//++++++++++++++++++++++++++++++++++++++++++
	aUPC = new UPC("12345ABCDE");		
	aGroceryItem = new GroceryItem( 1, GroceryCategory.BAKERY, "genericName", 
					"specificName", "brandName", aUPC);

	itemFilter= getTestFilter( null, "genericName", null, null, null);
	
	isMatch= itemFilter.isItemMatched(aGroceryItem);
	assertTrue("Generic Name doesn't match", isMatch);

	//+++++++++++++++++++++++++++++++++++
	// Positive Test - Matching Specific Name
	//+++++++++++++++++++++++++++++++++++
	aUPC = new UPC("12345ABCDE");		
	aGroceryItem = new GroceryItem( 1, GroceryCategory.BAKERY, "genericName", 
					"specificName", "brandName", aUPC);

	itemFilter = getTestFilter( null, null, "specificName", null, null);
	
	isMatch= itemFilter.isItemMatched(aGroceryItem);
	assertTrue("Specific Name doesn't match", isMatch);
	
	//+++++++++++++++++++++++++++++++++++
	// Positive Test - Matching Brand Name
	//+++++++++++++++++++++++++++++++++++
	aUPC = new UPC("12345ABCDE");		
	aGroceryItem = new GroceryItem( 1, GroceryCategory.BAKERY, "genericName", 
					"specificName", "brandName", aUPC);

	itemFilter = getTestFilter( null, null, null, "brandName", null);
	
	isMatch= itemFilter.isItemMatched(aGroceryItem);
	assertTrue("Brand Name doesn't match", isMatch);
	
	//+++++++++++++++++++++++++++++++++++
	// Positive Test - Matching UPC
	//+++++++++++++++++++++++++++++++++++
	aUPC = new UPC("12345ABCDE");		
	aGroceryItem = new GroceryItem( 1, GroceryCategory.BAKERY, "genericName", 
					"specificName", "brandName", aUPC);

	itemFilter = getTestFilter( null, null, null, null, aUPC);
	
	isMatch= itemFilter.isItemMatched(aGroceryItem);
	assertTrue("UPC doesn't match", isMatch);
	
	//+++++++++++++++++++++++++++++++++++
	// Negative Test - Filter is wrong
	//+++++++++++++++++++++++++++++++++++
	aUPC = new UPC("12345ABCDE");		
	aGroceryItem = new GroceryItem( 1, GroceryCategory.BAKERY, "genericName", 
					"specificName", "brandName", aUPC);

	itemFilter = getTestFilter( GroceryCategory.BABY, null, null, null, aUPC);
	
	isMatch= itemFilter.isItemMatched(aGroceryItem);
	assertFalse("Filter was not supposed to match", isMatch);
	

    }


    /**
     * This method create am ItemFilter using the value passed in
     * 
     * @param aCategory
     * @param aGenericName
     * @param aSpecificName
     * @param aBrandName
     * @param aUPC
     * @return
     */
    private ItemFilter getTestFilter(GroceryCategory aCategory, String aGenericName, String aSpecificName, 
	                             String aBrandName, UPC aUPC)
    {
	
	ItemFilter itemFilter = new ItemFilter();
	itemFilter.setCategoryID( aCategory );
	itemFilter.setGenericName(aGenericName);
	itemFilter.setSpecificName(aSpecificName);
	itemFilter.setBrandName(aBrandName);
	itemFilter.setUpcCode(aUPC);
	
	return itemFilter;
    }

}
