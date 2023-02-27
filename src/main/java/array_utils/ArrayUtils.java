package array_utils;

import org.eclipse.jdt.annotation.NonNull;

/**
 * Utility class for Arrays of numbers.
 * 
 * @author Ville-Veikko Nieminen
 */
class ArrayUtils {

	/**
	 * Finds minimum amount of numbers that can fit (in natural order) between any
	 * of given values. 0 is considered as valid result if there is adjacent or
	 * duplicate values.
	 * 
	 * @param values numbers or an array of numbers
	 * @return minValueOfNumbers minimum amount of numbers that can be placed
	 *         between given values
	 * @throws IllegalArgumentException if you give less than 2 values
	 */
	public static int findMinimumNumbersBetweenValues(@NonNull final int... values) {
		if (values.length < 2) {
			throw new IllegalArgumentException("There must be atleast two values");
		}
		// Does the same thing as Arrays.sort(), just wanted to create my own methods
		// for this assignment.
		int[] sortedByNaturalOrder = sortByNaturalOrder(values);
		int minValueOfNumbers = 0;

		for (int i = 0; i < sortedByNaturalOrder.length - 1; i++) {
			int numbersBetween = getAmountOfNumbersBetween(sortedByNaturalOrder[i], sortedByNaturalOrder[i + 1]);
			if (i == 0 || numbersBetween < minValueOfNumbers) {
				minValueOfNumbers = numbersBetween;
			}
			// minimum value reached, no need to continue iterating
			if (minValueOfNumbers == 0) {
				return minValueOfNumbers;
			}
		}
		return minValueOfNumbers;
	}

	/**
	 * Copies given array and sorts it in natural order (ascending). Given array is
	 * left untouched.
	 * 
	 * @param array array to copy for sorting
	 * @return sorted copy of given array
	 */
	public static int[] sortByNaturalOrder(@NonNull final int[] array) {
		// Does the same thing as Arrays.copyOf()
		int[] sortedArray = copyArray(array);
		
		for (int i = 0; i < sortedArray.length; i++) {
			for (int j = i + 1; j < sortedArray.length; j++) {
				if (sortedArray[j] < sortedArray[i]) {
					swap(sortedArray, i, j);
				}
			}
		}
		return sortedArray;
	}

	/**
	 * Copies given array of numbers.
	 * 
	 * @param arrayToCopy
	 * @return copy of given array
	 */
	public static int[] copyArray(@NonNull int[] arrayToCopy) {
		int[] copy = new int[arrayToCopy.length];
		
		for (int i = 0; i < arrayToCopy.length; i++) {
			copy[i] = arrayToCopy[i];
		}
		return copy;
	}

	/**
	 * Checks how many numbers there are between two values in natural order.
	 * 
	 * @param from
	 * @param to
	 * @return the amount of numbers between given values
	 */
	private static int getAmountOfNumbersBetween(final int from, final int to) {
		return from < to ? to - from - 1 : 0;
	}

	/**
	 * Swaps the values of given indexes in array.
	 * 
	 * @param array  array that is modified
	 * @param index1 index which value is swapped
	 * @param index2 index which value is swapped
	 */
	private static void swap(int[] array, int index1, int index2) {
		int valueFromIndex1 = array[index1];
		int valueFromIndex2 = array[index2];

		array[index1] = valueFromIndex2;
		array[index2] = valueFromIndex1;
	}

}