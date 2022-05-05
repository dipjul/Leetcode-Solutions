class Solution {
    public int coinChange(int[] coins, int amount) {
        int x = amount+1;
        int[] dp = new int[x];
        int n = coins.length;
        dp[0] = 0;
        
        for(int i = 1; i <= amount; i++) {
            int min = x;
            for(int j = 0; j < n; j++) {
                int coinsJ = coins[j];
                if(i >= coinsJ) {
                    int val = dp[i-coinsJ];
                    if(min > 1+val && val != x)
                        min = 1 + val;
                }
            }
            dp[i] = min;
        }
        
        return dp[amount]==x?-1:dp[amount];
    }
}