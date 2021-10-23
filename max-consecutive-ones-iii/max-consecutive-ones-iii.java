class Solution {
    public int longestOnes(int[] nums, int k) {
        int wS = 0, maxLen = 0, countConOne = 0;
        
        for(int wE = 0; wE < nums.length; wE++) {
            
            if(nums[wE] == 1)
                countConOne++;
            while(wE - wS + 1 - countConOne > k) {
                
                if(nums[wS] == 1)
                    countConOne--;
                wS++;
            }
            maxLen = Math.max(maxLen, wE-wS+1);
        }
        return maxLen;
    }
}