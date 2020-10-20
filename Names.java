/**
 * Write a method lastNameFirst that takes a string containing a name 
 * such as "Harry Smith" or "Mary Jane Lee", and that returns the string 
 * with the last name first, such as "Smith, Harry" or "Lee, Mary Jane".
*/
package com.corejava;

public class Names
{
   /**
      Changes a name so that the last name comes first.
      @param name a name such as "Mary Jane Lee"
      @return the reversed name, such as "Lee, Mary Jane". 
      If name has no spaces, it is returned without change.
   */
   public static String lastNameFirst(String name)
   {

    String result = "";
    if(!name.contains(" "))
    {
    String firstOnly = name.substring(0);
    return firstOnly;
    }

    else
    {
    String first = name.substring(name.lastIndexOf(" ")+1);
    String last = name.substring(0, name.lastIndexOf(" "));
    result =  first + ", " + last;


    return result;
    }
   }
}