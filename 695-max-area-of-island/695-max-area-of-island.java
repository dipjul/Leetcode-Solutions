class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] mark = new boolean[grid.length][grid[0].length];
        int[] res = {0};
        int[] tmp = {0};
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!mark[i][j] && grid[i][j] == 1) {
                    tmp[0] = 0;
                    dfs(grid, i, j, mark, res, tmp);
                }
            }
        }
        return res[0];
    }

    private void dfs(int[][] grid, int i, int j, boolean[][] mark, int[] res, int[] tmp) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || mark[i][j] || grid[i][j] == 0) {
            res[0] = Math.max(res[0], tmp[0]);
            return;
        }
        mark[i][j] = true;
        tmp[0]++;
        dfs(grid, i + 1, j, mark, res, tmp);
        dfs(grid, i, j - 1, mark, res, tmp);
        dfs(grid, i - 1, j, mark, res, tmp);
        dfs(grid, i, j + 1, mark, res, tmp);
    }
}
