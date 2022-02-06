class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        
        if(n < 2) {
            ArrayList<Integer> centroids = new ArrayList<>();
            for(int i = 0; i < n; i++)
                centroids.add(i);
            return centroids;
        }
        
        // Initialize the graph
        ArrayList<Set<Integer>> neighbors = new ArrayList<>();
        for(int i = 0; i < n; i++)
            neighbors.add(new HashSet<>());
        
        // Build the graph
        for(int[] edge: edges) {
            int start = edge[0], end = edge[1];
            neighbors.get(start).add(end);
            neighbors.get(end).add(start);
        }
        
        // Initialize first layer of leaves
        ArrayList<Integer> leaves = new ArrayList<>();
        for(int i = 0; i < n; i++)
            if(neighbors.get(i).size() == 1)
                leaves.add(i);
        
        // Trim the leaves untill reach the centroids
        int remainingNodes = n;
        while(remainingNodes > 2) {
            remainingNodes -= leaves.size();
            ArrayList<Integer> newLeaves = new ArrayList<>();
            
            // remove the current leaves along with the edges
            for(Integer leaf: leaves) {
                // the only neighbor left for the leaf node
                Integer neighbor = neighbors.get(leaf).iterator().next();
                // remove the edge along with the leaf node
                neighbors.get(neighbor).remove(leaf);
                if (neighbors.get(neighbor).size() == 1)
                    newLeaves.add(neighbor);
            }
            // prepare for the next round
            leaves = newLeaves; 
        }
        // The remaining nodes are the centroids of the graph
        return leaves;
    }
}