class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] res = new int[k][2];
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1]));
        
        for(int[] point: points) {
            pq.offer(point);
            if(pq.size() > k)
                pq.poll();
        }
        int ind = 0;
        while(!pq.isEmpty()) {
            int[] p = pq.poll();
            res[ind][0] = p[0];
            res[ind][1] = p[1];
            ind++;
        }
        return res;
    }
}
