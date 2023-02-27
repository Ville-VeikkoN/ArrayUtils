package array_utils;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] array = stringToIntArray(args[0]);
		int result = ArrayUtils.findMinimumNumbersBetweenValues(array);
		System.out.println(String.format("Minimum amount of numbers between values: %s is: %s", Arrays.toString(array), result));
	}

	public static int[] stringToIntArray(String input) {
		String[] separatedByComma = input.split(",");
		int[] intArray = new int[separatedByComma.length];
		for (int i = 0; i < separatedByComma.length; i++) {
			intArray[i] = Integer.parseInt(separatedByComma[i]);
		}
		return intArray;
	}
}
