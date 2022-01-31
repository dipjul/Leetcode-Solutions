class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        int freshCount = 0;
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1)
                    freshCount++;
                if(grid[i][j] == 2)
                    q.offer(new int[]{i, j});
            }
        }
        
        if(freshCount == 0) return 0;
        int directions[][] = {{-1,0}, {0, 1}, {1, 0}, {0, -1}};
        int time = 0;
        while(!q.isEmpty()) {
            int levelSize = q.size();
            for(int i = 0; i < levelSize; i++) {
                int[] pos = q.poll();
                int x = pos[0];
                int y = pos[1];
                for(int[] dir:directions) {
                    int n_x = x + dir[0];
                    int n_y = y + dir[1];
                    
                    if(n_x >= 0 && n_x < m && n_y >= 0 && n_y < n && grid[n_x][n_y] == 1) {
                        grid[n_x][n_y] = 2;
                        q.offer(new int[]{n_x, n_y});
                        freshCount--;
                    }
                }
            }
            time++;
        }
        return freshCount==0?time-1:-1;
    }
}
