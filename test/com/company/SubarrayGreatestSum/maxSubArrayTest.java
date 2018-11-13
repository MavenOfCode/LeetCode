package com.company.SubarrayGreatestSum;

import org.junit.Test;

import static org.junit.Assert.*;

public class maxSubArrayTest {

    @Test
    public void maxSubArrayGeneralTest() {
        int[] inputArray = {-2,1,-3,4,-1,2,1,-5,4};
        int expected = 6;
        int actual = maxSubArray.maxSubArray(inputArray);

        assertEquals(expected,actual);
    }

    @Test
    public void maxSubArrayTwoTest() {
        int[] inputArray = {-2,1};
        int expected = 1;
        int actual = maxSubArray.maxSubArray(inputArray);

        assertEquals(expected,actual);
    }

    @Test
    public void maxSubArrayEmptyTest() {
        int[] inputArray = {};
        int expected = 0;
        int actual = maxSubArray.maxSubArray(inputArray);

        assertEquals(expected,actual);
    }

    @Test
    public void maxSubArraySmallerEmptyTest() {
        int[] inputArray = {};
        int expected = 0;
        int actual = maxSubArray.maxSubArraySmaller(inputArray);

        assertEquals(expected,actual);
    }

    @Test
    public void maxSubArraySmallerTwoTest() {
        int[] inputArray = {-2,1};
        int expected = 1;
        int actual = maxSubArray.maxSubArraySmaller(inputArray);

        assertEquals(expected,actual);
    }

    @Test
    public void maxSubArraySmallerGeneralTest() {
        int[] inputArray = {-2,1,-3,4,-1,2,1,-5,4};
        int expected = 6;
        int actual = maxSubArray.maxSubArraySmaller(inputArray);

        assertEquals(expected,actual);
    }
}