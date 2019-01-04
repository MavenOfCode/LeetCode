package MaxProfitII;

public class maxProfit2 {

    //below doesn't work in every case and is too complicated.
    //reviewed online solutions by others
    //made this too hard.
    //trying again more simply

//    public static int maxProfit(int[] prices){
//        if(prices.length <= 1){
//            return 0;
//        }
//        int min = prices[0];
//        int profitSoFar = 0; //track profit by day for multiple sales
//        int totalProfit = 0;  //add cumulative total profit
//        for(int i = 1; i < prices.length; i++) {
//            profitSoFar = Math.max(profitSoFar, prices[i] - min);
//            min = Math.min(min, prices[i]);
//            if(profitSoFar >= min){
//                totalProfit += profitSoFar; //add sale to total profit
//                min = prices[i+1]; //move minimum forward since you can't sell from prior day
//                profitSoFar =0; //reset profit from sale to zero for next sale
//            }
//        }
//        return totalProfit;
//    }

    public static int maxProfit(int[] prices){
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++){
            maxProfit += Math.max(prices[i]-prices[i-1],0);
        }
        return maxProfit;
    }
}
