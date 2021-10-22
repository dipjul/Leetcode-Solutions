class Solution {
    public int longestOnes(int[] nums, int k) {
        int windowStart = 0, onesCount = 0, maxLen = 0;
        
        for(int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            if(nums[windowEnd] == 1) onesCount++;
            while(windowEnd - windowStart + 1 - onesCount > k) {
                if(nums[windowStart] == 1)
                    onesCount--;
                windowStart++;
            }
            maxLen = Math.max(maxLen, windowEnd - windowStart + 1);
        }
        
        return maxLen;
    }
}