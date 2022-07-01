class Solution {
    public int maximumsSplicedArray(int[] nums1, int[] nums2) {
        int sum1 = 0, sum2 = 0, n = nums1.length;
        for(int i = 0; i < n; i++) {
            sum1 += nums1[i];
            sum2 += nums2[i];
        }
        return Math.max(fun(nums1, nums2, sum1, sum2, n), fun(nums2, nums1, sum2, sum1, n));
    }
    
    private int fun(int[] nums1, int[] nums2, int sum1, int sum2, int n) {
        int maxSum = 0;
        int max = 0;
        
        int l = 0, r = 0;
        while(r < n) {
            int diff = nums2[r]-nums1[r];
            max += diff;
            if(max < 0) {
                l = r + 1;
                r = l;
                max = 0;
            } else {
                r++;
            }
            maxSum = Math.max(maxSum, max);
        }
        return sum1 + maxSum;
    }
}
