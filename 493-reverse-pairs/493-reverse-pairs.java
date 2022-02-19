class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }
    
    private int mergeSort(int[] nums, int start, int end) {
        if(start >= end)
            return 0;
        int count = 0;
        int mid = start + (end-start)/2;
        count += mergeSort(nums, start, mid);
        count += mergeSort(nums, mid+1, end);
        count += merge(nums, start, mid, end);
        return count;
    }
    
    private int merge(int[] nums, int start, int mid, int end) {
        int count = 0;
        int[] L = Arrays.copyOfRange(nums, start, mid+1);
        int[] R = Arrays.copyOfRange(nums, mid+1, end+1);
        
        int start1 = 0, end1 = L.length-1, start2 = 0, end2 = R.length-1;
        int k = start;
        
        int j = mid+1;
        for(int i = start; i <= mid; i++) {
            while(j <= end && nums[i]>(2*(long)nums[j]))
                j++;
            count += (j-(mid+1));
        }
        
        while(start1 <= end1 && start2 <= end2) {
            if(L[start1] < R[start2]) {
                nums[k++] = L[start1++];
            } else {
                nums[k++] = R[start2++];
            }
        }
        
        while(start1 <= end1) {
            nums[k++] = L[start1++];
        }
        
        while(start2 <= end2) {
            nums[k++] = R[start2++];
        }
        
        return count;
    }
}
