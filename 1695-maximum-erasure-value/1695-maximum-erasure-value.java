class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        int winS = 0, maxSum = 0, sum = 0;
        for(int winE = 0; winE < nums.length; winE++) {
            if(mp.containsKey(nums[winE])) {
                winS = Math.max(winS, mp.get(nums[winE])+1);
                mp.remove(nums[winE]);
            }
            sum = 0;
            for(int i = winS; i <= winE; i++)
                sum += nums[i];
            maxSum = Math.max(maxSum, sum);
            mp.put(nums[winE], winE);
        }
        return maxSum;
    }
}
