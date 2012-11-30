/**
 * ShoppingList.java
 *
 * Copyright (c) 2009 Mo Better Tech, Co.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Mo Better Tech, Co.
 */
package com.mobettertech.grub.android.shopping;

import java.util.Date;

/**
 * This class represents an individual Shopping List. It can be used to store 
 * the contents of a row of data from the shopping list database table. A 
 * Shopping list has a unique id (name) and can be associated with a specific
 * grocery store. A Shopping list also supports the ability to assign a due 
 * date, which indicates a time that the shopping should should occur by. Am
 * alarm can also be set for a shopping list which will be used by the 
 * system to send a shopping notification.
 *
 * @author Joel C. Black
 *
 */
public class ShoppingList
{
   String listName = null;
   String groceryStoreName = null;
   Date dueDate = null;
   Date alarm = null;
   /**
    * @return the listName
    */
   public String getListName()
   {
      return this.listName;
   }
   /**
    * @param aListName the listName to set
    */
   public void setListName(String aListName)
   {
      this.listName = aListName;
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
    * @return the dueDate
    */
   public Date getDueDate()
   {
      return this.dueDate;
   }
   /**
    * @param aDueDate the dueDate to set
    */
   public void setDueDate(Date aDueDate)
   {
      this.dueDate = aDueDate;
   }
   /**
    * @return the alarm
    */
   public Date getAlarm()
   {
      return this.alarm;
   }
   /**
    * @param aAlarm the alarm to set
    */
   public void setAlarm(Date aAlarm)
   {
      this.alarm = aAlarm;
   }

}
