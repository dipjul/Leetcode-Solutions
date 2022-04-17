class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int pre = 1;
        res[0] = 1;
        for(int i = 0; i < n-1; i++) {
            pre *= nums[i];
            res[i+1] = pre;
        }
        int post = 1;
        for(int i = n-1; i > 0; i--) {
            post *= nums[i];
            res[i-1] *= post;
        }
        return res;
    }
}