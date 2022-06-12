class Solution {
    public int minOperations(int[] nums, int x) {
        int left = 0, right = 0, curSum = 0, n = nums.length;
        int sum = 0, maxLen = -1;;
        for(int i = 0; i < n; i++) sum += nums[i];
        
        while(right < n) {
            curSum += nums[right];
            while(left <= right && sum - x < curSum) 
                curSum -= nums[left++];
            if(sum - x == curSum)
                maxLen = Math.max(maxLen, right-left+1);
            right++;
        }
        return maxLen == -1?-1:n-maxLen;
    }
}