class Solution {
    public boolean canJump(int[] nums) {
        int ans = 0, n = nums.length;
        for(int i = 0; i < n-1; i++) {
            if(ans < i)
                return false;
            if(ans < i+nums[i])
                ans = i+nums[i];
            if(ans >= n-1)
                return true;
        }
        return ans >= n-1;
    }
}
