package com.corejava;

/**
 * Implement a class Bug that models a bug climbing up a pole. 
 * @author attajunyah
 *
 */
public class Bug1
{
   private String climbed = "";
   
   // Provide the getPosition and up methods
   /**
    * Represent the distance climbed by a string of - characters, one for every 10 cm.
    * Whenever it reaches the top of the pole (at 100 cm), it slides back to the bottom.
    */
   public void up()
   {
	   climbed = "-" + climbed;
	   if(climbed.equals("----------")){climbed = "";}
   }
   
   /**
    * Provide a method getPosition that returns the current position.
    * @return the current position
    */
   public int getPosition()
   {
	   return climbed.length() * 10;
   }
}