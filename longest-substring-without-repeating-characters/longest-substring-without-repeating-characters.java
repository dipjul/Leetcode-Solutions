class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        int windowStart = 0, windowEnd = 0;
        HashMap<Character, Integer> mp = new HashMap<>();
        int count = 0;
        while(windowEnd < s.length()) {
            char ch = s.charAt(windowEnd);
            if(mp.containsKey(ch) && mp.get(ch) >= windowStart) {
                windowStart = mp.get(ch)+1;
                mp.remove(ch);
            }
            mp.put(ch, windowEnd);
            if(windowEnd - windowStart + 1 > count) {
                count = windowEnd-windowStart+1;
            }
            windowEnd++;
        }
        return count;
    }
}