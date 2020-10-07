/*
 * A row of black and white tiles needs to be placed along a wall. 
 * For aesthetic reasons, the architect has specified that the first and last tile shall be black.

Your task is to compute the number of tiles needed and the gap at each end, given the space available and the width of each tile.
let’s assume the following dimensions:

•Total width: 100 inches
•Tile width: 5 inches.

 */

package com.corejava;

import java.util.Scanner;

public class Tiles {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// Prompt user for total width and title width
		System.out.print("Total Width: ");
		int totalWidth = in.nextInt();
		System.out.print("Tile Width: ");
		int tileWidth = in.nextInt();
		
		int numberOfPairs = (totalWidth - tileWidth) / (2 * tileWidth);
		int numberOfTiles = 1 + 2 * numberOfPairs;
		double gap = (totalWidth - numberOfTiles * tileWidth) / 2.0;
		
		System.out.println("Number of Tiles: " + numberOfTiles);
		System.out.println("Gap at each end: " + gap);
	}
}
