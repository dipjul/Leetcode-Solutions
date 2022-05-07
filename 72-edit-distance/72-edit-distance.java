class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i = 1; i <= n; i++) {
            dp[i][0] = i;
        }
        
        for(int i = 1; i <= m; i++) {
            dp[0][i] = i;
        }
        
        for(int i = 1; i <= n; i++) {
            char ch1 = word2.charAt(i-1);
            for(int j = 1; j <= m; j++) {
                char ch2 = word1.charAt(j-1);
                
                if(ch1 == ch2)
                    dp[i][j] = dp[i-1][j-1];
                else
                    dp[i][j] = 1 + Math.min(dp[i-1][j], Math.min(dp[i-1][j-1], dp[i][j-1]));
            }
        }
        
        return dp[n][m];
    }
}