class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> indexMap = new HashMap<>();
        int windowStart = 0, count = 0;
        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char ch = s.charAt(windowEnd);
            if(indexMap.containsKey(ch)) {
                windowStart = Math.max(windowStart, indexMap.get(ch)+1);
            }
            count = Math.max(count, windowEnd - windowStart + 1);
            indexMap.put(ch, windowEnd);
        }
        return count;
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
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
}*/