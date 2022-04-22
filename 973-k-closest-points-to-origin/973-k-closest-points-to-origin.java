class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] res = new int[k][2];
        PriorityQueue<Point> pq = new PriorityQueue<Point>((a, b) -> new Double(b.dist).compareTo(new Double(a.dist)));
        
        for(int[] point: points) {
            pq.offer(new Point(point[0], point[1]));
            if(pq.size() > k)
                pq.poll();
        }
        int ind = 0;
        while(!pq.isEmpty()) {
            Point p = pq.poll();
            res[ind][0] = p.x;
            res[ind][1] = p.y;
            ind++;
        }
        return res;
    }
}

class Point {
    int x;
    int y;
    
    double dist;
    
    Point(int x, int y) {
        this.x = x;
        this.y = y;
        dist = Math.pow(x*x + y*y, 0.5);
    }
}