package MaxProfitII;

import org.junit.Test;

import static org.junit.Assert.*;

https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
public class maxProfit2Test {

    @Test
    public void maxProfitExample1Test() {
        int[] prices ={7,1,5,3,6,4};
        int expected = 7;
        int actual = maxProfit2.maxProfit(prices);

        assertEquals(expected, actual);
    }

    @Test
    public void maxProfitExample2Test() {
        int[] prices ={1,2,3,4,5};
        int expected = 4;
        int actual = maxProfit2.maxProfit(prices);

        assertEquals(expected, actual);
    }

    @Test
    public void maxProfitExample3NoProfitTest() {
        int[] prices ={7,6,4,3,1};
        int expected = 0;
        int actual = maxProfit2.maxProfit(prices);

        assertEquals(expected, actual);
    }

    @Test
    public void maxProfitEmptyTest() {
        int[] prices ={};
        int expected = 0;
        int actual = maxProfit2.maxProfit(prices);

        assertEquals(expected, actual);
    }

    @Test
    public void maxProfitAltNoProfitTest() {
        int[] prices ={4};
        int expected = 0;
        int actual = maxProfit2.maxProfit(prices);

        assertEquals(expected, actual);
    }
}