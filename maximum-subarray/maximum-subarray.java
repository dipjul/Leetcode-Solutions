class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int temp = nums[0];
        for(int i=1;i<nums.length;i++) {
            temp = Math.max(nums[i], nums[i] + temp);
            maxSum = Math.max(maxSum, temp);
        }
        return maxSum;
    }
}