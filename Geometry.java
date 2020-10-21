/**
 * Given the corner points of a triangle (x1, y1), (x2, y2), (x3, y3), compute the area.
 * Hint: The area of the triangle with corner points (0, 0), (x1, y1), and (x2, y2) is
 * 	|x1.y2 - x2.y1|
 * __________________
 *         2
	
 */


package com.corejava;

public class Geometry
{
	public static void main (String[] args)
	{
		System.out.println(triangleArea(0, 0, 1, 0, 0, 1));
		System.out.println(triangleArea(10, 10, 11, 10, 10, 11));
		System.out.println(triangleArea(10, 0, 0, 10, 10, 10));
		System.out.println(triangleArea(10, 10, 10, -10, 0, 0));
		System.out.println(triangleArea(10, 10, 20, 20, 30, 30));
	}
   /**
      Computes the area of a triangle
      @param x1 the x-coordinate of the first corner
      @param y1 the y-coordinate of the first corner
      @param x2 the x-coordinate of the second corner
      @param y2 the y-coordinate of the second corner
      @param x3 the x-coordinate of the third corner
      @param y3 the y-coordinate of the third corner
      @return the area of the triangle
   */
   public static double triangleArea(double x1, double y1,
      double x2, double y2, double x3, double y3)
   {
      
      if (x1 == 0 && y1 == 0)
      {
         double areaWithOriginZero = Math.abs((x2 * y3) - (x3 * y2)) / 2.0;
         return areaWithOriginZero;
      }
      else 
      {
         double area = Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0;
         return area;
      }
   }
}