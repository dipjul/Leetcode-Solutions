class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int windowSize = s1.length();
        StringBuilder sb = new StringBuilder();
        for(int windowEnd = 0; windowEnd < s2.length(); windowEnd++) {
            char ch = s2.charAt(windowEnd);
            if(windowEnd < windowSize)
                sb.append(ch);
            else {
                if(isPermutation(s1, sb.toString()))
                    return true;
                sb.deleteCharAt(0);
                sb.append(ch);
            }
            
        }
        return isPermutation(s1, sb.toString());
    }
    
    private boolean isPermutation(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;
        char[] arr = new char[26];
        for(int i = 0; i < s1.length(); i++) {
            int ind1 = s1.charAt(i)-'a';
            int ind2 = s2.charAt(i)-'a';
            arr[ind1]++;
            arr[ind2]--;
        }
        
        for(int i = 0; i < 26; i++) {
            if(arr[i] != 0)
                return false;
        }
        
        return true;
    }
}