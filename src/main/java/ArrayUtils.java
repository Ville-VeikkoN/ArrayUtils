import org.eclipse.jdt.annotation.NonNull;

/**
 * Utility class for Arrays of numbers.
 * 
 * @author Ville-Veikko Nieminen
 */
class ArrayUtils {

	/**
	 * Finds minimum amount of numbers that can fit between any of given values in
	 * natural order. 0 is considered as valid result if there is adjacent or
	 * duplicate values.
	 * 
	 * @param values that can be n amount of numbers or an array
	 * @return minValueOfNumbers minimum of numbers that can be placed between given
	 *         values
	 * @throws IllegalArgumentException if you give less than 2 values
	 */
	public static int findMinimumNumbersBetweenValues(@NonNull final int... values) {
		if (values.length < 2) {
			throw new IllegalArgumentException("There must be atleast two values");
		}

		// Sorting these values before, makes the checking a lot easier.
		// Does the same thing as Arrays.sort(), just wanted to create my own methods.
		int[] sortedByNaturalOrder = sortByNaturalOrder(values);

		int minValueOfNumbers = getAmountOfNumbersBetween(sortedByNaturalOrder[0], sortedByNaturalOrder[1]);

		for (int i = 1; i < sortedByNaturalOrder.length - 1; i++) {
			int numbersBetween = getAmountOfNumbersBetween(sortedByNaturalOrder[i], sortedByNaturalOrder[i + 1]);

			if (numbersBetween < minValueOfNumbers) {
				minValueOfNumbers = numbersBetween;
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

		// Does the same thing as Arrays.copyOf(), just wanted to create my own methods.
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
	 * @return numbersBetween the amount of numbers between given values
	 */
	private static int getAmountOfNumbersBetween(final int from, final int to) {
		int numbersBetween = 0;

		if (from < to) {
			for (int number = from + 1; number < to; number++) {
				numbersBetween++;
			}
		}
		return numbersBetween;
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