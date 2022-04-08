class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b-a);
        
        for(int stone : stones)
            pq.offer(stone);
        
        while(pq.size() > 1) {
            int x = pq.poll();
            int y = 0;
            if(pq.size() > 0)
                y = pq.poll();
            if(x != y) {
                pq.offer(Math.abs(x-y));
            } else {
                continue;
            }
        }
        
        return pq.isEmpty()?0:pq.peek();
    }
}