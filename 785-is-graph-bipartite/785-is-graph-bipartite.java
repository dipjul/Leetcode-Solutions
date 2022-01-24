class Solution {
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
}