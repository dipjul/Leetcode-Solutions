class Solution {
    public int longestSubsequence(String s, int k) {
        int len = 0, num = 0;
        for(int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) == '1') {
                num += Math.pow(2, s.length()-1-i);
                if(num <= k)
                    len++;
            } else {
                len++;
            }
        }
        return len;
    }
}