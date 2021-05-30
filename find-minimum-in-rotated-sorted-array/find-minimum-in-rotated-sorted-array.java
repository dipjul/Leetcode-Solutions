class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length-1, right = nums[nums.length-1];
        while(start<=end) {
            int mid = start + ((end-start)>>1);
            if(nums[mid]<=right && (mid == 0 ||  nums[mid-1]>nums[mid]))
                return nums[mid];
            else if(nums[mid] > right)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
    
}