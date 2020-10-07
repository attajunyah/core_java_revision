/*
 * A robot needs to retrieve an item that is located in rocky terrain adjacent to a road. 
 * The robot can travel at a faster speed on the road than on the rocky terrain, 
 * so it will want to do so for a certain distance before moving on a straight line to the item.
 * Your task is to compute the total time taken by the robot to reach its goal, given the following inputs:
 * 		The distance between the robot and the item in the x- and y-direction (dx and dy)
 * 		The speed of the robot on the road and the rocky terrain (s1 and s2)
 * 		The length l1 of the first segment (on the road)
 */

package com.corejava;

import java.util.Scanner;

public class TravelTime
{
   public static void main(String[] args)
   {      
      Scanner in = new Scanner(System.in);
      System.out.print("Distance to item along x-axis: ");
      double xDistance = in.nextDouble();
      System.out.print("Distance to item along y-axis: ");
      double yDistance = in.nextDouble();
      System.out.print("Length of segment 1: ");
      double segment1Length = in.nextDouble();
      System.out.print("Speed along segment 1: ");
      double segment1Speed = in.nextDouble();
      System.out.print("Speed along segment 2: ");
      double segment2Speed = in.nextDouble();

      double segment1Time = segment1Length / segment1Speed;
      double segment2Length = Math.sqrt(Math.pow(xDistance, 2)
         + Math.pow(yDistance - segment1Length, 2));
      double segment2Time = segment2Length / segment2Speed;
      double totalTime = segment1Time + segment2Time;
      System.out.println("Total time: " + totalTime);
   }
}