class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        int[] res = new int[k];
        for(int num : nums) {
            mp.put(num, mp.getOrDefault(num,0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->b.val-a.val);
        for(int key : mp.keySet())
            pq.offer(new Pair(key, mp.get(key)));
        for(int i = 0; i < k; i++)
            res[i] = pq.poll().key;
        
        return res;
    }
}

class Pair {
    int key;
    int val;
    
    Pair(int k, int v) {
        key = k;
        val = v;
    }
}