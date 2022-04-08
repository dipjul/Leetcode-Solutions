class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        
        int total = 0;
        int result = nums[0];
        
        for(int num : nums) {
            if(total < 0)
                total = 0;
            total = total+num;
            result = Math.max(result, total);
            
        }
        
        return result;
    }
}