class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0)
            return false;
        
        
        Map<Integer, Integer> mp = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->a-b);
        
        for(int i = 0; i < hand.length; i++) {
           if(!mp.containsKey(hand[i])) {
               pq.offer(hand[i]);
               mp.put(hand[i], 1);
           } else {
               mp.put(hand[i], mp.get(hand[i])+1);
           }
        }
        
        while(!pq.isEmpty()) {
            int min = pq.peek();
            int sz  = 0;
            while(sz < groupSize) {
                if(!mp.containsKey(min))
                    return false;
                mp.put(min, mp.get(min)-1);
                if(mp.get(min) == 0) {
                    mp.remove(min);
                    int val = pq.poll();
                    if(val != min)
                        return false;
                }
                min++;
                sz++;
            }

        }
        return true;
    }
}
