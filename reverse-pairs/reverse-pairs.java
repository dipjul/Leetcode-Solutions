class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }
    
    private int mergeSort(int[] nums, int start, int end) {
        int count = 0;
        int mid = start + (end - start)/2;
        if(start >= end)
            return 0;
        count += mergeSort(nums, start, mid);
        count += mergeSort(nums, mid+1, end);
        count += merge(nums, start, mid, end);
        return count;
    }
    
    private int merge(int[] nums, int start, int mid, int end) {
        int count = 0;
        int[] L = Arrays.copyOfRange(nums, start, mid+1);
        int[] R = Arrays.copyOfRange(nums, mid+1, end+1);
        int ptr1 = 0, ptr2 = 0, k = start;
        
        while(ptr1 < L.length && ptr2 < R.length) {
            if((long)L[ptr1] > (long)R[ptr2]*2) {
                count += (L.length-ptr1);
                ptr2++;
            } 
            else
                ptr1++;
        }
        ptr1 = 0; ptr2 = 0;
        while(ptr1 < L.length && ptr2 < R.length) {
            if(L[ptr1] > R[ptr2]) {
                nums[k++] = R[ptr2++];
            }
            else {
                nums[k++] = L[ptr1++];
            }
        }
        
        while(ptr1 < L.length) {
            nums[k++] = L[ptr1++];
        }
        
        while(ptr2 < R.length) {
            nums[k++] = R[ptr2++];
        }
        
        return count;
    }
}