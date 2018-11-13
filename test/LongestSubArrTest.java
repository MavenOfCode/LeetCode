

import com.company.SubarrayLongestArray.LongestSubArr;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubArrTest {

    @Test
    public void findLengthOfLCISEmptyTest() {
        int[] actualArray = new int[0];
        int expected = 0;
        int actual = LongestSubArr.findLengthOfLCIS(actualArray);

        assertEquals(expected,actual);
    }

    @Test
    public void findLengthOfLCISNegativeNumbers() {
        int[] actualArray = {-2,-1,0,1,-2};
        int expected = 4;
        int actual = LongestSubArr.findLengthOfLCIS(actualArray);

        assertEquals(expected,actual);
    }

    @Test
    public void findLengthOfLCISSingleValue() {
        int[] actualArray = {3,3,3,3,3};
        int expected = 1;
        int actual = LongestSubArr.findLengthOfLCIS(actualArray);

        assertEquals(expected,actual);
    }

    @Test
    public void findLengthOfLCISSingleElement() {
        int[] actualArray = {3};
        int expected = 1;
        int actual = LongestSubArr.findLengthOfLCIS(actualArray);

        assertEquals(expected,actual);
    }

    @Test
    public void findLengthOfLCISUnsorted() {
        int[] actualArray = {1,3,5,4,7};
        int expected = 3;
        int actual = LongestSubArr.findLengthOfLCIS(actualArray);

        assertEquals(expected,actual);
    }

    @Test
    public void findLengthOfLCISUnsortedLong() {
        int[] actualArray = {1, 2, 5, 6, 7, 4, 5, 6, 7};
        int expected = 5;
        int actual = LongestSubArr.findLengthOfLCIS(actualArray);

        assertEquals(expected,actual);
    }

    @Test
    public void findLengthInterviewEmptyTest() {
        int[] actualArray = new int[0];
        int expected = 0;
        int actual = LongestSubArr.findLongestInterview(actualArray);

        assertEquals(expected,actual);
    }

    @Test
    public void findLongestInterviewUnsortedLongTest() {
        int[] actualArray = {1, 2, 5, 6, 7, 4, 5, 6, 7};
        int expected = 4;
        int actual = LongestSubArr.findLongestInterview(actualArray);

        assertEquals(expected,actual);
    }
}