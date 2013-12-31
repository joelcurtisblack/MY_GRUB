package com.mobettertech.grub.service.catalog.dao.jdbc;

import java.util.Collection;

import com.mobettertech.grub.service.catalog.dao.GroceryCatalogDataAccessException;
import com.mobettertech.grub.service.catalog.dao.IGroceryCatalogDao;
import com.mobettertech.grub.service.core.catalog.ItemFilter;
import com.mobettertech.grub.service.core.catalog.dto.GroceryItem;

public class GroceryCatalogJdbcDao implements  IGroceryCatalogDao
{

	@Override
	public void createItem(GroceryItem aGroceryItem) throws GroceryCatalogDataAccessException 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createItems(Collection<GroceryItem> aGroceryItemCollection) throws GroceryCatalogDataAccessException 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<GroceryItem> retrieveAllItems() throws GroceryCatalogDataAccessException 
	{
		// TODO Auto-generated method stub
		return null;
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
