class Solution {
    public boolean search(int[] nums, int target) {
        int minIndex = findMin(nums);
        boolean left = binarySearch(0, minIndex-1, nums, target);
        boolean right = binarySearch(minIndex, nums.length-1, nums, target);
        return left || right || linearSearch(nums, target);
    }
    
    private boolean linearSearch(int[] nums, int target) {
        for(int num:nums)
            if(num == target)
                return true;
        return false;
    }
    
    private int findMin(int[] nums) {
        int start = 0, n = nums.length, end = n-1;
        int res = 0;
        while(start <= end) {
            int mid = start + (end - start)/2;
            int prev = (mid-1+n)%n, next = (mid+1)%n;
            
            if(nums[mid] <= nums[prev] && nums[mid] <= nums[prev]) {
                res = mid;
                end = mid-1;
            }
            else if(nums[mid] >= nums[end])
                start = mid+1;
            else
                end = mid-1;
        }
        return res;
    }
    
    private boolean binarySearch(int start, int end, int[] nums, int target) {
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(nums[mid] == target)
                return true;
            else if(nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return false;
    }
}