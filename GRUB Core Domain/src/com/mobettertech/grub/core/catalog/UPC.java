/**
 * UPC.java
 *
 * Copyright (c) 2009 Mo Better Tech, Co.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Mo Better Tech, Co.
 */
package com.mobettertech.grub.catalog;

import java.awt.image.BufferedImage;


/**
 * This class implements an Universal Product Code. This is a unique code
 * assigned to products.
 *
 * @author Joel
 *
 */
public class UPC
{
   private String upc_code = null;
   private BufferedImage upcImage = null;
   
   
   /**
    * constructor 
    * 
    * @param aUpcCode - string representing the code of the UPC
    * @param aUpcImage - a bitmap of the UPC bar code
    */
   public UPC(String aUpcCode, BufferedImage aUpcImage)
   {
      this.upc_code = aUpcCode;
      this.upcImage = aUpcImage;
   }


   /**
    * @return the upc_code
    */
   public String getUpc_code()
   {
      return this.upc_code;
   }


   /**
    * @return the upcImage
    */
   public BufferedImage getUpcImage()
   {
      return this.upcImage;
   }
   
}
