class Solution {
    public int mySqrt(int x) {
        int start = 1, end = x, res = 0;
        while(start <= end) {
            int mid = start + (end - start)/2;
            
            if(mid == x/mid)
                return mid;
            else if(mid < x/mid) {
                res = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }
}

// same as finding floor in BS, mid == x/mid not mid*mid == x (this might lead to overflow of integer)