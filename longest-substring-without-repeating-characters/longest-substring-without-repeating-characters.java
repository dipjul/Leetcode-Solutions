class Solution {
    public int lengthOfLongestSubstring(String s) {
        int windowStart = 0, max = 0;
        Map<Character, Integer> mp = new HashMap();
        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char right = s.charAt(windowEnd);
            if(mp.containsKey(right)) {
                windowStart = Math.max(windowStart, mp.get(right)+1);
            }
            mp.put(right, windowEnd);
            max = Math.max(max, windowEnd-windowStart+1);
        }
        
        return max;
    }
}