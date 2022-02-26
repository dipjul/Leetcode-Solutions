class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums, target, 0);
    }
    
    private int helper(int[] nums, int target, int index) {
        if(index == nums.length && target == 0)
            return 1;
        if(index >= nums.length)
            return 0;
        // positive
        int pos = helper(nums, target-nums[index], index+1);
        // negative
        int neg = helper(nums, target+nums[index], index+1);
        return pos+neg;
    }
}