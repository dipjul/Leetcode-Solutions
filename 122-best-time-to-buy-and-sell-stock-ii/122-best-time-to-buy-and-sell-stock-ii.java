class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int ans = 0;
        
        for(int i = 0, j = 1; j < n; j++, i++)
            ans += (prices[j]>prices[i]?prices[j]-prices[i]:0);
        return ans;
    }
}