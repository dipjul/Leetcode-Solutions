class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer> result = new ArrayList<>();
        // a. Initialize the graph
        Map<Integer, List<Integer>> graph = new HashMap();
        Map<Integer, Integer> indegree = new HashMap();
        
        for(int i = 0; i < numCourses; i++) {
            graph.put(i, new ArrayList());
            indegree.put(i, 0);
        }
        
        // b. Build the graph
        for(int i = 0; i < prerequisites.length; i++) {
            int parent = prerequisites[i][1];
            int child = prerequisites[i][0];
            graph.get(parent).add(child);
            indegree.put(child, indegree.get(child)+1);
        }
        
        // c. Find all sources i.e., all vertices with 0 in-degrees
        Queue<Integer> sources = new LinkedList<>();
        for(Map.Entry<Integer, Integer> entry: indegree.entrySet()) {
            if(entry.getValue() == 0)
                sources.add(entry.getKey());
        }
        
        // d. For each source, add it to the sortedOrder and subtract one from all of its children's in-degrees
        // if a child's in-degree becomes zero, add it to the sources queue
        int ind = 0;
        while(!sources.isEmpty()) {
            int vertex = sources.poll();
            result.add(vertex);
            List<Integer> children = graph.get(vertex);
            for(int child: children) {
                indegree.put(child, indegree.get(child)-1);
                if(indegree.get(child) == 0)
                    sources.add(child);
            }
        }
        if(result.size() != numCourses)
            return new int[]{};
        int[] res = new int[numCourses];
        for(int i = 0; i < numCourses; i++)
            res[i] = result.get(i);
        return res;
    }
}