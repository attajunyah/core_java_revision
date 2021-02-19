package com.corejava;

public class Duplicates {
	/**
	 * Removes duplicates from an array.
	 * @param a an array
	 * @param currentSize the current size of the array
	 * @return the new size
	 */
	
	public static int removeDuplicates(String[] a, int currentSize)
	{
		int start = 0; 
		while (start < currentSize)
		{
			int removed = removeFromTail(a, currentSize,
					start + 1, a[start]);
			currentSize = currentSize - removed;
			start++;
		}
		return currentSize;
	}
	
	/**
	 * Removes duplicates of a given value from the tail of an array
	 * @param a an array
	 * @param currentSize the current size
	 * @param start the first position of the tail
	 * @param toBeRemoved the value to be removed
	 * @return the number of elements removed
	 */
	public static int removeFromTail(String[] a, int currentSize, 
			int start, String toBeRemoved)
	{
		int source = start;
		int target = start;
		int removed = 0;
		while (source < currentSize)
		{
			if (a[source].equals(toBeRemoved))
			{
				removed++;
			}
			else
			{
				a[target] = a[source];
				target++;
			}
			source++;
		}
		return removed;
	}

	public static void main(String[] args) {
		String[] values = {"A","C", "C", "B", "A", "C", "B", "B", "A"};
		int newSize = removeDuplicates(values, values.length);
		for (int i = 0; i < newSize; i++)
		{
			System.out.print(values[i] + " ");
		}
		System.out.println();
	}

}
