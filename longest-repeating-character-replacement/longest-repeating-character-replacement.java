class Solution {
    public int characterReplacement(String s, int k) {
        int windowStart = 0, maxLength = 0, mostRepeatingCharCount = 0;
        
        HashMap<Character, Integer> mp = new HashMap();
        
        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char right = s.charAt(windowEnd);
            mp.put(right, mp.getOrDefault(right, 0)+1);
            mostRepeatingCharCount = Math.max(mostRepeatingCharCount, mp.get(right));
            if(windowEnd - windowStart + 1 - mostRepeatingCharCount > k) {
                char left = s.charAt(windowStart);
                mp.put(left, mp.get(left)-1);
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}