class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
        int pre = 1;
        for(int i = 0; i < n-1; i++) {
            pre *=  nums[i];
            result[i+1] = pre;
        }
        int post = 1;
        for(int i = n-1; i > 0; i--) {
            post *= nums[i];
            result[i-1] = result[i-1]*post;
        }
        return result;
    }
}