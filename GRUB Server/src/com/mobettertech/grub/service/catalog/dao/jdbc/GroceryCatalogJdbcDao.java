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

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.mobettertech.grub.service.catalog.dao.GroceryCatalogColumns;
import com.mobettertech.grub.service.catalog.dao.GroceryCatalogDataAccessException;
import com.mobettertech.grub.service.catalog.dao.IGroceryCatalogDao;
import com.mobettertech.grub.core.catalog.ItemFilter;
import com.mobettertech.grub.core.catalog.model.GroceryItem;

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
	              new RetrieveAllItemsPreparedStatementCreator( ), null );
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
	
	
	/**
	 * This class implements a PreparedStatementCreator responsible for inserting
	 * a GroceryItem into the Grocery_Catalog database.
	 * 
	 * @author Joel C. Black
	 *
	 */
	private static class InsertGroceryItemPreparedStatementCreator implements PreparedStatementCreator
	{
		private static String SQL = "INSERT INTO " + TABLE_NAME + "";

		GroceryItem groceryItem = null;
		
		
		public InsertGroceryItemPreparedStatementCreator(GroceryItem aGroceryItem)
		{
			super();
			groceryItem = aGroceryItem;		
		}
		
		
		@Override
		public PreparedStatement createPreparedStatement(Connection arg0) throws SQLException 
		{
			// TODO Auto-generated method stub
			return null;
		}
	}
	
	/**
	 * This class implements a PreparedStatementCreator responsible for inserting
	 * multiple
	 * 
	 * @author Joel C. Black
	 *
	 */
	private static class InsertGroceryItemsPreparedStatementCreator implements PreparedStatementCreator
	{
		private static String SQL = "INSERT ...";

		List<GroceryItem> groceryItemList;
		
		
		public InsertGroceryItemsPreparedStatementCreator(List<GroceryItem> aGroceryItemsList)
		{
			super();
			groceryItemList = aGroceryItemsList;
		
		}
		
		
		@Override
		public PreparedStatement createPreparedStatement(Connection arg0) throws SQLException 
		{
			// TODO Auto-generated method stub
			return null;
		}
	}
	
	private static class RetrieveGroceryItemsPreparedStatementCreator implements PreparedStatementCreator
	{
	}

	private static class RetrieveAllGroceryItemsPreparedStatementCreator implements PreparedStatementCreator
	{
	}

	private static class UpdateGroceryItemPreparedStatementCreator implements PreparedStatementCreator
	{
	}
	
	private static class UpdateGroceryItemsPreparedStatementCreator implements PreparedStatementCreator
	{
	}

	private static class DeleteGroceryItemPreparedStatementCreator implements PreparedStatementCreator
	{
	}

	private static class DeleteGroceryItemsPreparedStatementCreator implements PreparedStatementCreator
	{
	}
}
