class Solution {
    /*
         5   5                                   5
        / \ / \                                /  \
       4   4   4                              4   -∞
      /         \                           /
     3           3             3           3
    /             \           / \         /
   2               2        2      2     2
  /                 \     /         \  /
-∞                   1    1           1
                      \ /
                       0                      
   0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 indices
   2,3,4,5,4,5,4,3,2,1,0, 1, 2, 3, 2, 1, 2, 3, 4, 5 (20 nums)
   l                 m                            r l=0, m=9, r=19
   l       m         r                              l=0, m=4, r= 9
             l   m   r                              l=5, m=7, r= 9
             l m r                                  l=5, m=6, r= 7
             l r                                    l=5, m=5, r= 6
             l                                      l=5, m=5, r= 5

  return l
    */
    public int findPeakElement(int[] nums) {
        int start = 0, end = nums.length-1;
        while(start < end) {
            int mid = start + ((end-start)>>1);
            if(nums[mid] < nums[mid+1]) start = mid + 1;
            else end = mid;
        }
        return start;
    }
}
