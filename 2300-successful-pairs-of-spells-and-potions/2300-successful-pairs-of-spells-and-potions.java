class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length, m = potions.length;
        int[] res = new int[n];
        Arrays.sort(potions);
        
        for(int i = 0; i < n; i++) {
            int ind = findInd(potions, spells[i], success);
            res[i] = m - ind;
        }
        return res;
    }
    
    private int findInd(int[] arr, int sp, long s) {
        int left = 0, right = arr.length-1;
        while(left <= right) {
            int mid = left + (right-left)/2;
            long sx = arr[mid];
            sx*=sp;
            if(sx >= s || sx < 0) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return left;
    }
}