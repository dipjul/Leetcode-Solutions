class Solution {
    /*
Implementation

    Given the above algorithm, we could implement it via the Breadth First Search (BFS) strategy, to trim the           leaf nodes layer by layer (i.e. level by level).

        1. Initially, we would build a graph with the adjacency list from the input.

        2. We then create a queue which would be used to hold the leaf nodes.

        3. At the beginning, we put all the current leaf nodes into the queue.

        4. We then run a loop until there is only two nodes left in the graph.

        5. At each iteration, we remove the current leaf nodes from the queue. While removing the nodes, we also              remove the edges that are linked to the nodes. As a consequence, some of the non-leaf nodes would become            leaf nodes. And these are the nodes that would be trimmed out in the next iteration.

        6. The iteration terminates when there are no more than two nodes left in the graph, which are the desired            centroids nodes.
    */
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        // edge cases
        if(n < 2) {
            List<Integer> result = new ArrayList<>();
            for(int i = 0; i < n; i++)
                result.add(i);
            return result;
        }
        
        // Initialize the graph
        List<Set<Integer>> graph = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            graph.add(new HashSet<>());
        }
        
        // Build the graph with the adjacency list
        for(int i = 0; i < edges.length; i++) {
            int parent = edges[i][0], child = edges[i][1];
            graph.get(parent).add(child);
            graph.get(child).add(parent);
        }
        
        // Initialize the first layer of leaves
        ArrayList<Integer> leaves = new ArrayList<>();
        for(int i = 0; i < n; i++)
            if(graph.get(i).size() == 1)
                leaves.add(i);
        
        // Trim the leaves until reaching the centroids
        int remainingNodes = n;
        while(remainingNodes > 2) {
            remainingNodes -= leaves.size();
            ArrayList<Integer> newLeaves = new ArrayList<>();
            
            // remove the current leaves along with the edges
            for(Integer leaf:leaves) {
                // the only neighbor left for the leaf node
                Integer neighbor = graph.get(leaf).iterator().next();
                // remove the edge along with the leaf node
                graph.get(neighbor).remove(leaf);
                if(graph.get(neighbor).size() == 1)
                    newLeaves.add(neighbor);
            }
            // prepare for the next round
            leaves = newLeaves;
        }
        // The remaining nodes are the centroids of the graph
        return leaves;
    }
}