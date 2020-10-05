package com.corejava;

public class ShowCurrentTime {

	public static void main(String[] args) {
		// Obtain the total milliseconds since midnight, January 1, 1970
		long totalMilliseconds = System.currentTimeMillis();
		
		// Obtain the total seconds by converting milliseconds to seconds
		long totalSeconds = totalMilliseconds / 1000;
	
		// Compute the current second 
		long currentSecond = totalSeconds % 60;
		
		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		
		//Compute the current minute
		long currentMinutes = totalMinutes % 60;
		
		// Obtain the total hours 
		long totalHours = totalMinutes / 60;
		
		// Compute the current Hour
		long currentHour = totalHours % 24;
		System.out.println("The current time is " + currentHour +  ":" + currentMinutes + ":" + currentSecond + " GMT");
		

	}

}
