class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];
        for(int i = 1; i < n; i++) {
            prefixSum[i] = Math.max(prefixSum[i-1]+nums[i], nums[i]);
        }
        
        int result = prefixSum[0];
        for(int num:prefixSum)
            result = Math.max(result, num);
        return result;
    }
}