package MaxProfit;

public class maxProfit {

    //https://www.programcreek.com/2014/02/leetcode-best-time-to-buy-and-sell-stock-java/
    //https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    //take in array of prices
    //edge case if array is null or length is less than/equal to 1 return 0;
    //int min prices using 0 element in prices array for min so far
    //int profit starting at 0 for max profit
    //iterate through prices array starting at 1 element since 0 is accounted for
    //(also avoids null pointer exception this way)
     //-- in iteration calculate profit by using Math.max(profit vs prices[i] -min);
    // -- aso reset min by calculating min by using Math.min(min vs prices[i]);
    //return profit

    public static int maxProfit(int[] prices) {
        if(prices==null||prices.length<=1)
            return 0;

        int min=prices[0]; // min so far
        int profit=0;

        for(int i=1; i<prices.length; i++){
            profit = Math.max(profit, prices[i]-min);
            min = Math.min(min, prices[i]);
        }

        return profit;
    }
}
