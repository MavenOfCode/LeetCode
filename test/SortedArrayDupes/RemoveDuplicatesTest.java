package SortedArrayDupes;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesTest {

    @Test
    public void removeDuplicatesEmptyTest() {
        int actual = 0;
        int[] array = new int[0];
        int expected = RemoveDuplicates.removeDuplicates(array);

        assertEquals(expected, actual);
    }

    @Test
    public void removeDuplicatesSingleDupeTest() {
        int actual = 2;
        int[] array = {1,1,2};
        int expected = RemoveDuplicates.removeDuplicates(array);

        assertEquals(expected, actual);
    }
}