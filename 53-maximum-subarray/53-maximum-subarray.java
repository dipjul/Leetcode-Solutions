class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        
        int tmpResult = nums[0];
        int result = nums[0];
        
        for(int i = 1; i < n; i++) {
            tmpResult = Math.max(tmpResult+nums[i], nums[i]);
            result = Math.max(result, tmpResult);
        }
        
        return result;
    }
}