class Solution {
    public int orangesRotting(int[][] grid) {
        int freshCount = 0;
        Queue<int[]> rottens = new LinkedList<>();
        
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1)
                    freshCount++;
                if(grid[i][j] == 2)
                    rottens.offer(new int[]{i, j});
            }
        }
        
        if(freshCount == 0) return 0;
        int[][] dirs = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        int time = 0;
        while(!rottens.isEmpty()) {
            int levelSize = rottens.size();
            for(int i = 0; i < levelSize; i++) {
                int[] coordinate = rottens.poll();
                for(int[] dir:dirs) {
                    int nX = coordinate[0]+dir[0];
                    int nY = coordinate[1]+dir[1];
                    if(nX>=0 && nX < grid.length && nY >= 0 && nY < grid[0].length) {
                        if(grid[nX][nY] == 1) {
                            grid[nX][nY] = 2;
                            rottens.offer(new int[]{nX, nY});
                            freshCount--;
                        }
                    }
                }
            }
            time++;
        }
        return freshCount==0?time-1:-1;
    }
}