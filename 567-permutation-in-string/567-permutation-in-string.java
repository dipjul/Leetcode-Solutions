class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length())
            return false;
        char[] s1Map = new char[26];
        char[] s2Map = new char[26];
        
        for(int i = 0; i < s1.length(); i++) {
            s1Map[s1.charAt(i)-'a']++;
            s2Map[s2.charAt(i)-'a']++;
        }
            
        int matches = 0;
        for(int i = 0; i < 26; i++) {
            if(s1Map[i] == s2Map[i])
                matches++;
        }
        int windowStart = 0;
        for(int windowEnd = s1.length(); windowEnd < s2.length(); windowEnd++) {
            if(matches == 26) return true;
            int rightCharInd = s2.charAt(windowEnd)-'a';
            s2Map[rightCharInd]++;
            if(s1Map[rightCharInd] == s2Map[rightCharInd])
                matches++;
            else if(s1Map[rightCharInd] + 1 == s2Map[rightCharInd])
                matches--;
            
            int leftCharInd = s2.charAt(windowStart)-'a';
            s2Map[leftCharInd]--;
            if(s1Map[leftCharInd] == s2Map[leftCharInd])
                matches++;
            else if(s1Map[leftCharInd] - 1 == s2Map[leftCharInd])
                matches--;
            
            windowStart++;
        }
        
        return matches == 26;
    }
}