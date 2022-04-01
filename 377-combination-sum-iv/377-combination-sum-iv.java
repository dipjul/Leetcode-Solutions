class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        dp[0] = 0;
        for(int n:nums) {
            if(n <= target)
                dp[n] = 1;
        }
        
        for(int i = 1; i <= target; i++) {
            for(int n : nums) {
                if(i-n >= 0)
                    dp[i] += dp[i-n];
            }
        }
        
        return dp[target];
    }
}