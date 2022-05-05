class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n+1];
        dp[n] = 1;
        
        
        for(int i = n-1; i >= 0; i--) {
            char ch = s.charAt(i);
            if(ch != '0') {
            //     if(i < n-1 && Integer.valueOf(s.substring(i,i+2)) == 26)
            //         return 0;
            // }
            // else {
                dp[i] += dp[i+1];
                if(i < n-1 && Integer.valueOf(s.substring(i,i+2)) <= 26)
                    dp[i] += dp[i+2];
            }
        }
        return dp[0];
    }
}