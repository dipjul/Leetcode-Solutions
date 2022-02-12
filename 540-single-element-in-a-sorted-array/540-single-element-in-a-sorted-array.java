class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0, n = nums.length, end = n-1;
        // Boundary check
        if(end == 0)
            return nums[0];
        if(nums[0] != nums[1])
            return nums[0];
        if(nums[n-1] != nums[n-2])
            return nums[n-1];
        
        while(start <= end) {
            int mid = start + (end - start)/2;
            // unique element property
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1])
                return nums[mid];
            // partition property
            else if((mid%2==0 && nums[mid]==nums[mid+1]) || (mid%2==1 && nums[mid]==nums[mid-1]))
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
}
/*
    Partition property and Pair Index property
    [1, 1, 2, 3, 3, 4, 4, 6, 6]
     m2 m1
        mid(m1) = odd && A[mid]==A[mid-1] -> element not present in left side
        mid(m2) = even && A[mid]==A[mid+1] -> element not present in left side



*/