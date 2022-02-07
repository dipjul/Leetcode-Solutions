class Solution {
    /*
    parent(vertices from which the edges are coming to the current vertex) - parentVertices
        0:<3>
        1:<0>
        2:<0,1>
        3:<1>
        4:
        5:<2,4>
        6:
    out-degree
        0:2
        1:2
        2:1
        3:1
        4:1
        5:0
        6:0
    q: [5, 6]
    [5] : -> pq: [5]
        5:<2,4>
        out-degree:
        0:2
        1:2
        2:1-1 = 0
        3:1
        4:1-1 = 0
        5:0
        6:0
    q: [6, 2, 4]
    [6] : -> pq: [5, 6]
        6:
        out-degree: no change
    q: [2, 4]
    [2] : -> pq: [2, 5, 6]
        2:<0,1>
        out-degree:
        0:2-1=1
        1:2-1=1
        2:0
        3:1
        4:0
        5:0
        6:0
    q: [4]
    [4] : -> pq: [1, 4, 5, 6]
        4:
        out-degree: no change
    */
    public List<Integer> eventualSafeNodes(int[][] graph) {
        // to store the result in sorted order
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
        
        // Add the sources(i.e, vertices with out-degree 0)
        Queue<Integer> q = new LinkedList<>();
        for(Map.Entry<Integer, Integer> entry: outdegree.entrySet())
            if(entry.getValue() == 0)
                q.offer(entry.getKey());
        
        // for each source, remove it and add it to the PQ, all the vertices having edge to the source should be           // remove (i.e, subtract one from the out-degree)
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