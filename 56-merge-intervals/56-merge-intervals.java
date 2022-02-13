class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        if(intervals.length <= 1)
            return intervals;
        List<int[]> result = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        
        for(int i = 1; i < intervals.length; i++) {
            int nxtStart = intervals[i][0], nxtEnd = intervals[i][1];
            if(nxtStart <= end) {
                end = Math.max(end, nxtEnd);
            } else {
                result.add(new int[]{start, end});
                start = nxtStart;
                end = nxtEnd;
            }
        }
        result.add(new int[]{start, end});
        return result.toArray(new int[result.size()][]);
    }
}


/* [[1,3],[2,6],[8,10],[15,18]]
  Sort:  [[1,3],[2,6],[8,10],[15,18]]
  

*/



















/*
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        
        int start = intervals[0][0], end = intervals[0][0];
        List<int[]> res = new ArrayList();
        
        for(int[] interval:intervals) {
            if(end >= interval[0]) {
                end = Math.max(end, interval[1]);
            } else {
                // List<Integer> tmp = new ArrayList();
                // tmp.add(start);
                // tmp.add(end);
                res.add(new int[]{start, end});
                
                start = interval[0];
                end = interval[1];
            }
        }
        // List<Integer> tmp = new ArrayList();
        // tmp.add(start);
        // tmp.add(end);
        res.add(new int[]{start, end});
        // res.add(tmp);
        // int[][] r = new int[res.size()][2];
        // int[][] intArray = res.stream().map(u -> u.stream().mapToInt(i->i).toArray()).toArray(int[][]::new);
        return res.toArray(new int[res.size()][]);
    }
}
*/
/*

[[1, 3], [2, 6], [8, 10],[15, 18], [12, 16]]

[[1, 3], [2, 6], [8, 10], [12, 16], [15, 18]]

LOOP:
START
start = 1, end = 3

compare (3 > 2)? true
end = max(3, 6) = 6

compare (6 > 8)? false
res<- [1, 6]
start = 8, end = 10

compare (10 > 12) false
res = [1,6] <- [8,10]
start = 12, end = 16

compare (16 > 15)? true
end = max(16, 18) = 18
END
res = [[1,6], [8, 10], [12, 18]]
*/