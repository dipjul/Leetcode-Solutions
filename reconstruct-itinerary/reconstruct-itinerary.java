class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        List<String> res = new LinkedList<>();
        Map<String, PriorityQueue<String>> adj = new HashMap<>();
        
        for(List<String> ticket:tickets) {
            if(!adj.containsKey(ticket.get(0)))
                adj.put(ticket.get(0), new PriorityQueue<>((a,b)-> a.compareTo(b)));
            adj.get(ticket.get(0)).offer(ticket.get(1));
        }
        if(adj.containsKey("JFK"))
            dfs("JFK", adj, res);
        return res;
    }
    
    private void dfs(String src, Map<String, PriorityQueue<String>> adj, List<String> res) {
        while(adj.containsKey(src) && !adj.get(src).isEmpty())
            dfs(adj.get(src).poll(), adj, res);
        res.add(0, src);
    }
}