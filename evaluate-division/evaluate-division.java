class Pair {
    String node;
    double weight;
    
    Pair(String node, double weight) {
        this.node = node;
        this.weight = weight;
    }
}

class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        // create the graph
        Map<String, Map<String, Double>> graph = new HashMap<>();

        for(int i = 0; i < equations.size(); i++) {
            String num = equations.get(i).get(0);
            String den = equations.get(i).get(1);
            // num -> den
            if(!graph.containsKey(num))
                graph.put(num, new HashMap<>());
            graph.get(num).put(den, values[i]);

            // den - > num
            if(!graph.containsKey(den))
                graph.put(den, new HashMap<>());
            graph.get(den).put(num, 1/values[i]);
        }

        // check queries
        double[] res = new double[queries.size()];
        int idx = 0;

        for(List<String> query:queries) {
            String num = query.get(0);
            String den = query.get(1);
            if(!graph.containsKey(num) || !graph.containsKey(den))
                res[idx++] = -1.0d;
            else if(num.equals(den))
                res[idx++] = 1.0d;
            else
                res[idx++] = dfs(num, den, graph, new HashSet<String>(), 1.0d);
        }

        return res;        
    }
    
    // dfs to find the result
    private double dfs(String src, String dst, Map<String, Map<String, Double>> graph, Set<String> vis, double tmp) {
        if(!graph.containsKey(src))
            return -1.0d;
        if(graph.get(src).containsKey(dst))
            return tmp*graph.get(src).get(dst);
        
        vis.add(src); 
        
        
        for(Map.Entry<String, Double> neighbor : graph.get(src).entrySet()) {
            if(!vis.contains(neighbor.getKey())) {
                double ans = dfs(neighbor.getKey(), dst, graph, vis, tmp*neighbor.getValue());
                if(ans != -1.0d)
                    return ans;
            }    
        }
        return -1.0d;  
    }
}



