class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if(sum%2 != 0)
            return false;
        int target = sum/2;
        Boolean[][] memo = new Boolean[nums.length][target+1];
        return helper(nums, target, 0, memo);
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
}