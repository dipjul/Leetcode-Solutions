class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        int winS = 0, maxSum = 0, sum = 0;
        for(int winE = 0; winE < nums.length; winE++) {
            sum += nums[winE];
            if(mp.containsKey(nums[winE])) {
                int i = winS;
                winS = Math.max(winS, mp.get(nums[winE])+1);
                mp.remove(nums[winE]);
                while(i < winS)
                    sum -= nums[i++];
            }
            maxSum = Math.max(maxSum, sum);
            mp.put(nums[winE], winE);
        }
        return maxSum;
    }
}