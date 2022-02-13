class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len1 = nums1.length;
        int ptr1 = m-1, ptr2 = n-1, ptr3 = len1-1;
        
        while(ptr3 >= 0) {
            int element1 = ptr1>=0?nums1[ptr1]:Integer.MIN_VALUE;
            int element2 = ptr2>=0?nums2[ptr2]:Integer.MIN_VALUE;
            
            if(element1 > element2) {
                nums1[ptr3--] = element1;
                ptr1--;
            } else {
                nums1[ptr3--] = element2;
                ptr2--;
            }
        }
    }
}
             
        
/*
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m-1,ptr2 = n- 1, ptr12 = nums1.length-1;
        
        while(ptr1 >= 0 && ptr2 >= 0) {
            if(nums1[ptr1] < nums2[ptr2]) {
                nums1[ptr12] = nums2[ptr2];
                ptr2--;
                
            } else {
                nums1[ptr12] = nums1[ptr1];
                ptr1--;
            }
            ptr12--;
        }
        while(ptr1 >= 0) {
            nums1[ptr12] = nums1[ptr1];
            ptr1--;
            ptr12--;
        }
        while(ptr2 >= 0) {
            nums1[ptr12] = nums2[ptr2];
            ptr2--; ptr12--;
        }
    }
}
*/
/*

1 2 3 0 0 0       2 5 6
    p1    p12         p2

    3 5 6
*/