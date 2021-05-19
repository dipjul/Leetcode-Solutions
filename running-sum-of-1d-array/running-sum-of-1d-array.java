class Solution {
    public int[] runningSum(int[] nums) {
        int[] output = new int[nums.length];
        int sum = nums[0];
        output[0] = nums[0];
        for(int i=1;i<nums.length;i++) {
            sum += nums[i];
            output[i] = sum;
        }
        return output;
    }
}