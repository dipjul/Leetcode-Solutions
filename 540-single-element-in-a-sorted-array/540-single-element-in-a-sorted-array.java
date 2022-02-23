class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0, end = nums.length-1;
        if(end == 0)
            return nums[0];
        if(nums[start] != nums[start+1])
            return nums[start];
        if(nums[end] != nums[end-1])
            return nums[end];
        
        while(start <= end) {
            int mid = start + (end - start)/2;
            
            // unique element property
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1])
                return nums[mid];
            
            // partition and pair index property
            else if((mid%2 == 0 && nums[mid] == nums[mid-1]) ||(mid%2 == 1 && nums[mid] == nums[mid+1]))
                end = mid-1;
            else
                start = mid+1;
            
        }
        return -1;
    }
}

/*
Partition property and Pair Index property
 [1,1,2,3,3,4,4,8,8]
          m
m is even & nums[m] == nums[m-1] -> search on left

 [1,1,2,3,3,4,4]
        m
m is odd & nums[m] == nums[m+1] -> search on left
*/