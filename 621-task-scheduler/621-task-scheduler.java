class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        int max = 0;
        int maxCount = 0;
        
        for(char task : tasks) {
            freq[task-'A']++;
            if(freq[task-'A'] == max) {
                maxCount++;
            } else if(freq[task-'A'] > max) {
                max = freq[task-'A'];
                maxCount = 1;
            }
        }
        
        // number of blank sequence
        int blankSeq = max - 1;
        // number of blanks in each sequence
        int blankSeqLen = n - (maxCount - 1);
        // total empty slots
        int emptySlots = blankSeq * blankSeqLen;
        // non-max tasks count
        int availableSlots = tasks.length - (maxCount * max);
        // total amount of idle tiem
        int idleTime = Math.max(0, emptySlots - availableSlots);
        
        return tasks.length + idleTime;
    }
}
