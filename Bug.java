package com.corejava;

/**
 * Implement a class Bug that models a bug climbing up a pole. 
 * @author attajunyah
 *
 */
public class Bug
{
   private int position;
   
   // Provide the getPosition and up methods
   /**
    * Each time the up method is called, the bug climbs 10 cm.
    * Whenever it reaches the top of the pole (at 100 cm), it slides back to the bottom.
    */
   public void up()
   {
      position = position + 10;
      if(position == 100){position = 0;}
   }
   
   /**
    * Provide a method getPosition that returns the current position.
    * @return the current position
    */
   public int getPosition()
   {
      return position;
   }
}