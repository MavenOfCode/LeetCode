package SortedArrayDupes;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesTest {

    @Test
    public void removeDuplicatesEmptyTest() {
        int expected = 0;
        int[] array = new int[0];
        int actual = RemoveDuplicates.removeDuplicates(array);

        assertEquals(expected, actual);
    }

    @Test
    public void removeDuplicatesSingleDupeTest() {
        int expected = 2;
        int[] array = {1,1,2};
        int actual = RemoveDuplicates.removeDuplicates(array);

        assertEquals(expected, actual);
    }

    @Test
    public void removeDuplicatesMultipleDupeTest() {
        int expected = 5;
        int[] array = {1,1,2,2,2,3,4,4,5};
        int actual = RemoveDuplicates.removeDuplicates(array);

        assertEquals(expected, actual);
    }

    @Test
    public void removeDuplicatesNegativeDupeTest() {
        int expected = 5;
        int[] array = {-7,-6,-6,3,2,1};
        int actual = RemoveDuplicates.removeDuplicates(array);

        assertEquals(expected, actual);
    }
}