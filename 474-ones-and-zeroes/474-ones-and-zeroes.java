class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        Integer[][][] dp = new Integer[strs.length][m+1][n+1];
        return knapsackRecursive(dp, 0, strs, m, n);
    }
    
    private int knapsackRecursive(Integer[][][] dp, int index, String[] strs, int m, int n) {
        if(index >= strs.length || (m == 0 && n == 0) || m < 0 || n < 0)
            return 0;
        if(dp[index][m][n] != null)
            return dp[index][m][n];
        
        int zeroes = countZeroes(strs[index]);
        int ones = strs[index].length() - zeroes;
        
        int include = 0;
        if(zeroes <= m && ones <= n)
            include = 1 + knapsackRecursive(dp, index+1, strs, m-zeroes, n-ones);
        int exclude = knapsackRecursive(dp, index+1, strs, m, n);
        
        dp[index][m][n] = Math.max(include, exclude);
        return dp[index][m][n];
    }
    
    private int countZeroes(String s) {
        int c = 0;
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) == '0')
                c++;
        return c;
    }
}