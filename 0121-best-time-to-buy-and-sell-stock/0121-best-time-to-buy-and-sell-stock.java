class Solution {
    public int maxProfit(int[] prices) {
        int lowest = Integer.MAX_VALUE;
        int profit = 0;
        
        //record smallest value so far
        //calculate max profit from that value
        for (int i = 0; i < prices.length; i++) {
            lowest = Math.min(lowest, prices[i]);
            profit = Math.max(profit, prices[i] - lowest);
        }
        
        return profit;
    }
}