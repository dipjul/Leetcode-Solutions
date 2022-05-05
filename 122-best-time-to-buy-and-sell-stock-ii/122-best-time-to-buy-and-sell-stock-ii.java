class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int ans = 0;
        
        for(int i = 0, j = 1; j < n; j++, i++) {
            int diff = prices[j]-prices[i];
            if(diff > 0) {
                ans += diff;
            }
        }
        
        return ans;
    }
}