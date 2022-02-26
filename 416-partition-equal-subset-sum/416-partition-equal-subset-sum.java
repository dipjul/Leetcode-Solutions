class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if(sum%2 != 0)
            return false;
        int target = sum/2;
        // Boolean[][] memo = new Boolean[nums.length][target+1];
        // return helper(nums, target, 0, memo);
        return helperTopDown(nums, target);
    }
    
    private boolean helper(int[] nums, int target, int index, Boolean[][] memo) {
        if(target == 0)
            return true;
        if(index == nums.length || target < 0)
            return false;
        if(memo[index][target] != null)
            return memo[index][target];
        memo[index][target] = helper(nums, target-nums[index], index+1, memo) || helper(nums, target, index+1, memo);
        return memo[index][target];
    }
    
    private boolean helperTopDown(int[] nums, int target) {
        Boolean[][] dp = new Boolean[nums.length+1][target+1];
        
        for(int i = 0; i < dp[0].length; i++) {
            dp[0][i] = false;
        }
        
        for(int i = 0; i < dp.length; i++) {
            dp[i][0] = true;
        }
        
        for(int i = 1; i < dp.length; i++) {
            for(int j = 1; j < dp[i].length; j++) {
                if(j-nums[i-1] >= 0)
                    dp[i][j] = dp[i-1][j-nums[i-1]] || dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}