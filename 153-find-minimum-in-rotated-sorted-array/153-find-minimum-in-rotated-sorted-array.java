class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int start = 0, end = n-1;
        int res = 0;
        while(start <= end) {
            int mid = start + (end - start)/2;
            int prev = (mid-1+n)%n, next = (mid+1)%n;
            if(nums[mid]<nums[prev] && nums[mid]<nums[next])
                return nums[mid];
            else if(nums[end] <= nums[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        return nums[res];
    }
}