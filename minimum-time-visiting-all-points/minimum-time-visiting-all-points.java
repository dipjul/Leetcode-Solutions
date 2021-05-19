class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int count=0;
        for(int i=1;i<points.length;i++) {
            int x1 = points[i-1][0];
            int y1 = points[i-1][1];
            int x2 = points[i][0];
            int y2 = points[i][1];
            
            int d_x = Math.abs(x1-x2);
            int d_y = Math.abs(y1-y2);
            
            int d_steps = Math.min(d_x, d_y);
            int x_steps = d_x - d_steps;
            int y_steps = d_y - d_steps;
            count += d_steps + x_steps + y_steps;
        }
        return count;
    }
}