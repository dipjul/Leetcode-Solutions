class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(n < 2) {
            List<Integer> centroids = new ArrayList<>();
            for(int i = 0; i < n; i++)
                centroids.add(i);
            return centroids;
        }
        
        // 1. Initialize the graph
        List<Set<Integer>> graph = new ArrayList<>();
        
        for(int i = 0; i < n; i++)
            graph.add(new HashSet<>());
        
        // 2. Build the graph
        for(int i = 0; i < edges.length; i++) {
            int start = edges[i][0], end = edges[i][1];
            graph.get(start).add(end);
            graph.get(end).add(start);
        }
        
        // 3. Initialize first layer of leaves
        ArrayList<Integer> leaves = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(graph.get(i).size() == 1)
                leaves.add(i);
        }
        
        // 4. Trim leaves untill reach the centroids
        int remainingNodes = n;
        while(remainingNodes > 2) {
            
            remainingNodes -= leaves.size();
            
            ArrayList<Integer> newLeaves = new ArrayList<>();
            
            // 4.1 remove current leaves along the edges
            for(int leaf:leaves) {
                // 4.1.1 only the neighbor left for the leaf node
                Integer neighbor = graph.get(leaf).iterator().next();
                // 4.1.2 remove the edge along with the leaf node
                graph.get(neighbor).remove(leaf);
                
                if(graph.get(neighbor).size() == 1)
                    newLeaves.add(neighbor);
            }
            leaves = newLeaves;
        }
        return leaves;
    }
}