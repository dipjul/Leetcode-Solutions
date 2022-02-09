class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] vis = new boolean[n];
        List<Integer> arr = new ArrayList<>();
        dfs(0, rooms, arr, vis);
        return n == arr.size();
    }
    
    private void dfs(int vertex, List<List<Integer>> rooms, List<Integer> arr, boolean[] vis) {
        vis[vertex] = true;
        arr.add(vertex);
        for(int key: rooms.get(vertex)) {
            if(!vis[key])
                dfs(key, rooms, arr, vis);
        }
    }
}