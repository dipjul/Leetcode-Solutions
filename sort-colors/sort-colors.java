class Solution {
    public void sortColors(int[] nums) {
        int i = 0, lowBound=0, highBound = nums.length - 1;
        
        while(i <= highBound) {
            if(nums[i] == 0) {
                swap(nums, i, lowBound);
                lowBound++;
                i++;
            } else if(nums[i] == 2) {
                swap(nums, i, highBound);
                highBound--;
            } else
                i++;
        }
    }
    
    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}