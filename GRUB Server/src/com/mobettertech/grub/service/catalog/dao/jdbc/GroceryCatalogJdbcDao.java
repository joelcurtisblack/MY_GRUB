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
import java.util.List;

import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.mobettertech.grub.service.catalog.dao.GroceryCatalogColumns;
import com.mobettertech.grub.service.catalog.dao.GroceryCatalogDataAccessException;
import com.mobettertech.grub.service.catalog.dao.IGroceryCatalogDao;
import com.mobettertech.grub.core.catalog.ItemFilter;
import com.mobettertech.grub.core.catalog.dto.GroceryItem;

/**
 * This class implements a JDBC based DAO for the Grocery Catalog database.
 * 
 * @author Joel C. Black
 *
 */
public class GroceryCatalogJdbcDao extends JdbcDaoSupport implements IGroceryCatalogDao
{
	

   public static final String TABLE_NAME = "grocery_catalog";
	
	
	
	
	
	
	@Override
	public void insertGroceryItem(GroceryItem aGroceryItem) throws GroceryCatalogDataAccessException 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertGroceryItems(Collection<GroceryItem> aGroceryItemCollection) throws GroceryCatalogDataAccessException 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<GroceryItem> retrieveAllGroceryItems() throws GroceryCatalogDataAccessException 
	{
	      List<GroceryItem> bookings = (List<GroceryItem>) this.getJdbcTemplate().query(
	              new RetrieveAllItemsPreparedStatementCreator( ), new FlightLegBookingExtractor() );
	        return bookings;
	}

	@Override
	public GroceryItem retrieveItems(ItemFilter aItemFilter) throws GroceryCatalogDataAccessException 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateGroceryItem(GroceryItem aGroceryItem) throws GroceryCatalogDataAccessException 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateGroceryItems(Collection<GroceryItem> aGroceryItemList) throws GroceryCatalogDataAccessException 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteGroceryItem(GroceryItem aGroceryItem) throws GroceryCatalogDataAccessException 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteGroceryItems(Collection<GroceryItem> aGroceryItemList) throws GroceryCatalogDataAccessException 
	{
		// TODO Auto-generated method stub
		
	}
	
	private class isertItemPreparedStatementCreator implements PreparedStatementCreator
	{
	}
	
	private class isertItemsPreparedStatementCreator implements PreparedStatementCreator
	{
	}
	
	private class RetrieveItemsPreparedStatementCreator implements PreparedStatementCreator
	{
	}

	private class RetrieveAllItemsPreparedStatementCreator implements PreparedStatementCreator
	{
	}

	private class UpdateItemPreparedStatementCreator implements PreparedStatementCreator
	{
	}
	
	private class UpdateItemsPreparedStatementCreator implements PreparedStatementCreator
	{
	}

	private class DeleteItemPreparedStatementCreator implements PreparedStatementCreator
	{
	}

	private class DeleteItemsPreparedStatementCreator implements PreparedStatementCreator
	{
	}
}
