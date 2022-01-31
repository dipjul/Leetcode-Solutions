class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid.length == 0 || grid[0][0] == 1 || grid[grid.length-1][grid[0].length-1] == 1)
            return -1;
        int ans = 0;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});
        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0},{1,-1},{-1,1},{-1,-1},{1,1}};
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        visited[0][0] = true;
        while (!q.isEmpty()) {
            int size = q.size();
            for(int i=0;i<size;i++) {
                int[] pop = q.poll();
                if(pop[0]==m-1 && pop[1]==n-1) {
                    return ans+1;
                }
                for (int k=0;k<8;k++) {
                    int nextX = directions[k][0]+pop[0];
                    int nextY = directions[k][1]+pop[1];

                    if(nextX>=0 && nextX<m && nextY>=0 && nextY<n && !visited[nextX][nextY] && grid[nextX][nextY]==0) {
                        q.offer(new int[]{nextX,nextY});
                        visited[nextX][nextY]=true;
                    }

                }
            }
            ans++;
        }
        return -1;
    }
}