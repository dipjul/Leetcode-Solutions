class Solution {
    public int minCostConnectPoints(int[][] points) {
        int size = points.length;
        UnionFind uf = new UnionFind(size);
        PriorityQueue<Edge> pq = new PriorityQueue<>((a,b)->a.weight-b.weight);
        for(int i = 0; i < size; i++) {
            int[] c1 = points[i];
            for(int j = i+1; j < size; j++) {
                int[] c2 = points[j];
                int cost = Math.abs(c1[0]-c2[0])+Math.abs(c1[1]-c2[1]);
                pq.offer(new Edge(i, j, cost));
            }
        }
        
        int result = 0;
        int count = size-1;
        while(!pq.isEmpty() && count > 0) {
            Edge e = pq.poll();
            if(!uf.isConnected(e.point1, e.point2)) {
                uf.union(e.point1, e.point2);
                result += e.weight;
                count--;
            }
        }
        return result;
    }
}

class Edge {
    int point1;
    int point2;
    int weight;
    
    public Edge(int p1, int p2, int wt) {
        this.point1 = p1;
        this.point2 = p2;
        this.weight = wt;
    }
}

class UnionFind {
    int[] root;
    int[] rank;
    
    public UnionFind(int size) {
        root = new int[size];
        rank = new int[size];
        
        for(int i = 0; i < size; i++) {
            root[i] = i;
            rank[i] = 0;
        }
    }
    
    public int find(int x) {
        if(x == root[x])
            return x;
        return root[x] = find(root[x]);
    }
    
    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if(rootX != rootY) {
            if(rank[rootX] > rank[rootY])
                root[rootY] = rootX;
            else if(rank[rootX] < rank[rootY])
                root[rootX] = rootY;
            else{
                root[rootY] = rootX;
                rank[rootX]++;
            }     
        }
    }
    
    public boolean isConnected(int x, int y) {
        return find(x) == find(y);
    }
}