class Solution {
    public void sortColors(int[] nums) {
        int lowBound = 0, highBound = nums.length-1;
        int i = 0;
        while(i <= highBound) {
            if(nums[i] == 0) {
                swap(nums, i, lowBound);
                lowBound++;
                i++;
            } else if(nums[i] == 2) {
                swap(nums, i, highBound);
                highBound--;
            } else {
                i++;
            }
        }
    }
    
    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}