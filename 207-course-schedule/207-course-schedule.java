class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // List<Integer> result = new ArrayList<>();
        int result = 0;
        
        // 1. Initialize the graph
        Map<Integer, List<Integer>> graph = new HashMap<>();
        Map<Integer, Integer> inDegree = new HashMap<>();
        
        for(int i = 0; i < numCourses; i++) {
            graph.put(i, new ArrayList<>());
            inDegree.put(i, 0);
        }
        
        // 2. Build the graph
        for(int i = 0; i < prerequisites.length; i++) {
            int child = prerequisites[i][0], parent = prerequisites[i][1];
            graph.get(parent).add(child);
            inDegree.put(child, inDegree.get(child)+1);
        }
        
        // 3. Add all the sources(i.e, vertices with in-degree 0) to a queue
        Queue<Integer> sources = new LinkedList<>();
        for(Map.Entry<Integer, Integer> entry: inDegree.entrySet())
            if(entry.getValue() == 0)
                sources.offer(entry.getKey());
        
        // 4. For each source, add it to the result, subtract 1 from all of it's children's in-degree
        // & add if any child has in-degree 0, add it to sources queue
        while(!sources.isEmpty()) {
            int vertex = sources.poll();
            result++;
            for(int child:graph.get(vertex)) {
                inDegree.put(child, inDegree.get(child)-1);
                if(inDegree.get(child) == 0)
                    sources.offer(child);
            }
        }
        
        // 5. If size of result equal to numCourses then return true else return false
        return result == numCourses;
    }
}