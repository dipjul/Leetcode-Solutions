class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];

        for(int i = 0; i < graph.length; i++) {
            if(color[i] == 0 && !dfs2(i, graph, color))
                return false;
        }
        return true;
    }        
    
    private boolean dfs2(int node, int[][] graph, int[] color) {
        if(color[node] == 0)
            color[node] = 1;
        
        for(Integer it:graph[node]) {
            if(color[it] == color[node])
                return false;
            if(color[it] == 0) {
                color[it] = color[node]==1?2:1;
                if(!dfs2(it, graph, color))
                    return false;
            }        
        }
        return true;
    }
    
    /* 
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        Arrays.fill(color, -1);
        for(int i = 0; i < graph.length; i++) {
            if(color[i] == -1 && !dfs(i, graph, color, 1))
                return false;
        }
        return true;
    }

    private boolean dfs(int node, int[][] graph, int[] color, int prevColor) {
        if(color[node] == prevColor)
            return false;
        color[node] = 1-prevColor;
        for(Integer it:graph[node]) {
            if(color[it] == color[node])
                return false;
            if(color[it] == -1) {
                if(!dfs(it, graph, color, color[node]))
                    return false;
            }
                
        }
        return true;
    }
     */   
    /*
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        Arrays.fill(color, -1);
        for(int i = 0; i < graph.length; i++) {
            if(color[i] == -1 && !bfs(i, graph, color))
                return false;
        }
        return true;
    }
    
    private boolean bfs(int node, int[][] graph, int[] color) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        color[node] = 0;
        while (!q.isEmpty()) {
            int curr = q.poll();
            for (int it : graph[curr]) {
                if(color[it] == -1) {
                    color[it] = 1 - color[curr];
                    q.add(it);
                } else if (color[it] == color[curr])
                    return false;
            }
        }
        return true;
    }
    */
}