public class Solution {

    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] time : times) {
            List<int[]> neighbours = graph.getOrDefault(time[0], new ArrayList<>());
            neighbours.add(new int[] { time[1], time[2] });
            graph.put(time[0], neighbours);
        }
        int[] cost = new int[n + 1];
        for (int i = 1; i <= n; i++) cost[i] = 100005;
        cost[k] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.offer(k);
        while (!q.isEmpty()) {
            int vertex = q.poll();
            if (!graph.containsKey(vertex)) continue;

            List<int[]> neighbours = graph.get(vertex);
            // Collections.sort(neighbours, (a, b) -> a[1] - b[1]);
            for (int[] nei : neighbours) {
                int newCost = cost[vertex] + nei[1];
                if (newCost < cost[nei[0]]) {
                    cost[nei[0]] = newCost;
                    q.offer(nei[0]);
                }
            }
        }
        int ans = -1;
        for (int i = 1; i <= n; i++) {
            if (cost[i] >= 100005) return -1;
            if (cost[i] > ans) ans = cost[i];
        }
        return ans;
    }
}
