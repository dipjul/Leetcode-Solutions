class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp, 10000);
        dp[n - 1] = 0;

        for (int i = n - 2; i >= 0; i--) {
            for (int j = nums[i]; j >= 0; j--) {
                if (i + j < n)
                    dp[i] = Math.min(dp[i], 1 + dp[i + j]);
            }
        }
        return dp[0];
    }
}
