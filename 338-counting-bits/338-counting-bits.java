class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n+1];
        
        for(int i = 1; i < n+1; i++) {

            dp[i] = dp[i/2] + i % 2;
        }
        
        return dp;
    }
}
/*
f[i] = f[i / 2] + i % 2.
*/