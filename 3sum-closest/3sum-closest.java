class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int smallestDiff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++) {
            int left = i + 1, right = nums.length-1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int targetDiff = sum - target;
                
                if(Math.abs(targetDiff) < Math.abs(smallestDiff)) {
                    smallestDiff = targetDiff;
                }
                
                if(sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
            
        }
        return smallestDiff < Integer.MAX_VALUE?(target + smallestDiff):0;
    }
}