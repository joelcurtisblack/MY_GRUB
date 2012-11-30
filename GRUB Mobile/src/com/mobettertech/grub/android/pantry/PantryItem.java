/**
 * PantryItemDo.java
 *
 * Copyright (c) 2009 Mo Better Tech, Co.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Mo Better Tech, Co.
 */
package com.mobettertech.grub.android.pantry;

/**
 * This class implements
 *
 * @author Joel
 *
 */
public class PantryItem
{
   private String  itemName = null;
   private String  containerType = null;
   private Integer containerSize = 0;
   private String  groceryStoreName = null;
   private boolean staple = false;
   private Integer qty = 0;
   private Double  cost = 0.00;
   
   
   
   /**
    * @return the itemName
    */
   public String getItemName()
   {
      return this.itemName;
   }
   /**
    * @param aItemName the itemName to set
    */
   public void setItemName(String aItemName)
   {
      this.itemName = aItemName;
   }
   /**
    * @return the containerType
    */
   public String getContainerType()
   {
      return this.containerType;
   }
   /**
    * @param aContainerType the containerType to set
    */
   public void setContainerType(String aContainerType)
   {
      this.containerType = aContainerType;
   }
   /**
    * @return the containerSize
    */
   public Integer getContainerSize()
   {
      return this.containerSize;
   }
   /**
    * @param aContainerSize the containerSize to set
    */
   public void setContainerSize(Integer aContainerSize)
   {
      this.containerSize = aContainerSize;
   }
   /**
    * @return the groceryStoreName
    */
   public String getGroceryStoreName()
   {
      return this.groceryStoreName;
   }
   /**
    * @param aGroceryStoreName the groceryStoreName to set
    */
   public void setGroceryStoreName(String aGroceryStoreName)
   {
      this.groceryStoreName = aGroceryStoreName;
   }
   /**
    * @return the stapleFalg
    */
   public boolean isStaple()
   {
      return this.staple;
   }
   /**
    * @param aStapleFalg the stapleFalg to set
    */
   public void setStaple(boolean aStapleFlag)
   {
      this.staple = aStapleFlag;
   }
   /**
    * @return the qty
    */
   public Integer getQty()
   {
      return this.qty;
   }
   /**
    * @param aQty the qty to set
    */
   public void setQty(Integer aQty)
   {
      this.qty = aQty;
   }
   /**
    * @return the cost
    */
   public Double getCost()
   {
      return this.cost;
   }
   /**
    * @param aCost the cost to set
    */
   public void setCost(Double aCost)
   {
      this.cost = aCost;
   }

}
