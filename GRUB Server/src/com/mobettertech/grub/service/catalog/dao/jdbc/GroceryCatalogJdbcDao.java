/**
 * GroceryCatalogJdbcDao.java
 *
 * Copyright (c) 2013 Mo Better Tech, Co.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Mo Better Tech, Co.
 * 
 */
package com.mobettertech.grub.service.catalog.dao.jdbc;

import java.util.Collection;

import com.mobettertech.grub.service.catalog.dao.GroceryCatalogColumns;
import com.mobettertech.grub.service.catalog.dao.GroceryCatalogDataAccessException;
import com.mobettertech.grub.service.catalog.dao.IGroceryCatalogDao;
import com.mobettertech.grub.core.catalog.ItemFilter;
import com.mobettertech.grub.core.catalog.dto.GroceryItem;

public class GroceryCatalogJdbcDao implements  IGroceryCatalogDao
{
	

   public static final String TABLE_NAME = "grocery_catalog";
	
	
	
	
	
	
	@Override
	public void createItem(GroceryItem aGroceryItem) throws GroceryCatalogDataAccessException 
	{
	      List<FlightLegBooking> bookings = (List<FlightLegBooking>) this.getJdbcTemplate().query(
	              new GetByFlightLegIdPreparedStatementCreator( aFlightLegId,
	                    aAsOfDate ), new FlightLegBookingExtractor() );
	        return bookings;
		
	}

	@Override
	public void createItems(Collection<GroceryItem> aGroceryItemCollection) throws GroceryCatalogDataAccessException 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<GroceryItem> retrieveAllItems() throws GroceryCatalogDataAccessException 
	{
	      List<GroceryItem> bookings = (List<GroceryItem>) this.getJdbcTemplate().query(
	              new GetByFlightLegIdPreparedStatementCreator( aFlightLegId,
	                    aAsOfDate ), new FlightLegBookingExtractor() );
	        return bookings;
	}

	@Override
	public GroceryItem retrieveItems(ItemFilter aItemFilter) throws GroceryCatalogDataAccessException 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateItem(GroceryItem aGroceryItem) throws GroceryCatalogDataAccessException 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateItems(Collection<GroceryItem> aGroceryItemList) throws GroceryCatalogDataAccessException 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteItem(GroceryItem aGroceryItem) throws GroceryCatalogDataAccessException 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteItems(Collection<GroceryItem> aGroceryItemList) throws GroceryCatalogDataAccessException 
	{
		// TODO Auto-generated method stub
		
	}

}
