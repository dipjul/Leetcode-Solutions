class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        
        for(int i = 0, j = 1; j < prices.length; j++, i++) {
            if(prices[j]>prices[i]) {
                ans += prices[j]-prices[i];
            }
        }
        
        return ans;
    }
}