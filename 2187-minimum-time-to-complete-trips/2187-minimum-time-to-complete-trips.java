class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long l = 1, h = 100000000000000L;
        
        while(l < h) {
            long mid = l + (h-l)/2;
            long count = 0;

            for(int i = 0; i < time.length; i++) {
                count += (mid/time[i]);
            }
            if(count < totalTrips)
                l = mid+1;               
            else
                h = mid;
        }
        return l;
    }
}