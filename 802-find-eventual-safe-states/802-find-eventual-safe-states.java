class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->a-b);
        
        // Initialize the graph
        Map<Integer, List<Integer>> parentVertices = new HashMap<>();
        Map<Integer, Integer> outdegree = new HashMap<>();
        for(int i = 0; i < graph.length; i++) {
            parentVertices.put(i, new ArrayList<>());
        }
        
        // Build the relation
        for(int i = 0; i < graph.length; i++) {
            outdegree.put(i, graph[i].length);
            
            for(int j = 0; j < graph[i].length; j++) {
                parentVertices.get(graph[i][j]).add(i);
            }
        }
        
        // Add the sources
        Queue<Integer> q = new LinkedList<>();
        for(Map.Entry<Integer, Integer> entry: outdegree.entrySet())
            if(entry.getValue() == 0)
                q.offer(entry.getKey());
        
        while(!q.isEmpty()) {
            int vertex = q.poll();
            pq.offer(vertex);
            
            for(int child : parentVertices.get(vertex)) {
                outdegree.put(child, outdegree.get(child)-1);
                if(outdegree.get(child) == 0)
                    q.offer(child);
            }
        }
        List<Integer> result = new ArrayList<>();
        while(!pq.isEmpty())
            result.add(pq.poll());
        return result;
    }
}