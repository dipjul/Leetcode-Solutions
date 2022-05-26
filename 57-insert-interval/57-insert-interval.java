class Solution {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length < 1) return new int[][] { newInterval };

        List<int[]> mergedList = new ArrayList<>();
        int index = 0;
        while (index < intervals.length && intervals[index][1] < newInterval[0]) {
            mergedList.add(intervals[index++]);
        }
        while (index < intervals.length && intervals[index][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[index][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[index][1]);
            index++;
        }
        mergedList.add(newInterval);

        while (index < intervals.length) mergedList.add(intervals[index++]);

        return mergedList.toArray(new int[mergedList.size()][]);
    }
}
