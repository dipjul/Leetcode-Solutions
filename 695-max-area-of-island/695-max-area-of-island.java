class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] mark = new boolean[grid.length][grid[0].length];
        int res = 0;

       for (int i = 0; i < grid.length; i++) {
           for (int j = 0; j < grid[0].length; j++) {
               if (!mark[i][j] && grid[i][j] == 1) {
                    res = Math.max(res, dfs(grid, i, j, mark));
               }
           }
       }
        return res;
    }

    private int dfs(int[][] grid, int i, int j, boolean[][] mark) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || mark[i][j] || grid[i][j] == 0) {
            return 0;
        }
        mark[i][j] = true;
        return (1 + dfs(grid, i + 1, j, mark) +
        dfs(grid, i, j - 1, mark) +
        dfs(grid, i - 1, j, mark) +
        dfs(grid, i, j + 1, mark));
    }
}
