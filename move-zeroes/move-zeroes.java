class Solution {
    public void moveZeroes(int[] nums) {
        int lowBound = 0;
        int i = 0;
        while(i < nums.length) {
            if(nums[i] != 0) {
                swap(nums, lowBound, i);
                lowBound++;
            }
            i++;
        }
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}