class Solution {
    public boolean isIdealPermutation(int[] nums) {
        int countLocalInversion = 0, countGlobalInversion = 0;
        int n = nums.length;
        for(int i = 0; i < n-1; i++) {
            if(nums[i]>nums[i+1])
                countLocalInversion++;
        }
        
        countGlobalInversion = mergeSort(nums, 0, n-1);
        System.out.println("g: "+ countGlobalInversion +"  l: "+ countLocalInversion);
        return countGlobalInversion == countLocalInversion;
    }
    
    private int mergeSort(int[] nums, int start, int end) {
        int cnt = 0;
        if(start >= end)
            return 0;
        
        int mid = start + (end - start)/2;
        cnt += mergeSort(nums, start, mid);
        cnt += mergeSort(nums, mid+1, end);
        cnt += merge(nums, start, mid, mid+1, end);
        
        return cnt;
    }
    
    private int merge(int[] nums, int start1, int end1, int start2, int end2) {
        int count = 0;
        int[] L = Arrays.copyOfRange(nums, start1, end1+1);
        int[] R = Arrays.copyOfRange(nums, start2, end2+1);
        int ptr1 = 0, ptr2 = 0, k = start1;
        
        while(ptr1 < L.length && ptr2 < R.length) {
            if(L[ptr1] > R[ptr2]) {
                nums[k++] = R[ptr2++];
                count += (end1+1-(start1+ptr1));
            } else {
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

/*

O(n) - forLoop - local inversion

[1, 2, 0]

[1, 2] [0]

[1] [2] [0]

[1, 2] [0]
1 compareTo 0
count += sizeOf Left - indexOf 1 (because all the numbers after 1(including 1) would be grater than 0 which means all will have a inversion)


*/