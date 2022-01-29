class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean result = false;
        boolean[] visited = new boolean[n];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        
        for(int i = 0; i < edges.length; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        
        for(int i = 0; i < n; i++) {
            if(i == source && visited[i] == false) {
                result = dfs(source, destination, adj, visited);
                if(result) return true;
            }
        }
        return result;
    }
    
    private boolean bfs(int vertex, int dest, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        if(vertex == dest) return true;
        Queue<Integer> q = new LinkedList<>();
        q.offer(vertex);
        visited[vertex] = true;
        
        while(!q.isEmpty()) {
            int sz = q.size();
            for(int i = 0; i < sz; i++) {
                int curr = q.poll();
                ArrayList<Integer> children = adj.get(curr);

                for(int j = 0; j < children.size(); j++) {
                    int child = children.get(j);
                    if(child == dest) return true;
                    if(visited[child] == false) {
                        
                        visited[child] = true;
                        q.offer(child);
                    }
                }
            }
        }
        return false;
    }
    
    
    private boolean dfs(int vertex, int dest, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        visited[vertex] = true;
        if(vertex == dest) return true;
        boolean result = false;
        for(Integer it:adj.get(vertex)) {
            if(!visited[it]) {
                if(it == dest) return true;
                else {
                    result = dfs(it, dest, adj, visited);
                    if(result)
                        return true;
                }
            }
        }
        return result;
    }
    
}