package RotateArray;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateArrayTest {

    @Test
    public void rotateTestOne() {
        int[] input = {1,2,3,4,5,6,7};
        int[] expected = {5,6,7,1,2,3,4};
        int[] actual = RotateArray.rotate(input,3);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void rotateTestTwo() {
        int[] input = {-1,-100,3,99};
        int[] expected = {3,99,-1,-100};
        int[] actual = RotateArray.rotate(input,2);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void rotateTestNoChange() {
        int[] input = {-1,-100};
        int[] expected = {-1,-100};
        int[] actual = RotateArray.rotate(input,7);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void rotateTestTiny() {
        int[] input = {1,2};
        int[] expected = {2,1};
        int[] actual = RotateArray.rotate(input,1);

        assertArrayEquals(expected, actual);
    }

}