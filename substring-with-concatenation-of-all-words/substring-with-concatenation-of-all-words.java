class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int wordsCount = words.length, wordLen = words[0].length();
        
        Map<String, Integer> wordFreqMap = new HashMap();
        List<Integer> res = new ArrayList();
        for(String word:words)
            wordFreqMap.put(word, wordFreqMap.getOrDefault(word, 0)+1);
        
        for(int windowStart = 0; windowStart < s.length()-wordsCount*wordLen+1; windowStart++) {
            Map<String, Integer> hasSeen = new HashMap();
            
            for(int count = 0; count < wordsCount; count++) {
                int nextWordIndex = windowStart + count*wordLen;
                String word = s.substring(nextWordIndex, nextWordIndex+wordLen);
                
                if(!wordFreqMap.containsKey(word))
                    break;
                hasSeen.put(word,hasSeen.getOrDefault(word, 0)+1);
                if(hasSeen.get(word) > wordFreqMap.get(word))
                    break;
                if(count+1 == wordsCount)
                    res.add(windowStart);
            }
            
        }
        return res;
    }
}