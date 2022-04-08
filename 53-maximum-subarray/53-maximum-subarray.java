class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        
        int total = 0;
        int result = nums[0];
        
        for(int num : nums) {
            total = total+num;
            result = Math.max(result, total);
            if(total < 0)
                total = 0;
        }
        
        return result;
    }
}