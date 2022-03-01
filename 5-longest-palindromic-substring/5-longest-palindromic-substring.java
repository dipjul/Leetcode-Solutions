class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 0 || s.length() == 1)
            return s;
        int resLen = 0;
        String res = "";
        for(int i = 0; i < s.length(); i++) {
            // odd length palindromes
            int left = i, right = i;
            while(left >= 0 && right < s.length() && s.charAt(left)==s.charAt(right)) {
                if(right-left+1 > resLen) {
                    res = s.substring(left, right+1);
                    resLen = right-left+1;
                }
                left--;
                right++;
            }
            // even length palindrome
            left = i; right = i+1;
            while(left >= 0 && right < s.length() && s.charAt(left)==s.charAt(right)) {
                if(right-left+1 > resLen) {
                    res = s.substring(left, right+1);
                    resLen = right-left+1;
                }
                left--;
                right++;
            }
        }
        return res;
    }
}