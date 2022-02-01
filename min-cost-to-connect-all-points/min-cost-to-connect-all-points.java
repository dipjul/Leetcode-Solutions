class Solution {
    public int minCostConnectPoints(int[][] points) {
        List<List<Node>> adj = new ArrayList<>();
        int size = points.length;
        for(int i = 0; i < size; i++) { 
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < size-1; i++) {
            for(int j = i+1; j < size; j++) {
                int cost = Math.abs(points[i][0]-points[j][0]) + Math.abs(points[i][1]-points[j][1]);
                adj.get(i).add(new Node(j, cost));
                adj.get(j).add(new Node(i, cost));
            }
        }
        
        int res = 0;
        Set<Integer> visited = new HashSet<>();
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->a.wt-b.wt);
        pq.offer(new Node(0, 0));
        int count = size-1;
        while(!pq.isEmpty() && count > 0) {
            Node n = pq.poll();
            if(!visited.contains(n.v)) {
                res += n.wt;
                visited.add(n.v);
                for(Node nei:adj.get(n.v)) {
                    if(!visited.contains(nei.v))
                        pq.offer(new Node(nei.v, nei.wt));
                }
            }
        }
        return res;
    }
}

class Node {
    int v;
    int wt;
    Node(int v, int wt) {
        this.v = v;
        this.wt = wt;
    }
}
    /*
    // Prim's Algorithm
    public int minCostConnectPoints(int[][] points) {
        int size = points.length;
        // to store the edges sorted based on weight
        PriorityQueue<Edge> pq = new PriorityQueue<>((a, b) -> a.weight-b.weight);
        
        // find the edges from the first vertex 
        int[] c1 = points[0];
        for(int i = 1; i < size; i++) {
            int[] c2 = points[i];
            int cost = Math.abs(c1[0]-c2[0]) + Math.abs(c1[1]-c2[1]);
            pq.offer(new Edge(0, i, cost));
        }
        
        // N-1 edges
        int count = size-1;
        // store the mst cost
        int minCost = 0;
        
        // to store the visited vertices of the graph
        boolean[] visited = new boolean[size];
        visited[0] = true;
        
        // while pq is not empty && count is greater than 0
        while(!pq.isEmpty() && count > 0) {
            Edge e = pq.poll();
            int p1 = e.point1;
            int p2 = e.point2;
            if(!visited[p2]) {
                minCost += e.weight;
                visited[p2] = true;
                for(int i = 0; i < size; i++) {
                    if(!visited[i]) {
                        int cost = Math.abs(points[p2][0]-points[i][0]) + Math.abs(points[p2][1]-points[i][1]);
                        pq.offer(new Edge(p2, i, cost));
                    }
                }
            }
            count--;
        }
            
      return minCost;      
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
} */
    
    /*
    // Kruskal's Algorithm
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
*/