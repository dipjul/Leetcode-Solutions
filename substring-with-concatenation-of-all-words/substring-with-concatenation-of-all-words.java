class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int wordsCount = words.length, wordLen = words[0].length();
        List<Integer> res = new ArrayList();
        Map<String, Integer> wordFreqMap = new HashMap();
        
        for(String word:words)
            wordFreqMap.put(word, wordFreqMap.getOrDefault(word, 0)+1);
        
        for(int windowStart = 0; windowStart < s.length()-wordsCount*wordLen+1; windowStart++) {
            Map<String, Integer> hasSeen = new HashMap();
            
            for(int j = 0; j < wordsCount; j++) {
                int nextWordIndex = windowStart + j*wordLen;
                String word = s.substring(nextWordIndex, nextWordIndex+wordLen);
                
                if(!wordFreqMap.containsKey(word))
                    break;
                hasSeen.put(word, hasSeen.getOrDefault(word, 0)+1);
                
                if(hasSeen.get(word) > wordFreqMap.get(word))
                    break;
                
                if(j+1 == wordsCount)
                    res.add(windowStart);
            }
        }
        return res;
    }
}