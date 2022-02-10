class Solution {
    int[] dirX = {-1, 0, 1, 0};
    int[] dirY = {0, 1, 0, -1};
    
    public int numIslands(char[][] grid) {
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        // make dfs number for "1"
        int count = 0;
        
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(!vis[i][j] && grid[i][j] == '1') {
                    count++;
                    dfs(i, j, grid, vis);
                }
            }
        }
        return count;
    }
    
    private void dfs(int x, int y, char[][] grid, boolean[][] vis) {
        vis[x][y] = true;
        for(int i = 0; i < 4; i++) {
            int newX = x + dirX[i];
            int newY = y + dirY[i];
            if(isValid(newX, newY, grid.length, grid[0].length) && !vis[newX][newY] && grid[newX][newY]=='1')
                dfs(newX, newY, grid, vis);
        }
    }
    private boolean isValid(int x, int y, int xSize, int ySize) {
        if(x < 0 || x >= xSize || y < 0 || y >= ySize)
            return false;
        return true;
    }
}