package array_utils;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;

public class ArrayUtilsTest {

	@Test
	public void testfindMinimumNumbersBetweenValuesUsingArray() {
		int[] array = new int[] { -3, 1, 3, 10, 4 };
		// 0 because of 3 and 4
		assertEquals(0, ArrayUtils.findMinimumNumbersBetweenValues(array));

		// Change the order
		array = new int[] { 4, 10, 3, 1, -3 };
		// 0 because of 3 and 4
		assertEquals(0, ArrayUtils.findMinimumNumbersBetweenValues(array));

		// Test with array containing same values
		array = new int[] { 1, 1, 2, 2, 3 };
		// 0 because of duplicates
		assertEquals(0, ArrayUtils.findMinimumNumbersBetweenValues(array));

		array = new int[] { 1, 92, 8, 32, -7 };
		// 6 because there is 2, 3, 4, 5, 6 and 7 between 1 and 8
		assertEquals(6, ArrayUtils.findMinimumNumbersBetweenValues(array));

	}

	@Test
	public void testfindMinimumNumbersBetweenValuesUsingIntegers() {
		// 2 and 3 between 1 and 4
		assertEquals(2, ArrayUtils.findMinimumNumbersBetweenValues(1, 4, 8, 16, 32));
		
		// 5, 6 and 7 between 4 and 8
		assertEquals(3, ArrayUtils.findMinimumNumbersBetweenValues(4, 8, 16, 32, 64));
		
		// -2, -1, 0, 1 ,2, 3 and 4 between -3 and 5
		assertEquals(7, ArrayUtils.findMinimumNumbersBetweenValues(-3, 5, 90, -100));
		
		// -2, -1, 0, 1 ,2, 3 and 4 between -3 and 5
		assertEquals(7, ArrayUtils.findMinimumNumbersBetweenValues(5, 90, -3, -100));
		
		// 5, 6, 7 and 8 between 4 and 9
		assertEquals(4, ArrayUtils.findMinimumNumbersBetweenValues(4, 9));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testfindMinimumNumbersBetweenValuesWithSingleParameter() {
		ArrayUtils.findMinimumNumbersBetweenValues(1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testfindMinimumNumbersBetweenValuesWithEmptyArray() {
		int[] emptyArray = new int[0];
		ArrayUtils.findMinimumNumbersBetweenValues(emptyArray);
	}

	@Test
	public void testSortByNaturalOrder() {
		int[] expected = new int[] { -100, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 100 };
		int[] unsorted = new int[] { -5, -1, -3, 5, 3, 100, -2, 4, -4, 0, 2, 1, -100 };

		int[] sorted = ArrayUtils.sortByNaturalOrder(unsorted);
		assertEquals(Arrays.toString(sorted), Arrays.toString(expected));
	}

	@Test
	public void testCopyArray() {
		int[] array = new int[] { -100, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 100 };
		assertEquals(Arrays.toString(array), Arrays.toString(ArrayUtils.copyArray(array)));
	}

}
