class Solution {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> charFreqCount = new HashMap();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            charFreqCount.put(ch, charFreqCount.getOrDefault(ch, 0)+1);
        }
        
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        pq.addAll(charFreqCount.entrySet());
        
        while(!pq.isEmpty()) {
            Map.Entry e = pq.poll();
            for(int i = 0; i <(int)e.getValue();i++)
                sb.append(e.getKey());
        }
        return sb.toString();
    }
}