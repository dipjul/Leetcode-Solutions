class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        
        int ptr1 = 0, ptr2 = nums.length-1;
        
        int mxSm = 0;
        
        while(ptr1 < ptr2) {
            mxSm = Math.max(mxSm, nums[ptr1++]+nums[ptr2--]);
        }
        
        return mxSm;
    }
}