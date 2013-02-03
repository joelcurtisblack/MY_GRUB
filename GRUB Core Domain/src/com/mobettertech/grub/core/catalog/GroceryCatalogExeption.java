/**
 * GroceryCatalogExeption.java
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
 * This class implements an Exception used to indicate a problem occurred in 
 * one of the GroceryCatalog components. 
 *
 * @author Joel Black
 *
 */
public class GroceryCatalogExeption extends Exception
{

    /**
     * 
     */
    public GroceryCatalogExeption()
    {
	// TODO Auto-generated constructor stub
    }

    /**
     * @param aMessage
     */
    public GroceryCatalogExeption(String aMessage)
    {
	super(aMessage);
	// TODO Auto-generated constructor stub
    }

    /**
     * @param aCause
     */
    public GroceryCatalogExeption(Throwable aCause)
    {
	super(aCause);
	// TODO Auto-generated constructor stub
    }

    /**
     * @param aMessage
     * @param aCause
     */
    public GroceryCatalogExeption(String aMessage, Throwable aCause)
    {
	super(aMessage, aCause);
	// TODO Auto-generated constructor stub
    }

}
