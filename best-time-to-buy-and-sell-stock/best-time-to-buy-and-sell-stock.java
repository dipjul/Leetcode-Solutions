class Solution {
    public int maxProfit(int[] prices) {
        int maxTrade = 0;
        int min_I = prices[0];
        int max_I = 0;
        for(int i=0;i<prices.length;i++) {
            min_I = Math.min(min_I, prices[i]);
            max_I = prices[i]-min_I;
            maxTrade = Math.max(maxTrade, max_I);
        }
        return maxTrade;
    }
}