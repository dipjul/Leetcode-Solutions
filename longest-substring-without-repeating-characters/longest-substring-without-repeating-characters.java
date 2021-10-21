class Solution {
    public int lengthOfLongestSubstring(String s) {
        int windowStart = 0, maxLength = 0;
        HashMap<Character, Integer> mp = new HashMap();
        
        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char rightChar = s.charAt(windowEnd);
            if(mp.containsKey(rightChar)) {
                windowStart = Math.max(windowStart, mp.get(rightChar)+1);
            }
            mp.put(rightChar, windowEnd);
            maxLength = Math.max(maxLength, windowEnd-windowStart+1);
        }
        return maxLength;
    }
}