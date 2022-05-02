class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int lowBound = 0;
        int i = 0, n = nums.length;
        while(i < n) {
            if(nums[i] % 2 == 0) {
                swap(nums, i, lowBound);
                 lowBound++;  
            }
            i++;
        }
        return nums;
    }
    
    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}