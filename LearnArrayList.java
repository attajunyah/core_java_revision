package com.corejava;
import java.util.ArrayList;

public class LearnArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Frimpong Atta Junior");
		names.add("Osei");
		
		String firstName = names.get(0);
		String lastName = names.get(1);
		
		names.set(0, "Akwasi Frimpong Atta Junior");
		
		System.out.println(names);
		
		System.out.println(firstName);
		System.out.println(lastName);

	}

}
