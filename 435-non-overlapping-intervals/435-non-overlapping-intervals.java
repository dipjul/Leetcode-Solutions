class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length <= 1)
            return 0;
        Arrays.sort(intervals, (a,b)->a[1]-b[1]);
        
        int count = 0;
        int[] prev = intervals[0];
        for(int i = 1; i < intervals.length; i++) {
            int[] curr = intervals[i];
            if(prev[1] > curr[0])
                count++;
            else
                prev = intervals[i];
        }
        
        return count;
    }
}
