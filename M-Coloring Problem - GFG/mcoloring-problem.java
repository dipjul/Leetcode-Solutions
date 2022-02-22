// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();

        while (tc-- > 0) {
            int V = scan.nextInt();
            int C = scan.nextInt();
            int E = scan.nextInt();

            List<Integer>[] G = new ArrayList[V];
            for (int i = 0; i < V; i++) {
                G[i] = new ArrayList<>();
            }

            for (int i = 0; i < E; i++) {
                int u = scan.nextInt() - 1;
                int v = scan.nextInt() - 1;
                G[u].add(v);
                G[v].add(u);
            }
            int[] color = new int[V];

            System.out.println(new solve().graphColoring(G, color, 0, C) ? 1 : 0);
        }
    }
}
// } Driver Code Ends


class solve 
{
    //Function to determine if graph can be coloured with at most M colours such
    //that no two adjacent vertices of graph are coloured with same colour.
    public static boolean graphColoring(List<Integer>[] G, int[] color, int i, int m) 
    {
        // Your code here
        if(i == G.length)
            return true;
        for(int j = 1; j <= m; j++) {
            if(possible(i, j, G[i], color)){
                color[i] = j; // add choice
                if(graphColoring(G, color, i+1, m))
                    return true;
                color[i] = 0; // remove choice for backtracking
            }
        }
        
        return false;
    }
    
    private static boolean possible(int node, int colorType, List<Integer> adj, int[] color) {
        for(int num:adj) {
            if(color[num] == colorType)
                return false;
        }
        return true;
    }
}