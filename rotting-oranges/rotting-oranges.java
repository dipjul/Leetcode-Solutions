class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        
        Queue<int[]> rottens = new LinkedList<>();
        int count_fresh = 0;
        
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == 2)
                    rottens.offer(new int[] {i, j});
                if(grid[i][j] == 1)
                    count_fresh++;
            }
        }
        
        if(count_fresh == 0)
            return 0;
        
        int count = 0;
        
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        
        while(!rottens.isEmpty()) {
            count++;
            int size = rottens.size();
            
            for(int i = 0; i < size; i++) {
                int[] point = rottens.poll();
            
                for(int dir[]:dirs) {
                    int x = point[0]+dir[0];
                    int y = point[1]+dir[1];

                    if(x < 0 || x >= rows || y < 0 || y >= cols || grid[x][y] == 0 || grid[x][y] == 2)
                        continue;
                    grid[x][y] = 2;
                    rottens.offer(new int[]{x, y});
                    count_fresh--;
                }
            }
            
            
        }
        
        return count_fresh == 0? count-1:-1;
    }
}