/**
 * PantryException.java
 *
 * Copyright (c) 2012 Mo Better Tech, Co.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Mo Better Tech, Co.
 */
package com.mobettertech.grub.pantry;

/**
 * This class implements an Exception used to indicate 
 * an error occurred during Panty processing. 
 *
 * @author Joel C. Black
 *
 */
public class PantryException extends Exception
{
         
   /**
    * default constructor
    */
   public PantryException()
   {
      super();
      // TODO Auto-generated constructor stub
   }

   /**
    * @param aArg0
    * @param aArg1
    */
   public PantryException(String aArg0, Throwable aArg1)
   {
      super(aArg0, aArg1);
      // TODO Auto-generated constructor stub
   }

   /**
    * @param aArg0
    */
   public PantryException(String aArg0)
   {
      super(aArg0);
      // TODO Auto-generated constructor stub
   }

   /**
    * @param aArg0
    */
   public PantryException(Throwable aArg0)
   {
      super(aArg0);
      // TODO Auto-generated constructor stub
   }

}
