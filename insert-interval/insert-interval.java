class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length < 1)
            return new int[][]{newInterval};
        // if(newInterval == null || newInterval.length < 2)
        //     return intervals;
        List<int[]> mergedList = new ArrayList();
        
        int i = 0;
        while(i < intervals.length && newInterval[0]>intervals[i][0]) {
            i++;
        }
        
        if(i == 0)
            mergedList.add(newInterval);
        else {
            for(int j = 0; j < i; j++) {
                mergedList.add(new int[]{intervals[j][0], intervals[j][1]});
            }
            int[] prevInterval = mergedList.get(mergedList.size()-1);
            if(prevInterval[1] >= newInterval[0]) {
                mergedList.set(mergedList.size()-1, new int[]{prevInterval[0], Math.max(prevInterval[1], newInterval[1])});
            } else {
                mergedList.add(newInterval);
            }
        }
        // int start = 0, end = 0;
        for(int j = i; j < intervals.length; j++) {
            int[] prevInterval = mergedList.get(mergedList.size()-1);
            if(prevInterval[1] >= intervals[j][0]) {
                mergedList.set(mergedList.size()-1, new int[]{prevInterval[0], Math.max(prevInterval[1], intervals[j][1])});
            } else {
                mergedList.add(new int[]{intervals[j][0], intervals[j][1]});
            }
        }
            
        return  mergedList.toArray(new int[mergedList.size()][]);

    }
}

/*

        List<int[]> mergedList = new ArrayList();
        int size = intervals.length;
        // int[] interval = new int[]{intervals[0][0], intervals[0][1]};
        int start = intervals[0][0], end = intervals[0][1];
        if(newInterval[1] < start)
            mergedList.add(newInterval);
        else
            mergedList.add(new int[]{start, end});
        
        for(int[] interval: intervals) {
            prevInterval = mergedList.get(mergedList.size()-1);
            if(newInterval[0] <= interval[1]) {
                
            }
        }

*/