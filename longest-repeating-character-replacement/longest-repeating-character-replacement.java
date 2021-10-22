class Solution {
    public int characterReplacement(String s, int k) {
        int windowStart = 0, maxLength = 0, mostRepeatingCharCount = 0;
        
        HashMap<Character, Integer> charFreqMap = new HashMap();
        
        for(int wE = 0; wE < s.length(); wE++) {
            char right = s.charAt(wE);
            charFreqMap.put(right, charFreqMap.getOrDefault(right, 0)+1);
            mostRepeatingCharCount = Math.max(mostRepeatingCharCount, charFreqMap.get(right));
            
            while(wE-windowStart+1 - mostRepeatingCharCount > k) {
                char left = s.charAt(windowStart);
                charFreqMap.put(left, charFreqMap.get(left)-1);
                if(charFreqMap.get(left) == 0)
                    charFreqMap.remove(left);
                windowStart++;
            }
            maxLength = Math.max(maxLength, wE-windowStart+1);
        }
        
        return maxLength;
    }
}