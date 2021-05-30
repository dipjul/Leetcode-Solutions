class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        if(x == 1) return 1;
        long start = 0, end = x/2 + 1;
        while(start <= end) {
            long mid = start + ((end-start)>>1);
            if(square(mid) > x) {
                end = mid-1;
            }
            else if(square(mid) < x) {
                if(square(mid+1) > x)
                    return (int)mid;
                start = mid+1;
            }
            
            else
                return (int)mid;
        }
        return -1;
    }
    
    private long square(long x) {
        return x*x;
    }
}