import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayUtilsTest {

	@Test
	public void testfindMinimumNumbersBetweenValuesUsingArray() {
		
		int[] array = new int[] {-3, 1, 3, 10, 4};
		//0 because of 3 and 4
		assertEquals(0, ArrayUtils.findMinimumNumbersBetweenValues(array));
	
		//Change the order 
		array = new int[] {4, 10, 3, 1, -3};
		//0 because of 3 and 4
		assertEquals(0, ArrayUtils.findMinimumNumbersBetweenValues(array));

		//Test with array containing same values
		array = new int[] {1, 1, 2, 2, 3};
		//0 because of duplicates
		assertEquals(0, ArrayUtils.findMinimumNumbersBetweenValues(array));
		
		array = new int[] {1, 92, 8, 32, -7};
		//6 because there is 2, 3, 4, 5, 6 and 7 between 1 and 8
		assertEquals(6, ArrayUtils.findMinimumNumbersBetweenValues(array));
		
		
	}

	@Test
	public void testfindMinimumNumbersBetweenValuesUsingIntegers() {
		
		//2 and 3 between 1 and 4
		assertEquals(2, ArrayUtils.findMinimumNumbersBetweenValues(1, 4, 8, 16, 32));
	
		//5, 6 and 7 between 4 and 8
		assertEquals(3, ArrayUtils.findMinimumNumbersBetweenValues(4, 8, 16, 32, 64));

		//-2, -1, 0, 1 ,2, 3 and 4 between -3 and 5
		assertEquals(7, ArrayUtils.findMinimumNumbersBetweenValues(-3, 5, 90, -100));
		
		//-2, -1, 0, 1 ,2, 3 and 4 between -3 and 5
		assertEquals(7, ArrayUtils.findMinimumNumbersBetweenValues(5, 90, -3, -100));
		
		//5, 6, 7 and 8 between 4 and 9
		assertEquals(4, ArrayUtils.findMinimumNumbersBetweenValues(4,9));
		
		ArrayUtils.findMinimumNumbersBetweenValues(null);
		
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
		//assertEquals();
	}
	
}
