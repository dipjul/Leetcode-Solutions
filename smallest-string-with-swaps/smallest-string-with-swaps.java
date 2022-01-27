class Solution {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        if(s == null || s.length() == 0)
            return null;
        UnionFind uf = new UnionFind(s.length());
        // connects are made below
        for(List<Integer> pair: pairs)
            uf.union(pair.get(0), pair.get(1));
        // PriorityQueue for sorted order of the characters
        Map<Integer, PriorityQueue<Character>> map = new HashMap<>();
        // components with the same root(i.e connected) are store as root,<all the characters in sorted order>
        for(int i = 0; i < s.length(); i++) {
            int root = uf.find(i);
            map.putIfAbsent(root, new PriorityQueue<>());
            map.get(root).offer(s.charAt(i));
        }
        
        StringBuilder sb = new StringBuilder(s.length());
        for(int i = 0; i < s.length(); i++) {
            sb.append(map.get(uf.find(i)).poll());
            // find(i) would give the root, using root we get the PQ
        }
        return sb.toString();
    }
}

class UnionFind {
    int root[];
    int rank[];
    
    UnionFind(int size) {
        root = new int[size];
        rank = new int[size];
        
        for(int i = 0; i < size; i++) {
            root[i] = i;
            rank[i] = 0;
        }
    }
    
    public int find(int x) {
        if (x == root[x]) {
            return x;
        }
        return root[x] = find(root[x]);
    }
    
    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            if (rank[rootX] > rank[rootY]) {
                root[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                root[rootX] = rootY;
            } else {
                root[rootY] = rootX;
                rank[rootX] += 1;
            }
        }
    }
}