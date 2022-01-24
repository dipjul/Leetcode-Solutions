class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(0, graph.length-1, graph, res, new ArrayList<Integer>());
        return res;
    }
    
    private void dfs(int src, int dest, int[][] graph, List<List<Integer>> res, List<Integer> tmp) {
        tmp.add(src);
        if(src == dest) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        for(Integer it: graph[src]) {
            dfs(it, dest, graph, res, tmp);
            tmp.remove(tmp.size()-1);            
        }

    }
}