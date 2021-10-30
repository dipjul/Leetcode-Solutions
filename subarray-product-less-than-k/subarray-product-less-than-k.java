class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0, p = 1, count = 0;
        
        for(int right = 0; right < nums.length; right++) {
            p = p*nums[right];
            while(p >= k && left < nums.length) {
                p /= nums[left];
                left++;
            }
            if(left <= right)
                count += (right-left+1);
        }
        return count;
    }
}