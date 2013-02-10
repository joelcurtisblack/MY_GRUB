/**
 * UPC.java
 *
 * Copyright (c) 2009 Mo Better Tech, Co.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Mo Better Tech, Co.
 */
package com.mobettertech.grub.core.catalog;

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
 
   /*
    * @see java.lang.Object#hashCode()
    */
   @Override
   public int hashCode()
   {
	final int prime = 31;
	int result = 1;
	result = prime * result
	        + ((upc_code == null) ? 0 : upc_code.hashCode());
	return result;
   }


   /*
    * @see java.lang.Object#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object obj)
   {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	UPC other = (UPC) obj;
	if (upc_code == null)
	{
	    if (other.upc_code != null)
		return false;
	}
	else if (!upc_code.equals(other.upc_code))
	    return false;
	return true;
   }
   
   
}
