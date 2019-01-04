package TwoArraysII;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TwoArraysIITest {

    @Test
    public void intersectTest1() {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] expected = {2, 2};
        int[] actual = TwoArraysII.intersect2(nums1,nums2);
        assertEquals(expected.toString(),actual.toString());
    }

    @Test
    public void intersectTest2() {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] expected = {4,9};
        int[] actual = TwoArraysII.intersect2(nums1,nums2);
        assertEquals(expected,actual);
    }
}