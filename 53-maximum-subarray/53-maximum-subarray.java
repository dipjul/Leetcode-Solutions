class Solution {
    public int maxSubArray(int[] nums) {
        int total = 0, result = nums[0];
        
        for(int num : nums) {
            if(total < 0)
                total = 0;
            total = Math.max(num, total+num);
            result = Math.max(total, result);
        }
        return result;
    }
}