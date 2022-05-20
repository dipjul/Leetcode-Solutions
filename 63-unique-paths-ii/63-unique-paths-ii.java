class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length, m = obstacleGrid[0].length;
        int[][] dp = new int[n][m];
        
        if(obstacleGrid[0][0] == 1)
            return 0;
        
        dp[0][0] = 1;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(obstacleGrid[i][j] != 1) {
                    if(i-1 >= 0 && j-1 >= 0)
                        dp[i][j] = Math.max(dp[i][j], dp[i-1][j]+dp[i][j-1]);
                    else if(i-1 >= 0)
                        dp[i][j] = Math.max(dp[i][j], dp[i-1][j]);
                    else if(j-1 >= 0)
                        dp[i][j] = Math.max(dp[i][j], dp[i][j-1]);
                    
                }
            }
        }
        
        return dp[n-1][m-1];
    }
}
