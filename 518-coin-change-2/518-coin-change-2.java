class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[][] = new int[n][amount+1];
        
        for(int i = 0; i < n; i++)
            dp[i][0] = 1;
        
        for(int i = 0; i < n; i++) {
            for(int j = 1; j <= amount; j++) {
                if(i > 0) {
                    if(j-coins[i]>=0)  
                        dp[i][j] = dp[i-1][j] + dp[i][j-coins[i]];
                    else
                        dp[i][j] = dp[i-1][j];     
                }
                else {
                    if(j-coins[i] >= 0)
                        dp[i][j] = dp[i][j-coins[i]];
                    else
                        dp[i][j] = 0; 
                }
            }
        }
        
        return dp[n-1][amount];
    }
}

// dp[i][j] = dp[i-1][j] + dp[i][j-coin]