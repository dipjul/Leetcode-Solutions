class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> arr = new ArrayList<>();
        int ptr1 = 0, ptr2 = 0;
        while(ptr1 < nums1.length && ptr2 < nums2.length) {
            if(nums1[ptr1] < nums2[ptr2]) {
                arr.add(nums1[ptr1]);
                ptr1++;
            } else {
                arr.add(nums2[ptr2]);
                ptr2++;
            }
        }
        
        while(ptr1 < nums1.length) {
            arr.add(nums1[ptr1]);
            ptr1++;
        }
        while(ptr2 < nums2.length) {
            arr.add(nums2[ptr2]);
            ptr2++;
        }
        int n = arr.size();
        if(arr.size()%2 == 0) {
            return (double)(arr.get(n/2)+arr.get(n/2-1))/2.0;
        } else {
            return (double) (arr.get(n/2));
        }
    }
}