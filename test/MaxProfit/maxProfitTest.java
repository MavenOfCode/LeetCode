package MaxProfit;

import org.junit.Test;

import static org.junit.Assert.*;

public class maxProfitTest {

    @Test
    public void maxProfitTestOne() {
        int[] prices ={7,1,5,3,6,4};
        int expected = 5;
        int actual = maxProfit.maxProfit(prices);

        assertEquals(expected, actual);
    }

    @Test
    public void maxProfitTestTwo() {
        int[] prices ={7,6,4,3,1};
        int expected = 0;
        int actual = maxProfit.maxProfit(prices);

        assertEquals(expected, actual);
    }

    @Test
    public void maxProfitEmptyTest() {
        int[] prices ={};
        int expected = 0;
        int actual = maxProfit.maxProfit(prices);

        assertEquals(expected, actual);
    }
}