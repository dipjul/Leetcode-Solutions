class Solution {
    public int longestOnes(int[] nums, int k) {
        int windowStart = 0, zeroCountInWindow = 0, maxLen = 0;
        HashMap<Integer, Integer> mp = new HashMap();
        
        for(int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            int right = nums[windowEnd];
            if(right == 0) {
                mp.put(right, mp.getOrDefault(right, 0)+1);
            }
            while((mp.containsKey(0)?mp.get(0):0) > k) {
                if(nums[windowStart] == 0)
                    mp.put(0, mp.get(0)-1);
                windowStart++;
            }
            maxLen = Math.max(maxLen, windowEnd - windowStart + 1);  
        }
        return maxLen;
    }
}