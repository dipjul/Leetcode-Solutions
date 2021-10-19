class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int windowStart = 0, windowSum = 0;
        int min = Integer.MAX_VALUE;
        
        for(int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            windowSum += nums[windowEnd];
            while(windowSum >= target) {
                windowSum -= nums[windowStart];
                min = Math.min(min, windowEnd - windowStart + 1);
                windowStart++;
            }
        }
        return min<Integer.MAX_VALUE?min:0;
    }
}