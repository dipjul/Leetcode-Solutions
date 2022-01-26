class Solution {
    public int findCircleNum(int[][] isConnected) {
        if(isConnected == null || isConnected.length == 0)
            return 0;
        int n = isConnected.length;
        UnionFind uf = new UnionFind(n);
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(isConnected[i][j] == 1)
                    uf.union(i, j);
            }
        }
        return uf.getCount();
    }
}

class UnionFind {
    int root[];
    int rank[];
    int count;
    
    UnionFind(int size) {
        root = new int[size];
        rank = new int[size];
        count = size;
        
        for(int i = 0; i < size; i++) {
            root[i] = i;
            rank[i] = 0;
        }
    }
    
    public int find(int x) {
        if(x == root[x])
            return x;
        return x = find(root[x]);
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
            count--;
        }
    }
    
    public int getCount() {
        return count;
    }
}
