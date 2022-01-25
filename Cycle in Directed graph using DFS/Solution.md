## Detect cycle in a directed graph 
```
Medium Accuracy: 30.19% Submissions: 100k+ Points: 4
```

### Given a Directed Graph with V vertices (Numbered from 0 to V-1) and E edges, check whether it contains any cycle or not.
```
Example 1:
Input:
4 4
0 1
1 2
2 3
3 3

Output: 1
Explanation: 3 -> 3 is a cycle

Example 2:
Input:
3 2
0 1
1 2

Output: 0
Explanation: no cycle in the graph
```

Your task:
You don’t need to read input or print anything. Your task is to complete the function isCyclic() which takes the integer V denoting the number of vertices and adjacency list as input parameters and returns a boolean value denoting if the given directed graph contains a cycle or not.

```
Expected Time Complexity: O(V + E)
Expected Auxiliary Space: O(V)
```
```
Constraints:
1 ≤ V, E ≤ 105

View Bookmarked Problems
Company Tags
 Adobe Amazon BankBazaar Flipkart Goldman Sachs MakeMyTrip Microsoft Oracle Rockstand Samsung
```

```java
class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] vis = new int[V];
        int[] dfsVis = new int[V];
        
        for(int i = 0;i < V; i++) {
            if(vis[i] == 0 && dfsCycle(i, adj, vis, dfsVis))
                return true;
        }
        return false;
    }
    
    private boolean dfsCycle(int node, ArrayList<ArrayList<Integer>> adj, int[] vis, int[] dfsVis) {
        vis[node] = 1;
        dfsVis[node] = 1;
        for(Integer it:adj.get(node)) {
            if(vis[it] == 0) {
                if(dfsCycle(it, adj, vis, dfsVis))
                    return true;
            }
            if(dfsVis[it] == 1)
                return true;
        }
        dfsVis[node] = 0;
        return false;
    }
}
```
