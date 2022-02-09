class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int[] result = new int[2];
        UnionFind uf = new UnionFind(edges.length+1);
        
        for(int[] edge:edges) {
            if(uf.isConnected(edge[0], edge[1]))
                result = new int[]{edge[0], edge[1]};
            uf.union(edge[0], edge[1]);
        }
        return result;
    }
}

class UnionFind {
    int[] root;
    int[] rank;
    
    UnionFind(int size) {
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
            else {
                root[rootY] = rootX;
                rank[rootX]++;
            }
        }
    }
    
    public boolean isConnected(int x, int y) {
        return find(x) == find(y);
    }
}