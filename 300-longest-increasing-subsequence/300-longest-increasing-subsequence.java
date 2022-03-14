class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int res = dp[0];
        
        for(int i = 1; i < dp.length; i++) {
            int max = 0;
            for(int j = 0; j < i; j++) {
                if(nums[j] < nums[i])
                    max = Math.max(max, dp[j]);
            }
            dp[i] = max + 1;
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}