class Solution {
    private boolean isWordPossible(String word, int[] charFreq) {
        for(char ch:word.toCharArray()) {
            --charFreq[ch-'a'];
            if(charFreq[ch-'a'] < 0)
                return false;
        }
        return true;
        
    }
    public int countCharacters(String[] words, String chars) {
        int result=0; 
        for( String word: words) {
            int[] charFreq = new int[26];
            for(char ch : chars.toCharArray())
                ++charFreq[ch-'a'];
            if(isWordPossible(word, charFreq)) result+=word.length();
        }
        return result;
    }
}