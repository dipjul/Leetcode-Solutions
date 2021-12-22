class Solution {
    public int maxSubArray(int[] nums) {
        int[] prefixSum = new int[nums.length];
        int maxSum = nums[0];
        prefixSum[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            prefixSum[i] = Math.max(nums[i], prefixSum[i-1]+nums[i]);
        }
        
        for(int i = 0; i < prefixSum.length; i++) {
            maxSum = Math.max(maxSum, prefixSum[i]);
        }
        return maxSum;
    }
}