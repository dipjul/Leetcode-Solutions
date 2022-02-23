class Solution {
    public int search(int[] nums, int target) {
        int smallestNum = findMin(nums);
        int left = binarySearch(nums, 0, smallestNum-1, target);
        if(left != -1)
            return left;
        int right = binarySearch(nums, smallestNum, nums.length-1, target);
        if(right != -1)
            return right;
        return -1;
    }
    
    private int findMin(int[] nums) {
        int start = 0, end = nums.length-1;
        
        while(start <= end) {
            int mid = start + (end-start)/2;
            int prev = (mid+nums.length-1)%nums.length, next = (mid+1)%nums.length;
            if(nums[mid] <= nums[prev] && nums[mid] <= nums[next])
                return mid;
            else if(nums[end] <= nums[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
    
    private int binarySearch(int[] nums, int start, int end, int target) {

        while(start <= end) {
            int mid = start + (end-start)/2;
            
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
}