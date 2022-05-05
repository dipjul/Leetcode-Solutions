class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        
        int prev = 1, prev2 = 0, curr = 0;
        
        for(int i = n-1; i >= 0; i--) {
            char ch = s.charAt(i);
            curr = 0;
            if(ch != '0') {
                curr += prev;
                if(i < n-1 && ((ch-'0' == 1) || (ch-'0' <= 2 && s.charAt(i+1)-'0' <= 6)))
                    curr += prev2;
            }
            int tmp = prev;
            prev = curr;
            prev2 = tmp;
        }
        return curr;
    }
}