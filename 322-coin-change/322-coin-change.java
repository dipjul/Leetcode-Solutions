class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        dp[0] = 0;
        
        for(int i = 1; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
            for(int coin : coins) {
                if(i >= coin) {
                    int val = dp[i-coin];
                    if(min > 1+val && val != Integer.MAX_VALUE)
                        min = 1 + val;
                }
            }
            dp[i] = min;
        }
        
        return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
    }
}