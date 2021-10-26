class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int windowStart = 0, matched = 0;
        
        List<Integer> result = new ArrayList();
        Map<Character, Integer> charFreqMap = new HashMap();
        
        for(char c:p.toCharArray())
            charFreqMap.put(c, charFreqMap.getOrDefault(c,0)+1);
        
        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char right = s.charAt(windowEnd);
            
            if(charFreqMap.containsKey(right)) {
                charFreqMap.put(right, charFreqMap.get(right)-1);
                if(charFreqMap.get(right) == 0)
                    matched++;
            }
            
            if(matched == charFreqMap.size()) {
                result.add(windowStart);
            }
            
            if(windowEnd >= p.length()-1) {
                char left = s.charAt(windowStart);
                
                if(charFreqMap.containsKey(left)) {
                    if(charFreqMap.get(left) == 0)
                        matched--;
                    charFreqMap.put(left, charFreqMap.get(left)+1);
                    
                }
                windowStart++;
            }
        }
        return result;
    }
}