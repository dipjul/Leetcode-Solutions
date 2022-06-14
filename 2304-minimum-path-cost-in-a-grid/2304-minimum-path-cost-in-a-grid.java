class Solution {
    public int minPathCost(int[][] grid, int[][] moveCost) {
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];
        
        // copied last row
        for(int i = 0; i < n; i++) {
            dp[m-1][i] = grid[m-1][i];
        }
        
        
        for(int i = m - 2; i >= 0; i--) {
            for(int j = 0; j < n; j++) {
                int val = Integer.MAX_VALUE;
                for(int k = 0; k < n; k++) {
                    val = Math.min(val, dp[i+1][k]+grid[i][j]+moveCost[grid[i][j]][k]);
                }
                dp[i][j] = val;
            }
        }
        int result = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            result = Math.min(result, dp[0][i]);
        }
        return result;
    }
}