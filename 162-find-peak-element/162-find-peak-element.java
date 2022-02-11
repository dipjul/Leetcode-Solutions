class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0, end = nums.length-1;
        if(end == 0)
            return 0;
        while(start <= end) {
            int mid = start + (end - start)/2;
            
            if(mid > 0 && mid < nums.length-1) {
                if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1])
                    return mid;
                else if(nums[mid-1]>nums[mid])
                    end = mid-1;
                else
                    start = mid+1;                    
            } 
            else if(mid == 0) {
                if(nums[mid] > nums[mid+1])
                    return mid;
                else 
                    return mid+1;
            }
            else if(mid == nums.length-1) {
                if(nums[mid] > nums[mid-1])
                    return mid;
                else 
                    return mid-1;
            }
            
        }
        return -1;
    }
}