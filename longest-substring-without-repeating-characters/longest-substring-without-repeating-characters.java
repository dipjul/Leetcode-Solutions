class Solution {
    public int lengthOfLongestSubstring(String s) {
        int windowStart = 0;
        int totalLen = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            if(map.containsKey(s.charAt(windowEnd)) && map.get(s.charAt(windowEnd)) >= windowStart) {
                windowStart = map.get(s.charAt(windowEnd)) + 1;
                map.remove(s.charAt(windowEnd));
            }
            map.put(s.charAt(windowEnd), windowEnd);
            if(windowEnd - windowStart + 1 > totalLen) {
                totalLen = windowEnd - windowStart + 1;
            }
        }
        return totalLen;
    }
}