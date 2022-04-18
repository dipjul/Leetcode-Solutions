class Solution {
    public int characterReplacement(String s, int k) {
        int windowStart = 0, maxLength = 0, mostRepeatingCharCount = 0;
        
        HashMap<Character, Integer> charFreqMap = new HashMap();
        
        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char right = s.charAt(windowEnd);
            charFreqMap.put(right, charFreqMap.getOrDefault(right, 0)+1);
            mostRepeatingCharCount = Math.max(mostRepeatingCharCount, charFreqMap.get(right));
            
            while(windowEnd-windowStart+1 - mostRepeatingCharCount > k) {
                char left = s.charAt(windowStart);
                charFreqMap.put(left, charFreqMap.get(left)-1);
                if(charFreqMap.get(left) == 0)
                    charFreqMap.remove(left);
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd-windowStart+1);
        }
        
        return maxLength;
    }
}