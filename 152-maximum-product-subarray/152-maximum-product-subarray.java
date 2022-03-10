class Solution {
    public int maxProduct(int[] nums) {
        int res = Arrays.stream(nums).max().getAsInt();
        int currMin = 1, currMax = 1;
        for(int n : nums) {
            if(n == 0) {
                currMin = 1;
                currMax = 1;
                continue;
            } else {
                int tmp = currMax*n;
                currMax = Math.max(Math.max(currMax*n, currMin*n), n);
                currMin = Math.min(Math.min(tmp, currMin*n), n);
                res = Math.max(currMax, res);
            }
        }
        return res;
    }
}