public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < prices.length; i++) {
            minprice = Math.min(minprice, prices[i]);
            int profit = prices[i] - minprice;
            maxprofit = Math.max(maxprofit, profit);
        }
        return maxprofit;
    }
}

/*
 * Testcase:
 * Input: prices = [10,1,5,6,7,1]
 * Output: 6
 *
 * Testcase:
 * Input: prices = [10,8,7,5,2]
 * Output: 0
 */
