class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{firstOccurence(nums, target), lastOccurence(nums, target)};
    }
    
    private int firstOccurence(int[] nums, int target) {
        int s = 0, e = nums.length-1;
        int first = -1;
        while(s <= e) {
            int m = s + (e-s)/2;
            if(nums[m] == target) {
                first = m;
                e = m - 1;
            } else if(nums[m] > target)
                e = m - 1;
            else
                s = m + 1;
        }
        return first;
    }
    
    private int lastOccurence(int[] nums, int target) {
        int s = 0, e = nums.length-1;
        int last = -1;
        while(s <= e) {
            int m = s + (e-s)/2;
            if(nums[m] == target) {
                last = m;
                s = m + 1;
            } else if(nums[m] > target)
                e = m - 1;
            else
                s = m + 1;
        }
        return last;
    }
}