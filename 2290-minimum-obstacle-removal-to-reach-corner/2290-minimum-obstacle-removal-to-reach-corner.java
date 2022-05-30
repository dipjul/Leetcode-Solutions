class Solution {
    class Node {
        int dist;
        int i;
        int j;
        boolean done;
        Node(int d, int ii, int jj, boolean don) {
            dist = d;
            i = ii;
            j = jj;
            done = done;
        }
    }

    public int minimumObstacles(int[][] grid) {
        int[][] dirs = {{0,-1},{-1,0},{0,1},{1,0}};
        int n = grid.length, m = grid[0].length;
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b)->a.dist-b.dist);
        Map<String, Node> mp = new HashMap<>();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                String key = ""+i+","+j;
                Node node = null;
                if(i == 0 && j == 0)
                    node = new Node(0,i,j,false);
                else
                    node = new Node(100001,i,j,false);
                mp.put(key, node);
            }
        }

        pq.offer(mp.get("0,0"));
        while(!pq.isEmpty()) {
            Node node = pq.poll();
            if(node.done == false) {
                node.done = true;
                int i = node.i;
                int j = node.j;
                for(int[] dir:dirs) {
                    int new_i = i+dir[0];
                    int new_j = j+dir[1];
                    if(new_i >= 0 && new_i < n && new_j >= 0 && new_j < m) {
                        String neiK = ""+new_i+","+new_j;
                        Node nei = mp.get(neiK);
                        int cost = node.dist+grid[new_i][new_j];
                        if(cost < nei.dist) {
                            nei.dist = cost;
                            pq.offer(mp.get(neiK));
                        }
                    }
                }
            }

        }
        return mp.get(""+(n-1)+","+(m-1)).dist;
    }
}
