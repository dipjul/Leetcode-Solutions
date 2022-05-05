class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        
        int prev = 1, prev2 = 0, curr = 0;
        
        for(int i = n-1; i >= 0; i--) {
            char ch = s.charAt(i);
            curr = 0;
            if(ch != '0') {
                curr += prev;
                if(i < n-1 && Integer.valueOf(s.substring(i,i+2)) <= 26)
                    curr += prev2;
            }
            int tmp = prev;
            prev = curr;
            prev2 = tmp;
        }
        return curr;
    }
}